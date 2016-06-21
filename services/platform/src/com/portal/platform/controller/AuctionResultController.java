/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/
package com.portal.platform.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.portal.platform.service.AuctionResultService;
import com.portal.platform.service.PropertySaleService;
import java.io.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.hibernate.TypeMismatchException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.util.WMMultipartUtils;
import com.wavemaker.runtime.util.WMRuntimeUtils;
import com.wavemaker.runtime.file.model.DownloadResponse;
import com.wordnik.swagger.annotations.*;
import com.portal.platform.*;
import com.portal.platform.service.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

/**
 * Controller object for domain model class AuctionResult.
 * @see com.portal.platform.AuctionResult
 */
@RestController(value = "Platform.AuctionResultController")
@RequestMapping("/platform/AuctionResult")
@Api(description = "Exposes APIs to work with AuctionResult resource.", value = "AuctionResultController")
public class AuctionResultController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuctionResultController.class);

    @Autowired
    @Qualifier("platform.AuctionResultService")
    private AuctionResultService auctionResultService;

    @Autowired
    @Qualifier("platform.PropertySaleService")
    private PropertySaleService propertySaleService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of AuctionResult instances matching the search criteria.")
    public Page<AuctionResult> findAuctionResults(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering AuctionResults list");
        return auctionResultService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of AuctionResult instances.")
    public Page<AuctionResult> getAuctionResults(Pageable pageable) {
        LOGGER.debug("Rendering AuctionResults list");
        return auctionResultService.findAll(pageable);
    }

    @RequestMapping(value = "/{id:.+}/propertySales", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the propertySales instance associated with the given id.")
    public Page<PropertySale> findAssociatedpropertySales(Pageable pageable, @PathVariable("id") Integer id) {
        LOGGER.debug("Fetching all associated propertySales");
        return propertySaleService.findAssociatedValues(id, "auctionResult", "id", pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setAuctionResultService(AuctionResultService service) {
        this.auctionResultService = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new AuctionResult instance.")
    public AuctionResult createAuctionResult(@RequestBody AuctionResult instance) {
        LOGGER.debug("Create AuctionResult with information: {}", instance);
        instance = auctionResultService.create(instance);
        LOGGER.debug("Created AuctionResult with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of AuctionResult instances.")
    public Long countAllAuctionResults() {
        LOGGER.debug("counting AuctionResults");
        Long count = auctionResultService.countAll();
        return count;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the AuctionResult instance associated with the given id.")
    public AuctionResult getAuctionResult(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting AuctionResult with id: {}", id);
        AuctionResult instance = auctionResultService.findById(id);
        LOGGER.debug("AuctionResult details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the AuctionResult instance associated with the given id.")
    public AuctionResult editAuctionResult(@PathVariable(value = "id") Integer id, @RequestBody AuctionResult instance) throws EntityNotFoundException {
        LOGGER.debug("Editing AuctionResult with id: {}", instance.getId());
        instance.setId(id);
        instance = auctionResultService.update(instance);
        LOGGER.debug("AuctionResult details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the AuctionResult instance associated with the given id.")
    public boolean deleteAuctionResult(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting AuctionResult with id: {}", id);
        AuctionResult deleted = auctionResultService.delete(id);
        return deleted != null;
    }
}
