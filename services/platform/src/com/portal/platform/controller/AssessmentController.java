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
import com.portal.platform.Assessment;
import com.portal.platform.service.AssessmentService;
import com.wordnik.swagger.annotations.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

/**
 * Controller object for domain model class Assessment.
 * @see Assessment
 */
@RestController("platform.AssessmentController")
@RequestMapping("/platform/Assessment")
@Api(description = "Exposes APIs to work with Assessment resource.", value = "AssessmentController")
public class AssessmentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AssessmentController.class);

    @Autowired
    @Qualifier("platform.AssessmentService")
    private AssessmentService assessmentService;

    /**
     * @deprecated Use {@link #findAssessments(String)} instead.
     */
    @Deprecated
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of Assessment instances matching the search criteria.")
    public Page<Assessment> findAssessments(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Assessments list");
        return assessmentService.findAll(queryFilters, pageable);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of Assessment instances matching the search criteria.")
    public Page<Assessment> findAssessments(@RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Assessments list");
        return assessmentService.findAll(query, pageable);
    }

    @RequestMapping(value = "/export/{exportType}", method = RequestMethod.GET, produces = "application/octet-stream")
    @ApiOperation(value = "Returns downloadable file for the data.")
    public Downloadable exportAssessments(@PathVariable("exportType") ExportType exportType, @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        return assessmentService.export(exportType, query, pageable);
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the total count of Assessment instances.")
    public Long countAssessments(@RequestParam(value = "q", required = false) String query) {
        LOGGER.debug("counting Assessments");
        return assessmentService.count(query);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service AssessmentService instance
	 */
    protected void setAssessmentService(AssessmentService service) {
        this.assessmentService = service;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the Assessment instance associated with the given id.")
    public Assessment getAssessment(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting Assessment with id: {}", id);
        Assessment foundAssessment = assessmentService.getById(id);
        LOGGER.debug("Assessment details with id: {}", foundAssessment);
        return foundAssessment;
    }
}
