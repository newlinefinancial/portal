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
 * Accrual generated by hbm2java
 */
@Entity
@Table(name="`accrual`"
    ,schema="servicing"
)

public class Accrual  implements java.io.Serializable {

    
    private Integer id;
    
    private java.util.Date enteredTimestamp;
    
    private java.util.Date updatedTimestamp;
    
    private String disbursementCategory;
    
    private java.util.Date effectiveDate;
    
    private Double revenueAmount;
    
    private Double principalAmount;
    
    private Double totalAccrualAmount;
    
    private Integer penaltyPeriod;
    
    private String user;
    
    private AccrualType accrualType;
    
    private Certificate certificate;
    
    private Disbursement disbursement;
    
    private Payment payment;

    public Accrual() {
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

    @Column(name="`entered_timestamp`", length=23)
    public java.util.Date getEnteredTimestamp() {
        return this.enteredTimestamp;
    }
    
    public void setEnteredTimestamp(java.util.Date enteredTimestamp) {
        this.enteredTimestamp = enteredTimestamp;
    }

    @Temporal(TemporalType.TIMESTAMP)

    @Column(name="`updated_timestamp`", length=23)
    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }
    
    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    

    @Column(name="`disbursement_category`", length=50)
    public String getDisbursementCategory() {
        return this.disbursementCategory;
    }
    
    public void setDisbursementCategory(String disbursementCategory) {
        this.disbursementCategory = disbursementCategory;
    }

    @Temporal(TemporalType.DATE)

    @Column(name="`effective_date`", length=10)
    public java.util.Date getEffectiveDate() {
        return this.effectiveDate;
    }
    
    public void setEffectiveDate(java.util.Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    

    @Column(name="`revenue_amount`", scale=4)
    public Double getRevenueAmount() {
        return this.revenueAmount;
    }
    
    public void setRevenueAmount(Double revenueAmount) {
        this.revenueAmount = revenueAmount;
    }

    

    @Column(name="`principal_amount`", scale=4)
    public Double getPrincipalAmount() {
        return this.principalAmount;
    }
    
    public void setPrincipalAmount(Double principalAmount) {
        this.principalAmount = principalAmount;
    }

    

    @Column(name="`total_accrual_amount`", scale=4)
    public Double getTotalAccrualAmount() {
        return this.totalAccrualAmount;
    }
    
    public void setTotalAccrualAmount(Double totalAccrualAmount) {
        this.totalAccrualAmount = totalAccrualAmount;
    }

    

    @Column(name="`penalty_period`", precision=10)
    public Integer getPenaltyPeriod() {
        return this.penaltyPeriod;
    }
    
    public void setPenaltyPeriod(Integer penaltyPeriod) {
        this.penaltyPeriod = penaltyPeriod;
    }

    

    @Column(name="`user`", length=50)
    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`accrual_type_id`")
    public AccrualType getAccrualType() {
        return this.accrualType;
    }
    
    public void setAccrualType(AccrualType accrualType) {
        this.accrualType = accrualType;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`certificate_id`")
    public Certificate getCertificate() {
        return this.certificate;
    }
    
    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`disbursement_id`")
    public Disbursement getDisbursement() {
        return this.disbursement;
    }
    
    public void setDisbursement(Disbursement disbursement) {
        this.disbursement = disbursement;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`payment_id`")
    public Payment getPayment() {
        return this.payment;
    }
    
    public void setPayment(Payment payment) {
        this.payment = payment;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof Accrual) )
		    return false;

		 Accrual that = (Accrual) o;

		 return ( (this.getId()==that.getId()) || ( this.getId()!=null && that.getId()!=null && this.getId().equals(that.getId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );

         return result;
    }


}

