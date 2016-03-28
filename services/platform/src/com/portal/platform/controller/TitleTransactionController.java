/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.portal.platform.service.TitleTransactionService;
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
 * Controller object for domain model class TitleTransaction.
 * @see com.portal.platform.TitleTransaction
 */
@RestController(value = "Platform.TitleTransactionController")
@RequestMapping("/platform/TitleTransaction")
@Api(description = "Exposes APIs to work with TitleTransaction resource.", value = "TitleTransactionController")
public class TitleTransactionController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TitleTransactionController.class);

    @Autowired
    @Qualifier("platform.TitleTransactionService")
    private TitleTransactionService titleTransactionService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of TitleTransaction instances matching the search criteria.")
    public Page<TitleTransaction> findTitleTransactions(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering TitleTransactions list");
        return titleTransactionService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of TitleTransaction instances.")
    public Page<TitleTransaction> getTitleTransactions(Pageable pageable) {
        LOGGER.debug("Rendering TitleTransactions list");
        return titleTransactionService.findAll(pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setTitleTransactionService(TitleTransactionService service) {
        this.titleTransactionService = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new TitleTransaction instance.")
    public TitleTransaction createTitleTransaction(@RequestBody TitleTransaction instance) {
        LOGGER.debug("Create TitleTransaction with information: {}", instance);
        instance = titleTransactionService.create(instance);
        LOGGER.debug("Created TitleTransaction with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of TitleTransaction instances.")
    public Long countAllTitleTransactions() {
        LOGGER.debug("counting TitleTransactions");
        Long count = titleTransactionService.countAll();
        return count;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the TitleTransaction instance associated with the given id.")
    public TitleTransaction getTitleTransaction(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting TitleTransaction with id: {}", id);
        TitleTransaction instance = titleTransactionService.findById(id);
        LOGGER.debug("TitleTransaction details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the TitleTransaction instance associated with the given id.")
    public TitleTransaction editTitleTransaction(@PathVariable(value = "id") Integer id, @RequestBody TitleTransaction instance) throws EntityNotFoundException {
        LOGGER.debug("Editing TitleTransaction with id: {}", instance.getId());
        instance.setId(id);
        instance = titleTransactionService.update(instance);
        LOGGER.debug("TitleTransaction details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the TitleTransaction instance associated with the given id.")
    public boolean deleteTitleTransaction(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting TitleTransaction with id: {}", id);
        TitleTransaction deleted = titleTransactionService.delete(id);
        return deleted != null;
    }
}
