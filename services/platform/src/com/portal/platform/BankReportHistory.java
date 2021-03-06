/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * BankReportHistory generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`bank_report_history`", schema = "servicing")
public class BankReportHistory implements Serializable {

    private int id;
    private String bank;
    private String type;
    private java.util.Date startTimestamp;
    private java.util.Date endTimestamp;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`id`", nullable = false, scale = 0, precision = 10)
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "`bank`", nullable = false, length = 50)
    public String getBank() {
        return this.bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @Column(name = "`type`", nullable = false, length = 50)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "`start_timestamp`", nullable = false)
    public java.util.Date getStartTimestamp() {
        return this.startTimestamp;
    }

    public void setStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "`end_timestamp`", nullable = false)
    public java.util.Date getEndTimestamp() {
        return this.endTimestamp;
    }

    public void setEndTimestamp(java.util.Date endTimestamp) {
        this.endTimestamp = endTimestamp;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankReportHistory)) return false;
        final BankReportHistory bankReportHistory = (BankReportHistory) o;
        return Objects.equals(getId(), bankReportHistory.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

