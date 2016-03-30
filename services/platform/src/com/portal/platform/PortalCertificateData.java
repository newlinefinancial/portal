/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * PortalCertificateData generated by hbm2java
 */
@Entity
@Table(name="`portal_certificate_data`"
    ,schema="review"
)
@IdClass(value=PortalCertificateDataId.class)
public class PortalCertificateData  implements java.io.Serializable {

    
    private Integer certificateId;
    
    private Integer propertyId;
    
    private String pin;
    
    private Integer volume;
    
    private String header;
    
    private String code;
    
    private String propertyType;
    
    private String certificateNumber;
    
    private BigDecimal bidRate;
    
    private Integer taxYear;
    
    private Date dateSold;
    
    private String status;
    
    private Date statusChangeDate;
    
    private String storageStatus;
    
    private String bank;
    
    private Date expirationDate;
    
    private String countyName;
    
    private Double certificatePrincipal;
    
    private Double subPrincipal;
    
    private Double feePrincipal;
    
    private Double certificateRevenue;
    
    private Double subRevenue;
    
    private Double feeRevenue;
    
    private Double principal;
    
    private Double revenue;
    
    private Double balanceDue;
    
    private Double paymentInTransit;
    
    private Double dueAfterSettlement;
    
    private String matterNumber;
    
    private Date initialCourtDate;
    
    private Date filedDate;
    
    private Date closedDate;

    public PortalCertificateData() {
    }


    @Id 
    

    @Column(name="`certificate_id`", insertable=false, updatable=false, precision=10)
    public Integer getCertificateId() {
        return this.certificateId;
    }
    
    public void setCertificateId(Integer certificateId) {
        this.certificateId = certificateId;
    }
    @Id 
    

