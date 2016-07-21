Application.$controller("MainPageController", ["$scope", function($scope) {
    "use strict";

    /* perform any action on widgets/variables within this block */
    $scope.onPageReady = function() {

        // read markers from URL
        var markers = [];
        if (getParameterByName('incomplete')) {
            markers = getParameterByName('incomplete').split(';');
        }

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

            addMarkers(map)

            // Handle click event on the map created above
            map.addListener('click', function(event) {
                // If Map zoom level is less than 15, return
                if (map.getZoom() < REP.Layer.Google.MIN_ZOOM) {
                    console.log("Zoom Level too low for REP");
                    return;
                }

                // close existing infoWindow, if present
                // if (infoWindow !== null) {
                //     infoWindow.close();
                // }

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

            })

            // Initialize REP
            REP.Layer.Google.Initialize(map);
        }

        // Updates lat and long in the static variable as well as triggers a call to the ReportAllAPI
        function updateLatLong(lat, long) {
            var pointDataString = "POINT(" + long + " " + lat + ")"
            $scope.Widgets.pointLabel.caption = pointDataString;
            $scope.Variables.svPointData.setData(pointDataString);
            // setting the data
            $scope.Variables.svReportallUsa.setInput('spatial_intersect', pointDataString);
            // Calling the ReportAll Webservice with required parameters
            $scope.Variables.svReportallUsa.update()
        }


        // When marker data is passed in using url params, add markers
        function addMarkers(map) {
            console.log("Number of markers supplied: " + markers.length)
            console.log("adding markers")
            if (markers.length < 1) {
                console.log("No markers supplied");
                return;
            }
            markers.map(function(markerText) {
                var location_details = markerText.split(':');
                var markerId = location_details[0];
                var latLong = location_details[2];
                console.log("Maker ID: " + markerId + "latLong: " + latLong)
                var lat1 = parseFloat(latLong.split(',')[0]);
                var long1 = parseFloat(latLong.split(',')[1]);
                console.log("lat: " + lat1);
                console.log("long: " + long1);
                var myLatLng = {
                    lat: lat1,
                    lng: long1
                };
                var marker = new google.maps.Marker({
                    position: myLatLng,
                    map: map,
                    title: markerId
                });
            })
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

        // Parse URL Parameters
        function getParameterByName(name, url) {
            if (!url) url = window.location.href;
            name = name.replace(/[\[\]]/g, "\\$&");
            var regex = new RegExp("[?&]" + name + "(=([^&#]*)|&|#|$)"),
                results = regex.exec(url);
            if (!results) return null;
            if (!results[2]) return '';
            return decodeURIComponent(results[2].replace(/\+/g, " "));
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
    }
}]);