/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/
package com.portal.platform.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.file.model.Downloadable;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.portal.platform.PortalMatterData;
import com.portal.platform.PortalMatterDataId;
import com.portal.platform.service.PortalMatterDataService;
import com.wordnik.swagger.annotations.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

/**
 * Controller object for domain model class PortalMatterData.
 * @see PortalMatterData
 */
@RestController("platform.PortalMatterDataController")
@RequestMapping("/platform/PortalMatterData")
@Api(description = "Exposes APIs to work with PortalMatterData resource.", value = "PortalMatterDataController")
public class PortalMatterDataController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PortalMatterDataController.class);

    @Autowired
    @Qualifier("platform.PortalMatterDataService")
    private PortalMatterDataService portalMatterDataService;

    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the PortalMatterData instance associated with the given composite-id.")
    public PortalMatterData getPortalMatterData(@RequestParam("certificateId") int certificateId, @RequestParam("propertyId") int propertyId, @RequestParam("header") String header, @RequestParam("certificateNumber") String certificateNumber, @RequestParam("taxYear") int taxYear, @RequestParam("dateSold") Date dateSold, @RequestParam("status") String status, @RequestParam("expirationDate") Date expirationDate, @RequestParam("countyName") String countyName, @RequestParam("volume") int volume, @RequestParam("taxYearNotices") String taxYearNotices, @RequestParam("matterId") int matterId, @RequestParam("matterNumber") String matterNumber, @RequestParam("filedDate") Date filedDate, @RequestParam("lastWorkDate") Date lastWorkDate, @RequestParam("initialCourtDate") Date initialCourtDate, @RequestParam("closedDate") Date closedDate, @RequestParam("addressOverride") String addressOverride, @RequestParam("pinOverride") String pinOverride, @RequestParam("piqAddress") String piqAddress, @RequestParam("piqCity") String piqCity, @RequestParam("piqState") String piqState, @RequestParam("piqZip") String piqZip, @RequestParam("pin") String pin, @RequestParam("addressSource1") String addressSource1, @RequestParam("addressSource2") String addressSource2, @RequestParam("finalPin") String finalPin) throws EntityNotFoundException {
        PortalMatterDataId portalmatterdataId = new PortalMatterDataId();
        portalmatterdataId.setCertificateId(certificateId);
        portalmatterdataId.setPropertyId(propertyId);
        portalmatterdataId.setHeader(header);
        portalmatterdataId.setCertificateNumber(certificateNumber);
        portalmatterdataId.setTaxYear(taxYear);
        portalmatterdataId.setDateSold(dateSold);
        portalmatterdataId.setStatus(status);
        portalmatterdataId.setExpirationDate(expirationDate);
        portalmatterdataId.setCountyName(countyName);
        portalmatterdataId.setVolume(volume);
        portalmatterdataId.setTaxYearNotices(taxYearNotices);
        portalmatterdataId.setMatterId(matterId);
        portalmatterdataId.setMatterNumber(matterNumber);
        portalmatterdataId.setFiledDate(filedDate);
        portalmatterdataId.setLastWorkDate(lastWorkDate);
        portalmatterdataId.setInitialCourtDate(initialCourtDate);
        portalmatterdataId.setClosedDate(closedDate);
        portalmatterdataId.setAddressOverride(addressOverride);
        portalmatterdataId.setPinOverride(pinOverride);
        portalmatterdataId.setPiqAddress(piqAddress);
        portalmatterdataId.setPiqCity(piqCity);
        portalmatterdataId.setPiqState(piqState);
        portalmatterdataId.setPiqZip(piqZip);
        portalmatterdataId.setPin(pin);
        portalmatterdataId.setAddressSource1(addressSource1);
        portalmatterdataId.setAddressSource2(addressSource2);
        portalmatterdataId.setFinalPin(finalPin);
        LOGGER.debug("Getting PortalMatterData with id: {}", portalmatterdataId);
        PortalMatterData portalmatterdata = portalMatterDataService.getById(portalmatterdataId);
        LOGGER.debug("PortalMatterData details with id: {}", portalmatterdata);
        return portalmatterdata;
    }

    /**
     * @deprecated Use {@link #findPortalMatterDatas(String)} instead.
     */
    @Deprecated
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of PortalMatterData instances matching the search criteria.")
    public Page<PortalMatterData> findPortalMatterDatas(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering PortalMatterDatas list");
        return portalMatterDataService.findAll(queryFilters, pageable);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of PortalMatterData instances matching the search criteria.")
    public Page<PortalMatterData> findPortalMatterDatas(@RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering PortalMatterDatas list");
        return portalMatterDataService.findAll(query, pageable);
    }

    @RequestMapping(value = "/export/{exportType}", method = RequestMethod.GET, produces = "application/octet-stream")
    @ApiOperation(value = "Returns downloadable file for the data.")
    public Downloadable exportPortalMatterDatas(@PathVariable("exportType") ExportType exportType, @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        return portalMatterDataService.export(exportType, query, pageable);
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the total count of PortalMatterData instances.")
    public Long countPortalMatterDatas(@RequestParam(value = "q", required = false) String query) {
        LOGGER.debug("counting PortalMatterDatas");
        return portalMatterDataService.count(query);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service PortalMatterDataService instance
	 */
    protected void setPortalMatterDataService(PortalMatterDataService service) {
        this.portalMatterDataService = service;
    }
}
