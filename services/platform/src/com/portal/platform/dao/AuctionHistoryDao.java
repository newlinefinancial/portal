/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.portal.platform.AuctionHistory;
import com.portal.platform.AuctionHistoryId;

/**
 * Specifies methods used to obtain and modify AuctionHistory related information
 * which is stored in the database.
 */
@Repository("platform.AuctionHistoryDao")
public class AuctionHistoryDao extends WMGenericDaoImpl<AuctionHistory, AuctionHistoryId> {

    @Autowired
    @Qualifier("platformTemplate")
    private HibernateTemplate template;

    public HibernateTemplate getTemplate() {
        return this.template;
    }
}

