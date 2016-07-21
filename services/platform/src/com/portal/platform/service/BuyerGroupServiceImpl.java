/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wavemaker.runtime.data.dao.WMGenericDao;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.file.model.Downloadable;

import com.portal.platform.BuyerGroup;

/**
 * ServiceImpl object for domain model class BuyerGroup.
 *
 * @see BuyerGroup
 */
@Service("platform.BuyerGroupService")
public class BuyerGroupServiceImpl implements BuyerGroupService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BuyerGroupServiceImpl.class);

    @Autowired
    @Qualifier("platform.BuyerGroupDao")
    private WMGenericDao<BuyerGroup, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<BuyerGroup, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

	@Transactional(readOnly = true, value = "platformTransactionManager")
	@Override
	public BuyerGroup getById(Integer buyergroupId) throws EntityNotFoundException {
        LOGGER.debug("Finding BuyerGroup by id: {}", buyergroupId);
        BuyerGroup buyergroup = this.wmGenericDao.findById(buyergroupId);
        if (buyergroup == null){
            LOGGER.debug("No BuyerGroup found with id: {}", buyergroupId);
            throw new EntityNotFoundException(String.valueOf(buyergroupId));
        }
        return buyergroup;
    }

	@Transactional(readOnly = true, value = "platformTransactionManager")
	@Override
	public Page<BuyerGroup> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all BuyerGroups");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "platformTransactionManager")
    @Override
    public Page<BuyerGroup> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all BuyerGroups");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "platformTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service platform for table BuyerGroup to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

	@Transactional(readOnly = true, value = "platformTransactionManager")
	@Override
	public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "platformTransactionManager")
    @SuppressWarnings("unchecked")
	@Override
    public Page<BuyerGroup> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable) {
        LOGGER.debug("Fetching all associated");
        return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
    }
}

