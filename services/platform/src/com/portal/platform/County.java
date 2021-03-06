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
import javax.persistence.UniqueConstraint;

/**
 * County generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`county`", schema = "data", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"`county_name`"})})
public class County implements Serializable {

    private int id;
    private String countyName;
    private String areaLookup;
    private Integer areaLength;
    private String gis;
    private String assessor;
    private String newlinePhoto;
    private String treasurer;
    private String recorder;
    private String clerk;
    private String clerkAddress;
    private String clerkCity;
    private String clerkPhone;
    private Double searchFee;
    private Double takeNoticeAmount;
    private Double takeNoticeAccrualAmount;
    private Double redemptionFee;
    private Double redemptionBillAmount;
    private Double filingCost;
    private Double filingRevenue;
    private Double sheriffCost;
    private Double clerkCost;
    private Double publicationCost;
    private List<PropertyClass> propertyClasses = new ArrayList<>();
    private State state;
    private List<Property> properties = new ArrayList<>();
    private List<Auction> auctions = new ArrayList<>();
    private List<Township> townships = new ArrayList<>();
    private List<Grade> grades = new ArrayList<>();
    private List<TaxSchedule> taxSchedules = new ArrayList<>();
    private List<Certificate> certificates = new ArrayList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`id`", nullable = false, scale = 0, precision = 10)
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "`county_name`", nullable = false, length = 50)
    public String getCountyName() {
        return this.countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    @Column(name = "`area_lookup`", nullable = false, length = 10)
    public String getAreaLookup() {
        return this.areaLookup;
    }

    public void setAreaLookup(String areaLookup) {
        this.areaLookup = areaLookup;
    }

    @Column(name = "`area_length`", nullable = true, scale = 0, precision = 10)
    public Integer getAreaLength() {
        return this.areaLength;
    }

    public void setAreaLength(Integer areaLength) {
        this.areaLength = areaLength;
    }

    @Column(name = "`gis`", nullable = true, length = 100)
    public String getGis() {
        return this.gis;
    }

    public void setGis(String gis) {
        this.gis = gis;
    }

    @Column(name = "`assessor`", nullable = true, length = 100)
    public String getAssessor() {
        return this.assessor;
    }

    public void setAssessor(String assessor) {
        this.assessor = assessor;
    }

    @Column(name = "`newline_photo`", nullable = true, length = 100)
    public String getNewlinePhoto() {
        return this.newlinePhoto;
    }

    public void setNewlinePhoto(String newlinePhoto) {
        this.newlinePhoto = newlinePhoto;
    }

    @Column(name = "`treasurer`", nullable = true, length = 100)
    public String getTreasurer() {
        return this.treasurer;
    }

    public void setTreasurer(String treasurer) {
        this.treasurer = treasurer;
    }

    @Column(name = "`recorder`", nullable = true, length = 100)
    public String getRecorder() {
        return this.recorder;
    }

    public void setRecorder(String recorder) {
        this.recorder = recorder;
    }

    @Column(name = "`clerk`", nullable = true, length = 100)
    public String getClerk() {
        return this.clerk;
    }

    public void setClerk(String clerk) {
        this.clerk = clerk;
    }

    @Column(name = "`clerk_address`", nullable = true, length = 255)
    public String getClerkAddress() {
        return this.clerkAddress;
    }

    public void setClerkAddress(String clerkAddress) {
        this.clerkAddress = clerkAddress;
    }

    @Column(name = "`clerk_city`", nullable = true, length = 50)
    public String getClerkCity() {
        return this.clerkCity;
    }

    public void setClerkCity(String clerkCity) {
        this.clerkCity = clerkCity;
    }

    @Column(name = "`clerk_phone`", nullable = true, length = 50)
    public String getClerkPhone() {
        return this.clerkPhone;
    }

    public void setClerkPhone(String clerkPhone) {
        this.clerkPhone = clerkPhone;
    }

    @Column(name = "`search_fee`", nullable = true, scale = 4, precision = 19)
    public Double getSearchFee() {
        return this.searchFee;
    }

    public void setSearchFee(Double searchFee) {
        this.searchFee = searchFee;
    }

    @Column(name = "`take_notice_amount`", nullable = true, scale = 4, precision = 19)
    public Double getTakeNoticeAmount() {
        return this.takeNoticeAmount;
    }

    public void setTakeNoticeAmount(Double takeNoticeAmount) {
        this.takeNoticeAmount = takeNoticeAmount;
    }

    @Column(name = "`take_notice_accrual_amount`", nullable = true, scale = 4, precision = 19)
    public Double getTakeNoticeAccrualAmount() {
        return this.takeNoticeAccrualAmount;
    }

    public void setTakeNoticeAccrualAmount(Double takeNoticeAccrualAmount) {
        this.takeNoticeAccrualAmount = takeNoticeAccrualAmount;
    }

    @Column(name = "`redemption_fee`", nullable = true, scale = 4, precision = 19)
    public Double getRedemptionFee() {
        return this.redemptionFee;
    }

    public void setRedemptionFee(Double redemptionFee) {
        this.redemptionFee = redemptionFee;
    }

    @Column(name = "`redemption_bill_amount`", nullable = true, scale = 4, precision = 19)
    public Double getRedemptionBillAmount() {
        return this.redemptionBillAmount;
    }

    public void setRedemptionBillAmount(Double redemptionBillAmount) {
        this.redemptionBillAmount = redemptionBillAmount;
    }

    @Column(name = "`filing_cost`", nullable = true, scale = 4, precision = 19)
    public Double getFilingCost() {
        return this.filingCost;
    }

    public void setFilingCost(Double filingCost) {
        this.filingCost = filingCost;
    }

    @Column(name = "`filing_revenue`", nullable = true, scale = 4, precision = 19)
    public Double getFilingRevenue() {
        return this.filingRevenue;
    }

    public void setFilingRevenue(Double filingRevenue) {
        this.filingRevenue = filingRevenue;
    }

    @Column(name = "`sheriff_cost`", nullable = true, scale = 4, precision = 19)
    public Double getSheriffCost() {
        return this.sheriffCost;
    }

    public void setSheriffCost(Double sheriffCost) {
        this.sheriffCost = sheriffCost;
    }

    @Column(name = "`clerk_cost`", nullable = true, scale = 4, precision = 19)
    public Double getClerkCost() {
        return this.clerkCost;
    }

    public void setClerkCost(Double clerkCost) {
        this.clerkCost = clerkCost;
    }

    @Column(name = "`publication_cost`", nullable = true, scale = 4, precision = 19)
    public Double getPublicationCost() {
        return this.publicationCost;
    }

    public void setPublicationCost(Double publicationCost) {
        this.publicationCost = publicationCost;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "county")
    public List<PropertyClass> getPropertyClasses() {
        return this.propertyClasses;
    }

    public void setPropertyClasses(List<PropertyClass> propertyClasses) {
        this.propertyClasses = propertyClasses;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`state_id`", referencedColumnName = "`id`", insertable = true, updatable = true)
    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "county")
    public List<Property> getProperties() {
        return this.properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "county")
    public List<Auction> getAuctions() {
        return this.auctions;
    }

    public void setAuctions(List<Auction> auctions) {
        this.auctions = auctions;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "county")
    public List<Township> getTownships() {
        return this.townships;
    }

    public void setTownships(List<Township> townships) {
        this.townships = townships;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "county")
    public List<Grade> getGrades() {
        return this.grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "county")
    public List<TaxSchedule> getTaxSchedules() {
        return this.taxSchedules;
    }

    public void setTaxSchedules(List<TaxSchedule> taxSchedules) {
        this.taxSchedules = taxSchedules;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "county")
    public List<Certificate> getCertificates() {
        return this.certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof County)) return false;
        final County county = (County) o;
        return Objects.equals(getId(), county.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

