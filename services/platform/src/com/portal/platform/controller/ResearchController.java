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
import com.portal.platform.PropertySale;
import com.portal.platform.Research;
import com.portal.platform.TaxHistory;
import com.portal.platform.TitleTransaction;
import com.portal.platform.service.PropertySaleService;
import com.portal.platform.service.ResearchService;
import com.portal.platform.service.TaxHistoryService;
import com.portal.platform.service.TitleTransactionService;
import com.wordnik.swagger.annotations.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

/**
 * Controller object for domain model class Research.
 * @see Research
 */
@RestController("platform.ResearchController")
@RequestMapping("/platform/Research")
@Api(description = "Exposes APIs to work with Research resource.", value = "ResearchController")
public class ResearchController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ResearchController.class);

    @Autowired
    @Qualifier("platform.ResearchService")
    private ResearchService researchService;

    @Autowired
    @Qualifier("platform.TitleTransactionService")
    private TitleTransactionService titleTransactionService;

    @Autowired
    @Qualifier("platform.TaxHistoryService")
    private TaxHistoryService taxHistoryService;

    @Autowired
    @Qualifier("platform.PropertySaleService")
    private PropertySaleService propertySaleService;

    /**
     * @deprecated Use {@link #findResearches(String)} instead.
     */
    @Deprecated
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of Research instances matching the search criteria.")
    public Page<Research> findResearches(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Researches list");
        return researchService.findAll(queryFilters, pageable);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of Research instances matching the search criteria.")
    public Page<Research> findResearches(@RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Researches list");
        return researchService.findAll(query, pageable);
    }

    @RequestMapping(value = "/export/{exportType}", method = RequestMethod.GET, produces = "application/octet-stream")
    @ApiOperation(value = "Returns downloadable file for the data.")
    public Downloadable exportResearches(@PathVariable("exportType") ExportType exportType, @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        return researchService.export(exportType, query, pageable);
    }

    @RequestMapping(value = "/{id:.+}/propertySales", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the propertySales instance associated with the given id.")
    public Page<PropertySale> findAssociatedPropertySales(Pageable pageable, @PathVariable("id") Integer id) {
        LOGGER.debug("Fetching all associated propertySales");
        return propertySaleService.findAssociatedValues(id, "research", "id", pageable);
    }

    @RequestMapping(value = "/{id:.+}/taxHistories", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the taxHistories instance associated with the given id.")
    public Page<TaxHistory> findAssociatedTaxHistories(Pageable pageable, @PathVariable("id") Integer id) {
        LOGGER.debug("Fetching all associated taxHistories");
        return taxHistoryService.findAssociatedValues(id, "research", "id", pageable);
    }

    @RequestMapping(value = "/{id:.+}/titleTransactions", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the titleTransactions instance associated with the given id.")
    public Page<TitleTransaction> findAssociatedTitleTransactions(Pageable pageable, @PathVariable("id") Integer id) {
        LOGGER.debug("Fetching all associated titleTransactions");
        return titleTransactionService.findAssociatedValues(id, "research", "id", pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service ResearchService instance
	 */
    protected void setResearchService(ResearchService service) {
        this.researchService = service;
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service TitleTransactionService instance
	 */
    protected void setTitleTransactionService(TitleTransactionService service) {
        this.titleTransactionService = service;
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service TaxHistoryService instance
	 */
    protected void setTaxHistoryService(TaxHistoryService service) {
        this.taxHistoryService = service;
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service PropertySaleService instance
	 */
    protected void setPropertySaleService(PropertySaleService service) {
        this.propertySaleService = service;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of Research instances.")
    public Long countResearches(@RequestParam(value = "q", required = false) String query) {
        LOGGER.debug("counting Researches");
        return researchService.count(query);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the Research instance associated with the given id.")
    public Research getResearch(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting Research with id: {}", id);
        Research foundResearch = researchService.getById(id);
        LOGGER.debug("Research details with id: {}", foundResearch);
        return foundResearch;
    }
}
