/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigDecimal;
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
 * Property generated by hbm2java
 */
@Entity
@Table(name="`property`"
    ,schema="data"
)

public class Property  implements java.io.Serializable {

    
    private Integer id;
    
    private String pin;
    
    private java.util.Date updatedTimestamp;
    
    private Boolean dead;
    
    private Integer volume;
    
    private String addressLine1;
    
    private String addressLine2;
    
    private String addressCity;
    
    private String addressZip;
    
    private Integer yearBuilt;
    
    private Integer yearImproved;
    
    private Integer sqftLiving;
    
    private Integer sqftTotal;
    
    private BigDecimal lotSize;
    
    private Boolean addressVerified;
    
    private String addressSource1;
    
    private String addressSource2;
    
    private Float latitude;
    
    private Float longitude;
    
    private Integer lastImportId;
    
    private String pinNd;
    
    private String pinBuilding;
    
    private Set<Inspection> inspections = new HashSet<Inspection>(0);
    
    private Set<Underwriting> underwritings = new HashSet<Underwriting>(0);
    
    private Set<Note> notes = new HashSet<Note>(0);
    
    private Set<InspectionRoute> inspectionRoutes = new HashSet<InspectionRoute>(0);
    
    private Set<PropertySale> propertySales = new HashSet<PropertySale>(0);
    
    private Set<TaxHistory> taxHistories = new HashSet<TaxHistory>(0);
    
    private County county;
    
    private Grade grade;
    
    private Property propertyByReplacedBy;
    
    private Set<Property> propertiesForReplacedBy = new HashSet<Property>(0);
    
    private PropertyExterior propertyExterior;
    
    private PropertyType propertyType;
    
    private Township township;
    
    private Set<TitleTransaction> titleTransactions = new HashSet<TitleTransaction>(0);
    
    private Set<Auction> auctions = new HashSet<Auction>(0);
    
    private Set<Assessment> assessments = new HashSet<Assessment>(0);
    
    private Set<AvailableSubs> availableSubses = new HashSet<AvailableSubs>(0);
    
    private Set<AuctionResult> auctionResults = new HashSet<AuctionResult>(0);
    
    private Set<Research> researches = new HashSet<Research>(0);
    
    private Set<Certificate> certificates = new HashSet<Certificate>(0);

    public Property() {
    }


    @Id @GeneratedValue(strategy=IDENTITY)
    

    @Column(name="`ID`", precision=10)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    

    @Column(name="`pin`")
    public String getPin() {
        return this.pin;
    }
    
    public void setPin(String pin) {
        this.pin = pin;
    }

    @Temporal(TemporalType.TIMESTAMP)

