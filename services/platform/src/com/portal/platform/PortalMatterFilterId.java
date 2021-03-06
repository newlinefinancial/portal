/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

public class PortalMatterFilterId implements Serializable {

    private int propertyId;
    private String countyName;
    private String certificateNumber;
    private int taxYear;
    private String status;
    private String pin;
    private int volume;
    private java.util.Date expirationDate;
    private String matterNumber;
    private java.util.Date closedDate;
    private java.util.Date filedDate;
    private int matterId;
    private int certificateId;

    public int getPropertyId() {
        return this.propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public String getCountyName() {
        return this.countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCertificateNumber() {
        return this.certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public int getTaxYear() {
        return this.taxYear;
    }

    public void setTaxYear(int taxYear) {
        this.taxYear = taxYear;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPin() {
        return this.pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public java.util.Date getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getMatterNumber() {
        return this.matterNumber;
    }

    public void setMatterNumber(String matterNumber) {
        this.matterNumber = matterNumber;
    }

    public java.util.Date getClosedDate() {
        return this.closedDate;
    }

    public void setClosedDate(java.util.Date closedDate) {
        this.closedDate = closedDate;
    }

    public java.util.Date getFiledDate() {
        return this.filedDate;
    }

    public void setFiledDate(java.util.Date filedDate) {
        this.filedDate = filedDate;
    }

    public int getMatterId() {
        return this.matterId;
    }

    public void setMatterId(int matterId) {
        this.matterId = matterId;
    }

    public int getCertificateId() {
        return this.certificateId;
    }

    public void setCertificateId(int certificateId) {
        this.certificateId = certificateId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PortalMatterFilter)) return false;
        final PortalMatterFilter portalMatterFilter = (PortalMatterFilter) o;
        return Objects.equals(getPropertyId(), portalMatterFilter.getPropertyId()) &&
                Objects.equals(getCountyName(), portalMatterFilter.getCountyName()) &&
                Objects.equals(getCertificateNumber(), portalMatterFilter.getCertificateNumber()) &&
                Objects.equals(getTaxYear(), portalMatterFilter.getTaxYear()) &&
                Objects.equals(getStatus(), portalMatterFilter.getStatus()) &&
                Objects.equals(getPin(), portalMatterFilter.getPin()) &&
                Objects.equals(getVolume(), portalMatterFilter.getVolume()) &&
                Objects.equals(getExpirationDate(), portalMatterFilter.getExpirationDate()) &&
                Objects.equals(getMatterNumber(), portalMatterFilter.getMatterNumber()) &&
                Objects.equals(getClosedDate(), portalMatterFilter.getClosedDate()) &&
                Objects.equals(getFiledDate(), portalMatterFilter.getFiledDate()) &&
                Objects.equals(getMatterId(), portalMatterFilter.getMatterId()) &&
                Objects.equals(getCertificateId(), portalMatterFilter.getCertificateId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPropertyId(),
                getCountyName(),
                getCertificateNumber(),
                getTaxYear(),
                getStatus(),
                getPin(),
                getVolume(),
                getExpirationDate(),
                getMatterNumber(),
                getClosedDate(),
                getFiledDate(),
                getMatterId(),
                getCertificateId());
    }
}
