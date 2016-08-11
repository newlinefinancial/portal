/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/
package com.portal.platform.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.TypeMismatchException;
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
import org.springframework.web.multipart.MultipartHttpServletRequest;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.file.model.DownloadResponse;
import com.wavemaker.runtime.file.model.Downloadable;
import com.wavemaker.runtime.util.WMMultipartUtils;
import com.wavemaker.runtime.util.WMRuntimeUtils;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.portal.platform.Sysdiagrams;
import com.portal.platform.service.SysdiagramsService;
import com.wordnik.swagger.annotations.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

/**
 * Controller object for domain model class Sysdiagrams.
 * @see Sysdiagrams
 */
@RestController("platform.SysdiagramsController")
@RequestMapping("/platform/Sysdiagrams")
@Api(description = "Exposes APIs to work with Sysdiagrams resource.", value = "SysdiagramsController")
public class SysdiagramsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SysdiagramsController.class);

    @Autowired
    @Qualifier("platform.SysdiagramsService")
    private SysdiagramsService sysdiagramsService;

    @RequestMapping(value = "/{id}/content/{fieldName}", method = RequestMethod.GET, produces = "application/octet-stream")
    @ApiOperation(value = "Retrieves content for the given BLOB field in Sysdiagrams instance")
    public DownloadResponse getSysdiagramsBLOBContent(@PathVariable("id") Integer id, @PathVariable("fieldName") String fieldName, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, @RequestParam(value = "download", defaultValue = "false") boolean download) {
        LOGGER.debug("Retrieves content for the given BLOB field {} in Sysdiagrams instance", fieldName);
        if (!WMRuntimeUtils.isLob(Sysdiagrams.class, fieldName)) {
            throw new TypeMismatchException("Given field " + fieldName + " is not a valid BLOB type");
        }
        Sysdiagrams sysdiagrams = sysdiagramsService.getById(id);
        return WMMultipartUtils.buildDownloadResponseForBlob(sysdiagrams, fieldName, httpServletRequest, download);
    }

    /**
     * @deprecated Use {@link #findSysdiagrams(String)} instead.
     */
    @Deprecated
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of Sysdiagrams instances matching the search criteria.")
    public Page<Sysdiagrams> findSysdiagrams(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Sysdiagrams list");
        return sysdiagramsService.findAll(queryFilters, pageable);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of Sysdiagrams instances matching the search criteria.")
    public Page<Sysdiagrams> findSysdiagrams(@RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Sysdiagrams list");
        return sysdiagramsService.findAll(query, pageable);
    }

    @RequestMapping(value = "/export/{exportType}", method = RequestMethod.GET, produces = "application/octet-stream")
    @ApiOperation(value = "Returns downloadable file for the data.")
    public Downloadable exportSysdiagrams(@PathVariable("exportType") ExportType exportType, @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        return sysdiagramsService.export(exportType, query, pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service SysdiagramsService instance
	 */
    protected void setSysdiagramsService(SysdiagramsService service) {
        this.sysdiagramsService = service;
    }

    @RequestMapping(method = RequestMethod.POST, consumes = { "multipart/form-data" })
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new Sysdiagrams instance.This API should be used when the Sysdiagrams instance has fields that requires multipart data.")
    public Sysdiagrams createSysdiagrams(MultipartHttpServletRequest multipartHttpServletRequest) {
        Sysdiagrams sysdiagrams = WMMultipartUtils.toObject(multipartHttpServletRequest, Sysdiagrams.class, "platform");
        LOGGER.debug("Creating a new Sysdiagrams with information: {}", sysdiagrams);
        return sysdiagramsService.create(sysdiagrams);
    }

    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new Sysdiagrams instance.")
    public Sysdiagrams createSysdiagrams(@RequestBody Sysdiagrams sysdiagrams) {
        LOGGER.debug("Create Sysdiagrams with information: {}", sysdiagrams);
        sysdiagrams = sysdiagramsService.create(sysdiagrams);
        LOGGER.debug("Created Sysdiagrams with information: {}", sysdiagrams);
        return sysdiagrams;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of Sysdiagrams instances.")
    public Long countSysdiagrams(@RequestParam(value = "q", required = false) String query) {
        LOGGER.debug("counting Sysdiagrams");
        return sysdiagramsService.count(query);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the Sysdiagrams instance associated with the given id.")
    public Sysdiagrams getSysdiagrams(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting Sysdiagrams with id: {}", id);
        Sysdiagrams foundSysdiagrams = sysdiagramsService.getById(id);
        LOGGER.debug("Sysdiagrams details with id: {}", foundSysdiagrams);
        return foundSysdiagrams;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the Sysdiagrams instance associated with the given id.")
    public Sysdiagrams editSysdiagrams(@PathVariable(value = "id") Integer id, @RequestBody Sysdiagrams sysdiagrams) throws EntityNotFoundException {
        LOGGER.debug("Editing Sysdiagrams with id: {}", sysdiagrams.getDiagramId());
        sysdiagrams.setDiagramId(id);
        sysdiagrams = sysdiagramsService.update(sysdiagrams);
        LOGGER.debug("Sysdiagrams details with id: {}", sysdiagrams);
        return sysdiagrams;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST, consumes = { "multipart/form-data" })
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the Sysdiagrams instance associated with the given id.This API should be used when Sysdiagrams instance fields that require multipart data.")
    public Sysdiagrams editSysdiagrams(@PathVariable(value = "id") Integer id, MultipartHttpServletRequest multipartHttpServletRequest) throws EntityNotFoundException {
        Sysdiagrams newSysdiagrams = WMMultipartUtils.toObject(multipartHttpServletRequest, Sysdiagrams.class, "platform");
        newSysdiagrams.setDiagramId(id);
        Sysdiagrams oldSysdiagrams = sysdiagramsService.getById(id);
        WMMultipartUtils.updateLobsContent(oldSysdiagrams, newSysdiagrams);
        LOGGER.debug("Updating Sysdiagrams with information: {}", newSysdiagrams);
        return sysdiagramsService.update(newSysdiagrams);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the Sysdiagrams instance associated with the given id.")
    public boolean deleteSysdiagrams(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting Sysdiagrams with id: {}", id);
        Sysdiagrams deletedSysdiagrams = sysdiagramsService.delete(id);
        return deletedSysdiagrams != null;
    }
}
