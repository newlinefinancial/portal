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
 * ServiceImpl object for domain model class PropertyType.
 * @see com.portal.platform.PropertyType
 */
@Service("platform.PropertyTypeService")
public class PropertyTypeServiceImpl implements PropertyTypeService {


    private static final Logger LOGGER = LoggerFactory.getLogger(PropertyTypeServiceImpl.class);

    @Autowired
    @Qualifier("platform.PropertyTypeDao")
    private WMGenericDao<PropertyType, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<PropertyType, Integer> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "platformTransactionManager")
     public Page<PropertyType> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "platformTransactionManager")
    @Override
    public PropertyType create(PropertyType propertytype) {
        LOGGER.debug("Creating a new propertytype with information: {}" , propertytype);
        return this.wmGenericDao.create(propertytype);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "platformTransactionManager")
    @Override
    public PropertyType delete(Integer propertytypeId) throws EntityNotFoundException {
        LOGGER.debug("Deleting propertytype with id: {}" , propertytypeId);
        PropertyType deleted = this.wmGenericDao.findById(propertytypeId);
        if (deleted == null) {
            LOGGER.debug("No propertytype found with id: {}" , propertytypeId);
            throw new EntityNotFoundException(String.valueOf(propertytypeId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "platformTransactionManager")
    @Override
    public Page<PropertyType> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all propertytypes");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "platformTransactionManager")
    @Override
    public Page<PropertyType> findAll(Pageable pageable) {
        LOGGER.debug("Finding all propertytypes");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "platformTransactionManager")
    @Override
    public PropertyType findById(Integer id) throws EntityNotFoundException {
        LOGGER.debug("Finding propertytype by id: {}" , id);
        PropertyType propertytype=this.wmGenericDao.findById(id);
        if(propertytype==null){
            LOGGER.debug("No propertytype found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return propertytype;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "platformTransactionManager")
    @Override
    public PropertyType update(PropertyType updated) throws EntityNotFoundException {
        LOGGER.debug("Updating propertytype with information: {}" , updated);
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


