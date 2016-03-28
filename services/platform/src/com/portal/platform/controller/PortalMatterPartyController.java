/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.portal.platform.service.PortalMatterPartyService;
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
 * Controller object for domain model class PortalMatterParty.
 * @see com.portal.platform.PortalMatterParty
 */
@RestController(value = "Platform.PortalMatterPartyController")
@RequestMapping("/platform/PortalMatterParty")
@Api(description = "Exposes APIs to work with PortalMatterParty resource.", value = "PortalMatterPartyController")
public class PortalMatterPartyController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PortalMatterPartyController.class);

    @Autowired
    @Qualifier("platform.PortalMatterPartyService")
    private PortalMatterPartyService portalMatterPartyService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of PortalMatterParty instances matching the search criteria.")
    public Page<PortalMatterParty> findPortalMatterPartys(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering PortalMatterPartys list");
        return portalMatterPartyService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of PortalMatterParty instances.")
    public Page<PortalMatterParty> getPortalMatterPartys(Pageable pageable) {
        LOGGER.debug("Rendering PortalMatterPartys list");
        return portalMatterPartyService.findAll(pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setPortalMatterPartyService(PortalMatterPartyService service) {
        this.portalMatterPartyService = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new PortalMatterParty instance.")
    public PortalMatterParty createPortalMatterParty(@RequestBody PortalMatterParty instance) {
        LOGGER.debug("Create PortalMatterParty with information: {}", instance);
        instance = portalMatterPartyService.create(instance);
        LOGGER.debug("Created PortalMatterParty with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the PortalMatterParty instance associated with the given composite-id.")
    public PortalMatterParty getPortalMatterParty(@RequestParam(value = "matterPartyId", required = true) Integer matterPartyId, @RequestParam(value = "interestType1", required = true) String interestType1, @RequestParam(value = "interestType2", required = true) String interestType2, @RequestParam(value = "interestType3", required = true) String interestType3, @RequestParam(value = "serviceType", required = true) String serviceType, @RequestParam(value = "service1Reference", required = true) String service1Reference, @RequestParam(value = "service1Status", required = true) String service1Status, @RequestParam(value = "service2Reference", required = true) String service2Reference, @RequestParam(value = "service2Status", required = true) String service2Status, @RequestParam(value = "service2Flag", required = true) String service2Flag, @RequestParam(value = "service3Reference", required = true) String service3Reference, @RequestParam(value = "service3Status", required = true) String service3Status, @RequestParam(value = "service3Flag", required = true) String service3Flag, @RequestParam(value = "name", required = true) String name, @RequestParam(value = "careOf", required = true) String careOf, @RequestParam(value = "address", required = true) String address, @RequestParam(value = "city", required = true) String city, @RequestParam(value = "state", required = true) String state, @RequestParam(value = "zip", required = true) String zip, @RequestParam(value = "partyId", required = true) Integer partyId, @RequestParam(value = "partyCsz", required = true) String partyCsz, @RequestParam(value = "class_", required = true) String class_, @RequestParam(value = "source1", required = true) String source1, @RequestParam(value = "source2", required = true) String source2, @RequestParam(value = "piq", required = true) Boolean piq, @RequestParam(value = "matterId", required = true) Integer matterId) throws EntityNotFoundException {
        PortalMatterPartyId temp = new PortalMatterPartyId();
        temp.setMatterPartyId(matterPartyId);
        temp.setInterestType1(interestType1);
        temp.setInterestType2(interestType2);
        temp.setInterestType3(interestType3);
        temp.setServiceType(serviceType);
        temp.setService1Reference(service1Reference);
        temp.setService1Status(service1Status);
        temp.setService2Reference(service2Reference);
        temp.setService2Status(service2Status);
        temp.setService2Flag(service2Flag);
        temp.setService3Reference(service3Reference);
        temp.setService3Status(service3Status);
        temp.setService3Flag(service3Flag);
        temp.setName(name);
        temp.setCareOf(careOf);
        temp.setAddress(address);
        temp.setCity(city);
        temp.setState(state);
        temp.setZip(zip);
        temp.setPartyId(partyId);
        temp.setPartyCsz(partyCsz);
        temp.setClass_(class_);
        temp.setSource1(source1);
        temp.setSource2(source2);
        temp.setPiq(piq);
        temp.setMatterId(matterId);
        LOGGER.debug("Getting PortalMatterParty with id: {}", temp);
        PortalMatterParty instance = portalMatterPartyService.findById(temp);
        LOGGER.debug("PortalMatterParty details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the PortalMatterParty instance associated with the given composite-id.")
    public PortalMatterParty editPortalMatterParty(@RequestParam(value = "matterPartyId", required = true) Integer matterPartyId, @RequestParam(value = "interestType1", required = true) String interestType1, @RequestParam(value = "interestType2", required = true) String interestType2, @RequestParam(value = "interestType3", required = true) String interestType3, @RequestParam(value = "serviceType", required = true) String serviceType, @RequestParam(value = "service1Reference", required = true) String service1Reference, @RequestParam(value = "service1Status", required = true) String service1Status, @RequestParam(value = "service2Reference", required = true) String service2Reference, @RequestParam(value = "service2Status", required = true) String service2Status, @RequestParam(value = "service2Flag", required = true) String service2Flag, @RequestParam(value = "service3Reference", required = true) String service3Reference, @RequestParam(value = "service3Status", required = true) String service3Status, @RequestParam(value = "service3Flag", required = true) String service3Flag, @RequestParam(value = "name", required = true) String name, @RequestParam(value = "careOf", required = true) String careOf, @RequestParam(value = "address", required = true) String address, @RequestParam(value = "city", required = true) String city, @RequestParam(value = "state", required = true) String state, @RequestParam(value = "zip", required = true) String zip, @RequestParam(value = "partyId", required = true) Integer partyId, @RequestParam(value = "partyCsz", required = true) String partyCsz, @RequestParam(value = "class_", required = true) String class_, @RequestParam(value = "source1", required = true) String source1, @RequestParam(value = "source2", required = true) String source2, @RequestParam(value = "piq", required = true) Boolean piq, @RequestParam(value = "matterId", required = true) Integer matterId, @RequestBody PortalMatterParty instance) throws EntityNotFoundException {
        PortalMatterPartyId temp = new PortalMatterPartyId();
        temp.setMatterPartyId(matterPartyId);
        temp.setInterestType1(interestType1);
        temp.setInterestType2(interestType2);
        temp.setInterestType3(interestType3);
        temp.setServiceType(serviceType);
        temp.setService1Reference(service1Reference);
        temp.setService1Status(service1Status);
        temp.setService2Reference(service2Reference);
        temp.setService2Status(service2Status);
        temp.setService2Flag(service2Flag);
        temp.setService3Reference(service3Reference);
        temp.setService3Status(service3Status);
        temp.setService3Flag(service3Flag);
        temp.setName(name);
        temp.setCareOf(careOf);
        temp.setAddress(address);
        temp.setCity(city);
        temp.setState(state);
        temp.setZip(zip);
        temp.setPartyId(partyId);
        temp.setPartyCsz(partyCsz);
        temp.setClass_(class_);
        temp.setSource1(source1);
        temp.setSource2(source2);
        temp.setPiq(piq);
        temp.setMatterId(matterId);
        portalMatterPartyService.delete(temp);
        instance = portalMatterPartyService.create(instance);
        LOGGER.debug("PortalMatterParty details with id is updated: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the PortalMatterParty instance associated with the given composite-id.")
    public boolean deletePortalMatterParty(@RequestParam(value = "matterPartyId", required = true) Integer matterPartyId, @RequestParam(value = "interestType1", required = true) String interestType1, @RequestParam(value = "interestType2", required = true) String interestType2, @RequestParam(value = "interestType3", required = true) String interestType3, @RequestParam(value = "serviceType", required = true) String serviceType, @RequestParam(value = "service1Reference", required = true) String service1Reference, @RequestParam(value = "service1Status", required = true) String service1Status, @RequestParam(value = "service2Reference", required = true) String service2Reference, @RequestParam(value = "service2Status", required = true) String service2Status, @RequestParam(value = "service2Flag", required = true) String service2Flag, @RequestParam(value = "service3Reference", required = true) String service3Reference, @RequestParam(value = "service3Status", required = true) String service3Status, @RequestParam(value = "service3Flag", required = true) String service3Flag, @RequestParam(value = "name", required = true) String name, @RequestParam(value = "careOf", required = true) String careOf, @RequestParam(value = "address", required = true) String address, @RequestParam(value = "city", required = true) String city, @RequestParam(value = "state", required = true) String state, @RequestParam(value = "zip", required = true) String zip, @RequestParam(value = "partyId", required = true) Integer partyId, @RequestParam(value = "partyCsz", required = true) String partyCsz, @RequestParam(value = "class_", required = true) String class_, @RequestParam(value = "source1", required = true) String source1, @RequestParam(value = "source2", required = true) String source2, @RequestParam(value = "piq", required = true) Boolean piq, @RequestParam(value = "matterId", required = true) Integer matterId) throws EntityNotFoundException {
        PortalMatterPartyId temp = new PortalMatterPartyId();
        temp.setMatterPartyId(matterPartyId);
        temp.setInterestType1(interestType1);
        temp.setInterestType2(interestType2);
        temp.setInterestType3(interestType3);
        temp.setServiceType(serviceType);
        temp.setService1Reference(service1Reference);
        temp.setService1Status(service1Status);
        temp.setService2Reference(service2Reference);
        temp.setService2Status(service2Status);
        temp.setService2Flag(service2Flag);
        temp.setService3Reference(service3Reference);
        temp.setService3Status(service3Status);
        temp.setService3Flag(service3Flag);
        temp.setName(name);
        temp.setCareOf(careOf);
        temp.setAddress(address);
        temp.setCity(city);
        temp.setState(state);
        temp.setZip(zip);
        temp.setPartyId(partyId);
        temp.setPartyCsz(partyCsz);
        temp.setClass_(class_);
        temp.setSource1(source1);
        temp.setSource2(source2);
        temp.setPiq(piq);
        temp.setMatterId(matterId);
        LOGGER.debug("Deleting PortalMatterParty with id: {}", temp);
        PortalMatterParty deleted = portalMatterPartyService.delete(temp);
        return deleted != null;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of PortalMatterParty instances.")
    public Long countAllPortalMatterPartys() {
        LOGGER.debug("counting PortalMatterPartys");
        Long count = portalMatterPartyService.countAll();
        return count;
    }
}
