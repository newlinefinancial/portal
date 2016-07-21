/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Matter generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`matter`", schema = "servicing", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"`certificate_id`"})})
public class Matter implements Serializable {

    private int id;
    private String matterNumber;
    private String pinOverride;
    private String addressOverride;
    private String user;
    private Date filedDate;
    private Date lastWorkDate;
    private Date initialCourtDate;
    private Date closedDate;
    private Certificate certificate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`id`", nullable = false, scale = 0, precision = 10)
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "`matter_number`", nullable = true, length = 50)
    public String getMatterNumber() {
        return this.matterNumber;
    }

    public void setMatterNumber(String matterNumber) {
        this.matterNumber = matterNumber;
    }

    @Column(name = "`pin_override`", nullable = true, length = 150)
    public String getPinOverride() {
        return this.pinOverride;
    }

    public void setPinOverride(String pinOverride) {
        this.pinOverride = pinOverride;
    }

    @Column(name = "`address_override`", nullable = true, length = 150)
    public String getAddressOverride() {
        return this.addressOverride;
    }

    public void setAddressOverride(String addressOverride) {
        this.addressOverride = addressOverride;
    }

    @Column(name = "`user`", nullable = false, length = 50)
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "`filed_date`", nullable = true)
    public Date getFiledDate() {
        return this.filedDate;
    }

    public void setFiledDate(Date filedDate) {
        this.filedDate = filedDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "`last_work_date`", nullable = true)
    public Date getLastWorkDate() {
        return this.lastWorkDate;
    }

    public void setLastWorkDate(Date lastWorkDate) {
        this.lastWorkDate = lastWorkDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "`initial_court_date`", nullable = true)
    public Date getInitialCourtDate() {
        return this.initialCourtDate;
    }

    public void setInitialCourtDate(Date initialCourtDate) {
        this.initialCourtDate = initialCourtDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "`closed_date`", nullable = true)
    public Date getClosedDate() {
        return this.closedDate;
    }

    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`certificate_id`", referencedColumnName = "`id`", insertable = true, updatable = true)
    public Certificate getCertificate() {
        return this.certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Matter)) return false;
        final Matter matter = (Matter) o;
        return Objects.equals(getId(), matter.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

