/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/
package com.portal.platform.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.portal.platform.service.BuyerGroupService;
import com.portal.platform.service.BuyerService;
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
 * Controller object for domain model class BuyerGroup.
 * @see com.portal.platform.BuyerGroup
 */
@RestController(value = "Platform.BuyerGroupController")
@RequestMapping("/platform/BuyerGroup")
@Api(description = "Exposes APIs to work with BuyerGroup resource.", value = "BuyerGroupController")
public class BuyerGroupController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BuyerGroupController.class);

    @Autowired
    @Qualifier("platform.BuyerGroupService")
    private BuyerGroupService buyerGroupService;

    @Autowired
    @Qualifier("platform.BuyerService")
    private BuyerService buyerService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of BuyerGroup instances matching the search criteria.")
    public Page<BuyerGroup> findBuyerGroups(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering BuyerGroups list");
        return buyerGroupService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of BuyerGroup instances.")
    public Page<BuyerGroup> getBuyerGroups(Pageable pageable) {
        LOGGER.debug("Rendering BuyerGroups list");
        return buyerGroupService.findAll(pageable);
    }

    @RequestMapping(value = "/{id:.+}/buyers", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the buyers instance associated with the given id.")
    public Page<Buyer> findAssociatedbuyers(Pageable pageable, @PathVariable("id") Integer id) {
        LOGGER.debug("Fetching all associated buyers");
        return buyerService.findAssociatedValues(id, "buyerGroup", "id", pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setBuyerGroupService(BuyerGroupService service) {
        this.buyerGroupService = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new BuyerGroup instance.")
    public BuyerGroup createBuyerGroup(@RequestBody BuyerGroup instance) {
        LOGGER.debug("Create BuyerGroup with information: {}", instance);
        instance = buyerGroupService.create(instance);
        LOGGER.debug("Created BuyerGroup with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of BuyerGroup instances.")
    public Long countAllBuyerGroups() {
        LOGGER.debug("counting BuyerGroups");
        Long count = buyerGroupService.countAll();
        return count;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the BuyerGroup instance associated with the given id.")
    public BuyerGroup getBuyerGroup(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting BuyerGroup with id: {}", id);
        BuyerGroup instance = buyerGroupService.findById(id);
        LOGGER.debug("BuyerGroup details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the BuyerGroup instance associated with the given id.")
    public BuyerGroup editBuyerGroup(@PathVariable(value = "id") Integer id, @RequestBody BuyerGroup instance) throws EntityNotFoundException {
        LOGGER.debug("Editing BuyerGroup with id: {}", instance.getId());
        instance.setId(id);
        instance = buyerGroupService.update(instance);
        LOGGER.debug("BuyerGroup details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the BuyerGroup instance associated with the given id.")
    public boolean deleteBuyerGroup(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting BuyerGroup with id: {}", id);
        BuyerGroup deleted = buyerGroupService.delete(id);
        return deleted != null;
    }
}
