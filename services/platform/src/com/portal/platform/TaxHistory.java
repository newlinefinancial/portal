/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * TaxHistory generated by hbm2java
 */
@Entity
@Table(name="`tax_history`"
    ,schema="data"
)

public class TaxHistory  implements java.io.Serializable {

    
    private Integer id;
    
    private java.util.Date researchDate;
    
    private Integer taxYear;
    
    private String openStatus;
    
    private Double inst1Due;
    
    private Double inst2Due;
    
    private Double totalDue;
    
    private String saleType;
    
    private String saleStatus;
    
    private java.util.Date dispositionDate;
    
    private String caseNumber;
    
    private Integer lastImportId;
    
    private Property property;
    
    private Research research;

    public TaxHistory() {
    }


    @Id @GeneratedValue(strategy=IDENTITY)
    

    @Column(name="`id`", precision=10)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    @Temporal(TemporalType.DATE)

    @Column(name="`research_date`", length=10)
    public java.util.Date getResearchDate() {
        return this.researchDate;
    }
    
    public void setResearchDate(java.util.Date researchDate) {
        this.researchDate = researchDate;
    }

    

    @Column(name="`tax_year`", precision=10)
    public Integer getTaxYear() {
        return this.taxYear;
    }
    
    public void setTaxYear(Integer taxYear) {
        this.taxYear = taxYear;
    }

    

    @Column(name="`open_status`", length=50)
    public String getOpenStatus() {
        return this.openStatus;
    }
    
    public void setOpenStatus(String openStatus) {
        this.openStatus = openStatus;
    }

    

    @Column(name="`inst1_due`", scale=4)
    public Double getInst1Due() {
        return this.inst1Due;
    }
    
    public void setInst1Due(Double inst1Due) {
        this.inst1Due = inst1Due;
    }

    

    @Column(name="`inst2_due`", scale=4)
    public Double getInst2Due() {
        return this.inst2Due;
    }
    
    public void setInst2Due(Double inst2Due) {
        this.inst2Due = inst2Due;
    }

    

    @Column(name="`total_due`", scale=4)
    public Double getTotalDue() {
        return this.totalDue;
    }
    
    public void setTotalDue(Double totalDue) {
        this.totalDue = totalDue;
    }

    

    @Column(name="`sale_type`", length=50)
    public String getSaleType() {
        return this.saleType;
    }
    
    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    

    @Column(name="`sale_status`", length=50)
    public String getSaleStatus() {
        return this.saleStatus;
    }
    
    public void setSaleStatus(String saleStatus) {
        this.saleStatus = saleStatus;
    }

    @Temporal(TemporalType.DATE)

    @Column(name="`disposition_date`", length=10)
    public java.util.Date getDispositionDate() {
        return this.dispositionDate;
    }
    
    public void setDispositionDate(java.util.Date dispositionDate) {
        this.dispositionDate = dispositionDate;
    }

    

    @Column(name="`case_number`", length=50)
    public String getCaseNumber() {
        return this.caseNumber;
    }
    
    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    

    @Column(name="`last_import_id`", precision=10)
    public Integer getLastImportId() {
        return this.lastImportId;
    }
    
    public void setLastImportId(Integer lastImportId) {
        this.lastImportId = lastImportId;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`property_id`")
    public Property getProperty() {
        return this.property;
    }
    
    public void setProperty(Property property) {
        this.property = property;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`research_bundle`")
    public Research getResearch() {
        return this.research;
    }
    
    public void setResearch(Research research) {
        this.research = research;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof TaxHistory) )
		    return false;

		 TaxHistory that = (TaxHistory) o;

		 return ( (this.getId()==that.getId()) || ( this.getId()!=null && that.getId()!=null && this.getId().equals(that.getId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );

         return result;
    }


}

