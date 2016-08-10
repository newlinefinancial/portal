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

import com.portal.platform.Inspection;
import com.portal.platform.RejectReason;
import com.portal.platform.service.InspectionService;
import com.portal.platform.service.RejectReasonService;


/**
 * Controller object for domain model class RejectReason.
 * @see RejectReason
 */
@RestController("platform.RejectReasonController")
@Api(value = "/platform/RejectReason", description = "Exposes APIs to work with RejectReason resource.")
@RequestMapping("/platform/RejectReason")
public class RejectReasonController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RejectReasonController.class);

    @Autowired
	@Qualifier("platform.RejectReasonService")
	private RejectReasonService rejectReasonService;

    @Autowired
	@Qualifier("platform.InspectionService")
	private InspectionService inspectionService;


    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the RejectReason instance associated with the given id.")
    public RejectReason getRejectReason(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting RejectReason with id: {}" , id);

        RejectReason foundRejectReason = rejectReasonService.getById(id);
        LOGGER.debug("RejectReason details with id: {}" , foundRejectReason);

        return foundRejectReason;
    }

    /**
     * @deprecated Use {@link #findRejectReasons(String)} instead.
     */
    @Deprecated
    @RequestMapping(value = "/search", method = RequestMethod.POST)
	@ApiOperation(value = "Returns the list of RejectReason instances matching the search criteria.")
	public Page<RejectReason> findRejectReasons( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
		LOGGER.debug("Rendering RejectReasons list");
		return rejectReasonService.findAll(queryFilters, pageable);
	}

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of RejectReason instances matching the search criteria.")
    public Page<RejectReason> findRejectReasons(@RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering RejectReasons list");
    	return rejectReasonService.findAll(query, pageable);
    }

    @RequestMapping(value = "/export/{exportType}", method = RequestMethod.GET, produces = "application/octet-stream")
    @ApiOperation(value = "Returns downloadable file for the data.")
    public Downloadable exportRejectReasons(@PathVariable("exportType") ExportType exportType, @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return rejectReasonService.export(exportType, query, pageable);
    }

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the total count of RejectReason instances.")
	public Long countRejectReasons(@RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting RejectReasons");
		return rejectReasonService.count(query);
	}

    @RequestMapping(value="/{id:.+}/inspections", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the inspections instance associated with the given id.")
     public Page<Inspection> findAssociatedInspections(Pageable pageable, @PathVariable("id") Integer id) {
        LOGGER.debug("Fetching all associated inspections");
        return inspectionService.findAssociatedValues(id, "rejectReason", "id", pageable);
   }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service RejectReasonService instance
	 */
	protected void setRejectReasonService(RejectReasonService service) {
		this.rejectReasonService = service;
	}

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service InspectionService instance
	 */
	protected void setInspectionService(InspectionService service) {
        this.inspectionService = service;
    }
}

