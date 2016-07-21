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
import com.portal.platform.County;
import com.portal.platform.State;
import com.portal.platform.service.CountyService;
import com.portal.platform.service.StateService;
import com.wordnik.swagger.annotations.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

/**
 * Controller object for domain model class State.
 * @see State
 */
@RestController("platform.StateController")
@RequestMapping("/platform/State")
@Api(description = "Exposes APIs to work with State resource.", value = "StateController")
public class StateController {

    private static final Logger LOGGER = LoggerFactory.getLogger(StateController.class);

    @Autowired
    @Qualifier("platform.StateService")
    private StateService stateService;

    @Autowired
    @Qualifier("platform.CountyService")
    private CountyService countyService;

    /**
     * @deprecated Use {@link #findStates(String)} instead.
     */
    @Deprecated
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of State instances matching the search criteria.")
    public Page<State> findStates(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering States list");
        return stateService.findAll(queryFilters, pageable);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of State instances matching the search criteria.")
    public Page<State> findStates(@RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering States list");
        return stateService.findAll(query, pageable);
    }

    @RequestMapping(value = "/export/{exportType}", method = RequestMethod.GET, produces = "application/octet-stream")
    @ApiOperation(value = "Returns downloadable file for the data.")
    public Downloadable exportStates(@PathVariable("exportType") ExportType exportType, @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        return stateService.export(exportType, query, pageable);
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the total count of State instances.")
    public Long countStates(@RequestParam(value = "q", required = false) String query) {
        LOGGER.debug("counting States");
        return stateService.count(query);
    }

    @RequestMapping(value = "/{id:.+}/counties", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the counties instance associated with the given id.")
    public Page<County> findAssociatedCounties(Pageable pageable, @PathVariable("id") Integer id) {
        LOGGER.debug("Fetching all associated counties");
        return countyService.findAssociatedValues(id, "state", "id", pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service StateService instance
	 */
    protected void setStateService(StateService service) {
        this.stateService = service;
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service CountyService instance
	 */
    protected void setCountyService(CountyService service) {
        this.countyService = service;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the State instance associated with the given id.")
    public State getState(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting State with id: {}", id);
        State foundState = stateService.getById(id);
        LOGGER.debug("State details with id: {}", foundState);
        return foundState;
    }
}
