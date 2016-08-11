
package com.portal.platform.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.wavemaker.runtime.data.model.CustomQuery;
import com.wavemaker.runtime.data.dao.query.WMQueryExecutor;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

@Service
public class PlatformQueryExecutorServiceImpl implements PlatformQueryExecutorService {
	private static final Logger LOGGER = LoggerFactory.getLogger(PlatformQueryExecutorServiceImpl.class);

	@Autowired
	@Qualifier("platformWMQueryExecutor")
	private WMQueryExecutor queryExecutor;

	@Transactional(value = "platformTransactionManager")
	@Override
	public Page<Object> executeInspection_drop_down(Pageable pageable)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return queryExecutor.executeNamedQuery("inspection_drop_down", params, pageable);
	}
	@Transactional(value = "platformTransactionManager")
	@Override
	public Page<Object> executeQryPortalCertificateDataById(Pageable pageable, java.lang.Integer id)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", id);
        return queryExecutor.executeNamedQuery("qryPortalCertificateDataById", params, pageable);
	}
	@Transactional(value = "platformTransactionManager")
	@Override
	public Page<Object> executeQryPortalInspectionFilterByID(Pageable pageable, java.lang.Integer property_id)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("property_id", property_id);
        return queryExecutor.executeNamedQuery("qryPortalInspectionFilterByID", params, pageable);
	}
	@Transactional(value = "platformTransactionManager")
	@Override
	public Page<Object> executeQryPortalInspectionFilterByName(Pageable pageable, java.lang.String drop_down)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("drop_down", drop_down);
        return queryExecutor.executeNamedQuery("qryPortalInspectionFilterByName", params, pageable);
	}
	@Transactional(value = "platformTransactionManager")
	@Override
	public Page<Object> executeQryPortalInspectFilterDataByDropDownId(Pageable pageable, java.lang.String drop_down)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("drop_down", drop_down);
        return queryExecutor.executeNamedQuery("qryPortalInspectFilterDataByDropDownId", params, pageable);
	}
	@Transactional(value = "platformTransactionManager")
	@Override
	public Page<Object> executeQryPortalAuctionHistoryByPropertyID(Pageable pageable, java.lang.Integer property_id)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("property_id", property_id);
        return queryExecutor.executeNamedQuery("qryPortalAuctionHistoryByPropertyID", params, pageable);
	}
	@Transactional(value = "platformTransactionManager")
	@Override
	public Page<Object> executeQryPortalAuctionNote(Pageable pageable, java.lang.Integer property_id)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("property_id", property_id);
        return queryExecutor.executeNamedQuery("qryPortalAuctionNote", params, pageable);
	}

	@Transactional(value = "platformTransactionManager")
	@Override
	public Page<Object> executeWMCustomQuerySelect(CustomQuery query, Pageable pageable) {
	    return queryExecutor.executeCustomQuery(query, pageable);
	}

	@Transactional(value = "platformTransactionManager")
    @Override
    public int executeWMCustomQueryUpdate(CustomQuery query) {
        return queryExecutor.executeCustomQueryForUpdate(query);
    }
}

