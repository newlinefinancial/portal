/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/
package com.portal.platform.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.portal.platform.service.PropertyExteriorService;
import com.portal.platform.service.PropertyService;
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
 * Controller object for domain model class PropertyExterior.
 * @see com.portal.platform.PropertyExterior
 */
@RestController(value = "Platform.PropertyExteriorController")
@RequestMapping("/platform/PropertyExterior")
@Api(description = "Exposes APIs to work with PropertyExterior resource.", value = "PropertyExteriorController")
public class PropertyExteriorController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropertyExteriorController.class);

    @Autowired
    @Qualifier("platform.PropertyExteriorService")
    private PropertyExteriorService propertyExteriorService;

    @Autowired
    @Qualifier("platform.PropertyService")
    private PropertyService propertyService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of PropertyExterior instances matching the search criteria.")
    public Page<PropertyExterior> findPropertyExteriors(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering PropertyExteriors list");
        return propertyExteriorService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of PropertyExterior instances.")
    public Page<PropertyExterior> getPropertyExteriors(Pageable pageable) {
        LOGGER.debug("Rendering PropertyExteriors list");
        return propertyExteriorService.findAll(pageable);
    }

    @RequestMapping(value = "/{id:.+}/properties", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the properties instance associated with the given id.")
    public Page<Property> findAssociatedproperties(Pageable pageable, @PathVariable("id") Integer id) {
        LOGGER.debug("Fetching all associated properties");
        return propertyService.findAssociatedValues(id, "propertyExterior", "id", pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setPropertyExteriorService(PropertyExteriorService service) {
        this.propertyExteriorService = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new PropertyExterior instance.")
    public PropertyExterior createPropertyExterior(@RequestBody PropertyExterior instance) {
        LOGGER.debug("Create PropertyExterior with information: {}", instance);
        instance = propertyExteriorService.create(instance);
        LOGGER.debug("Created PropertyExterior with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of PropertyExterior instances.")
    public Long countAllPropertyExteriors() {
        LOGGER.debug("counting PropertyExteriors");
        Long count = propertyExteriorService.countAll();
        return count;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the PropertyExterior instance associated with the given id.")
    public PropertyExterior getPropertyExterior(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting PropertyExterior with id: {}", id);
        PropertyExterior instance = propertyExteriorService.findById(id);
        LOGGER.debug("PropertyExterior details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the PropertyExterior instance associated with the given id.")
    public PropertyExterior editPropertyExterior(@PathVariable(value = "id") Integer id, @RequestBody PropertyExterior instance) throws EntityNotFoundException {
        LOGGER.debug("Editing PropertyExterior with id: {}", instance.getId());
        instance.setId(id);
        instance = propertyExteriorService.update(instance);
        LOGGER.debug("PropertyExterior details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the PropertyExterior instance associated with the given id.")
    public boolean deletePropertyExterior(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting PropertyExterior with id: {}", id);
        PropertyExterior deleted = propertyExteriorService.delete(id);
        return deleted != null;
    }
}
