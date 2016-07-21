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
import com.portal.platform.AuctionResult;
import com.portal.platform.PropertySale;
import com.portal.platform.service.AuctionResultService;
import com.portal.platform.service.PropertySaleService;
import com.wordnik.swagger.annotations.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

/**
 * Controller object for domain model class AuctionResult.
 * @see AuctionResult
 */
@RestController("platform.AuctionResultController")
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

    /**
     * @deprecated Use {@link #findAuctionResults(String)} instead.
     */
    @Deprecated
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of AuctionResult instances matching the search criteria.")
    public Page<AuctionResult> findAuctionResults(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering AuctionResults list");
        return auctionResultService.findAll(queryFilters, pageable);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of AuctionResult instances matching the search criteria.")
    public Page<AuctionResult> findAuctionResults(@RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering AuctionResults list");
        return auctionResultService.findAll(query, pageable);
    }

    @RequestMapping(value = "/export/{exportType}", method = RequestMethod.GET, produces = "application/octet-stream")
    @ApiOperation(value = "Returns downloadable file for the data.")
    public Downloadable exportAuctionResults(@PathVariable("exportType") ExportType exportType, @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        return auctionResultService.export(exportType, query, pageable);
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the total count of AuctionResult instances.")
    public Long countAuctionResults(@RequestParam(value = "q", required = false) String query) {
        LOGGER.debug("counting AuctionResults");
        return auctionResultService.count(query);
    }

    @RequestMapping(value = "/{id:.+}/propertySales", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the propertySales instance associated with the given id.")
    public Page<PropertySale> findAssociatedPropertySales(Pageable pageable, @PathVariable("id") Integer id) {
        LOGGER.debug("Fetching all associated propertySales");
        return propertySaleService.findAssociatedValues(id, "auctionResult", "id", pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service AuctionResultService instance
	 */
    protected void setAuctionResultService(AuctionResultService service) {
        this.auctionResultService = service;
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service PropertySaleService instance
	 */
    protected void setPropertySaleService(PropertySaleService service) {
        this.propertySaleService = service;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the AuctionResult instance associated with the given id.")
    public AuctionResult getAuctionResult(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting AuctionResult with id: {}", id);
        AuctionResult foundAuctionResult = auctionResultService.getById(id);
        LOGGER.debug("AuctionResult details with id: {}", foundAuctionResult);
        return foundAuctionResult;
    }
}
