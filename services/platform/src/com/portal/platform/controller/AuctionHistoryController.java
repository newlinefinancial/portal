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
import com.portal.platform.AuctionHistory;
import com.portal.platform.AuctionHistoryId;
import com.portal.platform.service.AuctionHistoryService;
import com.wordnik.swagger.annotations.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

/**
 * Controller object for domain model class AuctionHistory.
 * @see AuctionHistory
 */
@RestController("platform.AuctionHistoryController")
@RequestMapping("/platform/AuctionHistory")
@Api(description = "Exposes APIs to work with AuctionHistory resource.", value = "AuctionHistoryController")
public class AuctionHistoryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuctionHistoryController.class);

    @Autowired
    @Qualifier("platform.AuctionHistoryService")
    private AuctionHistoryService auctionHistoryService;

    /**
     * @deprecated Use {@link #findAuctionHistories(String)} instead.
     */
    @Deprecated
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of AuctionHistory instances matching the search criteria.")
    public Page<AuctionHistory> findAuctionHistories(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering AuctionHistories list");
        return auctionHistoryService.findAll(queryFilters, pageable);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of AuctionHistory instances matching the search criteria.")
    public Page<AuctionHistory> findAuctionHistories(@RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering AuctionHistories list");
        return auctionHistoryService.findAll(query, pageable);
    }

    @RequestMapping(value = "/export/{exportType}", method = RequestMethod.GET, produces = "application/octet-stream")
    @ApiOperation(value = "Returns downloadable file for the data.")
    public Downloadable exportAuctionHistories(@PathVariable("exportType") ExportType exportType, @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        return auctionHistoryService.export(exportType, query, pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service AuctionHistoryService instance
	 */
    protected void setAuctionHistoryService(AuctionHistoryService service) {
        this.auctionHistoryService = service;
    }

    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the AuctionHistory instance associated with the given composite-id.")
    public AuctionHistory getAuctionHistory(@RequestParam(value = "auctionId", required = true) int auctionId, @RequestParam(value = "auctionYear", required = true) int auctionYear, @RequestParam(value = "taxYear1", required = true) Integer taxYear1, @RequestParam(value = "auctionResult1", required = true) String auctionResult1, @RequestParam(value = "dispositionStatus1", required = true) String dispositionStatus1, @RequestParam(value = "dispositionDate1", required = true) Date dispositionDate1, @RequestParam(value = "openStatus1", required = true) String openStatus1, @RequestParam(value = "taxYear2", required = true) Integer taxYear2, @RequestParam(value = "auctionResult2", required = true) String auctionResult2, @RequestParam(value = "dispositionStatus2", required = true) String dispositionStatus2, @RequestParam(value = "dispositionDate2", required = true) Date dispositionDate2, @RequestParam(value = "openStatus2", required = true) String openStatus2, @RequestParam(value = "taxYear3", required = true) Integer taxYear3, @RequestParam(value = "auctionResult3", required = true) String auctionResult3, @RequestParam(value = "dispositionStatus3", required = true) String dispositionStatus3, @RequestParam(value = "dispositionDate3", required = true) Date dispositionDate3, @RequestParam(value = "openStatus3", required = true) String openStatus3, @RequestParam(value = "taxYear4", required = true) Integer taxYear4, @RequestParam(value = "auctionResult4", required = true) String auctionResult4, @RequestParam(value = "dispositionStatus4", required = true) String dispositionStatus4, @RequestParam(value = "dispositionDate4", required = true) Date dispositionDate4, @RequestParam(value = "openStatus4", required = true) String openStatus4, @RequestParam(value = "taxYear5", required = true) Integer taxYear5, @RequestParam(value = "auctionResult5", required = true) String auctionResult5, @RequestParam(value = "dispositionStatus5", required = true) String dispositionStatus5, @RequestParam(value = "dispositionDate5", required = true) Date dispositionDate5, @RequestParam(value = "openStatus5", required = true) String openStatus5) throws EntityNotFoundException {
        AuctionHistoryId auctionhistoryId = new AuctionHistoryId();
        auctionhistoryId.setAuctionId(auctionId);
        auctionhistoryId.setAuctionYear(auctionYear);
        auctionhistoryId.setTaxYear1(taxYear1);
        auctionhistoryId.setAuctionResult1(auctionResult1);
        auctionhistoryId.setDispositionStatus1(dispositionStatus1);
        auctionhistoryId.setDispositionDate1(dispositionDate1);
        auctionhistoryId.setOpenStatus1(openStatus1);
        auctionhistoryId.setTaxYear2(taxYear2);
        auctionhistoryId.setAuctionResult2(auctionResult2);
        auctionhistoryId.setDispositionStatus2(dispositionStatus2);
        auctionhistoryId.setDispositionDate2(dispositionDate2);
        auctionhistoryId.setOpenStatus2(openStatus2);
        auctionhistoryId.setTaxYear3(taxYear3);
        auctionhistoryId.setAuctionResult3(auctionResult3);
        auctionhistoryId.setDispositionStatus3(dispositionStatus3);
        auctionhistoryId.setDispositionDate3(dispositionDate3);
        auctionhistoryId.setOpenStatus3(openStatus3);
        auctionhistoryId.setTaxYear4(taxYear4);
        auctionhistoryId.setAuctionResult4(auctionResult4);
        auctionhistoryId.setDispositionStatus4(dispositionStatus4);
        auctionhistoryId.setDispositionDate4(dispositionDate4);
        auctionhistoryId.setOpenStatus4(openStatus4);
        auctionhistoryId.setTaxYear5(taxYear5);
        auctionhistoryId.setAuctionResult5(auctionResult5);
        auctionhistoryId.setDispositionStatus5(dispositionStatus5);
        auctionhistoryId.setDispositionDate5(dispositionDate5);
        auctionhistoryId.setOpenStatus5(openStatus5);
        LOGGER.debug("Getting AuctionHistory with id: {}", auctionhistoryId);
        AuctionHistory auctionhistory = auctionHistoryService.getById(auctionhistoryId);
        LOGGER.debug("AuctionHistory details with id: {}", auctionhistory);
        return auctionhistory;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of AuctionHistory instances.")
    public Long countAuctionHistories(@RequestParam(value = "q", required = false) String query) {
        LOGGER.debug("counting AuctionHistories");
        return auctionHistoryService.count(query);
    }
}
