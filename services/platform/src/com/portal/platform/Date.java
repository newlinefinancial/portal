/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Date generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`date`", schema = "dbo")
public class Date implements Serializable {

    private java.util.Date date;

    @Id
    @Temporal(TemporalType.DATE)
    @Column(name = "`date`", nullable = false)
    public java.util.Date getDate() {
        return this.date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Date)) return false;
        final Date date = (Date) o;
        return Objects.equals(getDate(), date.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDate());
    }
}

