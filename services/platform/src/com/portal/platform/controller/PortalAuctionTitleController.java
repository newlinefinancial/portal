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
import com.portal.platform.PortalAuctionTitle;
import com.portal.platform.PortalAuctionTitleId;
import com.portal.platform.service.PortalAuctionTitleService;
import com.wordnik.swagger.annotations.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

/**
 * Controller object for domain model class PortalAuctionTitle.
 * @see PortalAuctionTitle
 */
@RestController("platform.PortalAuctionTitleController")
@RequestMapping("/platform/PortalAuctionTitle")
@Api(description = "Exposes APIs to work with PortalAuctionTitle resource.", value = "PortalAuctionTitleController")
public class PortalAuctionTitleController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PortalAuctionTitleController.class);

    @Autowired
    @Qualifier("platform.PortalAuctionTitleService")
    private PortalAuctionTitleService portalAuctionTitleService;

    /**
     * @deprecated Use {@link #findPortalAuctionTitles(String)} instead.
     */
    @Deprecated
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of PortalAuctionTitle instances matching the search criteria.")
    public Page<PortalAuctionTitle> findPortalAuctionTitles(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering PortalAuctionTitles list");
        return portalAuctionTitleService.findAll(queryFilters, pageable);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of PortalAuctionTitle instances matching the search criteria.")
    public Page<PortalAuctionTitle> findPortalAuctionTitles(@RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering PortalAuctionTitles list");
        return portalAuctionTitleService.findAll(query, pageable);
    }

    @RequestMapping(value = "/export/{exportType}", method = RequestMethod.GET, produces = "application/octet-stream")
    @ApiOperation(value = "Returns downloadable file for the data.")
    public Downloadable exportPortalAuctionTitles(@PathVariable("exportType") ExportType exportType, @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        return portalAuctionTitleService.export(exportType, query, pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service PortalAuctionTitleService instance
	 */
    protected void setPortalAuctionTitleService(PortalAuctionTitleService service) {
        this.portalAuctionTitleService = service;
    }

    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the PortalAuctionTitle instance associated with the given composite-id.")
    public PortalAuctionTitle getPortalAuctionTitle(@RequestParam(value = "consideration", required = true) Double consideration, @RequestParam(value = "date", required = true) Date date, @RequestParam(value = "docNumber", required = true) String docNumber, @RequestParam(value = "grantee", required = true) String grantee, @RequestParam(value = "grantor", required = true) String grantor, @RequestParam(value = "id", required = true) int id, @RequestParam(value = "propertyId", required = true) int propertyId, @RequestParam(value = "titleType", required = true) String titleType, @RequestParam(value = "category", required = true) String category, @RequestParam(value = "name", required = true) String name) throws EntityNotFoundException {
        PortalAuctionTitleId portalauctiontitleId = new PortalAuctionTitleId();
        portalauctiontitleId.setConsideration(consideration);
        portalauctiontitleId.setDate(date);
        portalauctiontitleId.setDocNumber(docNumber);
        portalauctiontitleId.setGrantee(grantee);
        portalauctiontitleId.setGrantor(grantor);
        portalauctiontitleId.setId(id);
        portalauctiontitleId.setPropertyId(propertyId);
        portalauctiontitleId.setTitleType(titleType);
        portalauctiontitleId.setCategory(category);
        portalauctiontitleId.setName(name);
        LOGGER.debug("Getting PortalAuctionTitle with id: {}", portalauctiontitleId);
        PortalAuctionTitle portalauctiontitle = portalAuctionTitleService.getById(portalauctiontitleId);
        LOGGER.debug("PortalAuctionTitle details with id: {}", portalauctiontitle);
        return portalauctiontitle;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of PortalAuctionTitle instances.")
    public Long countPortalAuctionTitles(@RequestParam(value = "q", required = false) String query) {
        LOGGER.debug("counting PortalAuctionTitles");
        return portalAuctionTitleService.count(query);
    }
}
