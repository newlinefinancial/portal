/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Date;

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

import com.portal.platform.PortalGradeNote;
import com.portal.platform.PortalGradeNoteId;
import com.portal.platform.service.PortalGradeNoteService;


/**
 * Controller object for domain model class PortalGradeNote.
 * @see PortalGradeNote
 */
@RestController("platform.PortalGradeNoteController")
@Api(value = "/platform/PortalGradeNote", description = "Exposes APIs to work with PortalGradeNote resource.")
@RequestMapping("/platform/PortalGradeNote")
public class PortalGradeNoteController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PortalGradeNoteController.class);

    @Autowired
	@Qualifier("platform.PortalGradeNoteService")
	private PortalGradeNoteService portalGradeNoteService;


    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the PortalGradeNote instance associated with the given composite-id.")
    public PortalGradeNote getPortalGradeNote(@RequestParam("gradeId") int gradeId,@RequestParam("noteId") int noteId,@RequestParam("user") String user,@RequestParam("created") Date created,@RequestParam("done") Date done,@RequestParam("noteDescription") String noteDescription,@RequestParam("noteTypeId") int noteTypeId) throws EntityNotFoundException {

        PortalGradeNoteId portalgradenoteId = new PortalGradeNoteId();
        portalgradenoteId.setGradeId(gradeId);
        portalgradenoteId.setNoteId(noteId);
        portalgradenoteId.setUser(user);
        portalgradenoteId.setCreated(created);
        portalgradenoteId.setDone(done);
        portalgradenoteId.setNoteDescription(noteDescription);
        portalgradenoteId.setNoteTypeId(noteTypeId);

        LOGGER.debug("Getting PortalGradeNote with id: {}" , portalgradenoteId);
        PortalGradeNote portalgradenote = portalGradeNoteService.getById(portalgradenoteId);
        LOGGER.debug("PortalGradeNote details with id: {}" , portalgradenote);

        return portalgradenote;
    }


    /**
     * @deprecated Use {@link #findPortalGradeNotes(String)} instead.
     */
    @Deprecated
    @RequestMapping(value = "/search", method = RequestMethod.POST)
	@ApiOperation(value = "Returns the list of PortalGradeNote instances matching the search criteria.")
	public Page<PortalGradeNote> findPortalGradeNotes( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
		LOGGER.debug("Rendering PortalGradeNotes list");
		return portalGradeNoteService.findAll(queryFilters, pageable);
	}

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of PortalGradeNote instances matching the search criteria.")
    public Page<PortalGradeNote> findPortalGradeNotes(@RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering PortalGradeNotes list");
    	return portalGradeNoteService.findAll(query, pageable);
    }

    @RequestMapping(value = "/export/{exportType}", method = RequestMethod.GET, produces = "application/octet-stream")
    @ApiOperation(value = "Returns downloadable file for the data.")
    public Downloadable exportPortalGradeNotes(@PathVariable("exportType") ExportType exportType, @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return portalGradeNoteService.export(exportType, query, pageable);
    }

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the total count of PortalGradeNote instances.")
	public Long countPortalGradeNotes(@RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting PortalGradeNotes");
		return portalGradeNoteService.count(query);
	}


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service PortalGradeNoteService instance
	 */
	protected void setPortalGradeNoteService(PortalGradeNoteService service) {
		this.portalGradeNoteService = service;
	}

}

