/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.portal.platform.service.PortalCertificateDataService;
import java.math.BigDecimal;
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
 * Controller object for domain model class PortalCertificateData.
 * @see com.portal.platform.PortalCertificateData
 */
@RestController(value = "Platform.PortalCertificateDataController")
@RequestMapping("/platform/PortalCertificateData")
@Api(description = "Exposes APIs to work with PortalCertificateData resource.", value = "PortalCertificateDataController")
public class PortalCertificateDataController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PortalCertificateDataController.class);

    @Autowired
    @Qualifier("platform.PortalCertificateDataService")
    private PortalCertificateDataService portalCertificateDataService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of PortalCertificateData instances matching the search criteria.")
    public Page<PortalCertificateData> findPortalCertificateDatas(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering PortalCertificateDatas list");
        return portalCertificateDataService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of PortalCertificateData instances.")
    public Page<PortalCertificateData> getPortalCertificateDatas(Pageable pageable) {
        LOGGER.debug("Rendering PortalCertificateDatas list");
        return portalCertificateDataService.findAll(pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setPortalCertificateDataService(PortalCertificateDataService service) {
        this.portalCertificateDataService = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new PortalCertificateData instance.")
    public PortalCertificateData createPortalCertificateData(@RequestBody PortalCertificateData instance) {
        LOGGER.debug("Create PortalCertificateData with information: {}", instance);
        instance = portalCertificateDataService.create(instance);
        LOGGER.debug("Created PortalCertificateData with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the PortalCertificateData instance associated with the given composite-id.")
    public PortalCertificateData getPortalCertificateData(@RequestParam(value = "certificateId", required = true) Integer certificateId, @RequestParam(value = "propertyId", required = true) Integer propertyId, @RequestParam(value = "pin", required = true) String pin, @RequestParam(value = "volume", required = true) Integer volume, @RequestParam(value = "header", required = true) String header, @RequestParam(value = "code", required = true) String code, @RequestParam(value = "propertyType", required = true) String propertyType, @RequestParam(value = "certificateNumber", required = true) String certificateNumber, @RequestParam(value = "bidRate", required = true) BigDecimal bidRate, @RequestParam(value = "taxYear", required = true) Integer taxYear, @RequestParam(value = "dateSold", required = true) Date dateSold, @RequestParam(value = "status", required = true) String status, @RequestParam(value = "statusChangeDate", required = true) Date statusChangeDate, @RequestParam(value = "storageStatus", required = true) String storageStatus, @RequestParam(value = "bank", required = true) String bank, @RequestParam(value = "expirationDate", required = true) Date expirationDate, @RequestParam(value = "countyName", required = true) String countyName, @RequestParam(value = "certificatePrincipal", required = true) Double certificatePrincipal, @RequestParam(value = "subPrincipal", required = true) Double subPrincipal, @RequestParam(value = "feePrincipal", required = true) Double feePrincipal, @RequestParam(value = "certificateRevenue", required = true) Double certificateRevenue, @RequestParam(value = "subRevenue", required = true) Double subRevenue, @RequestParam(value = "feeRevenue", required = true) Double feeRevenue, @RequestParam(value = "principal", required = true) Double principal, @RequestParam(value = "revenue", required = true) Double revenue, @RequestParam(value = "balanceDue", required = true) Double balanceDue, @RequestParam(value = "paymentInTransit", required = true) Double paymentInTransit, @RequestParam(value = "dueAfterSettlement", required = true) Double dueAfterSettlement, @RequestParam(value = "matterNumber", required = true) String matterNumber, @RequestParam(value = "initialCourtDate", required = true) Date initialCourtDate, @RequestParam(value = "filedDate", required = true) Date filedDate, @RequestParam(value = "closedDate", required = true) Date closedDate) throws EntityNotFoundException {
        PortalCertificateDataId temp = new PortalCertificateDataId();
        temp.setCertificateId(certificateId);
        temp.setPropertyId(propertyId);
        temp.setPin(pin);
        temp.setVolume(volume);
        temp.setHeader(header);
        temp.setCode(code);
        temp.setPropertyType(propertyType);
        temp.setCertificateNumber(certificateNumber);
        temp.setBidRate(bidRate);
        temp.setTaxYear(taxYear);
        temp.setDateSold(dateSold);
        temp.setStatus(status);
        temp.setStatusChangeDate(statusChangeDate);
        temp.setStorageStatus(storageStatus);
        temp.setBank(bank);
        temp.setExpirationDate(expirationDate);
        temp.setCountyName(countyName);
        temp.setCertificatePrincipal(certificatePrincipal);
        temp.setSubPrincipal(subPrincipal);
        temp.setFeePrincipal(feePrincipal);
        temp.setCertificateRevenue(certificateRevenue);
        temp.setSubRevenue(subRevenue);
        temp.setFeeRevenue(feeRevenue);
        temp.setPrincipal(principal);
        temp.setRevenue(revenue);
        temp.setBalanceDue(balanceDue);
        temp.setPaymentInTransit(paymentInTransit);
        temp.setDueAfterSettlement(dueAfterSettlement);
        temp.setMatterNumber(matterNumber);
        temp.setInitialCourtDate(initialCourtDate);
        temp.setFiledDate(filedDate);
        temp.setClosedDate(closedDate);
        LOGGER.debug("Getting PortalCertificateData with id: {}", temp);
        PortalCertificateData instance = portalCertificateDataService.findById(temp);
        LOGGER.debug("PortalCertificateData details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the PortalCertificateData instance associated with the given composite-id.")
    public PortalCertificateData editPortalCertificateData(@RequestParam(value = "certificateId", required = true) Integer certificateId, @RequestParam(value = "propertyId", required = true) Integer propertyId, @RequestParam(value = "pin", required = true) String pin, @RequestParam(value = "volume", required = true) Integer volume, @RequestParam(value = "header", required = true) String header, @RequestParam(value = "code", required = true) String code, @RequestParam(value = "propertyType", required = true) String propertyType, @RequestParam(value = "certificateNumber", required = true) String certificateNumber, @RequestParam(value = "bidRate", required = true) BigDecimal bidRate, @RequestParam(value = "taxYear", required = true) Integer taxYear, @RequestParam(value = "dateSold", required = true) Date dateSold, @RequestParam(value = "status", required = true) String status, @RequestParam(value = "statusChangeDate", required = true) Date statusChangeDate, @RequestParam(value = "storageStatus", required = true) String storageStatus, @RequestParam(value = "bank", required = true) String bank, @RequestParam(value = "expirationDate", required = true) Date expirationDate, @RequestParam(value = "countyName", required = true) String countyName, @RequestParam(value = "certificatePrincipal", required = true) Double certificatePrincipal, @RequestParam(value = "subPrincipal", required = true) Double subPrincipal, @RequestParam(value = "feePrincipal", required = true) Double feePrincipal, @RequestParam(value = "certificateRevenue", required = true) Double certificateRevenue, @RequestParam(value = "subRevenue", required = true) Double subRevenue, @RequestParam(value = "feeRevenue", required = true) Double feeRevenue, @RequestParam(value = "principal", required = true) Double principal, @RequestParam(value = "revenue", required = true) Double revenue, @RequestParam(value = "balanceDue", required = true) Double balanceDue, @RequestParam(value = "paymentInTransit", required = true) Double paymentInTransit, @RequestParam(value = "dueAfterSettlement", required = true) Double dueAfterSettlement, @RequestParam(value = "matterNumber", required = true) String matterNumber, @RequestParam(value = "initialCourtDate", required = true) Date initialCourtDate, @RequestParam(value = "filedDate", required = true) Date filedDate, @RequestParam(value = "closedDate", required = true) Date closedDate, @RequestBody PortalCertificateData instance) throws EntityNotFoundException {
        PortalCertificateDataId temp = new PortalCertificateDataId();
        temp.setCertificateId(certificateId);
        temp.setPropertyId(propertyId);
        temp.setPin(pin);
        temp.setVolume(volume);
        temp.setHeader(header);
        temp.setCode(code);
        temp.setPropertyType(propertyType);
        temp.setCertificateNumber(certificateNumber);
        temp.setBidRate(bidRate);
        temp.setTaxYear(taxYear);
        temp.setDateSold(dateSold);
        temp.setStatus(status);
        temp.setStatusChangeDate(statusChangeDate);
        temp.setStorageStatus(storageStatus);
        temp.setBank(bank);
        temp.setExpirationDate(expirationDate);
        temp.setCountyName(countyName);
        temp.setCertificatePrincipal(certificatePrincipal);
        temp.setSubPrincipal(subPrincipal);
        temp.setFeePrincipal(feePrincipal);
        temp.setCertificateRevenue(certificateRevenue);
        temp.setSubRevenue(subRevenue);
        temp.setFeeRevenue(feeRevenue);
        temp.setPrincipal(principal);
        temp.setRevenue(revenue);
        temp.setBalanceDue(balanceDue);
        temp.setPaymentInTransit(paymentInTransit);
        temp.setDueAfterSettlement(dueAfterSettlement);
        temp.setMatterNumber(matterNumber);
        temp.setInitialCourtDate(initialCourtDate);
        temp.setFiledDate(filedDate);
        temp.setClosedDate(closedDate);
        portalCertificateDataService.delete(temp);
        instance = portalCertificateDataService.create(instance);
        LOGGER.debug("PortalCertificateData details with id is updated: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the PortalCertificateData instance associated with the given composite-id.")
    public boolean deletePortalCertificateData(@RequestParam(value = "certificateId", required = true) Integer certificateId, @RequestParam(value = "propertyId", required = true) Integer propertyId, @RequestParam(value = "pin", required = true) String pin, @RequestParam(value = "volume", required = true) Integer volume, @RequestParam(value = "header", required = true) String header, @RequestParam(value = "code", required = true) String code, @RequestParam(value = "propertyType", required = true) String propertyType, @RequestParam(value = "certificateNumber", required = true) String certificateNumber, @RequestParam(value = "bidRate", required = true) BigDecimal bidRate, @RequestParam(value = "taxYear", required = true) Integer taxYear, @RequestParam(value = "dateSold", required = true) Date dateSold, @RequestParam(value = "status", required = true) String status, @RequestParam(value = "statusChangeDate", required = true) Date statusChangeDate, @RequestParam(value = "storageStatus", required = true) String storageStatus, @RequestParam(value = "bank", required = true) String bank, @RequestParam(value = "expirationDate", required = true) Date expirationDate, @RequestParam(value = "countyName", required = true) String countyName, @RequestParam(value = "certificatePrincipal", required = true) Double certificatePrincipal, @RequestParam(value = "subPrincipal", required = true) Double subPrincipal, @RequestParam(value = "feePrincipal", required = true) Double feePrincipal, @RequestParam(value = "certificateRevenue", required = true) Double certificateRevenue, @RequestParam(value = "subRevenue", required = true) Double subRevenue, @RequestParam(value = "feeRevenue", required = true) Double feeRevenue, @RequestParam(value = "principal", required = true) Double principal, @RequestParam(value = "revenue", required = true) Double revenue, @RequestParam(value = "balanceDue", required = true) Double balanceDue, @RequestParam(value = "paymentInTransit", required = true) Double paymentInTransit, @RequestParam(value = "dueAfterSettlement", required = true) Double dueAfterSettlement, @RequestParam(value = "matterNumber", required = true) String matterNumber, @RequestParam(value = "initialCourtDate", required = true) Date initialCourtDate, @RequestParam(value = "filedDate", required = true) Date filedDate, @RequestParam(value = "closedDate", required = true) Date closedDate) throws EntityNotFoundException {
        PortalCertificateDataId temp = new PortalCertificateDataId();
        temp.setCertificateId(certificateId);
        temp.setPropertyId(propertyId);
        temp.setPin(pin);
        temp.setVolume(volume);
        temp.setHeader(header);
        temp.setCode(code);
        temp.setPropertyType(propertyType);
        temp.setCertificateNumber(certificateNumber);
        temp.setBidRate(bidRate);
        temp.setTaxYear(taxYear);
        temp.setDateSold(dateSold);
        temp.setStatus(status);
        temp.setStatusChangeDate(statusChangeDate);
        temp.setStorageStatus(storageStatus);
        temp.setBank(bank);
        temp.setExpirationDate(expirationDate);
        temp.setCountyName(countyName);
        temp.setCertificatePrincipal(certificatePrincipal);
        temp.setSubPrincipal(subPrincipal);
        temp.setFeePrincipal(feePrincipal);
        temp.setCertificateRevenue(certificateRevenue);
        temp.setSubRevenue(subRevenue);
        temp.setFeeRevenue(feeRevenue);
        temp.setPrincipal(principal);
        temp.setRevenue(revenue);
        temp.setBalanceDue(balanceDue);
        temp.setPaymentInTransit(paymentInTransit);
        temp.setDueAfterSettlement(dueAfterSettlement);
        temp.setMatterNumber(matterNumber);
        temp.setInitialCourtDate(initialCourtDate);
        temp.setFiledDate(filedDate);
        temp.setClosedDate(closedDate);
        LOGGER.debug("Deleting PortalCertificateData with id: {}", temp);
        PortalCertificateData deleted = portalCertificateDataService.delete(temp);
        return deleted != null;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of PortalCertificateData instances.")
    public Long countAllPortalCertificateDatas() {
        LOGGER.debug("counting PortalCertificateDatas");
        Long count = portalCertificateDataService.countAll();
        return count;
    }
}
