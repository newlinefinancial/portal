/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class BankReportId implements Serializable {

    private String event;
    private String state;
    private String countyName;
    private int taxYear;
    private String certificateNumber;
    private int volume;
    private String pin;
    private String bank;
    private java.util.Date activityDate;
    private Double amount;
    private BigDecimal lenderPortion;
    private Double certificatePrincipal;
    private Double subPrincipal;
    private Double revenue;
    private Double balanceDue;

    public String getEvent() {
        return this.event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountyName() {
        return this.countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getTaxYear() {
        return this.taxYear;
    }

    public void setTaxYear(int taxYear) {
        this.taxYear = taxYear;
    }

    public String getCertificateNumber() {
        return this.certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getPin() {
        return this.pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getBank() {
        return this.bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public java.util.Date getActivityDate() {
        return this.activityDate;
    }

    public void setActivityDate(java.util.Date activityDate) {
        this.activityDate = activityDate;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public BigDecimal getLenderPortion() {
        return this.lenderPortion;
    }

    public void setLenderPortion(BigDecimal lenderPortion) {
        this.lenderPortion = lenderPortion;
    }

    public Double getCertificatePrincipal() {
        return this.certificatePrincipal;
    }

    public void setCertificatePrincipal(Double certificatePrincipal) {
        this.certificatePrincipal = certificatePrincipal;
    }

    public Double getSubPrincipal() {
        return this.subPrincipal;
    }

    public void setSubPrincipal(Double subPrincipal) {
        this.subPrincipal = subPrincipal;
    }

    public Double getRevenue() {
        return this.revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Double getBalanceDue() {
        return this.balanceDue;
    }

    public void setBalanceDue(Double balanceDue) {
        this.balanceDue = balanceDue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankReport)) return false;
        final BankReport bankReport = (BankReport) o;
        return Objects.equals(getEvent(), bankReport.getEvent()) &&
                Objects.equals(getState(), bankReport.getState()) &&
                Objects.equals(getCountyName(), bankReport.getCountyName()) &&
                Objects.equals(getTaxYear(), bankReport.getTaxYear()) &&
                Objects.equals(getCertificateNumber(), bankReport.getCertificateNumber()) &&
                Objects.equals(getVolume(), bankReport.getVolume()) &&
                Objects.equals(getPin(), bankReport.getPin()) &&
                Objects.equals(getBank(), bankReport.getBank()) &&
                Objects.equals(getActivityDate(), bankReport.getActivityDate()) &&
                Objects.equals(getAmount(), bankReport.getAmount()) &&
                Objects.equals(getLenderPortion(), bankReport.getLenderPortion()) &&
                Objects.equals(getCertificatePrincipal(), bankReport.getCertificatePrincipal()) &&
                Objects.equals(getSubPrincipal(), bankReport.getSubPrincipal()) &&
                Objects.equals(getRevenue(), bankReport.getRevenue()) &&
                Objects.equals(getBalanceDue(), bankReport.getBalanceDue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEvent(),
                getState(),
                getCountyName(),
                getTaxYear(),
                getCertificateNumber(),
                getVolume(),
                getPin(),
                getBank(),
                getActivityDate(),
                getAmount(),
                getLenderPortion(),
                getCertificatePrincipal(),
                getSubPrincipal(),
                getRevenue(),
                getBalanceDue());
    }
}
