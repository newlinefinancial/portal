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
import com.portal.platform.TitleTransaction;
import com.portal.platform.TitleType;
import com.portal.platform.service.TitleTransactionService;
import com.portal.platform.service.TitleTypeService;
import com.wordnik.swagger.annotations.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

/**
 * Controller object for domain model class TitleType.
 * @see TitleType
 */
@RestController("platform.TitleTypeController")
@RequestMapping("/platform/TitleType")
@Api(description = "Exposes APIs to work with TitleType resource.", value = "TitleTypeController")
public class TitleTypeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TitleTypeController.class);

    @Autowired
    @Qualifier("platform.TitleTypeService")
    private TitleTypeService titleTypeService;

    @Autowired
    @Qualifier("platform.TitleTransactionService")
    private TitleTransactionService titleTransactionService;

    /**
     * @deprecated Use {@link #findTitleTypes(String)} instead.
     */
    @Deprecated
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of TitleType instances matching the search criteria.")
    public Page<TitleType> findTitleTypes(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering TitleTypes list");
        return titleTypeService.findAll(queryFilters, pageable);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of TitleType instances matching the search criteria.")
    public Page<TitleType> findTitleTypes(@RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering TitleTypes list");
        return titleTypeService.findAll(query, pageable);
    }

    @RequestMapping(value = "/export/{exportType}", method = RequestMethod.GET, produces = "application/octet-stream")
    @ApiOperation(value = "Returns downloadable file for the data.")
    public Downloadable exportTitleTypes(@PathVariable("exportType") ExportType exportType, @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        return titleTypeService.export(exportType, query, pageable);
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the total count of TitleType instances.")
    public Long countTitleTypes(@RequestParam(value = "q", required = false) String query) {
        LOGGER.debug("counting TitleTypes");
        return titleTypeService.count(query);
    }

    @RequestMapping(value = "/{id:.+}/titleTransactions", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the titleTransactions instance associated with the given id.")
    public Page<TitleTransaction> findAssociatedTitleTransactions(Pageable pageable, @PathVariable("id") Integer id) {
        LOGGER.debug("Fetching all associated titleTransactions");
        return titleTransactionService.findAssociatedValues(id, "titleTypeByTitleType", "id", pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service TitleTypeService instance
	 */
    protected void setTitleTypeService(TitleTypeService service) {
        this.titleTypeService = service;
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service TitleTransactionService instance
	 */
    protected void setTitleTransactionService(TitleTransactionService service) {
        this.titleTransactionService = service;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the TitleType instance associated with the given id.")
    public TitleType getTitleType(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting TitleType with id: {}", id);
        TitleType foundTitleType = titleTypeService.getById(id);
        LOGGER.debug("TitleType details with id: {}", foundTitleType);
        return foundTitleType;
    }
}
