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
 * ServiceImpl object for domain model class PortalMatterData.
 * @see com.portal.platform.PortalMatterData
 */
@Service("platform.PortalMatterDataService")
public class PortalMatterDataServiceImpl implements PortalMatterDataService {


    private static final Logger LOGGER = LoggerFactory.getLogger(PortalMatterDataServiceImpl.class);

    @Autowired
    @Qualifier("platform.PortalMatterDataDao")
    private WMGenericDao<PortalMatterData, PortalMatterDataId> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<PortalMatterData, PortalMatterDataId> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "platformTransactionManager")
     public Page<PortalMatterData> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "platformTransactionManager")
    @Override
    public PortalMatterData create(PortalMatterData portalmatterdata) {
        LOGGER.debug("Creating a new portalmatterdata with information: {}" , portalmatterdata);
        return this.wmGenericDao.create(portalmatterdata);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "platformTransactionManager")
    @Override
    public PortalMatterData delete(PortalMatterDataId portalmatterdataId) throws EntityNotFoundException {
        LOGGER.debug("Deleting portalmatterdata with id: {}" , portalmatterdataId);
        PortalMatterData deleted = this.wmGenericDao.findById(portalmatterdataId);
        if (deleted == null) {
            LOGGER.debug("No portalmatterdata found with id: {}" , portalmatterdataId);
            throw new EntityNotFoundException(String.valueOf(portalmatterdataId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "platformTransactionManager")
    @Override
    public Page<PortalMatterData> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all portalmatterdatas");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "platformTransactionManager")
    @Override
    public Page<PortalMatterData> findAll(Pageable pageable) {
        LOGGER.debug("Finding all portalmatterdatas");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "platformTransactionManager")
    @Override
    public PortalMatterData findById(PortalMatterDataId id) throws EntityNotFoundException {
        LOGGER.debug("Finding portalmatterdata by id: {}" , id);
        PortalMatterData portalmatterdata=this.wmGenericDao.findById(id);
        if(portalmatterdata==null){
            LOGGER.debug("No portalmatterdata found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return portalmatterdata;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "platformTransactionManager")
    @Override
    public PortalMatterData update(PortalMatterData updated) throws EntityNotFoundException {
        LOGGER.debug("Updating portalmatterdata with information: {}" , updated);
        this.wmGenericDao.update(updated);

        PortalMatterDataId id = new PortalMatterDataId();
        id.setCertificateId(updated.getCertificateId());
        id.setPropertyId(updated.getPropertyId());
        id.setHeader(updated.getHeader());
        id.setCertificateNumber(updated.getCertificateNumber());
        id.setTaxYear(updated.getTaxYear());
        id.setDateSold(updated.getDateSold());
        id.setStatus(updated.getStatus());
        id.setExpirationDate(updated.getExpirationDate());
        id.setCountyName(updated.getCountyName());
        id.setVolume(updated.getVolume());
        id.setTaxYearNotices(updated.getTaxYearNotices());
        id.setMatterId(updated.getMatterId());
        id.setMatterNumber(updated.getMatterNumber());
        id.setFiledDate(updated.getFiledDate());
        id.setLastWorkDate(updated.getLastWorkDate());
        id.setInitialCourtDate(updated.getInitialCourtDate());
        id.setClosedDate(updated.getClosedDate());
        id.setAddressOverride(updated.getAddressOverride());
        id.setPinOverride(updated.getPinOverride());
        id.setPiqAddress(updated.getPiqAddress());
        id.setPiqCity(updated.getPiqCity());
        id.setPiqState(updated.getPiqState());
        id.setPiqZip(updated.getPiqZip());
        id.setPin(updated.getPin());
        id.setAddressSource1(updated.getAddressSource1());
        id.setAddressSource2(updated.getAddressSource2());
        id.setFinalPin(updated.getFinalPin());

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "platformTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


