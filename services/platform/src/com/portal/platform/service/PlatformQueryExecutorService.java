/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/


package com.portal.platform.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.model.CustomQuery;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

public interface PlatformQueryExecutorService {
    Page<Object> executeInspection_drop_down(Pageable pageable) throws QueryParameterMismatchException;
    Page<Object> executeQryPortalCertificateDataById(Pageable pageable, java.lang.Integer id) throws QueryParameterMismatchException;
    Page<Object> executeQryPortalInspectionFilterByID(Pageable pageable, java.lang.Integer property_id) throws QueryParameterMismatchException;
    Page<Object> executeQryPortalInspectionFilterByName(Pageable pageable, java.lang.String drop_down) throws QueryParameterMismatchException;
    Page<Object> executeQryPortalInspectFilterDataByDropDownId(Pageable pageable, java.lang.String drop_down) throws QueryParameterMismatchException;
    Page<Object> executeQryPortalAuctionHistoryByPropertyID(Pageable pageable, java.lang.Integer property_id) throws QueryParameterMismatchException;
    Page<Object> executeQryPortalAuctionNote(Pageable pageable, java.lang.Integer property_id) throws QueryParameterMismatchException;
    Page<Object> executeQryLatLngFromDropDown(Pageable pageable, java.lang.String dropdown) throws QueryParameterMismatchException;
    Page<Object> executeQryPortalLinksByProperyID(Pageable pageable, java.lang.Integer property_id) throws QueryParameterMismatchException;

	
	Page<Object> executeWMCustomQuerySelect(CustomQuery query, Pageable pageable) ;

	int executeWMCustomQueryUpdate(CustomQuery query) ;
}

