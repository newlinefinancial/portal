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
import com.portal.platform.Auction;
import com.portal.platform.AuctionResult;
import com.portal.platform.Sample;
import com.portal.platform.Underwriting;
import com.portal.platform.service.AuctionResultService;
import com.portal.platform.service.AuctionService;
import com.portal.platform.service.SampleService;
import com.portal.platform.service.UnderwritingService;
import com.wordnik.swagger.annotations.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

/**
 * Controller object for domain model class Auction.
 * @see Auction
 */
@RestController("platform.AuctionController")
@RequestMapping("/platform/Auction")
@Api(description = "Exposes APIs to work with Auction resource.", value = "AuctionController")
public class AuctionController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuctionController.class);

    @Autowired
    @Qualifier("platform.AuctionService")
    private AuctionService auctionService;

    @Autowired
    @Qualifier("platform.SampleService")
    private SampleService sampleService;

    @Autowired
    @Qualifier("platform.UnderwritingService")
    private UnderwritingService underwritingService;

    @Autowired
    @Qualifier("platform.AuctionResultService")
    private AuctionResultService auctionResultService;

    /**
     * @deprecated Use {@link #findAuctions(String)} instead.
     */
    @Deprecated
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of Auction instances matching the search criteria.")
    public Page<Auction> findAuctions(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Auctions list");
        return auctionService.findAll(queryFilters, pageable);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of Auction instances matching the search criteria.")
    public Page<Auction> findAuctions(@RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Auctions list");
        return auctionService.findAll(query, pageable);
    }

    @RequestMapping(value = "/export/{exportType}", method = RequestMethod.GET, produces = "application/octet-stream")
    @ApiOperation(value = "Returns downloadable file for the data.")
    public Downloadable exportAuctions(@PathVariable("exportType") ExportType exportType, @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        return auctionService.export(exportType, query, pageable);
    }

    @RequestMapping(value = "/{id:.+}/underwritings", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the underwritings instance associated with the given id.")
    public Page<Underwriting> findAssociatedUnderwritings(Pageable pageable, @PathVariable("id") Integer id) {
        LOGGER.debug("Fetching all associated underwritings");
        return underwritingService.findAssociatedValues(id, "auction", "id", pageable);
    }

    @RequestMapping(value = "/{id:.+}/samples", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the samples instance associated with the given id.")
    public Page<Sample> findAssociatedSamples(Pageable pageable, @PathVariable("id") Integer id) {
        LOGGER.debug("Fetching all associated samples");
        return sampleService.findAssociatedValues(id, "auction", "id", pageable);
    }

    @RequestMapping(value = "/{id:.+}/auctionResults", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the auctionResults instance associated with the given id.")
    public Page<AuctionResult> findAssociatedAuctionResults(Pageable pageable, @PathVariable("id") Integer id) {
        LOGGER.debug("Fetching all associated auctionResults");
        return auctionResultService.findAssociatedValues(id, "auction", "id", pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service AuctionService instance
	 */
    protected void setAuctionService(AuctionService service) {
        this.auctionService = service;
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service SampleService instance
	 */
    protected void setSampleService(SampleService service) {
        this.sampleService = service;
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service UnderwritingService instance
	 */
    protected void setUnderwritingService(UnderwritingService service) {
        this.underwritingService = service;
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service AuctionResultService instance
	 */
    protected void setAuctionResultService(AuctionResultService service) {
        this.auctionResultService = service;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of Auction instances.")
    public Long countAuctions(@RequestParam(value = "q", required = false) String query) {
        LOGGER.debug("counting Auctions");
        return auctionService.count(query);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the Auction instance associated with the given id.")
    public Auction getAuction(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting Auction with id: {}", id);
        Auction foundAuction = auctionService.getById(id);
        LOGGER.debug("Auction details with id: {}", foundAuction);
        return foundAuction;
    }
}