    @Column(name="`updated_timestamp`", length=23)
    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }
    
    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    

    @Column(name="`dead`")
    public Boolean getDead() {
        return this.dead;
    }
    
    public void setDead(Boolean dead) {
        this.dead = dead;
    }

    

    @Column(name="`volume`", precision=10)
    public Integer getVolume() {
        return this.volume;
    }
    
    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    

    @Column(name="`address_line1`", length=220)
    public String getAddressLine1() {
        return this.addressLine1;
    }
    
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    

    @Column(name="`address_line2`", length=220)
    public String getAddressLine2() {
        return this.addressLine2;
    }
    
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    

    @Column(name="`address_city`", length=220)
    public String getAddressCity() {
        return this.addressCity;
    }
    
    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    

    @Column(name="`address_zip`", length=10)
    public String getAddressZip() {
        return this.addressZip;
    }
    
    public void setAddressZip(String addressZip) {
        this.addressZip = addressZip;
    }

    

    @Column(name="`year_built`", precision=10)
    public Integer getYearBuilt() {
        return this.yearBuilt;
    }
    
    public void setYearBuilt(Integer yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    

    @Column(name="`year_improved`", precision=10)
    public Integer getYearImproved() {
        return this.yearImproved;
    }
    
    public void setYearImproved(Integer yearImproved) {
        this.yearImproved = yearImproved;
    }

    

    @Column(name="`sqft_living`", precision=10)
    public Integer getSqftLiving() {
        return this.sqftLiving;
    }
    
    public void setSqftLiving(Integer sqftLiving) {
        this.sqftLiving = sqftLiving;
    }

    

    @Column(name="`sqft_total`", precision=10)
    public Integer getSqftTotal() {
        return this.sqftTotal;
    }
    
    public void setSqftTotal(Integer sqftTotal) {
        this.sqftTotal = sqftTotal;
    }

    

    @Column(name="`lot_size`", precision=28, scale=6)
    public BigDecimal getLotSize() {
        return this.lotSize;
    }
    
    public void setLotSize(BigDecimal lotSize) {
        this.lotSize = lotSize;
    }

    

    @Column(name="`address_verified`")
    public Boolean getAddressVerified() {
        return this.addressVerified;
    }
    
    public void setAddressVerified(Boolean addressVerified) {
        this.addressVerified = addressVerified;
    }

    

    @Column(name="`address_source1`", length=10)
    public String getAddressSource1() {
        return this.addressSource1;
    }
    
    public void setAddressSource1(String addressSource1) {
        this.addressSource1 = addressSource1;
    }

    

    @Column(name="`address_source2`", length=10)
    public String getAddressSource2() {
        return this.addressSource2;
    }
    
    public void setAddressSource2(String addressSource2) {
        this.addressSource2 = addressSource2;
    }

    

    @Column(name="`latitude`", precision=9, scale=6)
    public Float getLatitude() {
        return this.latitude;
    }
    
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    

    @Column(name="`longitude`", precision=9, scale=6)
    public Float getLongitude() {
        return this.longitude;
    }
    
    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    

    @Column(name="`last_import_id`", precision=10)
    public Integer getLastImportId() {
        return this.lastImportId;
    }
    
    public void setLastImportId(Integer lastImportId) {
        this.lastImportId = lastImportId;
    }

    

    @Column(name="`pin_nd`")
    public String getPinNd() {
        return this.pinNd;
    }
    
    public void setPinNd(String pinNd) {
        this.pinNd = pinNd;
    }

    

    @Column(name="`pin_building`")
    public String getPinBuilding() {
        return this.pinBuilding;
    }
    
    public void setPinBuilding(String pinBuilding) {
        this.pinBuilding = pinBuilding;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="property")
    public Set<Inspection> getInspections() {
        return this.inspections;
    }
    
    public void setInspections(Set<Inspection> inspections) {
        this.inspections = inspections;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="property")
    public Set<Underwriting> getUnderwritings() {
        return this.underwritings;
    }
    
    public void setUnderwritings(Set<Underwriting> underwritings) {
        this.underwritings = underwritings;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="property")
    public Set<Note> getNotes() {
        return this.notes;
    }
    
    public void setNotes(Set<Note> notes) {
        this.notes = notes;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="property")
    public Set<InspectionRoute> getInspectionRoutes() {
        return this.inspectionRoutes;
    }
    
    public void setInspectionRoutes(Set<InspectionRoute> inspectionRoutes) {
        this.inspectionRoutes = inspectionRoutes;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="property")
    public Set<PropertySale> getPropertySales() {
        return this.propertySales;
    }
    
    public void setPropertySales(Set<PropertySale> propertySales) {
        this.propertySales = propertySales;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="property")
    public Set<TaxHistory> getTaxHistories() {
        return this.taxHistories;
    }
    
    public void setTaxHistories(Set<TaxHistory> taxHistories) {
        this.taxHistories = taxHistories;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`county_id`")
    public County getCounty() {
        return this.county;
    }
    
    public void setCounty(County county) {
        this.county = county;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`grade_id`")
    public Grade getGrade() {
        return this.grade;
    }
    
    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`replaced_by`")
    @JsonIgnoreProperties({"propertyByReplacedBy", "propertiesForReplacedBy"})
    public Property getPropertyByReplacedBy() {
        return this.propertyByReplacedBy;
    }
    
    public void setPropertyByReplacedBy(Property propertyByReplacedBy) {
        this.propertyByReplacedBy = propertyByReplacedBy;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="propertyByReplacedBy")
    public Set<Property> getPropertiesForReplacedBy() {
        return this.propertiesForReplacedBy;
    }
    
    public void setPropertiesForReplacedBy(Set<Property> propertiesForReplacedBy) {
        this.propertiesForReplacedBy = propertiesForReplacedBy;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`property_exterior_id`")
    public PropertyExterior getPropertyExterior() {
        return this.propertyExterior;
    }
    
    public void setPropertyExterior(PropertyExterior propertyExterior) {
        this.propertyExterior = propertyExterior;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`property_type_id`")
    public PropertyType getPropertyType() {
        return this.propertyType;
    }
    
    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`township_id`")
    public Township getTownship() {
        return this.township;
    }
    
    public void setTownship(Township township) {
        this.township = township;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="property")
    public Set<TitleTransaction> getTitleTransactions() {
        return this.titleTransactions;
    }
    
    public void setTitleTransactions(Set<TitleTransaction> titleTransactions) {
        this.titleTransactions = titleTransactions;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="property")
    public Set<Auction> getAuctions() {
        return this.auctions;
    }
    
    public void setAuctions(Set<Auction> auctions) {
        this.auctions = auctions;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="property")
    public Set<Assessment> getAssessments() {
        return this.assessments;
    }
    
    public void setAssessments(Set<Assessment> assessments) {
        this.assessments = assessments;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="property")
    public Set<AvailableSubs> getAvailableSubses() {
        return this.availableSubses;
    }
    
    public void setAvailableSubses(Set<AvailableSubs> availableSubses) {
        this.availableSubses = availableSubses;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="property")
    public Set<AuctionResult> getAuctionResults() {
        return this.auctionResults;
    }
    
    public void setAuctionResults(Set<AuctionResult> auctionResults) {
        this.auctionResults = auctionResults;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="property")
    public Set<Research> getResearches() {
        return this.researches;
    }
    
    public void setResearches(Set<Research> researches) {
        this.researches = researches;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="property")
    public Set<Certificate> getCertificates() {
        return this.certificates;
    }
    
    public void setCertificates(Set<Certificate> certificates) {
        this.certificates = certificates;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof Property) )
		    return false;

		 Property that = (Property) o;

		 return ( (this.getId()==that.getId()) || ( this.getId()!=null && that.getId()!=null && this.getId().equals(that.getId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );

         return result;
    }


}

