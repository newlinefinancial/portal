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
 * ServiceImpl object for domain model class Underwriting.
 * @see com.portal.platform.Underwriting
 */
@Service("platform.UnderwritingService")
public class UnderwritingServiceImpl implements UnderwritingService {


    private static final Logger LOGGER = LoggerFactory.getLogger(UnderwritingServiceImpl.class);

    @Autowired
    @Qualifier("platform.UnderwritingDao")
    private WMGenericDao<Underwriting, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Underwriting, Integer> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "platformTransactionManager")
     public Page<Underwriting> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "platformTransactionManager")
    @Override
    public Underwriting create(Underwriting underwriting) {
        LOGGER.debug("Creating a new underwriting with information: {}" , underwriting);
        return this.wmGenericDao.create(underwriting);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "platformTransactionManager")
    @Override
    public Underwriting delete(Integer underwritingId) throws EntityNotFoundException {
        LOGGER.debug("Deleting underwriting with id: {}" , underwritingId);
        Underwriting deleted = this.wmGenericDao.findById(underwritingId);
        if (deleted == null) {
            LOGGER.debug("No underwriting found with id: {}" , underwritingId);
            throw new EntityNotFoundException(String.valueOf(underwritingId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "platformTransactionManager")
    @Override
    public Page<Underwriting> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all underwritings");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "platformTransactionManager")
    @Override
    public Page<Underwriting> findAll(Pageable pageable) {
        LOGGER.debug("Finding all underwritings");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "platformTransactionManager")
    @Override
    public Underwriting findById(Integer id) throws EntityNotFoundException {
        LOGGER.debug("Finding underwriting by id: {}" , id);
        Underwriting underwriting=this.wmGenericDao.findById(id);
        if(underwriting==null){
            LOGGER.debug("No underwriting found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return underwriting;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "platformTransactionManager")
    @Override
    public Underwriting update(Underwriting updated) throws EntityNotFoundException {
        LOGGER.debug("Updating underwriting with information: {}" , updated);
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


