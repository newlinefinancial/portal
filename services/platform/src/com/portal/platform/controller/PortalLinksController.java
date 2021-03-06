/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/
package com.portal.platform.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
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
import com.portal.platform.PortalLinks;
import com.portal.platform.PortalLinksId;
import com.portal.platform.service.PortalLinksService;
import com.wordnik.swagger.annotations.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

/**
 * Controller object for domain model class PortalLinks.
 * @see PortalLinks
 */
@RestController("platform.PortalLinksController")
@RequestMapping("/platform/PortalLinks")
@Api(description = "Exposes APIs to work with PortalLinks resource.", value = "PortalLinksController")
public class PortalLinksController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PortalLinksController.class);

    @Autowired
    @Qualifier("platform.PortalLinksService")
    private PortalLinksService portalLinksService;

    /**
     * @deprecated Use {@link #findPortalLinks(String)} instead.
     */
    @Deprecated
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of PortalLinks instances matching the search criteria.")
    public Page<PortalLinks> findPortalLinks(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering PortalLinks list");
        return portalLinksService.findAll(queryFilters, pageable);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of PortalLinks instances matching the search criteria.")
    public Page<PortalLinks> findPortalLinks(@RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering PortalLinks list");
        return portalLinksService.findAll(query, pageable);
    }

    @RequestMapping(value = "/export/{exportType}", method = RequestMethod.GET, produces = "application/octet-stream")
    @ApiOperation(value = "Returns downloadable file for the data.")
    public Downloadable exportPortalLinks(@PathVariable("exportType") ExportType exportType, @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        return portalLinksService.export(exportType, query, pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service PortalLinksService instance
	 */
    protected void setPortalLinksService(PortalLinksService service) {
        this.portalLinksService = service;
    }

    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the PortalLinks instance associated with the given composite-id.")
    public PortalLinks getPortalLinks(@RequestParam(value = "propertyId", required = true) int propertyId, @RequestParam(value = "gis", required = true) String gis, @RequestParam(value = "assessor", required = true) String assessor, @RequestParam(value = "treasurer", required = true) String treasurer, @RequestParam(value = "recorder", required = true) String recorder, @RequestParam(value = "clerk", required = true) String clerk, @RequestParam(value = "newlinePhoto", required = true) String newlinePhoto) throws EntityNotFoundException {
        PortalLinksId portallinksId = new PortalLinksId();
        portallinksId.setPropertyId(propertyId);
        portallinksId.setGis(gis);
        portallinksId.setAssessor(assessor);
        portallinksId.setTreasurer(treasurer);
        portallinksId.setRecorder(recorder);
        portallinksId.setClerk(clerk);
        portallinksId.setNewlinePhoto(newlinePhoto);
        LOGGER.debug("Getting PortalLinks with id: {}", portallinksId);
        PortalLinks portallinks = portalLinksService.getById(portallinksId);
        LOGGER.debug("PortalLinks details with id: {}", portallinks);
        return portallinks;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of PortalLinks instances.")
    public Long countPortalLinks(@RequestParam(value = "q", required = false) String query) {
        LOGGER.debug("counting PortalLinks");
        return portalLinksService.count(query);
    }
}
