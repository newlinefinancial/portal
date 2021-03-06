/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/
package com.portal.platform.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import java.math.BigDecimal;
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
import com.portal.platform.BankReport;
import com.portal.platform.BankReportId;
import com.portal.platform.service.BankReportService;
import com.wordnik.swagger.annotations.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

/**
 * Controller object for domain model class BankReport.
 * @see BankReport
 */
@RestController("platform.BankReportController")
@RequestMapping("/platform/BankReport")
@Api(description = "Exposes APIs to work with BankReport resource.", value = "BankReportController")
public class BankReportController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BankReportController.class);

    @Autowired
    @Qualifier("platform.BankReportService")
    private BankReportService bankReportService;

    /**
     * @deprecated Use {@link #findBankReports(String)} instead.
     */
    @Deprecated
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of BankReport instances matching the search criteria.")
    public Page<BankReport> findBankReports(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering BankReports list");
        return bankReportService.findAll(queryFilters, pageable);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of BankReport instances matching the search criteria.")
    public Page<BankReport> findBankReports(@RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering BankReports list");
        return bankReportService.findAll(query, pageable);
    }

    @RequestMapping(value = "/export/{exportType}", method = RequestMethod.GET, produces = "application/octet-stream")
    @ApiOperation(value = "Returns downloadable file for the data.")
    public Downloadable exportBankReports(@PathVariable("exportType") ExportType exportType, @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        return bankReportService.export(exportType, query, pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service BankReportService instance
	 */
    protected void setBankReportService(BankReportService service) {
        this.bankReportService = service;
    }

    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the BankReport instance associated with the given composite-id.")
    public BankReport getBankReport(@RequestParam(value = "event", required = true) String event, @RequestParam(value = "state", required = true) String state, @RequestParam(value = "countyName", required = true) String countyName, @RequestParam(value = "taxYear", required = true) int taxYear, @RequestParam(value = "certificateNumber", required = true) String certificateNumber, @RequestParam(value = "volume", required = true) int volume, @RequestParam(value = "pin", required = true) String pin, @RequestParam(value = "bank", required = true) String bank, @RequestParam(value = "activityDate", required = true) Date activityDate, @RequestParam(value = "amount", required = true) Double amount, @RequestParam(value = "lenderPortion", required = true) BigDecimal lenderPortion, @RequestParam(value = "certificatePrincipal", required = true) Double certificatePrincipal, @RequestParam(value = "subPrincipal", required = true) Double subPrincipal, @RequestParam(value = "revenue", required = true) Double revenue, @RequestParam(value = "balanceDue", required = true) Double balanceDue) throws EntityNotFoundException {
        BankReportId bankreportId = new BankReportId();
        bankreportId.setEvent(event);
        bankreportId.setState(state);
        bankreportId.setCountyName(countyName);
        bankreportId.setTaxYear(taxYear);
        bankreportId.setCertificateNumber(certificateNumber);
        bankreportId.setVolume(volume);
        bankreportId.setPin(pin);
        bankreportId.setBank(bank);
        bankreportId.setActivityDate(activityDate);
        bankreportId.setAmount(amount);
        bankreportId.setLenderPortion(lenderPortion);
        bankreportId.setCertificatePrincipal(certificatePrincipal);
        bankreportId.setSubPrincipal(subPrincipal);
        bankreportId.setRevenue(revenue);
        bankreportId.setBalanceDue(balanceDue);
        LOGGER.debug("Getting BankReport with id: {}", bankreportId);
        BankReport bankreport = bankReportService.getById(bankreportId);
        LOGGER.debug("BankReport details with id: {}", bankreport);
        return bankreport;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of BankReport instances.")
    public Long countBankReports(@RequestParam(value = "q", required = false) String query) {
        LOGGER.debug("counting BankReports");
        return bankReportService.count(query);
    }
}
