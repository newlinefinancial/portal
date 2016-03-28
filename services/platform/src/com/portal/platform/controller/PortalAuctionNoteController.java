/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.portal.platform.service.PortalAuctionNoteService;
import java.util.Date;
import org.springframework.web.bind.annotation.RequestBody;
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
 * Controller object for domain model class PortalAuctionNote.
 * @see com.portal.platform.PortalAuctionNote
 */
@RestController(value = "Platform.PortalAuctionNoteController")
@RequestMapping("/platform/PortalAuctionNote")
@Api(description = "Exposes APIs to work with PortalAuctionNote resource.", value = "PortalAuctionNoteController")
public class PortalAuctionNoteController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PortalAuctionNoteController.class);

    @Autowired
    @Qualifier("platform.PortalAuctionNoteService")
    private PortalAuctionNoteService portalAuctionNoteService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of PortalAuctionNote instances matching the search criteria.")
    public Page<PortalAuctionNote> findPortalAuctionNotes(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering PortalAuctionNotes list");
        return portalAuctionNoteService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of PortalAuctionNote instances.")
    public Page<PortalAuctionNote> getPortalAuctionNotes(Pageable pageable) {
        LOGGER.debug("Rendering PortalAuctionNotes list");
        return portalAuctionNoteService.findAll(pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setPortalAuctionNoteService(PortalAuctionNoteService service) {
        this.portalAuctionNoteService = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new PortalAuctionNote instance.")
    public PortalAuctionNote createPortalAuctionNote(@RequestBody PortalAuctionNote instance) {
        LOGGER.debug("Create PortalAuctionNote with information: {}", instance);
        instance = portalAuctionNoteService.create(instance);
        LOGGER.debug("Created PortalAuctionNote with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the PortalAuctionNote instance associated with the given composite-id.")
    public PortalAuctionNote getPortalAuctionNote(@RequestParam(value = "propertyId", required = true) Integer propertyId, @RequestParam(value = "noteId", required = true) Integer noteId, @RequestParam(value = "user", required = true) String user, @RequestParam(value = "created", required = true) Date created, @RequestParam(value = "done", required = true) Date done, @RequestParam(value = "noteDescription", required = true) String noteDescription, @RequestParam(value = "noteTypeId", required = true) Integer noteTypeId) throws EntityNotFoundException {
        PortalAuctionNoteId temp = new PortalAuctionNoteId();
        temp.setPropertyId(propertyId);
        temp.setNoteId(noteId);
        temp.setUser(user);
        temp.setCreated(created);
        temp.setDone(done);
        temp.setNoteDescription(noteDescription);
        temp.setNoteTypeId(noteTypeId);
        LOGGER.debug("Getting PortalAuctionNote with id: {}", temp);
        PortalAuctionNote instance = portalAuctionNoteService.findById(temp);
        LOGGER.debug("PortalAuctionNote details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the PortalAuctionNote instance associated with the given composite-id.")
    public PortalAuctionNote editPortalAuctionNote(@RequestParam(value = "propertyId", required = true) Integer propertyId, @RequestParam(value = "noteId", required = true) Integer noteId, @RequestParam(value = "user", required = true) String user, @RequestParam(value = "created", required = true) Date created, @RequestParam(value = "done", required = true) Date done, @RequestParam(value = "noteDescription", required = true) String noteDescription, @RequestParam(value = "noteTypeId", required = true) Integer noteTypeId, @RequestBody PortalAuctionNote instance) throws EntityNotFoundException {
        PortalAuctionNoteId temp = new PortalAuctionNoteId();
        temp.setPropertyId(propertyId);
        temp.setNoteId(noteId);
        temp.setUser(user);
        temp.setCreated(created);
        temp.setDone(done);
        temp.setNoteDescription(noteDescription);
        temp.setNoteTypeId(noteTypeId);
        portalAuctionNoteService.delete(temp);
        instance = portalAuctionNoteService.create(instance);
        LOGGER.debug("PortalAuctionNote details with id is updated: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the PortalAuctionNote instance associated with the given composite-id.")
    public boolean deletePortalAuctionNote(@RequestParam(value = "propertyId", required = true) Integer propertyId, @RequestParam(value = "noteId", required = true) Integer noteId, @RequestParam(value = "user", required = true) String user, @RequestParam(value = "created", required = true) Date created, @RequestParam(value = "done", required = true) Date done, @RequestParam(value = "noteDescription", required = true) String noteDescription, @RequestParam(value = "noteTypeId", required = true) Integer noteTypeId) throws EntityNotFoundException {
        PortalAuctionNoteId temp = new PortalAuctionNoteId();
        temp.setPropertyId(propertyId);
        temp.setNoteId(noteId);
        temp.setUser(user);
        temp.setCreated(created);
        temp.setDone(done);
        temp.setNoteDescription(noteDescription);
        temp.setNoteTypeId(noteTypeId);
        LOGGER.debug("Deleting PortalAuctionNote with id: {}", temp);
        PortalAuctionNote deleted = portalAuctionNoteService.delete(temp);
        return deleted != null;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of PortalAuctionNote instances.")
    public Long countAllPortalAuctionNotes() {
        LOGGER.debug("counting PortalAuctionNotes");
        Long count = portalAuctionNoteService.countAll();
        return count;
    }
}
