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
import com.portal.platform.GradeStat;
import com.portal.platform.service.GradeStatService;
import com.wordnik.swagger.annotations.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

/**
 * Controller object for domain model class GradeStat.
 * @see GradeStat
 */
@RestController("platform.GradeStatController")
@RequestMapping("/platform/GradeStat")
@Api(description = "Exposes APIs to work with GradeStat resource.", value = "GradeStatController")
public class GradeStatController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GradeStatController.class);

    @Autowired
    @Qualifier("platform.GradeStatService")
    private GradeStatService gradeStatService;

    /**
     * @deprecated Use {@link #findGradeStats(String)} instead.
     */
    @Deprecated
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of GradeStat instances matching the search criteria.")
    public Page<GradeStat> findGradeStats(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering GradeStats list");
        return gradeStatService.findAll(queryFilters, pageable);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of GradeStat instances matching the search criteria.")
    public Page<GradeStat> findGradeStats(@RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering GradeStats list");
        return gradeStatService.findAll(query, pageable);
    }

    @RequestMapping(value = "/export/{exportType}", method = RequestMethod.GET, produces = "application/octet-stream")
    @ApiOperation(value = "Returns downloadable file for the data.")
    public Downloadable exportGradeStats(@PathVariable("exportType") ExportType exportType, @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        return gradeStatService.export(exportType, query, pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service GradeStatService instance
	 */
    protected void setGradeStatService(GradeStatService service) {
        this.gradeStatService = service;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of GradeStat instances.")
    public Long countGradeStats(@RequestParam(value = "q", required = false) String query) {
        LOGGER.debug("counting GradeStats");
        return gradeStatService.count(query);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the GradeStat instance associated with the given id.")
    public GradeStat getGradeStat(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting GradeStat with id: {}", id);
        GradeStat foundGradeStat = gradeStatService.getById(id);
        LOGGER.debug("GradeStat details with id: {}", foundGradeStat);
        return foundGradeStat;
    }
}
