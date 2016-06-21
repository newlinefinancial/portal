/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/
package com.portal.platform.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.portal.platform.service.AuctionService;
import com.portal.platform.service.CertificateService;
import com.portal.platform.service.CountyService;
import com.portal.platform.service.GradeService;
import com.portal.platform.service.PropertyClassService;
import com.portal.platform.service.PropertyService;
import com.portal.platform.service.TaxScheduleService;
import com.portal.platform.service.TownshipService;
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
 * Controller object for domain model class County.
 * @see com.portal.platform.County
 */
@RestController(value = "Platform.CountyController")
@RequestMapping("/platform/County")
@Api(description = "Exposes APIs to work with County resource.", value = "CountyController")
public class CountyController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountyController.class);

    @Autowired
    @Qualifier("platform.CountyService")
    private CountyService countyService;

    @Autowired
    @Qualifier("platform.PropertyClassService")
    private PropertyClassService propertyClassService;

    @Autowired
    @Qualifier("platform.TaxScheduleService")
    private TaxScheduleService taxScheduleService;

    @Autowired
    @Qualifier("platform.GradeService")
    private GradeService gradeService;

    @Autowired
    @Qualifier("platform.AuctionService")
    private AuctionService auctionService;

    @Autowired
    @Qualifier("platform.TownshipService")
    private TownshipService townshipService;

    @Autowired
    @Qualifier("platform.PropertyService")
    private PropertyService propertyService;

    @Autowired
    @Qualifier("platform.CertificateService")
    private CertificateService certificateService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of County instances matching the search criteria.")
    public Page<County> findCountys(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Countys list");
        return countyService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of County instances.")
    public Page<County> getCountys(Pageable pageable) {
        LOGGER.debug("Rendering Countys list");
        return countyService.findAll(pageable);
    }

    @RequestMapping(value = "/{id:.+}/auctions", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the auctions instance associated with the given id.")
    public Page<Auction> findAssociatedauctions(Pageable pageable, @PathVariable("id") Integer id) {
        LOGGER.debug("Fetching all associated auctions");
        return auctionService.findAssociatedValues(id, "county", "id", pageable);
    }

    @RequestMapping(value = "/{id:.+}/propertyClasses", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the propertyClasses instance associated with the given id.")
    public Page<PropertyClass> findAssociatedpropertyClasses(Pageable pageable, @PathVariable("id") Integer id) {
        LOGGER.debug("Fetching all associated propertyClasses");
        return propertyClassService.findAssociatedValues(id, "county", "id", pageable);
    }

    @RequestMapping(value = "/{id:.+}/townships", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the townships instance associated with the given id.")
    public Page<Township> findAssociatedtownships(Pageable pageable, @PathVariable("id") Integer id) {
        LOGGER.debug("Fetching all associated townships");
        return townshipService.findAssociatedValues(id, "county", "id", pageable);
    }

    @RequestMapping(value = "/{id:.+}/taxSchedules", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the taxSchedules instance associated with the given id.")
    public Page<TaxSchedule> findAssociatedtaxSchedules(Pageable pageable, @PathVariable("id") Integer id) {
        LOGGER.debug("Fetching all associated taxSchedules");
        return taxScheduleService.findAssociatedValues(id, "county", "id", pageable);
    }

    @RequestMapping(value = "/{id:.+}/properties", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the properties instance associated with the given id.")
    public Page<Property> findAssociatedproperties(Pageable pageable, @PathVariable("id") Integer id) {
        LOGGER.debug("Fetching all associated properties");
        return propertyService.findAssociatedValues(id, "county", "id", pageable);
    }

    @RequestMapping(value = "/{id:.+}/grades", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the grades instance associated with the given id.")
    public Page<Grade> findAssociatedgrades(Pageable pageable, @PathVariable("id") Integer id) {
        LOGGER.debug("Fetching all associated grades");
        return gradeService.findAssociatedValues(id, "county", "id", pageable);
    }

    @RequestMapping(value = "/{id:.+}/certificates", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the certificates instance associated with the given id.")
    public Page<Certificate> findAssociatedcertificates(Pageable pageable, @PathVariable("id") Integer id) {
        LOGGER.debug("Fetching all associated certificates");
        return certificateService.findAssociatedValues(id, "county", "id", pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setCountyService(CountyService service) {
        this.countyService = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new County instance.")
    public County createCounty(@RequestBody County instance) {
        LOGGER.debug("Create County with information: {}", instance);
        instance = countyService.create(instance);
        LOGGER.debug("Created County with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of County instances.")
    public Long countAllCountys() {
        LOGGER.debug("counting Countys");
        Long count = countyService.countAll();
        return count;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the County instance associated with the given id.")
    public County getCounty(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting County with id: {}", id);
        County instance = countyService.findById(id);
        LOGGER.debug("County details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the County instance associated with the given id.")
    public County editCounty(@PathVariable(value = "id") Integer id, @RequestBody County instance) throws EntityNotFoundException {
        LOGGER.debug("Editing County with id: {}", instance.getId());
        instance.setId(id);
        instance = countyService.update(instance);
        LOGGER.debug("County details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the County instance associated with the given id.")
    public boolean deleteCounty(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting County with id: {}", id);
        County deleted = countyService.delete(id);
        return deleted != null;
    }
}
