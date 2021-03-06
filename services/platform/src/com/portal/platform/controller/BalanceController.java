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
import com.portal.platform.Balance;
import com.portal.platform.BalanceId;
import com.portal.platform.service.BalanceService;
import com.wordnik.swagger.annotations.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

/**
 * Controller object for domain model class Balance.
 * @see Balance
 */
@RestController("platform.BalanceController")
@RequestMapping("/platform/Balance")
@Api(description = "Exposes APIs to work with Balance resource.", value = "BalanceController")
public class BalanceController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BalanceController.class);

    @Autowired
    @Qualifier("platform.BalanceService")
    private BalanceService balanceService;

    /**
     * @deprecated Use {@link #findBalances(String)} instead.
     */
    @Deprecated
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of Balance instances matching the search criteria.")
    public Page<Balance> findBalances(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Balances list");
        return balanceService.findAll(queryFilters, pageable);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of Balance instances matching the search criteria.")
    public Page<Balance> findBalances(@RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Balances list");
        return balanceService.findAll(query, pageable);
    }

    @RequestMapping(value = "/export/{exportType}", method = RequestMethod.GET, produces = "application/octet-stream")
    @ApiOperation(value = "Returns downloadable file for the data.")
    public Downloadable exportBalances(@PathVariable("exportType") ExportType exportType, @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        return balanceService.export(exportType, query, pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service BalanceService instance
	 */
    protected void setBalanceService(BalanceService service) {
        this.balanceService = service;
    }

    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the Balance instance associated with the given composite-id.")
    public Balance getBalance(@RequestParam(value = "certificateId", required = true) int certificateId, @RequestParam(value = "prior", required = true) Double prior, @RequestParam(value = "certificatePrincipal", required = true) Double certificatePrincipal, @RequestParam(value = "subPrincipal", required = true) Double subPrincipal, @RequestParam(value = "feePrincipal", required = true) Double feePrincipal, @RequestParam(value = "principal", required = true) Double principal, @RequestParam(value = "certificateRevenue", required = true) Double certificateRevenue, @RequestParam(value = "subRevenue", required = true) Double subRevenue, @RequestParam(value = "feeRevenue", required = true) Double feeRevenue, @RequestParam(value = "revenue", required = true) Double revenue, @RequestParam(value = "redemptionAmount", required = true) Double redemptionAmount, @RequestParam(value = "amountPaid", required = true) Double amountPaid, @RequestParam(value = "balanceDue", required = true) Double balanceDue, @RequestParam(value = "paymentInTransit", required = true) Double paymentInTransit, @RequestParam(value = "dueAfterSettlement", required = true) Double dueAfterSettlement, @RequestParam(value = "facilityPayoff", required = true) Double facilityPayoff) throws EntityNotFoundException {
        BalanceId balanceId = new BalanceId();
        balanceId.setCertificateId(certificateId);
        balanceId.setPrior(prior);
        balanceId.setCertificatePrincipal(certificatePrincipal);
        balanceId.setSubPrincipal(subPrincipal);
        balanceId.setFeePrincipal(feePrincipal);
        balanceId.setPrincipal(principal);
        balanceId.setCertificateRevenue(certificateRevenue);
        balanceId.setSubRevenue(subRevenue);
        balanceId.setFeeRevenue(feeRevenue);
        balanceId.setRevenue(revenue);
        balanceId.setRedemptionAmount(redemptionAmount);
        balanceId.setAmountPaid(amountPaid);
        balanceId.setBalanceDue(balanceDue);
        balanceId.setPaymentInTransit(paymentInTransit);
        balanceId.setDueAfterSettlement(dueAfterSettlement);
        balanceId.setFacilityPayoff(facilityPayoff);
        LOGGER.debug("Getting Balance with id: {}", balanceId);
        Balance balance = balanceService.getById(balanceId);
        LOGGER.debug("Balance details with id: {}", balance);
        return balance;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of Balance instances.")
    public Long countBalances(@RequestParam(value = "q", required = false) String query) {
        LOGGER.debug("counting Balances");
        return balanceService.count(query);
    }
}
