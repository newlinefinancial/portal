/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;
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
 * Payment generated by hbm2java
 */
@Entity
@Table(name="`payment`"
    ,schema="servicing"
)

public class Payment  implements java.io.Serializable {

    
    private Integer id;
    
    private Date updatedTimestamp;
    
    private String paymentType;
    
    private Double amount;
    
    private Date effectiveDate;
    
    private Date receivedDate;
    
    private String checkNumber;
    
    private String trustReceipt;
    
    private String user;
    
    private Boolean locked;
    
    private Certificate certificate;
    
    private Disbursement disbursement;
    
    private Set<Accrual> accruals = new HashSet<Accrual>(0);

    public Payment() {
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

    @Column(name="`updated_timestamp`", length=23)
    public Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }
    
    public void setUpdatedTimestamp(Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    

    @Column(name="`payment_type`", length=50)
    public String getPaymentType() {
        return this.paymentType;
    }
    
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    

    @Column(name="`amount`", scale=4)
    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Temporal(TemporalType.DATE)

    @Column(name="`effective_date`", length=10)
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }
    
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @Temporal(TemporalType.DATE)

    @Column(name="`received_date`", length=10)
    public Date getReceivedDate() {
        return this.receivedDate;
    }
    
    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    

    @Column(name="`check_number`", length=50)
    public String getCheckNumber() {
        return this.checkNumber;
    }
    
    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    

    @Column(name="`trust_receipt`", length=50)
    public String getTrustReceipt() {
        return this.trustReceipt;
    }
    
    public void setTrustReceipt(String trustReceipt) {
        this.trustReceipt = trustReceipt;
    }

    

    @Column(name="`user`", length=50)
    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }

    

    @Column(name="`locked`")
    public Boolean getLocked() {
        return this.locked;
    }
    
    public void setLocked(Boolean locked) {
        this.locked = locked;
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

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="payment")
    public Set<Accrual> getAccruals() {
        return this.accruals;
    }
    
    public void setAccruals(Set<Accrual> accruals) {
        this.accruals = accruals;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof Payment) )
		    return false;

		 Payment that = (Payment) o;

		 return ( (this.getId()==that.getId()) || ( this.getId()!=null && that.getId()!=null && this.getId().equals(that.getId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );

         return result;
    }


}