    @Column(name="`property_id`", insertable=false, updatable=false, precision=10)
    public Integer getPropertyId() {
        return this.propertyId;
    }
    
    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }
    @Id 
    

    @Column(name="`pin`", insertable=false, updatable=false)
    public String getPin() {
        return this.pin;
    }
    
    public void setPin(String pin) {
        this.pin = pin;
    }
    @Id 
    

    @Column(name="`volume`", insertable=false, updatable=false, precision=10)
    public Integer getVolume() {
        return this.volume;
    }
    
    public void setVolume(Integer volume) {
        this.volume = volume;
    }
    @Id 
    

    @Column(name="`header`", insertable=false, updatable=false)
    public String getHeader() {
        return this.header;
    }
    
    public void setHeader(String header) {
        this.header = header;
    }
    @Id 
    

    @Column(name="`code`", insertable=false, updatable=false, length=50)
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    @Id 
    

    @Column(name="`property_type`", insertable=false, updatable=false, length=235)
    public String getPropertyType() {
        return this.propertyType;
    }
    
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }
    @Id 
    

    @Column(name="`certificate_number`", insertable=false, updatable=false, length=50)
    public String getCertificateNumber() {
        return this.certificateNumber;
    }
    
    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }
    @Id 
    

    @Column(name="`bid_rate`", insertable=false, updatable=false, precision=53, scale=9)
    public BigDecimal getBidRate() {
        return this.bidRate;
    }
    
    public void setBidRate(BigDecimal bidRate) {
        this.bidRate = bidRate;
    }
    @Id 
    

    @Column(name="`tax_year`", insertable=false, updatable=false, precision=10)
    public Integer getTaxYear() {
        return this.taxYear;
    }
    
    public void setTaxYear(Integer taxYear) {
        this.taxYear = taxYear;
    }
    @Id 
    @Temporal(TemporalType.DATE)

    @Column(name="`date_sold`", insertable=false, updatable=false, length=10)
    public Date getDateSold() {
        return this.dateSold;
    }
    
    public void setDateSold(Date dateSold) {
        this.dateSold = dateSold;
    }
    @Id 
    

    @Column(name="`status`", insertable=false, updatable=false, length=50)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    @Id 
    @Temporal(TemporalType.DATE)

    @Column(name="`status_change_date`", insertable=false, updatable=false, length=10)
    public Date getStatusChangeDate() {
        return this.statusChangeDate;
    }
    
    public void setStatusChangeDate(Date statusChangeDate) {
        this.statusChangeDate = statusChangeDate;
    }
    @Id 
    

    @Column(name="`storage_status`", insertable=false, updatable=false, length=50)
    public String getStorageStatus() {
        return this.storageStatus;
    }
    
    public void setStorageStatus(String storageStatus) {
        this.storageStatus = storageStatus;
    }
    @Id 
    

    @Column(name="`bank`", insertable=false, updatable=false, length=50)
    public String getBank() {
        return this.bank;
    }
    
    public void setBank(String bank) {
        this.bank = bank;
    }
    @Id 
    @Temporal(TemporalType.DATE)

    @Column(name="`expiration_date`", insertable=false, updatable=false, length=10)
    public Date getExpirationDate() {
        return this.expirationDate;
    }
    
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
    @Id 
    

    @Column(name="`county_name`", insertable=false, updatable=false, length=50)
    public String getCountyName() {
        return this.countyName;
    }
    
    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
    @Id 
    

    @Column(name="`certificate_principal`", insertable=false, updatable=false, scale=4)
    public Double getCertificatePrincipal() {
        return this.certificatePrincipal;
    }
    
    public void setCertificatePrincipal(Double certificatePrincipal) {
        this.certificatePrincipal = certificatePrincipal;
    }
    @Id 
    

    @Column(name="`sub_principal`", insertable=false, updatable=false, scale=4)
    public Double getSubPrincipal() {
        return this.subPrincipal;
    }
    
    public void setSubPrincipal(Double subPrincipal) {
        this.subPrincipal = subPrincipal;
    }
    @Id 
    

    @Column(name="`fee_principal`", insertable=false, updatable=false, scale=4)
    public Double getFeePrincipal() {
        return this.feePrincipal;
    }
    
    public void setFeePrincipal(Double feePrincipal) {
        this.feePrincipal = feePrincipal;
    }
    @Id 
    

    @Column(name="`certificate_revenue`", insertable=false, updatable=false, scale=4)
    public Double getCertificateRevenue() {
        return this.certificateRevenue;
    }
    
    public void setCertificateRevenue(Double certificateRevenue) {
        this.certificateRevenue = certificateRevenue;
    }
    @Id 
    

    @Column(name="`sub_revenue`", insertable=false, updatable=false, scale=4)
    public Double getSubRevenue() {
        return this.subRevenue;
    }
    
    public void setSubRevenue(Double subRevenue) {
        this.subRevenue = subRevenue;
    }
    @Id 
    

    @Column(name="`fee_revenue`", insertable=false, updatable=false, scale=4)
    public Double getFeeRevenue() {
        return this.feeRevenue;
    }
    
    public void setFeeRevenue(Double feeRevenue) {
        this.feeRevenue = feeRevenue;
    }
    @Id 
    

    @Column(name="`principal`", insertable=false, updatable=false, scale=4)
    public Double getPrincipal() {
        return this.principal;
    }
    
    public void setPrincipal(Double principal) {
        this.principal = principal;
    }
    @Id 
    

    @Column(name="`revenue`", insertable=false, updatable=false, scale=4)
    public Double getRevenue() {
        return this.revenue;
    }
    
    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }
    @Id 
    

    @Column(name="`balance_due`", insertable=false, updatable=false, scale=4)
    public Double getBalanceDue() {
        return this.balanceDue;
    }
    
    public void setBalanceDue(Double balanceDue) {
        this.balanceDue = balanceDue;
    }
    @Id 
    

    @Column(name="`payment_in_transit`", insertable=false, updatable=false, scale=4)
    public Double getPaymentInTransit() {
        return this.paymentInTransit;
    }
    
    public void setPaymentInTransit(Double paymentInTransit) {
        this.paymentInTransit = paymentInTransit;
    }
    @Id 
    

    @Column(name="`due_after_settlement`", insertable=false, updatable=false, scale=4)
    public Double getDueAfterSettlement() {
        return this.dueAfterSettlement;
    }
    
    public void setDueAfterSettlement(Double dueAfterSettlement) {
        this.dueAfterSettlement = dueAfterSettlement;
    }
    @Id 
    

    @Column(name="`matter_number`", insertable=false, updatable=false, length=50)
    public String getMatterNumber() {
        return this.matterNumber;
    }
    
    public void setMatterNumber(String matterNumber) {
        this.matterNumber = matterNumber;
    }
    @Id 
    @Temporal(TemporalType.DATE)

    @Column(name="`initial_court_date`", insertable=false, updatable=false, length=10)
    public Date getInitialCourtDate() {
        return this.initialCourtDate;
    }
    
    public void setInitialCourtDate(Date initialCourtDate) {
        this.initialCourtDate = initialCourtDate;
    }
    @Id 
    @Temporal(TemporalType.DATE)

    @Column(name="`filed_date`", insertable=false, updatable=false, length=10)
    public Date getFiledDate() {
        return this.filedDate;
    }
    
    public void setFiledDate(Date filedDate) {
        this.filedDate = filedDate;
    }
    @Id 
    @Temporal(TemporalType.DATE)

    @Column(name="`closed_date`", insertable=false, updatable=false, length=10)
    public Date getClosedDate() {
        return this.closedDate;
    }
    
    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof PortalCertificateData) )
		    return false;

		 PortalCertificateData that = (PortalCertificateData) o;

         return ( (this.getCertificateId()==that.getCertificateId()) || ( this.getCertificateId()!=null && that.getCertificateId()!=null && this.getCertificateId().equals(that.getCertificateId()) ) )
 && ( (this.getPropertyId()==that.getPropertyId()) || ( this.getPropertyId()!=null && that.getPropertyId()!=null && this.getPropertyId().equals(that.getPropertyId()) ) )
 && ( (this.getPin()==that.getPin()) || ( this.getPin()!=null && that.getPin()!=null && this.getPin().equals(that.getPin()) ) )
 && ( (this.getVolume()==that.getVolume()) || ( this.getVolume()!=null && that.getVolume()!=null && this.getVolume().equals(that.getVolume()) ) )
 && ( (this.getHeader()==that.getHeader()) || ( this.getHeader()!=null && that.getHeader()!=null && this.getHeader().equals(that.getHeader()) ) )
 && ( (this.getCode()==that.getCode()) || ( this.getCode()!=null && that.getCode()!=null && this.getCode().equals(that.getCode()) ) )
 && ( (this.getPropertyType()==that.getPropertyType()) || ( this.getPropertyType()!=null && that.getPropertyType()!=null && this.getPropertyType().equals(that.getPropertyType()) ) )
 && ( (this.getCertificateNumber()==that.getCertificateNumber()) || ( this.getCertificateNumber()!=null && that.getCertificateNumber()!=null && this.getCertificateNumber().equals(that.getCertificateNumber()) ) )
 && ( (this.getBidRate()==that.getBidRate()) || ( this.getBidRate()!=null && that.getBidRate()!=null && this.getBidRate().equals(that.getBidRate()) ) )
 && ( (this.getTaxYear()==that.getTaxYear()) || ( this.getTaxYear()!=null && that.getTaxYear()!=null && this.getTaxYear().equals(that.getTaxYear()) ) )
 && ( (this.getDateSold()==that.getDateSold()) || ( this.getDateSold()!=null && that.getDateSold()!=null && this.getDateSold().equals(that.getDateSold()) ) )
 && ( (this.getStatus()==that.getStatus()) || ( this.getStatus()!=null && that.getStatus()!=null && this.getStatus().equals(that.getStatus()) ) )
 && ( (this.getStatusChangeDate()==that.getStatusChangeDate()) || ( this.getStatusChangeDate()!=null && that.getStatusChangeDate()!=null && this.getStatusChangeDate().equals(that.getStatusChangeDate()) ) )
 && ( (this.getStorageStatus()==that.getStorageStatus()) || ( this.getStorageStatus()!=null && that.getStorageStatus()!=null && this.getStorageStatus().equals(that.getStorageStatus()) ) )
 && ( (this.getBank()==that.getBank()) || ( this.getBank()!=null && that.getBank()!=null && this.getBank().equals(that.getBank()) ) )
 && ( (this.getExpirationDate()==that.getExpirationDate()) || ( this.getExpirationDate()!=null && that.getExpirationDate()!=null && this.getExpirationDate().equals(that.getExpirationDate()) ) )
 && ( (this.getCountyName()==that.getCountyName()) || ( this.getCountyName()!=null && that.getCountyName()!=null && this.getCountyName().equals(that.getCountyName()) ) )
 && ( (this.getCertificatePrincipal()==that.getCertificatePrincipal()) || ( this.getCertificatePrincipal()!=null && that.getCertificatePrincipal()!=null && this.getCertificatePrincipal().equals(that.getCertificatePrincipal()) ) )
 && ( (this.getSubPrincipal()==that.getSubPrincipal()) || ( this.getSubPrincipal()!=null && that.getSubPrincipal()!=null && this.getSubPrincipal().equals(that.getSubPrincipal()) ) )
 && ( (this.getFeePrincipal()==that.getFeePrincipal()) || ( this.getFeePrincipal()!=null && that.getFeePrincipal()!=null && this.getFeePrincipal().equals(that.getFeePrincipal()) ) )
 && ( (this.getCertificateRevenue()==that.getCertificateRevenue()) || ( this.getCertificateRevenue()!=null && that.getCertificateRevenue()!=null && this.getCertificateRevenue().equals(that.getCertificateRevenue()) ) )
 && ( (this.getSubRevenue()==that.getSubRevenue()) || ( this.getSubRevenue()!=null && that.getSubRevenue()!=null && this.getSubRevenue().equals(that.getSubRevenue()) ) )
 && ( (this.getFeeRevenue()==that.getFeeRevenue()) || ( this.getFeeRevenue()!=null && that.getFeeRevenue()!=null && this.getFeeRevenue().equals(that.getFeeRevenue()) ) )
 && ( (this.getPrincipal()==that.getPrincipal()) || ( this.getPrincipal()!=null && that.getPrincipal()!=null && this.getPrincipal().equals(that.getPrincipal()) ) )
 && ( (this.getRevenue()==that.getRevenue()) || ( this.getRevenue()!=null && that.getRevenue()!=null && this.getRevenue().equals(that.getRevenue()) ) )
 && ( (this.getBalanceDue()==that.getBalanceDue()) || ( this.getBalanceDue()!=null && that.getBalanceDue()!=null && this.getBalanceDue().equals(that.getBalanceDue()) ) )
 && ( (this.getPaymentInTransit()==that.getPaymentInTransit()) || ( this.getPaymentInTransit()!=null && that.getPaymentInTransit()!=null && this.getPaymentInTransit().equals(that.getPaymentInTransit()) ) )
 && ( (this.getDueAfterSettlement()==that.getDueAfterSettlement()) || ( this.getDueAfterSettlement()!=null && that.getDueAfterSettlement()!=null && this.getDueAfterSettlement().equals(that.getDueAfterSettlement()) ) )
 && ( (this.getMatterNumber()==that.getMatterNumber()) || ( this.getMatterNumber()!=null && that.getMatterNumber()!=null && this.getMatterNumber().equals(that.getMatterNumber()) ) )
 && ( (this.getInitialCourtDate()==that.getInitialCourtDate()) || ( this.getInitialCourtDate()!=null && that.getInitialCourtDate()!=null && this.getInitialCourtDate().equals(that.getInitialCourtDate()) ) )
 && ( (this.getFiledDate()==that.getFiledDate()) || ( this.getFiledDate()!=null && that.getFiledDate()!=null && this.getFiledDate().equals(that.getFiledDate()) ) )
 && ( (this.getClosedDate()==that.getClosedDate()) || ( this.getClosedDate()!=null && that.getClosedDate()!=null && this.getClosedDate().equals(that.getClosedDate()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getCertificateId() == null ? 0 : this.getCertificateId().hashCode() );
         result = 37 * result + ( getPropertyId() == null ? 0 : this.getPropertyId().hashCode() );
         result = 37 * result + ( getPin() == null ? 0 : this.getPin().hashCode() );
         result = 37 * result + ( getVolume() == null ? 0 : this.getVolume().hashCode() );
         result = 37 * result + ( getHeader() == null ? 0 : this.getHeader().hashCode() );
         result = 37 * result + ( getCode() == null ? 0 : this.getCode().hashCode() );
         result = 37 * result + ( getPropertyType() == null ? 0 : this.getPropertyType().hashCode() );
         result = 37 * result + ( getCertificateNumber() == null ? 0 : this.getCertificateNumber().hashCode() );
         result = 37 * result + ( getBidRate() == null ? 0 : this.getBidRate().hashCode() );
         result = 37 * result + ( getTaxYear() == null ? 0 : this.getTaxYear().hashCode() );
         result = 37 * result + ( getDateSold() == null ? 0 : this.getDateSold().hashCode() );
         result = 37 * result + ( getStatus() == null ? 0 : this.getStatus().hashCode() );
         result = 37 * result + ( getStatusChangeDate() == null ? 0 : this.getStatusChangeDate().hashCode() );
         result = 37 * result + ( getStorageStatus() == null ? 0 : this.getStorageStatus().hashCode() );
         result = 37 * result + ( getBank() == null ? 0 : this.getBank().hashCode() );
         result = 37 * result + ( getExpirationDate() == null ? 0 : this.getExpirationDate().hashCode() );
         result = 37 * result + ( getCountyName() == null ? 0 : this.getCountyName().hashCode() );
         result = 37 * result + ( getCertificatePrincipal() == null ? 0 : this.getCertificatePrincipal().hashCode() );
         result = 37 * result + ( getSubPrincipal() == null ? 0 : this.getSubPrincipal().hashCode() );
         result = 37 * result + ( getFeePrincipal() == null ? 0 : this.getFeePrincipal().hashCode() );
         result = 37 * result + ( getCertificateRevenue() == null ? 0 : this.getCertificateRevenue().hashCode() );
         result = 37 * result + ( getSubRevenue() == null ? 0 : this.getSubRevenue().hashCode() );
         result = 37 * result + ( getFeeRevenue() == null ? 0 : this.getFeeRevenue().hashCode() );
         result = 37 * result + ( getPrincipal() == null ? 0 : this.getPrincipal().hashCode() );
         result = 37 * result + ( getRevenue() == null ? 0 : this.getRevenue().hashCode() );
         result = 37 * result + ( getBalanceDue() == null ? 0 : this.getBalanceDue().hashCode() );
         result = 37 * result + ( getPaymentInTransit() == null ? 0 : this.getPaymentInTransit().hashCode() );
         result = 37 * result + ( getDueAfterSettlement() == null ? 0 : this.getDueAfterSettlement().hashCode() );
         result = 37 * result + ( getMatterNumber() == null ? 0 : this.getMatterNumber().hashCode() );
         result = 37 * result + ( getInitialCourtDate() == null ? 0 : this.getInitialCourtDate().hashCode() );
         result = 37 * result + ( getFiledDate() == null ? 0 : this.getFiledDate().hashCode() );
         result = 37 * result + ( getClosedDate() == null ? 0 : this.getClosedDate().hashCode() );

         return result;
    }


}

