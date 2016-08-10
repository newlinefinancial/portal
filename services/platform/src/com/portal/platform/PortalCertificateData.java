/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PortalCertificateData generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`portal_certificate_data`", schema = "review")
@IdClass(PortalCertificateDataId.class)
public class PortalCertificateData implements Serializable {

    private int certificateId;
    private int propertyId;
    private String pin;
    private Integer volume;
    private String header;
    private String code;
    private String propertyType;
    private String certificateNumber;
    private BigDecimal bidRate;
    private int taxYear;
    private java.util.Date dateSold;
    private String status;
    private java.util.Date statusChangeDate;
    private String storageStatus;
    private String bank;
    private java.util.Date expirationDate;
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
    private java.util.Date initialCourtDate;
    private java.util.Date filedDate;
    private java.util.Date closedDate;

    @Id
    @Column(name = "`certificate_id`", nullable = false, scale = 0, precision = 10)
    public int getCertificateId() {
        return this.certificateId;
    }

    public void setCertificateId(int certificateId) {
        this.certificateId = certificateId;
    }

    @Id
    @Column(name = "`property_id`", nullable = false, scale = 0, precision = 10)
    public int getPropertyId() {
        return this.propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    @Id
    @Column(name = "`pin`", nullable = false, length = 255)
    public String getPin() {
        return this.pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Id
    @Column(name = "`volume`", nullable = true, scale = 0, precision = 10)
    public Integer getVolume() {
        return this.volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @Id
    @Column(name = "`header`", nullable = false, length = 255)
    public String getHeader() {
        return this.header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @Id
    @Column(name = "`code`", nullable = true, length = 50)
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Id
    @Column(name = "`property_type`", nullable = true, length = 235)
    public String getPropertyType() {
        return this.propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    @Id
    @Column(name = "`certificate_number`", nullable = false, length = 50)
    public String getCertificateNumber() {
        return this.certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    @Id
    @Column(name = "`bid_rate`", nullable = false, scale = 9, precision = 53)
    public BigDecimal getBidRate() {
        return this.bidRate;
    }

    public void setBidRate(BigDecimal bidRate) {
        this.bidRate = bidRate;
    }

    @Id
    @Column(name = "`tax_year`", nullable = false, scale = 0, precision = 10)
    public int getTaxYear() {
        return this.taxYear;
    }

    public void setTaxYear(int taxYear) {
        this.taxYear = taxYear;
    }

    @Id
    @Temporal(TemporalType.DATE)
    @Column(name = "`date_sold`", nullable = false)
    public java.util.Date getDateSold() {
        return this.dateSold;
    }

    public void setDateSold(java.util.Date dateSold) {
        this.dateSold = dateSold;
    }

    @Id
    @Column(name = "`status`", nullable = false, length = 50)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Id
    @Temporal(TemporalType.DATE)
    @Column(name = "`status_change_date`", nullable = true)
    public java.util.Date getStatusChangeDate() {
        return this.statusChangeDate;
    }

    public void setStatusChangeDate(java.util.Date statusChangeDate) {
        this.statusChangeDate = statusChangeDate;
    }

    @Id
    @Column(name = "`storage_status`", nullable = false, length = 50)
    public String getStorageStatus() {
        return this.storageStatus;
    }

    public void setStorageStatus(String storageStatus) {
        this.storageStatus = storageStatus;
    }

    @Id
    @Column(name = "`bank`", nullable = true, length = 50)
    public String getBank() {
        return this.bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @Id
    @Temporal(TemporalType.DATE)
    @Column(name = "`expiration_date`", nullable = false)
    public java.util.Date getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Id
    @Column(name = "`county_name`", nullable = false, length = 50)
    public String getCountyName() {
        return this.countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    @Id
    @Column(name = "`certificate_principal`", nullable = true, scale = 4, precision = 19)
    public Double getCertificatePrincipal() {
        return this.certificatePrincipal;
    }

    public void setCertificatePrincipal(Double certificatePrincipal) {
        this.certificatePrincipal = certificatePrincipal;
    }

    @Id
    @Column(name = "`sub_principal`", nullable = true, scale = 4, precision = 19)
    public Double getSubPrincipal() {
        return this.subPrincipal;
    }

    public void setSubPrincipal(Double subPrincipal) {
        this.subPrincipal = subPrincipal;
    }

    @Id
    @Column(name = "`fee_principal`", nullable = true, scale = 4, precision = 19)
    public Double getFeePrincipal() {
        return this.feePrincipal;
    }

    public void setFeePrincipal(Double feePrincipal) {
        this.feePrincipal = feePrincipal;
    }

    @Id
    @Column(name = "`certificate_revenue`", nullable = true, scale = 4, precision = 19)
    public Double getCertificateRevenue() {
        return this.certificateRevenue;
    }

    public void setCertificateRevenue(Double certificateRevenue) {
        this.certificateRevenue = certificateRevenue;
    }

    @Id
    @Column(name = "`sub_revenue`", nullable = true, scale = 4, precision = 19)
    public Double getSubRevenue() {
        return this.subRevenue;
    }

    public void setSubRevenue(Double subRevenue) {
        this.subRevenue = subRevenue;
    }

    @Id
    @Column(name = "`fee_revenue`", nullable = true, scale = 4, precision = 19)
    public Double getFeeRevenue() {
        return this.feeRevenue;
    }

    public void setFeeRevenue(Double feeRevenue) {
        this.feeRevenue = feeRevenue;
    }

    @Id
    @Column(name = "`principal`", nullable = true, scale = 4, precision = 19)
    public Double getPrincipal() {
        return this.principal;
    }

    public void setPrincipal(Double principal) {
        this.principal = principal;
    }

    @Id
    @Column(name = "`revenue`", nullable = true, scale = 4, precision = 19)
    public Double getRevenue() {
        return this.revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    @Id
    @Column(name = "`balance_due`", nullable = true, scale = 4, precision = 19)
    public Double getBalanceDue() {
        return this.balanceDue;
    }

    public void setBalanceDue(Double balanceDue) {
        this.balanceDue = balanceDue;
    }

    @Id
    @Column(name = "`payment_in_transit`", nullable = true, scale = 4, precision = 19)
    public Double getPaymentInTransit() {
        return this.paymentInTransit;
    }

    public void setPaymentInTransit(Double paymentInTransit) {
        this.paymentInTransit = paymentInTransit;
    }

    @Id
    @Column(name = "`due_after_settlement`", nullable = true, scale = 4, precision = 19)
    public Double getDueAfterSettlement() {
        return this.dueAfterSettlement;
    }

    public void setDueAfterSettlement(Double dueAfterSettlement) {
        this.dueAfterSettlement = dueAfterSettlement;
    }

    @Id
    @Column(name = "`matter_number`", nullable = true, length = 50)
    public String getMatterNumber() {
        return this.matterNumber;
    }

    public void setMatterNumber(String matterNumber) {
        this.matterNumber = matterNumber;
    }

    @Id
    @Temporal(TemporalType.DATE)
    @Column(name = "`initial_court_date`", nullable = true)
    public java.util.Date getInitialCourtDate() {
        return this.initialCourtDate;
    }

    public void setInitialCourtDate(java.util.Date initialCourtDate) {
        this.initialCourtDate = initialCourtDate;
    }

    @Id
    @Temporal(TemporalType.DATE)
    @Column(name = "`filed_date`", nullable = true)
    public java.util.Date getFiledDate() {
        return this.filedDate;
    }

    public void setFiledDate(java.util.Date filedDate) {
        this.filedDate = filedDate;
    }

    @Id
    @Temporal(TemporalType.DATE)
    @Column(name = "`closed_date`", nullable = true)
    public java.util.Date getClosedDate() {
        return this.closedDate;
    }

    public void setClosedDate(java.util.Date closedDate) {
        this.closedDate = closedDate;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PortalCertificateData)) return false;
        final PortalCertificateData portalCertificateData = (PortalCertificateData) o;
        return Objects.equals(getCertificateId(), portalCertificateData.getCertificateId()) &&
                Objects.equals(getPropertyId(), portalCertificateData.getPropertyId()) &&
                Objects.equals(getPin(), portalCertificateData.getPin()) &&
                Objects.equals(getVolume(), portalCertificateData.getVolume()) &&
                Objects.equals(getHeader(), portalCertificateData.getHeader()) &&
                Objects.equals(getCode(), portalCertificateData.getCode()) &&
                Objects.equals(getPropertyType(), portalCertificateData.getPropertyType()) &&
                Objects.equals(getCertificateNumber(), portalCertificateData.getCertificateNumber()) &&
                Objects.equals(getBidRate(), portalCertificateData.getBidRate()) &&
                Objects.equals(getTaxYear(), portalCertificateData.getTaxYear()) &&
                Objects.equals(getDateSold(), portalCertificateData.getDateSold()) &&
                Objects.equals(getStatus(), portalCertificateData.getStatus()) &&
                Objects.equals(getStatusChangeDate(), portalCertificateData.getStatusChangeDate()) &&
                Objects.equals(getStorageStatus(), portalCertificateData.getStorageStatus()) &&
                Objects.equals(getBank(), portalCertificateData.getBank()) &&
                Objects.equals(getExpirationDate(), portalCertificateData.getExpirationDate()) &&
                Objects.equals(getCountyName(), portalCertificateData.getCountyName()) &&
                Objects.equals(getCertificatePrincipal(), portalCertificateData.getCertificatePrincipal()) &&
                Objects.equals(getSubPrincipal(), portalCertificateData.getSubPrincipal()) &&
                Objects.equals(getFeePrincipal(), portalCertificateData.getFeePrincipal()) &&
                Objects.equals(getCertificateRevenue(), portalCertificateData.getCertificateRevenue()) &&
                Objects.equals(getSubRevenue(), portalCertificateData.getSubRevenue()) &&
                Objects.equals(getFeeRevenue(), portalCertificateData.getFeeRevenue()) &&
                Objects.equals(getPrincipal(), portalCertificateData.getPrincipal()) &&
                Objects.equals(getRevenue(), portalCertificateData.getRevenue()) &&
                Objects.equals(getBalanceDue(), portalCertificateData.getBalanceDue()) &&
                Objects.equals(getPaymentInTransit(), portalCertificateData.getPaymentInTransit()) &&
                Objects.equals(getDueAfterSettlement(), portalCertificateData.getDueAfterSettlement()) &&
                Objects.equals(getMatterNumber(), portalCertificateData.getMatterNumber()) &&
                Objects.equals(getInitialCourtDate(), portalCertificateData.getInitialCourtDate()) &&
                Objects.equals(getFiledDate(), portalCertificateData.getFiledDate()) &&
                Objects.equals(getClosedDate(), portalCertificateData.getClosedDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCertificateId(),
                getPropertyId(),
                getPin(),
                getVolume(),
                getHeader(),
                getCode(),
                getPropertyType(),
                getCertificateNumber(),
                getBidRate(),
                getTaxYear(),
                getDateSold(),
                getStatus(),
                getStatusChangeDate(),
                getStorageStatus(),
                getBank(),
                getExpirationDate(),
                getCountyName(),
                getCertificatePrincipal(),
                getSubPrincipal(),
                getFeePrincipal(),
                getCertificateRevenue(),
                getSubRevenue(),
                getFeeRevenue(),
                getPrincipal(),
                getRevenue(),
                getBalanceDue(),
                getPaymentInTransit(),
                getDueAfterSettlement(),
                getMatterNumber(),
                getInitialCourtDate(),
                getFiledDate(),
                getClosedDate());
    }
}

