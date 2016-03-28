/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.portal.platform.service.TaxScheduleService;
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
 * Controller object for domain model class TaxSchedule.
 * @see com.portal.platform.TaxSchedule
 */
@RestController(value = "Platform.TaxScheduleController")
@RequestMapping("/platform/TaxSchedule")
@Api(description = "Exposes APIs to work with TaxSchedule resource.", value = "TaxScheduleController")
public class TaxScheduleController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TaxScheduleController.class);

    @Autowired
    @Qualifier("platform.TaxScheduleService")
    private TaxScheduleService taxScheduleService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of TaxSchedule instances matching the search criteria.")
    public Page<TaxSchedule> findTaxSchedules(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering TaxSchedules list");
        return taxScheduleService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of TaxSchedule instances.")
    public Page<TaxSchedule> getTaxSchedules(Pageable pageable) {
        LOGGER.debug("Rendering TaxSchedules list");
        return taxScheduleService.findAll(pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setTaxScheduleService(TaxScheduleService service) {
        this.taxScheduleService = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new TaxSchedule instance.")
    public TaxSchedule createTaxSchedule(@RequestBody TaxSchedule instance) {
        LOGGER.debug("Create TaxSchedule with information: {}", instance);
        instance = taxScheduleService.create(instance);
        LOGGER.debug("Created TaxSchedule with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of TaxSchedule instances.")
    public Long countAllTaxSchedules() {
        LOGGER.debug("counting TaxSchedules");
        Long count = taxScheduleService.countAll();
        return count;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the TaxSchedule instance associated with the given id.")
    public TaxSchedule getTaxSchedule(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting TaxSchedule with id: {}", id);
        TaxSchedule instance = taxScheduleService.findById(id);
        LOGGER.debug("TaxSchedule details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the TaxSchedule instance associated with the given id.")
    public TaxSchedule editTaxSchedule(@PathVariable(value = "id") Integer id, @RequestBody TaxSchedule instance) throws EntityNotFoundException {
        LOGGER.debug("Editing TaxSchedule with id: {}", instance.getId());
        instance.setId(id);
        instance = taxScheduleService.update(instance);
        LOGGER.debug("TaxSchedule details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the TaxSchedule instance associated with the given id.")
    public boolean deleteTaxSchedule(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting TaxSchedule with id: {}", id);
        TaxSchedule deleted = taxScheduleService.delete(id);
        return deleted != null;
    }
}
