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
import com.portal.platform.Accounting;
import com.portal.platform.AccountingId;
import com.portal.platform.service.AccountingService;
import com.wordnik.swagger.annotations.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

/**
 * Controller object for domain model class Accounting.
 * @see Accounting
 */
@RestController("platform.AccountingController")
@RequestMapping("/platform/Accounting")
@Api(description = "Exposes APIs to work with Accounting resource.", value = "AccountingController")
public class AccountingController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountingController.class);

    @Autowired
    @Qualifier("platform.AccountingService")
    private AccountingService accountingService;

    /**
     * @deprecated Use {@link #findAccountings(String)} instead.
     */
    @Deprecated
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of Accounting instances matching the search criteria.")
    public Page<Accounting> findAccountings(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Accountings list");
        return accountingService.findAll(queryFilters, pageable);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of Accounting instances matching the search criteria.")
    public Page<Accounting> findAccountings(@RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Accountings list");
        return accountingService.findAll(query, pageable);
    }

    @RequestMapping(value = "/export/{exportType}", method = RequestMethod.GET, produces = "application/octet-stream")
    @ApiOperation(value = "Returns downloadable file for the data.")
    public Downloadable exportAccountings(@PathVariable("exportType") ExportType exportType, @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        return accountingService.export(exportType, query, pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service AccountingService instance
	 */
    protected void setAccountingService(AccountingService service) {
        this.accountingService = service;
    }

    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the Accounting instance associated with the given composite-id.")
    public Accounting getAccounting(@RequestParam(value = "certificateId", required = true) int certificateId, @RequestParam(value = "accountingDate", required = true) Date accountingDate, @RequestParam(value = "effectiveDate", required = true) Date effectiveDate, @RequestParam(value = "transaction", required = true) String transaction, @RequestParam(value = "category", required = true) String category, @RequestParam(value = "type", required = true) String type, @RequestParam(value = "principal", required = true) Double principal, @RequestParam(value = "revenue", required = true) Double revenue, @RequestParam(value = "cash", required = true) Double cash) throws EntityNotFoundException {
        AccountingId accountingId = new AccountingId();
        accountingId.setCertificateId(certificateId);
        accountingId.setAccountingDate(accountingDate);
        accountingId.setEffectiveDate(effectiveDate);
        accountingId.setTransaction(transaction);
        accountingId.setCategory(category);
        accountingId.setType(type);
        accountingId.setPrincipal(principal);
        accountingId.setRevenue(revenue);
        accountingId.setCash(cash);
        LOGGER.debug("Getting Accounting with id: {}", accountingId);
        Accounting accounting = accountingService.getById(accountingId);
        LOGGER.debug("Accounting details with id: {}", accounting);
        return accounting;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of Accounting instances.")
    public Long countAccountings(@RequestParam(value = "q", required = false) String query) {
        LOGGER.debug("counting Accountings");
        return accountingService.count(query);
    }
}
