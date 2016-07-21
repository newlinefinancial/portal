/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/
package com.portal.platform.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import java.math.BigInteger;
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
import com.portal.platform.BidSequence;
import com.portal.platform.BidSequenceId;
import com.portal.platform.service.BidSequenceService;
import com.wordnik.swagger.annotations.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

/**
 * Controller object for domain model class BidSequence.
 * @see BidSequence
 */
@RestController("platform.BidSequenceController")
@RequestMapping("/platform/BidSequence")
@Api(description = "Exposes APIs to work with BidSequence resource.", value = "BidSequenceController")
public class BidSequenceController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BidSequenceController.class);

    @Autowired
    @Qualifier("platform.BidSequenceService")
    private BidSequenceService bidSequenceService;

    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the BidSequence instance associated with the given composite-id.")
    public BidSequence getBidSequence(@RequestParam("auctionId") int auctionId, @RequestParam("taxYear") int taxYear, @RequestParam("propertyId") int propertyId, @RequestParam("auctionDay") Integer auctionDay, @RequestParam("order") BigInteger order) throws EntityNotFoundException {
        BidSequenceId bidsequenceId = new BidSequenceId();
        bidsequenceId.setAuctionId(auctionId);
        bidsequenceId.setTaxYear(taxYear);
        bidsequenceId.setPropertyId(propertyId);
        bidsequenceId.setAuctionDay(auctionDay);
        bidsequenceId.setOrder(order);
        LOGGER.debug("Getting BidSequence with id: {}", bidsequenceId);
        BidSequence bidsequence = bidSequenceService.getById(bidsequenceId);
        LOGGER.debug("BidSequence details with id: {}", bidsequence);
        return bidsequence;
    }

    /**
     * @deprecated Use {@link #findBidSequences(String)} instead.
     */
    @Deprecated
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of BidSequence instances matching the search criteria.")
    public Page<BidSequence> findBidSequences(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering BidSequences list");
        return bidSequenceService.findAll(queryFilters, pageable);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of BidSequence instances matching the search criteria.")
    public Page<BidSequence> findBidSequences(@RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering BidSequences list");
        return bidSequenceService.findAll(query, pageable);
    }

    @RequestMapping(value = "/export/{exportType}", method = RequestMethod.GET, produces = "application/octet-stream")
    @ApiOperation(value = "Returns downloadable file for the data.")
    public Downloadable exportBidSequences(@PathVariable("exportType") ExportType exportType, @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        return bidSequenceService.export(exportType, query, pageable);
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the total count of BidSequence instances.")
    public Long countBidSequences(@RequestParam(value = "q", required = false) String query) {
        LOGGER.debug("counting BidSequences");
        return bidSequenceService.count(query);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service BidSequenceService instance
	 */
    protected void setBidSequenceService(BidSequenceService service) {
        this.bidSequenceService = service;
    }
}
