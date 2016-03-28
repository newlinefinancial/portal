/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * Disbursement generated by hbm2java
 */
@Entity
@Table(name="`disbursement`"
    ,schema="servicing"
)

public class Disbursement  implements java.io.Serializable {

    
    private Integer id;
    
    private java.util.Date createdTimestamp;
    
    private java.util.Date updatedTimestamp;
    
    private String category;
    
    private String type;
    
    private String taxYearPaid;
    
    private Integer installment;
    
    private java.util.Date paymentDate;
    
    private Double amount;
    
    private String reference;
    
    private Integer currentPenaltyPeriod;
    
    private Boolean locked;
    
    private String user;
    
    private Integer lastImportId;
    
    private Certificate certificate;
    
    private Set<Payment> payments = new HashSet<Payment>(0);
    
    private Set<Accrual> accruals = new HashSet<Accrual>(0);

    public Disbursement() {
    }


    @Id @GeneratedValue(strategy=IDENTITY)
    

    @Column(name="`id`", precision=10)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    @Temporal(TemporalType.TIMESTAMP)

    @Column(name="`created_timestamp`", length=23)
    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }
    
    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    @Temporal(TemporalType.TIMESTAMP)

    @Column(name="`updated_timestamp`", length=23)
    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }
    
    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    

    @Column(name="`category`", length=50)
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }

    

    @Column(name="`type`", length=50)
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    

    @Column(name="`tax_year_paid`")
    public String getTaxYearPaid() {
        return this.taxYearPaid;
    }
    
    public void setTaxYearPaid(String taxYearPaid) {
        this.taxYearPaid = taxYearPaid;
    }

    

    @Column(name="`installment`", precision=10)
    public Integer getInstallment() {
        return this.installment;
    }
    
    public void setInstallment(Integer installment) {
        this.installment = installment;
    }

    @Temporal(TemporalType.DATE)

    @Column(name="`payment_date`", length=10)
    public java.util.Date getPaymentDate() {
        return this.paymentDate;
    }
    
    public void setPaymentDate(java.util.Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    

    @Column(name="`amount`", scale=4)
    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    

    @Column(name="`reference`", length=50)
    public String getReference() {
        return this.reference;
    }
    
    public void setReference(String reference) {
        this.reference = reference;
    }

    

    @Column(name="`current_penalty_period`", precision=10)
    public Integer getCurrentPenaltyPeriod() {
        return this.currentPenaltyPeriod;
    }
    
    public void setCurrentPenaltyPeriod(Integer currentPenaltyPeriod) {
        this.currentPenaltyPeriod = currentPenaltyPeriod;
    }

    

    @Column(name="`locked`")
    public Boolean getLocked() {
        return this.locked;
    }
    
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    

    @Column(name="`user`", length=50)
    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }

    

    @Column(name="`last_import_id`", precision=10)
    public Integer getLastImportId() {
        return this.lastImportId;
    }
    
    public void setLastImportId(Integer lastImportId) {
        this.lastImportId = lastImportId;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`certificate_id`")
    public Certificate getCertificate() {
        return this.certificate;
    }
    
    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="disbursement")
    public Set<Payment> getPayments() {
        return this.payments;
    }
    
    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="disbursement")
    public Set<Accrual> getAccruals() {
        return this.accruals;
    }
    
    public void setAccruals(Set<Accrual> accruals) {
        this.accruals = accruals;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof Disbursement) )
		    return false;

		 Disbursement that = (Disbursement) o;

		 return ( (this.getId()==that.getId()) || ( this.getId()!=null && that.getId()!=null && this.getId().equals(that.getId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );

         return result;
    }


}

