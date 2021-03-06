/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PortalCertificateParty generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`portal_certificate_party`", schema = "review")
@IdClass(PortalCertificatePartyId.class)
public class PortalCertificateParty implements Serializable {

    private int certificatePartyId;
    private int certificateId;
    private String interestType1;
    private String interestType2;
    private String interestType3;
    private java.util.Date letter1;
    private java.util.Date letter2;
    private String serviceType;
    private String service1Reference;
    private String service1Status;
    private String service2Reference;
    private String service2Status;
    private String service2Flag;
    private String service3Reference;
    private String service3Status;
    private String service3Flag;
    private String name;
    private String careOf;
    private String address;
    private String city;
    private String state;
    private String zip;
    private int partyId;
    private String partyCsz;
    private String class_;
    private String source1;
    private String source2;
    private boolean piq;

    @Id
    @Column(name = "`certificate_party_id`", nullable = false, scale = 0, precision = 10)
    public int getCertificatePartyId() {
        return this.certificatePartyId;
    }

    public void setCertificatePartyId(int certificatePartyId) {
        this.certificatePartyId = certificatePartyId;
    }

    @Id
    @Column(name = "`certificate_id`", nullable = false, scale = 0, precision = 10)
    public int getCertificateId() {
        return this.certificateId;
    }

    public void setCertificateId(int certificateId) {
        this.certificateId = certificateId;
    }

    @Id
    @Column(name = "`interest_type1`", nullable = false, length = 4)
    public String getInterestType1() {
        return this.interestType1;
    }

    public void setInterestType1(String interestType1) {
        this.interestType1 = interestType1;
    }

    @Id
    @Column(name = "`interest_type2`", nullable = true, length = 4)
    public String getInterestType2() {
        return this.interestType2;
    }

    public void setInterestType2(String interestType2) {
        this.interestType2 = interestType2;
    }

    @Id
    @Column(name = "`interest_type3`", nullable = true, length = 4)
    public String getInterestType3() {
        return this.interestType3;
    }

    public void setInterestType3(String interestType3) {
        this.interestType3 = interestType3;
    }

    @Id
    @Temporal(TemporalType.DATE)
    @Column(name = "`letter1`", nullable = true)
    public java.util.Date getLetter1() {
        return this.letter1;
    }

    public void setLetter1(java.util.Date letter1) {
        this.letter1 = letter1;
    }

    @Id
    @Temporal(TemporalType.DATE)
    @Column(name = "`letter2`", nullable = true)
    public java.util.Date getLetter2() {
        return this.letter2;
    }

    public void setLetter2(java.util.Date letter2) {
        this.letter2 = letter2;
    }

    @Id
    @Column(name = "`service_type`", nullable = false, length = 50)
    public String getServiceType() {
        return this.serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Id
    @Column(name = "`service1_reference`", nullable = true, length = 50)
    public String getService1Reference() {
        return this.service1Reference;
    }

    public void setService1Reference(String service1Reference) {
        this.service1Reference = service1Reference;
    }

    @Id
    @Column(name = "`service1_status`", nullable = true, length = 50)
    public String getService1Status() {
        return this.service1Status;
    }

    public void setService1Status(String service1Status) {
        this.service1Status = service1Status;
    }

    @Id
    @Column(name = "`service2_reference`", nullable = true, length = 50)
    public String getService2Reference() {
        return this.service2Reference;
    }

    public void setService2Reference(String service2Reference) {
        this.service2Reference = service2Reference;
    }

    @Id
    @Column(name = "`service2_status`", nullable = true, length = 50)
    public String getService2Status() {
        return this.service2Status;
    }

    public void setService2Status(String service2Status) {
        this.service2Status = service2Status;
    }

    @Id
    @Column(name = "`service2_flag`", nullable = true, length = 50)
    public String getService2Flag() {
        return this.service2Flag;
    }

    public void setService2Flag(String service2Flag) {
        this.service2Flag = service2Flag;
    }

    @Id
    @Column(name = "`service3_reference`", nullable = true, length = 50)
    public String getService3Reference() {
        return this.service3Reference;
    }

    public void setService3Reference(String service3Reference) {
        this.service3Reference = service3Reference;
    }

    @Id
    @Column(name = "`service3_status`", nullable = true, length = 50)
    public String getService3Status() {
        return this.service3Status;
    }

    public void setService3Status(String service3Status) {
        this.service3Status = service3Status;
    }

    @Id
    @Column(name = "`service3_flag`", nullable = true, length = 50)
    public String getService3Flag() {
        return this.service3Flag;
    }

    public void setService3Flag(String service3Flag) {
        this.service3Flag = service3Flag;
    }

    @Id
    @Column(name = "`name`", nullable = false, length = 200)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "`care_of`", nullable = true, length = 150)
    public String getCareOf() {
        return this.careOf;
    }

