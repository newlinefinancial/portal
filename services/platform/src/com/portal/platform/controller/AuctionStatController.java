/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/
package com.portal.platform.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import java.math.BigDecimal;
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
import com.portal.platform.AuctionStat;
import com.portal.platform.AuctionStatId;
import com.portal.platform.service.AuctionStatService;
import com.wordnik.swagger.annotations.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

/**
 * Controller object for domain model class AuctionStat.
 * @see AuctionStat
 */
@RestController("platform.AuctionStatController")
@RequestMapping("/platform/AuctionStat")
@Api(description = "Exposes APIs to work with AuctionStat resource.", value = "AuctionStatController")
public class AuctionStatController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuctionStatController.class);

    @Autowired
    @Qualifier("platform.AuctionStatService")
    private AuctionStatService auctionStatService;

    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the AuctionStat instance associated with the given composite-id.")
    public AuctionStat getAuctionStat(@RequestParam("auctionId") int auctionId, @RequestParam("auctionYear") int auctionYear, @RequestParam("lifetimeInvestment") BigDecimal lifetimeInvestment, @RequestParam("countPublished") Integer countPublished, @RequestParam("countAuctioned") Integer countAuctioned, @RequestParam("countForfeited") Integer countForfeited, @RequestParam("countOpensales") Integer countOpensales, @RequestParam("countOpenpriors") Integer countOpenpriors) throws EntityNotFoundException {
        AuctionStatId auctionstatId = new AuctionStatId();
        auctionstatId.setAuctionId(auctionId);
        auctionstatId.setAuctionYear(auctionYear);
        auctionstatId.setLifetimeInvestment(lifetimeInvestment);
        auctionstatId.setCountPublished(countPublished);
        auctionstatId.setCountAuctioned(countAuctioned);
        auctionstatId.setCountForfeited(countForfeited);
        auctionstatId.setCountOpensales(countOpensales);
        auctionstatId.setCountOpenpriors(countOpenpriors);
        LOGGER.debug("Getting AuctionStat with id: {}", auctionstatId);
        AuctionStat auctionstat = auctionStatService.getById(auctionstatId);
        LOGGER.debug("AuctionStat details with id: {}", auctionstat);
        return auctionstat;
    }

    /**
     * @deprecated Use {@link #findAuctionStats(String)} instead.
     */
    @Deprecated
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of AuctionStat instances matching the search criteria.")
    public Page<AuctionStat> findAuctionStats(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering AuctionStats list");
        return auctionStatService.findAll(queryFilters, pageable);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of AuctionStat instances matching the search criteria.")
    public Page<AuctionStat> findAuctionStats(@RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering AuctionStats list");
        return auctionStatService.findAll(query, pageable);
    }

    @RequestMapping(value = "/export/{exportType}", method = RequestMethod.GET, produces = "application/octet-stream")
    @ApiOperation(value = "Returns downloadable file for the data.")
    public Downloadable exportAuctionStats(@PathVariable("exportType") ExportType exportType, @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        return auctionStatService.export(exportType, query, pageable);
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the total count of AuctionStat instances.")
    public Long countAuctionStats(@RequestParam(value = "q", required = false) String query) {
        LOGGER.debug("counting AuctionStats");
        return auctionStatService.count(query);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service AuctionStatService instance
	 */
    protected void setAuctionStatService(AuctionStatService service) {
        this.auctionStatService = service;
    }
}
