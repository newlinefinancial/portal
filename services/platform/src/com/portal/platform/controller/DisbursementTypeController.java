/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/
package com.portal.platform.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.portal.platform.service.DisbursementTypeService;
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
 * Controller object for domain model class DisbursementType.
 * @see com.portal.platform.DisbursementType
 */
@RestController(value = "Platform.DisbursementTypeController")
@RequestMapping("/platform/DisbursementType")
@Api(description = "Exposes APIs to work with DisbursementType resource.", value = "DisbursementTypeController")
public class DisbursementTypeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DisbursementTypeController.class);

    @Autowired
    @Qualifier("platform.DisbursementTypeService")
    private DisbursementTypeService disbursementTypeService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of DisbursementType instances matching the search criteria.")
    public Page<DisbursementType> findDisbursementTypes(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering DisbursementTypes list");
        return disbursementTypeService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of DisbursementType instances.")
    public Page<DisbursementType> getDisbursementTypes(Pageable pageable) {
        LOGGER.debug("Rendering DisbursementTypes list");
        return disbursementTypeService.findAll(pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setDisbursementTypeService(DisbursementTypeService service) {
        this.disbursementTypeService = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new DisbursementType instance.")
    public DisbursementType createDisbursementType(@RequestBody DisbursementType instance) {
        LOGGER.debug("Create DisbursementType with information: {}", instance);
        instance = disbursementTypeService.create(instance);
        LOGGER.debug("Created DisbursementType with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of DisbursementType instances.")
    public Long countAllDisbursementTypes() {
        LOGGER.debug("counting DisbursementTypes");
        Long count = disbursementTypeService.countAll();
        return count;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the DisbursementType instance associated with the given id.")
    public DisbursementType getDisbursementType(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting DisbursementType with id: {}", id);
        DisbursementType instance = disbursementTypeService.findById(id);
        LOGGER.debug("DisbursementType details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the DisbursementType instance associated with the given id.")
    public DisbursementType editDisbursementType(@PathVariable(value = "id") Integer id, @RequestBody DisbursementType instance) throws EntityNotFoundException {
        LOGGER.debug("Editing DisbursementType with id: {}", instance.getId());
        instance.setId(id);
        instance = disbursementTypeService.update(instance);
        LOGGER.debug("DisbursementType details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the DisbursementType instance associated with the given id.")
    public boolean deleteDisbursementType(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting DisbursementType with id: {}", id);
        DisbursementType deleted = disbursementTypeService.delete(id);
        return deleted != null;
    }
}
