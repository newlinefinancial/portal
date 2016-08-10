/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.math.BigDecimal;
import java.math.BigInteger;

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

import com.portal.platform.ModelTitle;
import com.portal.platform.ModelTitleId;
import com.portal.platform.service.ModelTitleService;


/**
 * Controller object for domain model class ModelTitle.
 * @see ModelTitle
 */
@RestController("platform.ModelTitleController")
@Api(value = "/platform/ModelTitle", description = "Exposes APIs to work with ModelTitle resource.")
@RequestMapping("/platform/ModelTitle")
public class ModelTitleController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ModelTitleController.class);

    @Autowired
	@Qualifier("platform.ModelTitleService")
	private ModelTitleService modelTitleService;


    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the ModelTitle instance associated with the given composite-id.")
    public ModelTitle getModelTitle(@RequestParam("auctionId") int auctionId,@RequestParam("propertyId") int propertyId,@RequestParam("demoFlg") BigDecimal demoFlg,@RequestParam("gov") Integer gov,@RequestParam("govLien") Integer govLien,@RequestParam("numMortgages") Integer numMortgages,@RequestParam("valMortgages") BigInteger valMortgages,@RequestParam("maxValMortgages") BigInteger maxValMortgages,@RequestParam("minValMortgages") BigInteger minValMortgages,@RequestParam("newestMortgage") Integer newestMortgage,@RequestParam("oldestMortgage") Integer oldestMortgage,@RequestParam("numDeed") Integer numDeed,@RequestParam("valDeed") BigInteger valDeed,@RequestParam("maxValDeed") BigInteger maxValDeed,@RequestParam("minValDeed") BigInteger minValDeed,@RequestParam("newestDeed") Integer newestDeed,@RequestParam("oldestDeed") Integer oldestDeed,@RequestParam("numLien") Integer numLien,@RequestParam("valLien") BigInteger valLien,@RequestParam("maxValLien") BigInteger maxValLien,@RequestParam("minValLien") BigInteger minValLien,@RequestParam("newestLien") Integer newestLien,@RequestParam("oldestLien") Integer oldestLien,@RequestParam("numLis") Integer numLis,@RequestParam("valLis") BigInteger valLis,@RequestParam("maxValLis") BigInteger maxValLis,@RequestParam("minValLis") BigInteger minValLis,@RequestParam("newestLis") Integer newestLis,@RequestParam("oldestLis") Integer oldestLis,@RequestParam("numAssignment") Integer numAssignment,@RequestParam("valAssignment") BigInteger valAssignment,@RequestParam("maxValAssignment") BigInteger maxValAssignment,@RequestParam("minValAssignment") BigInteger minValAssignment,@RequestParam("newestAssignment") Integer newestAssignment,@RequestParam("oldestAssignment") Integer oldestAssignment,@RequestParam("numQuit") Integer numQuit,@RequestParam("valQuit") BigInteger valQuit,@RequestParam("maxValQuit") BigInteger maxValQuit,@RequestParam("minValQuit") BigInteger minValQuit,@RequestParam("newestQuit") Integer newestQuit,@RequestParam("oldestQuit") Integer oldestQuit,@RequestParam("numForeclosure") Integer numForeclosure,@RequestParam("valForeclosure") BigInteger valForeclosure,@RequestParam("maxValForeclosure") BigInteger maxValForeclosure,@RequestParam("minValForeclosure") BigInteger minValForeclosure,@RequestParam("newestForeclosure") Integer newestForeclosure,@RequestParam("oldestForeclosure") Integer oldestForeclosure,@RequestParam("numRents") Integer numRents,@RequestParam("valRents") BigInteger valRents,@RequestParam("maxValRents") BigInteger maxValRents,@RequestParam("minValRents") BigInteger minValRents,@RequestParam("newestRents") Integer newestRents,@RequestParam("oldestRents") Integer oldestRents,@RequestParam("numBuilding") Integer numBuilding,@RequestParam("valBuilding") BigInteger valBuilding,@RequestParam("maxValBuilding") BigInteger maxValBuilding,@RequestParam("minValBuilding") BigInteger minValBuilding,@RequestParam("newestBuilding") Integer newestBuilding,@RequestParam("oldestBuilding") Integer oldestBuilding) throws EntityNotFoundException {

        ModelTitleId modeltitleId = new ModelTitleId();
        modeltitleId.setAuctionId(auctionId);
        modeltitleId.setPropertyId(propertyId);
        modeltitleId.setDemoFlg(demoFlg);
        modeltitleId.setGov(gov);
        modeltitleId.setGovLien(govLien);
        modeltitleId.setNumMortgages(numMortgages);
        modeltitleId.setValMortgages(valMortgages);
        modeltitleId.setMaxValMortgages(maxValMortgages);
        modeltitleId.setMinValMortgages(minValMortgages);
        modeltitleId.setNewestMortgage(newestMortgage);
        modeltitleId.setOldestMortgage(oldestMortgage);
        modeltitleId.setNumDeed(numDeed);
        modeltitleId.setValDeed(valDeed);
        modeltitleId.setMaxValDeed(maxValDeed);
        modeltitleId.setMinValDeed(minValDeed);
        modeltitleId.setNewestDeed(newestDeed);
        modeltitleId.setOldestDeed(oldestDeed);
        modeltitleId.setNumLien(numLien);
        modeltitleId.setValLien(valLien);
        modeltitleId.setMaxValLien(maxValLien);
        modeltitleId.setMinValLien(minValLien);
        modeltitleId.setNewestLien(newestLien);
        modeltitleId.setOldestLien(oldestLien);
        modeltitleId.setNumLis(numLis);
        modeltitleId.setValLis(valLis);
        modeltitleId.setMaxValLis(maxValLis);
        modeltitleId.setMinValLis(minValLis);
        modeltitleId.setNewestLis(newestLis);
        modeltitleId.setOldestLis(oldestLis);
        modeltitleId.setNumAssignment(numAssignment);
        modeltitleId.setValAssignment(valAssignment);
        modeltitleId.setMaxValAssignment(maxValAssignment);
        modeltitleId.setMinValAssignment(minValAssignment);
        modeltitleId.setNewestAssignment(newestAssignment);
        modeltitleId.setOldestAssignment(oldestAssignment);
        modeltitleId.setNumQuit(numQuit);
        modeltitleId.setValQuit(valQuit);
        modeltitleId.setMaxValQuit(maxValQuit);
        modeltitleId.setMinValQuit(minValQuit);
        modeltitleId.setNewestQuit(newestQuit);
        modeltitleId.setOldestQuit(oldestQuit);
        modeltitleId.setNumForeclosure(numForeclosure);
        modeltitleId.setValForeclosure(valForeclosure);
        modeltitleId.setMaxValForeclosure(maxValForeclosure);
        modeltitleId.setMinValForeclosure(minValForeclosure);
        modeltitleId.setNewestForeclosure(newestForeclosure);
        modeltitleId.setOldestForeclosure(oldestForeclosure);
        modeltitleId.setNumRents(numRents);
        modeltitleId.setValRents(valRents);
        modeltitleId.setMaxValRents(maxValRents);
        modeltitleId.setMinValRents(minValRents);
        modeltitleId.setNewestRents(newestRents);
        modeltitleId.setOldestRents(oldestRents);
        modeltitleId.setNumBuilding(numBuilding);
        modeltitleId.setValBuilding(valBuilding);
        modeltitleId.setMaxValBuilding(maxValBuilding);
        modeltitleId.setMinValBuilding(minValBuilding);
        modeltitleId.setNewestBuilding(newestBuilding);
        modeltitleId.setOldestBuilding(oldestBuilding);

        LOGGER.debug("Getting ModelTitle with id: {}" , modeltitleId);
        ModelTitle modeltitle = modelTitleService.getById(modeltitleId);
        LOGGER.debug("ModelTitle details with id: {}" , modeltitle);

        return modeltitle;
    }


    /**
     * @deprecated Use {@link #findModelTitles(String)} instead.
     */
    @Deprecated
    @RequestMapping(value = "/search", method = RequestMethod.POST)
	@ApiOperation(value = "Returns the list of ModelTitle instances matching the search criteria.")
	public Page<ModelTitle> findModelTitles( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
		LOGGER.debug("Rendering ModelTitles list");
		return modelTitleService.findAll(queryFilters, pageable);
	}

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of ModelTitle instances matching the search criteria.")
    public Page<ModelTitle> findModelTitles(@RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering ModelTitles list");
    	return modelTitleService.findAll(query, pageable);
    }

    @RequestMapping(value = "/export/{exportType}", method = RequestMethod.GET, produces = "application/octet-stream")
    @ApiOperation(value = "Returns downloadable file for the data.")
    public Downloadable exportModelTitles(@PathVariable("exportType") ExportType exportType, @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return modelTitleService.export(exportType, query, pageable);
    }

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the total count of ModelTitle instances.")
	public Long countModelTitles(@RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting ModelTitles");
		return modelTitleService.count(query);
	}


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service ModelTitleService instance
	 */
	protected void setModelTitleService(ModelTitleService service) {
		this.modelTitleService = service;
	}

}

