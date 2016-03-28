/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/





import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.wavemaker.runtime.data.dao.*;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.portal.platform.*;


/**
 * ServiceImpl object for domain model class TitleTransaction.
 * @see com.portal.platform.TitleTransaction
 */
@Service("platform.TitleTransactionService")
public class TitleTransactionServiceImpl implements TitleTransactionService {


    private static final Logger LOGGER = LoggerFactory.getLogger(TitleTransactionServiceImpl.class);

    @Autowired
    @Qualifier("platform.TitleTransactionDao")
    private WMGenericDao<TitleTransaction, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<TitleTransaction, Integer> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "platformTransactionManager")
     public Page<TitleTransaction> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "platformTransactionManager")
    @Override
    public TitleTransaction create(TitleTransaction titletransaction) {
        LOGGER.debug("Creating a new titletransaction with information: {}" , titletransaction);
        return this.wmGenericDao.create(titletransaction);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "platformTransactionManager")
    @Override
    public TitleTransaction delete(Integer titletransactionId) throws EntityNotFoundException {
        LOGGER.debug("Deleting titletransaction with id: {}" , titletransactionId);
        TitleTransaction deleted = this.wmGenericDao.findById(titletransactionId);
        if (deleted == null) {
            LOGGER.debug("No titletransaction found with id: {}" , titletransactionId);
            throw new EntityNotFoundException(String.valueOf(titletransactionId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "platformTransactionManager")
    @Override
    public Page<TitleTransaction> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all titletransactions");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "platformTransactionManager")
    @Override
    public Page<TitleTransaction> findAll(Pageable pageable) {
        LOGGER.debug("Finding all titletransactions");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "platformTransactionManager")
    @Override
    public TitleTransaction findById(Integer id) throws EntityNotFoundException {
        LOGGER.debug("Finding titletransaction by id: {}" , id);
        TitleTransaction titletransaction=this.wmGenericDao.findById(id);
        if(titletransaction==null){
            LOGGER.debug("No titletransaction found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return titletransaction;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "platformTransactionManager")
    @Override
    public TitleTransaction update(TitleTransaction updated) throws EntityNotFoundException {
        LOGGER.debug("Updating titletransaction with information: {}" , updated);
        this.wmGenericDao.update(updated);

        Integer id = (Integer)updated.getId();

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "platformTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


