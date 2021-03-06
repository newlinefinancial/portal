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

import com.portal.platform.NumberTable;

/**
 * ServiceImpl object for domain model class NumberTable.
 *
 * @see NumberTable
 */
@Service("platform.NumberTableService")
public class NumberTableServiceImpl implements NumberTableService {

    private static final Logger LOGGER = LoggerFactory.getLogger(NumberTableServiceImpl.class);

    @Autowired
    @Qualifier("platform.NumberTableDao")
    private WMGenericDao<NumberTable, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<NumberTable, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "platformTransactionManager")
    @Override
	public NumberTable create(NumberTable numbertable) {
        LOGGER.debug("Creating a new NumberTable with information: {}", numbertable);
        return this.wmGenericDao.create(numbertable);
    }

	@Transactional(readOnly = true, value = "platformTransactionManager")
	@Override
	public NumberTable getById(Integer numbertableId) throws EntityNotFoundException {
        LOGGER.debug("Finding NumberTable by id: {}", numbertableId);
        NumberTable numbertable = this.wmGenericDao.findById(numbertableId);
        if (numbertable == null){
            LOGGER.debug("No NumberTable found with id: {}", numbertableId);
            throw new EntityNotFoundException(String.valueOf(numbertableId));
        }
        return numbertable;
    }

	@Transactional(rollbackFor = EntityNotFoundException.class, value = "platformTransactionManager")
	@Override
	public NumberTable update(NumberTable numbertable) throws EntityNotFoundException {
        LOGGER.debug("Updating NumberTable with information: {}", numbertable);
        this.wmGenericDao.update(numbertable);

        Integer numbertableId = numbertable.getNumber();

        return this.wmGenericDao.findById(numbertableId);
    }

    @Transactional(value = "platformTransactionManager")
	@Override
	public NumberTable delete(Integer numbertableId) throws EntityNotFoundException {
        LOGGER.debug("Deleting NumberTable with id: {}", numbertableId);
        NumberTable deleted = this.wmGenericDao.findById(numbertableId);
        if (deleted == null) {
            LOGGER.debug("No NumberTable found with id: {}", numbertableId);
            throw new EntityNotFoundException(String.valueOf(numbertableId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "platformTransactionManager")
	@Override
	public Page<NumberTable> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all NumberTables");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "platformTransactionManager")
    @Override
    public Page<NumberTable> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all NumberTables");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "platformTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service platform for table NumberTable to {} format", exportType);
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
    public Page<NumberTable> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable) {
        LOGGER.debug("Fetching all associated");
        return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
    }
}

