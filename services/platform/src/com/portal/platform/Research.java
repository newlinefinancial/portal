/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Research generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`research`", schema = "data", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"`property_id`", "`type`", "`date`"})})
public class Research implements Serializable {

    private int id;
    private String type;
    private java.util.Date date;
    private List<PropertySale> propertySales = new ArrayList<>();
    private List<TaxHistory> taxHistories = new ArrayList<>();
    private List<TitleTransaction> titleTransactions = new ArrayList<>();
    private Property property;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`id`", nullable = false, scale = 0, precision = 10)
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "`type`", nullable = false, length = 20)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "`date`", nullable = false)
    public java.util.Date getDate() {
        return this.date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "research")
    public List<PropertySale> getPropertySales() {
        return this.propertySales;
    }

    public void setPropertySales(List<PropertySale> propertySales) {
        this.propertySales = propertySales;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "research")
    public List<TaxHistory> getTaxHistories() {
        return this.taxHistories;
    }

    public void setTaxHistories(List<TaxHistory> taxHistories) {
        this.taxHistories = taxHistories;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "research")
    public List<TitleTransaction> getTitleTransactions() {
        return this.titleTransactions;
    }

    public void setTitleTransactions(List<TitleTransaction> titleTransactions) {
        this.titleTransactions = titleTransactions;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`property_id`", referencedColumnName = "`ID`", insertable = true, updatable = true)
    public Property getProperty() {
        return this.property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Research)) return false;
        final Research research = (Research) o;
        return Objects.equals(getId(), research.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

