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
 * TaxSchedule generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`tax_schedule`", schema = "data", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"`county_id`", "`tax_year`", "`inst`"})})
public class TaxSchedule implements Serializable {

    private int id;
    private int taxYear;
    private Integer inst;
    private Date dueDate;
    private Date postingDate;
    private Float equalizationFactor;
    private County county;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`ID`", nullable = false, scale = 0, precision = 10)
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "`tax_year`", nullable = false, scale = 0, precision = 10)
    public int getTaxYear() {
        return this.taxYear;
    }

    public void setTaxYear(int taxYear) {
        this.taxYear = taxYear;
    }

    @Column(name = "`inst`", nullable = true, scale = 0, precision = 10)
    public Integer getInst() {
        return this.inst;
    }

    public void setInst(Integer inst) {
        this.inst = inst;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "`due_date`", nullable = false)
    public Date getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "`posting_date`", nullable = false)
    public Date getPostingDate() {
        return this.postingDate;
    }

    public void setPostingDate(Date postingDate) {
        this.postingDate = postingDate;
    }

    @Column(name = "`equalization_factor`", nullable = true, scale = 4, precision = 5)
    public Float getEqualizationFactor() {
        return this.equalizationFactor;
    }

    public void setEqualizationFactor(Float equalizationFactor) {
        this.equalizationFactor = equalizationFactor;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`county_id`", referencedColumnName = "`id`", insertable = true, updatable = true)
    public County getCounty() {
        return this.county;
    }

    public void setCounty(County county) {
        this.county = county;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaxSchedule)) return false;
        final TaxSchedule taxSchedule = (TaxSchedule) o;
        return Objects.equals(getId(), taxSchedule.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