    public void setCareOf(String careOf) {
        this.careOf = careOf;
    }

    @Id
    @Column(name = "`address`", nullable = true, length = 100)
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Id
    @Column(name = "`city`", nullable = true, length = 50)
    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Id
    @Column(name = "`state`", nullable = true, length = 2)
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Id
    @Column(name = "`zip`", nullable = true, length = 10)
    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Id
    @Column(name = "`party_id`", nullable = false, scale = 0, precision = 10)
    public int getPartyId() {
        return this.partyId;
    }

    public void setPartyId(int partyId) {
        this.partyId = partyId;
    }

    @Id
    @Column(name = "`party_csz`", nullable = false, length = 64)
    public String getPartyCsz() {
        return this.partyCsz;
    }

    public void setPartyCsz(String partyCsz) {
        this.partyCsz = partyCsz;
    }

    @Id
    @Column(name = "`class`", nullable = false, length = 50)
    public String getClass_() {
        return this.class_;
    }

    public void setClass_(String class_) {
        this.class_ = class_;
    }

    @Id
    @Column(name = "`source1`", nullable = true, length = 4)
    public String getSource1() {
        return this.source1;
    }

    public void setSource1(String source1) {
        this.source1 = source1;
    }

    @Id
    @Column(name = "`source2`", nullable = true, length = 4)
    public String getSource2() {
        return this.source2;
    }

    public void setSource2(String source2) {
        this.source2 = source2;
    }

    @Id
    @Column(name = "`piq`", nullable = false)
    public boolean isPiq() {
        return this.piq;
    }

    public void setPiq(boolean piq) {
        this.piq = piq;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PortalCertificateParty)) return false;
        final PortalCertificateParty portalCertificateParty = (PortalCertificateParty) o;
        return Objects.equals(getCertificatePartyId(), portalCertificateParty.getCertificatePartyId()) &&
                Objects.equals(getCertificateId(), portalCertificateParty.getCertificateId()) &&
                Objects.equals(getInterestType1(), portalCertificateParty.getInterestType1()) &&
                Objects.equals(getInterestType2(), portalCertificateParty.getInterestType2()) &&
                Objects.equals(getInterestType3(), portalCertificateParty.getInterestType3()) &&
                Objects.equals(getLetter1(), portalCertificateParty.getLetter1()) &&
                Objects.equals(getLetter2(), portalCertificateParty.getLetter2()) &&
                Objects.equals(getServiceType(), portalCertificateParty.getServiceType()) &&
                Objects.equals(getService1Reference(), portalCertificateParty.getService1Reference()) &&
                Objects.equals(getService1Status(), portalCertificateParty.getService1Status()) &&
                Objects.equals(getService2Reference(), portalCertificateParty.getService2Reference()) &&
                Objects.equals(getService2Status(), portalCertificateParty.getService2Status()) &&
                Objects.equals(getService2Flag(), portalCertificateParty.getService2Flag()) &&
                Objects.equals(getService3Reference(), portalCertificateParty.getService3Reference()) &&
                Objects.equals(getService3Status(), portalCertificateParty.getService3Status()) &&
                Objects.equals(getService3Flag(), portalCertificateParty.getService3Flag()) &&
                Objects.equals(getName(), portalCertificateParty.getName()) &&
                Objects.equals(getCareOf(), portalCertificateParty.getCareOf()) &&
                Objects.equals(getAddress(), portalCertificateParty.getAddress()) &&
                Objects.equals(getCity(), portalCertificateParty.getCity()) &&
                Objects.equals(getState(), portalCertificateParty.getState()) &&
                Objects.equals(getZip(), portalCertificateParty.getZip()) &&
                Objects.equals(getPartyId(), portalCertificateParty.getPartyId()) &&
                Objects.equals(getPartyCsz(), portalCertificateParty.getPartyCsz()) &&
                Objects.equals(getClass_(), portalCertificateParty.getClass_()) &&
                Objects.equals(getSource1(), portalCertificateParty.getSource1()) &&
                Objects.equals(getSource2(), portalCertificateParty.getSource2()) &&
                Objects.equals(isPiq(), portalCertificateParty.isPiq());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCertificatePartyId(),
                getCertificateId(),
                getInterestType1(),
                getInterestType2(),
                getInterestType3(),
                getLetter1(),
                getLetter2(),
                getServiceType(),
                getService1Reference(),
                getService1Status(),
                getService2Reference(),
                getService2Status(),
                getService2Flag(),
                getService3Reference(),
                getService3Status(),
                getService3Flag(),
                getName(),
                getCareOf(),
                getAddress(),
                getCity(),
                getState(),
                getZip(),
                getPartyId(),
                getPartyCsz(),
                getClass_(),
                getSource1(),
                getSource2(),
                isPiq());
    }
}

