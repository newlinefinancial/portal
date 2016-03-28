/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.portal.platform.service.BankReportService;
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
 * Controller object for domain model class BankReport.
 * @see com.portal.platform.BankReport
 */
@RestController(value = "Platform.BankReportController")
@RequestMapping("/platform/BankReport")
@Api(description = "Exposes APIs to work with BankReport resource.", value = "BankReportController")
public class BankReportController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BankReportController.class);

    @Autowired
    @Qualifier("platform.BankReportService")
    private BankReportService bankReportService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of BankReport instances matching the search criteria.")
    public Page<BankReport> findBankReports(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering BankReports list");
        return bankReportService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of BankReport instances.")
    public Page<BankReport> getBankReports(Pageable pageable) {
        LOGGER.debug("Rendering BankReports list");
        return bankReportService.findAll(pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setBankReportService(BankReportService service) {
        this.bankReportService = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new BankReport instance.")
    public BankReport createBankReport(@RequestBody BankReport instance) {
        LOGGER.debug("Create BankReport with information: {}", instance);
        instance = bankReportService.create(instance);
        LOGGER.debug("Created BankReport with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of BankReport instances.")
    public Long countAllBankReports() {
        LOGGER.debug("counting BankReports");
        Long count = bankReportService.countAll();
        return count;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the BankReport instance associated with the given id.")
    public BankReport getBankReport(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting BankReport with id: {}", id);
        BankReport instance = bankReportService.findById(id);
        LOGGER.debug("BankReport details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the BankReport instance associated with the given id.")
    public BankReport editBankReport(@PathVariable(value = "id") Integer id, @RequestBody BankReport instance) throws EntityNotFoundException {
        LOGGER.debug("Editing BankReport with id: {}", instance.getId());
        instance.setId(id);
        instance = bankReportService.update(instance);
        LOGGER.debug("BankReport details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the BankReport instance associated with the given id.")
    public boolean deleteBankReport(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting BankReport with id: {}", id);
        BankReport deleted = bankReportService.delete(id);
        return deleted != null;
    }
}
