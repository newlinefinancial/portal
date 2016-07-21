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
import com.portal.platform.PortalTags;
import com.portal.platform.PortalTagsId;
import com.portal.platform.service.PortalTagsService;
import com.wordnik.swagger.annotations.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

/**
 * Controller object for domain model class PortalTags.
 * @see PortalTags
 */
@RestController("platform.PortalTagsController")
@RequestMapping("/platform/PortalTags")
@Api(description = "Exposes APIs to work with PortalTags resource.", value = "PortalTagsController")
public class PortalTagsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PortalTagsController.class);

    @Autowired
    @Qualifier("platform.PortalTagsService")
    private PortalTagsService portalTagsService;

    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the PortalTags instance associated with the given composite-id.")
    public PortalTags getPortalTags(@RequestParam("propertyId") int propertyId, @RequestParam("review") Integer review, @RequestParam("inspect") Integer inspect, @RequestParam("checkCounty") Integer checkCounty, @RequestParam("checkTitle") Integer checkTitle, @RequestParam("good") Integer good, @RequestParam("meh") Integer meh, @RequestParam("poor") Integer poor, @RequestParam("vacant") Integer vacant, @RequestParam("boarded") Integer boarded, @RequestParam("gone") Integer gone, @RequestParam("ng") Integer ng, @RequestParam("forSale") Integer forSale, @RequestParam("divided") Integer divided, @RequestParam("tax_valueIssue") Integer tax_valueIssue, @RequestParam("buildingCourt") Integer buildingCourt, @RequestParam("demoLien") Integer demoLien, @RequestParam("demoOrder") Integer demoOrder, @RequestParam("extension") Integer extension, @RequestParam("takeNotice") Integer takeNotice, @RequestParam("redemptionLetter") Integer redemptionLetter, @RequestParam("sieHearing") Integer sieHearing) throws EntityNotFoundException {
        PortalTagsId portaltagsId = new PortalTagsId();
        portaltagsId.setPropertyId(propertyId);
        portaltagsId.setReview(review);
        portaltagsId.setInspect(inspect);
        portaltagsId.setCheckCounty(checkCounty);
        portaltagsId.setCheckTitle(checkTitle);
        portaltagsId.setGood(good);
        portaltagsId.setMeh(meh);
        portaltagsId.setPoor(poor);
        portaltagsId.setVacant(vacant);
        portaltagsId.setBoarded(boarded);
        portaltagsId.setGone(gone);
        portaltagsId.setNg(ng);
        portaltagsId.setForSale(forSale);
        portaltagsId.setDivided(divided);
        portaltagsId.setTax_valueIssue(tax_valueIssue);
        portaltagsId.setBuildingCourt(buildingCourt);
        portaltagsId.setDemoLien(demoLien);
        portaltagsId.setDemoOrder(demoOrder);
        portaltagsId.setExtension(extension);
        portaltagsId.setTakeNotice(takeNotice);
        portaltagsId.setRedemptionLetter(redemptionLetter);
        portaltagsId.setSieHearing(sieHearing);
        LOGGER.debug("Getting PortalTags with id: {}", portaltagsId);
        PortalTags portaltags = portalTagsService.getById(portaltagsId);
        LOGGER.debug("PortalTags details with id: {}", portaltags);
        return portaltags;
    }

    /**
     * @deprecated Use {@link #findPortalTags(String)} instead.
     */
    @Deprecated
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of PortalTags instances matching the search criteria.")
    public Page<PortalTags> findPortalTags(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering PortalTags list");
        return portalTagsService.findAll(queryFilters, pageable);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of PortalTags instances matching the search criteria.")
    public Page<PortalTags> findPortalTags(@RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering PortalTags list");
        return portalTagsService.findAll(query, pageable);
    }

    @RequestMapping(value = "/export/{exportType}", method = RequestMethod.GET, produces = "application/octet-stream")
    @ApiOperation(value = "Returns downloadable file for the data.")
    public Downloadable exportPortalTags(@PathVariable("exportType") ExportType exportType, @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        return portalTagsService.export(exportType, query, pageable);
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the total count of PortalTags instances.")
    public Long countPortalTags(@RequestParam(value = "q", required = false) String query) {
        LOGGER.debug("counting PortalTags");
        return portalTagsService.count(query);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service PortalTagsService instance
	 */
    protected void setPortalTagsService(PortalTagsService service) {
        this.portalTagsService = service;
    }
}
