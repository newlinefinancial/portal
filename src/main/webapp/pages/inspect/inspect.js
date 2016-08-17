Application.$controller("inspectPageController", ["$scope", function($scope) {
    "use strict";

    /* perform any action on widgets/variables within this block */
    $scope.onPageReady = function() {

        // Constants & Variables
        var GOOGLE_MAPS_API_KEY = "AIzaSyBzs_6EsdrgAmboMDgXKFm0_Iv_78EE-_Y";
        var map;
        var infoWindow = null;
        var mapFeatures = [];
        var wText = 'Loading data from Parcel API...';
        var contentString = "Loading data from Parcel API....";

        // Methid to Initalize Google Maps API
        function initMap() {
            // setup Maps in UI
            map = new google.maps.Map(document.getElementById('gMapsDiv'), {
                center: new google.maps.LatLng(41.636258, -87.596769),
                zoom: 15,
                mapTypeId: google.maps.MapTypeId.ROADMAP
            });

            // Handle click event on the map created above
            map.addListener('click', function(event) {
                showREPDataOnClick(map, event);
            })

            // Initialize REP
            REP.Layer.Google.Initialize(map);
        }

        // When the user clicks on a grid, highlight it and show info window populated with data fetched from ReportAllUSA service
        function showREPDataOnClick(map, event) {
            // If Map zoom level is less than 15, return
            if (map.getZoom() < REP.Layer.Google.MIN_ZOOM) {
                console.log("Zoom Level too low for REP");
                return;
            }

            // Cleanup Map features
            for (var i = 0; i < mapFeatures.length; i++) mapFeatures[i].setMap(null);
            mapFeatures = []
            var latLng = event.latLng;

            REP.Layer.Google.IdentifyByPoint(map, latLng, function(resp) {
                if (resp.results.length) {
                    var respRow0 = resp.results[0];
                    for (var respKey in respRow0) {
                        var respVal = respRow0[respKey];
                        if (respVal === null) continue;
                        if (respKey === 'geom') {
                            for (var i = 0; i < respVal.length; i++) {
                                respVal[i].setOptions({
                                    fillColor: 'rgb(144,238,144)',
                                    strokeColor: 'rgb(200,0,0)'
                                });
                                respVal[i].setMap(map);
                            }
                            mapFeatures = respVal;
                        } else {
                            if (wText !== '') wText += '\n<br>';
                            wText += respKey + ': ' + respVal;
                        }
                    }
                }
            });
            // old stuff
            infoWindow = new google.maps.InfoWindow({
                content: contentString,
                position: event.latLng
            });
            infoWindow.open(map);
            updateLatLong(event.latLng.lat(), event.latLng.lng());
        }

        // Updates lat and long in the static variable as well as triggers a call to the ReportAllAPI
        function updateLatLong(lat, long) {
            var pointDataString = "POINT(" + long + " " + lat + ")"
            $scope.Variables.svPointData.setData(pointDataString);
            // setting the data
            $scope.Variables.svReportallUsa.setInput('spatial_intersect', pointDataString);
            // Calling the ReportAll Webservice with required parameters
            $scope.Variables.svReportallUsa.update()
        }

        // Load Google Maps and ReportAllUsa scripts, in order.
        function loadScripts() {
            var googleMapsJS = "https://maps.googleapis.com/maps/api/js?key=" + GOOGLE_MAPS_API_KEY;
            console.log("Starting load of: " + googleMapsJS)
            $.getScript(googleMapsJS, function() {
                console.log("googleMapsJS Script loaded successfully")
                var reportAllJS = "https://reportallusa.com/overlay/js.php?v=1.0&map=Google&client=DBGUwzBN1o";
                $.getScript(reportAllJS, function() {
                    console.log("ReportAll JS loaded successfully")
                    initMap()
                })
            })
        }

        // The code in this method is triggered when ReportAllUSA returns success
        $scope.svReportallUsaonSuccess = function(variable, data) {
            console.log("ReportAllUSA returned SUCCESS")
            var result = data.results[0];
            var contentString = "ERROR: Invalid response from ReportAll Portal";
            if (result) {
                contentString = "parcel_id: " + result.parcel_id + "<br> county_id: " + result.county_id + "<br> county_name: " + result.county_name + "<br> muni_name: " + result.muni_name + "<br> state_abbr:" + result.state_abbr + "<br> addr_street_name: " + result.addr_street_name + "<br> addr_street_type: " + result.addr_street_type + "<br> census_zip: " + result.census_zip + "<br> mail_address3: " + result.mail_address3 + "<br> mkt_val_land:" + result.mkt_val_land + "<br> mkt_val_bldg:" + result.mkt_val_bldg + "<br> mkt_val_tot: " + result.mkt_val_tot + "<br> muni_id:" + result.muni_id + "<br> school_dist_id:" + result.school_dist_id + "<br> acreage_calc: " + result.acreage_calc + "<br>";
            }
            infoWindow.setContent(contentString);
        };
        // Load the scripts and start maps rendering in UI
        loadScripts();
    };

    $scope.select1Change = function($event, $isolateScope) {
        console.log($scope.Widgets.select1.datavalue);
    };

}]);