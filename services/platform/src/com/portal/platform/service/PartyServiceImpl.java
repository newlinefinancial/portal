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
 * ServiceImpl object for domain model class Party.
 * @see com.portal.platform.Party
 */
@Service("platform.PartyService")
public class PartyServiceImpl implements PartyService {


    private static final Logger LOGGER = LoggerFactory.getLogger(PartyServiceImpl.class);

    @Autowired
    @Qualifier("platform.PartyDao")
    private WMGenericDao<Party, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Party, Integer> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "platformTransactionManager")
     public Page<Party> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "platformTransactionManager")
    @Override
    public Party create(Party party) {
        LOGGER.debug("Creating a new party with information: {}" , party);
        return this.wmGenericDao.create(party);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "platformTransactionManager")
    @Override
    public Party delete(Integer partyId) throws EntityNotFoundException {
        LOGGER.debug("Deleting party with id: {}" , partyId);
        Party deleted = this.wmGenericDao.findById(partyId);
        if (deleted == null) {
            LOGGER.debug("No party found with id: {}" , partyId);
            throw new EntityNotFoundException(String.valueOf(partyId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "platformTransactionManager")
    @Override
    public Page<Party> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all partys");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "platformTransactionManager")
    @Override
    public Page<Party> findAll(Pageable pageable) {
        LOGGER.debug("Finding all partys");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "platformTransactionManager")
    @Override
    public Party findById(Integer id) throws EntityNotFoundException {
        LOGGER.debug("Finding party by id: {}" , id);
        Party party=this.wmGenericDao.findById(id);
        if(party==null){
            LOGGER.debug("No party found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return party;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "platformTransactionManager")
    @Override
    public Party update(Party updated) throws EntityNotFoundException {
        LOGGER.debug("Updating party with information: {}" , updated);
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


