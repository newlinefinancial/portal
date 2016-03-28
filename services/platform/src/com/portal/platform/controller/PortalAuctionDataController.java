/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.portal.platform.service.PortalAuctionDataService;
import java.math.BigDecimal;
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
 * Controller object for domain model class PortalAuctionData.
 * @see com.portal.platform.PortalAuctionData
 */
@RestController(value = "Platform.PortalAuctionDataController")
@RequestMapping("/platform/PortalAuctionData")
@Api(description = "Exposes APIs to work with PortalAuctionData resource.", value = "PortalAuctionDataController")
public class PortalAuctionDataController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PortalAuctionDataController.class);

    @Autowired
    @Qualifier("platform.PortalAuctionDataService")
    private PortalAuctionDataService portalAuctionDataService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of PortalAuctionData instances matching the search criteria.")
    public Page<PortalAuctionData> findPortalAuctionDatas(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering PortalAuctionDatas list");
        return portalAuctionDataService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of PortalAuctionData instances.")
    public Page<PortalAuctionData> getPortalAuctionDatas(Pageable pageable) {
        LOGGER.debug("Rendering PortalAuctionDatas list");
        return portalAuctionDataService.findAll(pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setPortalAuctionDataService(PortalAuctionDataService service) {
        this.portalAuctionDataService = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new PortalAuctionData instance.")
    public PortalAuctionData createPortalAuctionData(@RequestBody PortalAuctionData instance) {
        LOGGER.debug("Create PortalAuctionData with information: {}", instance);
        instance = portalAuctionDataService.create(instance);
        LOGGER.debug("Created PortalAuctionData with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the PortalAuctionData instance associated with the given composite-id.")
    public PortalAuctionData getPortalAuctionData(@RequestParam(value = "propertyId", required = true) Integer propertyId, @RequestParam(value = "gradeId", required = true) Integer gradeId, @RequestParam(value = "pin", required = true) String pin, @RequestParam(value = "header", required = true) String header, @RequestParam(value = "pinNd", required = true) String pinNd, @RequestParam(value = "piqAddress", required = true) String piqAddress, @RequestParam(value = "assessor", required = true) String assessor, @RequestParam(value = "clerk", required = true) String clerk, @RequestParam(value = "gis", required = true) String gis, @RequestParam(value = "treasurer", required = true) String treasurer, @RequestParam(value = "recorder", required = true) String recorder, @RequestParam(value = "assesmentTaxYear", required = true) Integer assesmentTaxYear, @RequestParam(value = "equalizedValuation", required = true) Double equalizedValuation, @RequestParam(value = "homeExemption", required = true) Double homeExemption, @RequestParam(value = "seniorExemption", required = true) Double seniorExemption, @RequestParam(value = "assessedValuationBuilding", required = true) Double assessedValuationBuilding, @RequestParam(value = "assessedValuationLand", required = true) Double assessedValuationLand, @RequestParam(value = "assessedValuationTotal", required = true) Double assessedValuationTotal, @RequestParam(value = "marketValue", required = true) Double marketValue, @RequestParam(value = "assesseeName", required = true) String assesseeName, @RequestParam(value = "assesseeAddressLine1", required = true) String assesseeAddressLine1, @RequestParam(value = "assesseeAddressCity", required = true) String assesseeAddressCity, @RequestParam(value = "assesseeAddressState", required = true) String assesseeAddressState, @RequestParam(value = "assesseeAddressZip", required = true) String assesseeAddressZip, @RequestParam(value = "taxRate", required = true) BigDecimal taxRate, @RequestParam(value = "equalizationFactor", required = true) Float equalizationFactor, @RequestParam(value = "taxYear", required = true) Integer taxYear, @RequestParam(value = "auctionId", required = true) Integer auctionId, @RequestParam(value = "priorYearsDue", required = true) Double priorYearsDue, @RequestParam(value = "auctionInst1Due", required = true) Double auctionInst1Due, @RequestParam(value = "auctionInst2Due", required = true) Double auctionInst2Due, @RequestParam(value = "auctionYearBilled", required = true) Double auctionYearBilled, @RequestParam(value = "auctionYearDue", required = true) Double auctionYearDue, @RequestParam(value = "otherDue", required = true) Double otherDue, @RequestParam(value = "saleAmount", required = true) Double saleAmount, @RequestParam(value = "auctionStatSummary", required = true) String auctionStatSummary, @RequestParam(value = "lifetimeLtv", required = true) Float lifetimeLtv, @RequestParam(value = "predRedemptionPct", required = true) Float predRedemptionPct, @RequestParam(value = "predBidRate", required = true) Integer predBidRate, @RequestParam(value = "grade", required = true) Character grade, @RequestParam(value = "avgBidrate", required = true) Float avgBidrate, @RequestParam(value = "forfeitStat", required = true) String forfeitStat, @RequestParam(value = "redemptionStat", required = true) String redemptionStat) throws EntityNotFoundException {
        PortalAuctionDataId temp = new PortalAuctionDataId();
        temp.setPropertyId(propertyId);
        temp.setGradeId(gradeId);
        temp.setPin(pin);
        temp.setHeader(header);
        temp.setPinNd(pinNd);
        temp.setPiqAddress(piqAddress);
        temp.setAssessor(assessor);
        temp.setClerk(clerk);
        temp.setGis(gis);
        temp.setTreasurer(treasurer);
        temp.setRecorder(recorder);
        temp.setAssesmentTaxYear(assesmentTaxYear);
        temp.setEqualizedValuation(equalizedValuation);
        temp.setHomeExemption(homeExemption);
        temp.setSeniorExemption(seniorExemption);
        temp.setAssessedValuationBuilding(assessedValuationBuilding);
        temp.setAssessedValuationLand(assessedValuationLand);
        temp.setAssessedValuationTotal(assessedValuationTotal);
        temp.setMarketValue(marketValue);
        temp.setAssesseeName(assesseeName);
        temp.setAssesseeAddressLine1(assesseeAddressLine1);
        temp.setAssesseeAddressCity(assesseeAddressCity);
        temp.setAssesseeAddressState(assesseeAddressState);
        temp.setAssesseeAddressZip(assesseeAddressZip);
        temp.setTaxRate(taxRate);
        temp.setEqualizationFactor(equalizationFactor);
        temp.setTaxYear(taxYear);
        temp.setAuctionId(auctionId);
        temp.setPriorYearsDue(priorYearsDue);
        temp.setAuctionInst1Due(auctionInst1Due);
        temp.setAuctionInst2Due(auctionInst2Due);
        temp.setAuctionYearBilled(auctionYearBilled);
        temp.setAuctionYearDue(auctionYearDue);
        temp.setOtherDue(otherDue);
        temp.setSaleAmount(saleAmount);
        temp.setAuctionStatSummary(auctionStatSummary);
        temp.setLifetimeLtv(lifetimeLtv);
        temp.setPredRedemptionPct(predRedemptionPct);
        temp.setPredBidRate(predBidRate);
        temp.setGrade(grade);
        temp.setAvgBidrate(avgBidrate);
        temp.setForfeitStat(forfeitStat);
        temp.setRedemptionStat(redemptionStat);
        LOGGER.debug("Getting PortalAuctionData with id: {}", temp);
        PortalAuctionData instance = portalAuctionDataService.findById(temp);
        LOGGER.debug("PortalAuctionData details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the PortalAuctionData instance associated with the given composite-id.")
    public PortalAuctionData editPortalAuctionData(@RequestParam(value = "propertyId", required = true) Integer propertyId, @RequestParam(value = "gradeId", required = true) Integer gradeId, @RequestParam(value = "pin", required = true) String pin, @RequestParam(value = "header", required = true) String header, @RequestParam(value = "pinNd", required = true) String pinNd, @RequestParam(value = "piqAddress", required = true) String piqAddress, @RequestParam(value = "assessor", required = true) String assessor, @RequestParam(value = "clerk", required = true) String clerk, @RequestParam(value = "gis", required = true) String gis, @RequestParam(value = "treasurer", required = true) String treasurer, @RequestParam(value = "recorder", required = true) String recorder, @RequestParam(value = "assesmentTaxYear", required = true) Integer assesmentTaxYear, @RequestParam(value = "equalizedValuation", required = true) Double equalizedValuation, @RequestParam(value = "homeExemption", required = true) Double homeExemption, @RequestParam(value = "seniorExemption", required = true) Double seniorExemption, @RequestParam(value = "assessedValuationBuilding", required = true) Double assessedValuationBuilding, @RequestParam(value = "assessedValuationLand", required = true) Double assessedValuationLand, @RequestParam(value = "assessedValuationTotal", required = true) Double assessedValuationTotal, @RequestParam(value = "marketValue", required = true) Double marketValue, @RequestParam(value = "assesseeName", required = true) String assesseeName, @RequestParam(value = "assesseeAddressLine1", required = true) String assesseeAddressLine1, @RequestParam(value = "assesseeAddressCity", required = true) String assesseeAddressCity, @RequestParam(value = "assesseeAddressState", required = true) String assesseeAddressState, @RequestParam(value = "assesseeAddressZip", required = true) String assesseeAddressZip, @RequestParam(value = "taxRate", required = true) BigDecimal taxRate, @RequestParam(value = "equalizationFactor", required = true) Float equalizationFactor, @RequestParam(value = "taxYear", required = true) Integer taxYear, @RequestParam(value = "auctionId", required = true) Integer auctionId, @RequestParam(value = "priorYearsDue", required = true) Double priorYearsDue, @RequestParam(value = "auctionInst1Due", required = true) Double auctionInst1Due, @RequestParam(value = "auctionInst2Due", required = true) Double auctionInst2Due, @RequestParam(value = "auctionYearBilled", required = true) Double auctionYearBilled, @RequestParam(value = "auctionYearDue", required = true) Double auctionYearDue, @RequestParam(value = "otherDue", required = true) Double otherDue, @RequestParam(value = "saleAmount", required = true) Double saleAmount, @RequestParam(value = "auctionStatSummary", required = true) String auctionStatSummary, @RequestParam(value = "lifetimeLtv", required = true) Float lifetimeLtv, @RequestParam(value = "predRedemptionPct", required = true) Float predRedemptionPct, @RequestParam(value = "predBidRate", required = true) Integer predBidRate, @RequestParam(value = "grade", required = true) Character grade, @RequestParam(value = "avgBidrate", required = true) Float avgBidrate, @RequestParam(value = "forfeitStat", required = true) String forfeitStat, @RequestParam(value = "redemptionStat", required = true) String redemptionStat, @RequestBody PortalAuctionData instance) throws EntityNotFoundException {
        PortalAuctionDataId temp = new PortalAuctionDataId();
        temp.setPropertyId(propertyId);
        temp.setGradeId(gradeId);
        temp.setPin(pin);
        temp.setHeader(header);
        temp.setPinNd(pinNd);
        temp.setPiqAddress(piqAddress);
        temp.setAssessor(assessor);
        temp.setClerk(clerk);
        temp.setGis(gis);
        temp.setTreasurer(treasurer);
        temp.setRecorder(recorder);
        temp.setAssesmentTaxYear(assesmentTaxYear);
        temp.setEqualizedValuation(equalizedValuation);
        temp.setHomeExemption(homeExemption);
        temp.setSeniorExemption(seniorExemption);
        temp.setAssessedValuationBuilding(assessedValuationBuilding);
        temp.setAssessedValuationLand(assessedValuationLand);
        temp.setAssessedValuationTotal(assessedValuationTotal);
        temp.setMarketValue(marketValue);
        temp.setAssesseeName(assesseeName);
        temp.setAssesseeAddressLine1(assesseeAddressLine1);
        temp.setAssesseeAddressCity(assesseeAddressCity);
        temp.setAssesseeAddressState(assesseeAddressState);
        temp.setAssesseeAddressZip(assesseeAddressZip);
        temp.setTaxRate(taxRate);
        temp.setEqualizationFactor(equalizationFactor);
        temp.setTaxYear(taxYear);
        temp.setAuctionId(auctionId);
        temp.setPriorYearsDue(priorYearsDue);
        temp.setAuctionInst1Due(auctionInst1Due);
        temp.setAuctionInst2Due(auctionInst2Due);
        temp.setAuctionYearBilled(auctionYearBilled);
        temp.setAuctionYearDue(auctionYearDue);
        temp.setOtherDue(otherDue);
        temp.setSaleAmount(saleAmount);
        temp.setAuctionStatSummary(auctionStatSummary);
        temp.setLifetimeLtv(lifetimeLtv);
        temp.setPredRedemptionPct(predRedemptionPct);
        temp.setPredBidRate(predBidRate);
        temp.setGrade(grade);
        temp.setAvgBidrate(avgBidrate);
        temp.setForfeitStat(forfeitStat);
        temp.setRedemptionStat(redemptionStat);
        portalAuctionDataService.delete(temp);
        instance = portalAuctionDataService.create(instance);
        LOGGER.debug("PortalAuctionData details with id is updated: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the PortalAuctionData instance associated with the given composite-id.")
    public boolean deletePortalAuctionData(@RequestParam(value = "propertyId", required = true) Integer propertyId, @RequestParam(value = "gradeId", required = true) Integer gradeId, @RequestParam(value = "pin", required = true) String pin, @RequestParam(value = "header", required = true) String header, @RequestParam(value = "pinNd", required = true) String pinNd, @RequestParam(value = "piqAddress", required = true) String piqAddress, @RequestParam(value = "assessor", required = true) String assessor, @RequestParam(value = "clerk", required = true) String clerk, @RequestParam(value = "gis", required = true) String gis, @RequestParam(value = "treasurer", required = true) String treasurer, @RequestParam(value = "recorder", required = true) String recorder, @RequestParam(value = "assesmentTaxYear", required = true) Integer assesmentTaxYear, @RequestParam(value = "equalizedValuation", required = true) Double equalizedValuation, @RequestParam(value = "homeExemption", required = true) Double homeExemption, @RequestParam(value = "seniorExemption", required = true) Double seniorExemption, @RequestParam(value = "assessedValuationBuilding", required = true) Double assessedValuationBuilding, @RequestParam(value = "assessedValuationLand", required = true) Double assessedValuationLand, @RequestParam(value = "assessedValuationTotal", required = true) Double assessedValuationTotal, @RequestParam(value = "marketValue", required = true) Double marketValue, @RequestParam(value = "assesseeName", required = true) String assesseeName, @RequestParam(value = "assesseeAddressLine1", required = true) String assesseeAddressLine1, @RequestParam(value = "assesseeAddressCity", required = true) String assesseeAddressCity, @RequestParam(value = "assesseeAddressState", required = true) String assesseeAddressState, @RequestParam(value = "assesseeAddressZip", required = true) String assesseeAddressZip, @RequestParam(value = "taxRate", required = true) BigDecimal taxRate, @RequestParam(value = "equalizationFactor", required = true) Float equalizationFactor, @RequestParam(value = "taxYear", required = true) Integer taxYear, @RequestParam(value = "auctionId", required = true) Integer auctionId, @RequestParam(value = "priorYearsDue", required = true) Double priorYearsDue, @RequestParam(value = "auctionInst1Due", required = true) Double auctionInst1Due, @RequestParam(value = "auctionInst2Due", required = true) Double auctionInst2Due, @RequestParam(value = "auctionYearBilled", required = true) Double auctionYearBilled, @RequestParam(value = "auctionYearDue", required = true) Double auctionYearDue, @RequestParam(value = "otherDue", required = true) Double otherDue, @RequestParam(value = "saleAmount", required = true) Double saleAmount, @RequestParam(value = "auctionStatSummary", required = true) String auctionStatSummary, @RequestParam(value = "lifetimeLtv", required = true) Float lifetimeLtv, @RequestParam(value = "predRedemptionPct", required = true) Float predRedemptionPct, @RequestParam(value = "predBidRate", required = true) Integer predBidRate, @RequestParam(value = "grade", required = true) Character grade, @RequestParam(value = "avgBidrate", required = true) Float avgBidrate, @RequestParam(value = "forfeitStat", required = true) String forfeitStat, @RequestParam(value = "redemptionStat", required = true) String redemptionStat) throws EntityNotFoundException {
        PortalAuctionDataId temp = new PortalAuctionDataId();
        temp.setPropertyId(propertyId);
        temp.setGradeId(gradeId);
        temp.setPin(pin);
        temp.setHeader(header);
        temp.setPinNd(pinNd);
        temp.setPiqAddress(piqAddress);
        temp.setAssessor(assessor);
        temp.setClerk(clerk);
        temp.setGis(gis);
        temp.setTreasurer(treasurer);
        temp.setRecorder(recorder);
        temp.setAssesmentTaxYear(assesmentTaxYear);
        temp.setEqualizedValuation(equalizedValuation);
        temp.setHomeExemption(homeExemption);
        temp.setSeniorExemption(seniorExemption);
        temp.setAssessedValuationBuilding(assessedValuationBuilding);
        temp.setAssessedValuationLand(assessedValuationLand);
        temp.setAssessedValuationTotal(assessedValuationTotal);
        temp.setMarketValue(marketValue);
        temp.setAssesseeName(assesseeName);
        temp.setAssesseeAddressLine1(assesseeAddressLine1);
        temp.setAssesseeAddressCity(assesseeAddressCity);
        temp.setAssesseeAddressState(assesseeAddressState);
        temp.setAssesseeAddressZip(assesseeAddressZip);
        temp.setTaxRate(taxRate);
        temp.setEqualizationFactor(equalizationFactor);
        temp.setTaxYear(taxYear);
        temp.setAuctionId(auctionId);
        temp.setPriorYearsDue(priorYearsDue);
        temp.setAuctionInst1Due(auctionInst1Due);
        temp.setAuctionInst2Due(auctionInst2Due);
        temp.setAuctionYearBilled(auctionYearBilled);
        temp.setAuctionYearDue(auctionYearDue);
        temp.setOtherDue(otherDue);
        temp.setSaleAmount(saleAmount);
        temp.setAuctionStatSummary(auctionStatSummary);
        temp.setLifetimeLtv(lifetimeLtv);
        temp.setPredRedemptionPct(predRedemptionPct);
        temp.setPredBidRate(predBidRate);
        temp.setGrade(grade);
        temp.setAvgBidrate(avgBidrate);
        temp.setForfeitStat(forfeitStat);
        temp.setRedemptionStat(redemptionStat);
        LOGGER.debug("Deleting PortalAuctionData with id: {}", temp);
        PortalAuctionData deleted = portalAuctionDataService.delete(temp);
        return deleted != null;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of PortalAuctionData instances.")
    public Long countAllPortalAuctionDatas() {
        LOGGER.debug("counting PortalAuctionDatas");
        Long count = portalAuctionDataService.countAll();
        return count;
    }
}
