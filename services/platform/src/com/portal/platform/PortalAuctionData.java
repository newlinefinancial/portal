/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * PortalAuctionData generated by hbm2java
 */
@Entity
@Table(name="`portal_auction_data`"
    ,schema="review"
)
@IdClass(value=PortalAuctionDataId.class)
public class PortalAuctionData  implements java.io.Serializable {

    
    private Integer propertyId;
    
    private Integer gradeId;
    
    private String pin;
    
    private String header;
    
    private String pinNd;
    
    private String piqAddress;
    
    private String assessor;
    
    private String clerk;
    
    private String gis;
    
    private String treasurer;
    
    private String recorder;
    
    private Integer assesmentTaxYear;
    
    private Double equalizedValuation;
    
    private Double homeExemption;
    
    private Double seniorExemption;
    
    private Double assessedValuationBuilding;
    
    private Double assessedValuationLand;
    
    private Double assessedValuationTotal;
    
    private Double marketValue;
    
    private String assesseeName;
    
    private String assesseeAddressLine1;
    
    private String assesseeAddressCity;
    
    private String assesseeAddressState;
    
    private String assesseeAddressZip;
    
    private BigDecimal taxRate;
    
    private Float equalizationFactor;
    
    private Integer taxYear;
    
    private Integer auctionId;
    
    private Double priorYearsDue;
    
    private Double auctionInst1Due;
    
    private Double auctionInst2Due;
    
    private Double auctionYearBilled;
    
    private Double auctionYearDue;
    
    private Double otherDue;
    
    private Double saleAmount;
    
    private String auctionStatSummary;
    
    private Float lifetimeLtv;
    
    private Float predRedemptionPct;
    
    private Integer predBidRate;
    
    private Character grade;
    
    private Float avgBidrate;
    
    private String forfeitStat;
    
    private String redemptionStat;

    public PortalAuctionData() {
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
    

    @Column(name="`grade_id`", insertable=false, updatable=false, precision=10)
    public Integer getGradeId() {
        return this.gradeId;
    }
    
    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
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
    

    @Column(name="`header`", insertable=false, updatable=false)
    public String getHeader() {
        return this.header;
    }
    
    public void setHeader(String header) {
        this.header = header;
    }
    @Id 
    

    @Column(name="`pin_nd`", insertable=false, updatable=false)
    public String getPinNd() {
        return this.pinNd;
    }
    
    public void setPinNd(String pinNd) {
        this.pinNd = pinNd;
    }
    @Id 
    

    @Column(name="`piq_address`", insertable=false, updatable=false, length=455)
    public String getPiqAddress() {
        return this.piqAddress;
    }
    
    public void setPiqAddress(String piqAddress) {
        this.piqAddress = piqAddress;
    }
    @Id 
    

    @Column(name="`assessor`", insertable=false, updatable=false, length=100)
    public String getAssessor() {
        return this.assessor;
    }
    
    public void setAssessor(String assessor) {
        this.assessor = assessor;
    }
    @Id 
    

    @Column(name="`clerk`", insertable=false, updatable=false, length=100)
    public String getClerk() {
        return this.clerk;
    }
    
    public void setClerk(String clerk) {
        this.clerk = clerk;
    }
    @Id 
    

    @Column(name="`gis`", insertable=false, updatable=false, length=100)
    public String getGis() {
        return this.gis;
    }
    
    public void setGis(String gis) {
        this.gis = gis;
    }
    @Id 
    

    @Column(name="`treasurer`", insertable=false, updatable=false, length=100)
    public String getTreasurer() {
        return this.treasurer;
    }
    
    public void setTreasurer(String treasurer) {
        this.treasurer = treasurer;
    }
    @Id 
    

    @Column(name="`recorder`", insertable=false, updatable=false, length=100)
    public String getRecorder() {
        return this.recorder;
    }
    
    public void setRecorder(String recorder) {
        this.recorder = recorder;
    }
    @Id 
    

    @Column(name="`assesment_tax_year`", insertable=false, updatable=false, precision=10)
    public Integer getAssesmentTaxYear() {
        return this.assesmentTaxYear;
    }
    
    public void setAssesmentTaxYear(Integer assesmentTaxYear) {
        this.assesmentTaxYear = assesmentTaxYear;
    }
    @Id 
    

    @Column(name="`equalized_valuation`", insertable=false, updatable=false, scale=4)
    public Double getEqualizedValuation() {
        return this.equalizedValuation;
    }
    
    public void setEqualizedValuation(Double equalizedValuation) {
        this.equalizedValuation = equalizedValuation;
    }
    @Id 
    

    @Column(name="`home_exemption`", insertable=false, updatable=false, scale=4)
    public Double getHomeExemption() {
        return this.homeExemption;
    }
    
    public void setHomeExemption(Double homeExemption) {
        this.homeExemption = homeExemption;
    }
    @Id 
    

    @Column(name="`senior_exemption`", insertable=false, updatable=false, scale=4)
    public Double getSeniorExemption() {
        return this.seniorExemption;
    }
    
    public void setSeniorExemption(Double seniorExemption) {
        this.seniorExemption = seniorExemption;
    }
    @Id 
    

    @Column(name="`assessed_valuation_building`", insertable=false, updatable=false, scale=4)
    public Double getAssessedValuationBuilding() {
        return this.assessedValuationBuilding;
    }
    
    public void setAssessedValuationBuilding(Double assessedValuationBuilding) {
        this.assessedValuationBuilding = assessedValuationBuilding;
    }
    @Id 
    

    @Column(name="`assessed_valuation_land`", insertable=false, updatable=false, scale=4)
    public Double getAssessedValuationLand() {
        return this.assessedValuationLand;
    }
    
    public void setAssessedValuationLand(Double assessedValuationLand) {
        this.assessedValuationLand = assessedValuationLand;
    }
    @Id 
    

    @Column(name="`assessed_valuation_total`", insertable=false, updatable=false, scale=4)
    public Double getAssessedValuationTotal() {
        return this.assessedValuationTotal;
    }
    
    public void setAssessedValuationTotal(Double assessedValuationTotal) {
        this.assessedValuationTotal = assessedValuationTotal;
    }
    @Id 
    

    @Column(name="`market_value`", insertable=false, updatable=false, scale=4)
    public Double getMarketValue() {
        return this.marketValue;
    }
    
    public void setMarketValue(Double marketValue) {
        this.marketValue = marketValue;
    }
    @Id 
    

    @Column(name="`assessee_name`", insertable=false, updatable=false, length=100)
    public String getAssesseeName() {
        return this.assesseeName;
    }
    
    public void setAssesseeName(String assesseeName) {
        this.assesseeName = assesseeName;
    }
    @Id 
    

    @Column(name="`assessee_address_line1`", insertable=false, updatable=false, length=100)
    public String getAssesseeAddressLine1() {
        return this.assesseeAddressLine1;
    }
    
    public void setAssesseeAddressLine1(String assesseeAddressLine1) {
        this.assesseeAddressLine1 = assesseeAddressLine1;
    }
    @Id 
    

    @Column(name="`assessee_address_city`", insertable=false, updatable=false, length=50)
    public String getAssesseeAddressCity() {
        return this.assesseeAddressCity;
    }
    
    public void setAssesseeAddressCity(String assesseeAddressCity) {
        this.assesseeAddressCity = assesseeAddressCity;
    }
    @Id 
    

    @Column(name="`assessee_address_state`", insertable=false, updatable=false, length=2)
    public String getAssesseeAddressState() {
        return this.assesseeAddressState;
    }
    
    public void setAssesseeAddressState(String assesseeAddressState) {
        this.assesseeAddressState = assesseeAddressState;
    }
    @Id 
    

    @Column(name="`assessee_address_zip`", insertable=false, updatable=false, length=10)
    public String getAssesseeAddressZip() {
        return this.assesseeAddressZip;
    }
    
    public void setAssesseeAddressZip(String assesseeAddressZip) {
        this.assesseeAddressZip = assesseeAddressZip;
    }
    @Id 
    

    @Column(name="`tax_rate`", insertable=false, updatable=false, precision=28, scale=6)
    public BigDecimal getTaxRate() {
        return this.taxRate;
    }
    
    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }
    @Id 
    

    @Column(name="`equalization_factor`", insertable=false, updatable=false, precision=5, scale=4)
    public Float getEqualizationFactor() {
        return this.equalizationFactor;
    }
    
    public void setEqualizationFactor(Float equalizationFactor) {
        this.equalizationFactor = equalizationFactor;
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
    

    @Column(name="`auction_id`", insertable=false, updatable=false, precision=10)
    public Integer getAuctionId() {
        return this.auctionId;
    }
    
    public void setAuctionId(Integer auctionId) {
        this.auctionId = auctionId;
    }
    @Id 
    

    @Column(name="`prior_years_due`", insertable=false, updatable=false, scale=4)
    public Double getPriorYearsDue() {
        return this.priorYearsDue;
    }
    
    public void setPriorYearsDue(Double priorYearsDue) {
        this.priorYearsDue = priorYearsDue;
    }
    @Id 
    

    @Column(name="`auction_inst1_due`", insertable=false, updatable=false, scale=4)
    public Double getAuctionInst1Due() {
        return this.auctionInst1Due;
    }
    
    public void setAuctionInst1Due(Double auctionInst1Due) {
        this.auctionInst1Due = auctionInst1Due;
    }
    @Id 
    

    @Column(name="`auction_inst2_due`", insertable=false, updatable=false, scale=4)
    public Double getAuctionInst2Due() {
        return this.auctionInst2Due;
    }
    
    public void setAuctionInst2Due(Double auctionInst2Due) {
        this.auctionInst2Due = auctionInst2Due;
    }
    @Id 
    

    @Column(name="`auction_year_billed`", insertable=false, updatable=false, scale=4)
    public Double getAuctionYearBilled() {
        return this.auctionYearBilled;
    }
    
    public void setAuctionYearBilled(Double auctionYearBilled) {
        this.auctionYearBilled = auctionYearBilled;
    }
    @Id 
    

    @Column(name="`auction_year_due`", insertable=false, updatable=false, scale=4)
    public Double getAuctionYearDue() {
        return this.auctionYearDue;
    }
    
    public void setAuctionYearDue(Double auctionYearDue) {
        this.auctionYearDue = auctionYearDue;
    }
    @Id 
    

    @Column(name="`other_due`", insertable=false, updatable=false, scale=4)
    public Double getOtherDue() {
        return this.otherDue;
    }
    
    public void setOtherDue(Double otherDue) {
        this.otherDue = otherDue;
    }
    @Id 
    

    @Column(name="`sale_amount`", insertable=false, updatable=false, scale=4)
    public Double getSaleAmount() {
        return this.saleAmount;
    }
    
    public void setSaleAmount(Double saleAmount) {
        this.saleAmount = saleAmount;
    }
    @Id 
    

    @Column(name="`auction_stat_summary`", insertable=false, updatable=false, length=139)
    public String getAuctionStatSummary() {
        return this.auctionStatSummary;
    }
    
    public void setAuctionStatSummary(String auctionStatSummary) {
        this.auctionStatSummary = auctionStatSummary;
    }
    @Id 
    

    @Column(name="`lifetime_ltv`", insertable=false, updatable=false, precision=8)
    public Float getLifetimeLtv() {
        return this.lifetimeLtv;
    }
    
    public void setLifetimeLtv(Float lifetimeLtv) {
        this.lifetimeLtv = lifetimeLtv;
    }
    @Id 
    

    @Column(name="`pred_redemption_pct`", insertable=false, updatable=false, precision=3)
    public Float getPredRedemptionPct() {
        return this.predRedemptionPct;
    }
    
    public void setPredRedemptionPct(Float predRedemptionPct) {
        this.predRedemptionPct = predRedemptionPct;
    }
    @Id 
    

    @Column(name="`pred_bid_rate`", insertable=false, updatable=false, precision=10)
    public Integer getPredBidRate() {
        return this.predBidRate;
    }
    
    public void setPredBidRate(Integer predBidRate) {
        this.predBidRate = predBidRate;
    }
    @Id 
    

    @Column(name="`grade`", insertable=false, updatable=false, length=1)
    public Character getGrade() {
        return this.grade;
    }
    
    public void setGrade(Character grade) {
        this.grade = grade;
    }
    @Id 
    

    @Column(name="`avg_bidrate`", insertable=false, updatable=false, precision=4)
    public Float getAvgBidrate() {
        return this.avgBidrate;
    }
    
    public void setAvgBidrate(Float avgBidrate) {
        this.avgBidrate = avgBidrate;
    }
    @Id 
    

    @Column(name="`forfeit_stat`", insertable=false, updatable=false, length=80)
    public String getForfeitStat() {
        return this.forfeitStat;
    }
    
    public void setForfeitStat(String forfeitStat) {
        this.forfeitStat = forfeitStat;
    }
    @Id 
    

    @Column(name="`redemption_stat`", insertable=false, updatable=false, length=79)
    public String getRedemptionStat() {
        return this.redemptionStat;
    }
    
    public void setRedemptionStat(String redemptionStat) {
        this.redemptionStat = redemptionStat;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof PortalAuctionData) )
		    return false;

		 PortalAuctionData that = (PortalAuctionData) o;

         return ( (this.getPropertyId()==that.getPropertyId()) || ( this.getPropertyId()!=null && that.getPropertyId()!=null && this.getPropertyId().equals(that.getPropertyId()) ) )
 && ( (this.getGradeId()==that.getGradeId()) || ( this.getGradeId()!=null && that.getGradeId()!=null && this.getGradeId().equals(that.getGradeId()) ) )
 && ( (this.getPin()==that.getPin()) || ( this.getPin()!=null && that.getPin()!=null && this.getPin().equals(that.getPin()) ) )
 && ( (this.getHeader()==that.getHeader()) || ( this.getHeader()!=null && that.getHeader()!=null && this.getHeader().equals(that.getHeader()) ) )
 && ( (this.getPinNd()==that.getPinNd()) || ( this.getPinNd()!=null && that.getPinNd()!=null && this.getPinNd().equals(that.getPinNd()) ) )
 && ( (this.getPiqAddress()==that.getPiqAddress()) || ( this.getPiqAddress()!=null && that.getPiqAddress()!=null && this.getPiqAddress().equals(that.getPiqAddress()) ) )
 && ( (this.getAssessor()==that.getAssessor()) || ( this.getAssessor()!=null && that.getAssessor()!=null && this.getAssessor().equals(that.getAssessor()) ) )
 && ( (this.getClerk()==that.getClerk()) || ( this.getClerk()!=null && that.getClerk()!=null && this.getClerk().equals(that.getClerk()) ) )
 && ( (this.getGis()==that.getGis()) || ( this.getGis()!=null && that.getGis()!=null && this.getGis().equals(that.getGis()) ) )
 && ( (this.getTreasurer()==that.getTreasurer()) || ( this.getTreasurer()!=null && that.getTreasurer()!=null && this.getTreasurer().equals(that.getTreasurer()) ) )
 && ( (this.getRecorder()==that.getRecorder()) || ( this.getRecorder()!=null && that.getRecorder()!=null && this.getRecorder().equals(that.getRecorder()) ) )
 && ( (this.getAssesmentTaxYear()==that.getAssesmentTaxYear()) || ( this.getAssesmentTaxYear()!=null && that.getAssesmentTaxYear()!=null && this.getAssesmentTaxYear().equals(that.getAssesmentTaxYear()) ) )
 && ( (this.getEqualizedValuation()==that.getEqualizedValuation()) || ( this.getEqualizedValuation()!=null && that.getEqualizedValuation()!=null && this.getEqualizedValuation().equals(that.getEqualizedValuation()) ) )
 && ( (this.getHomeExemption()==that.getHomeExemption()) || ( this.getHomeExemption()!=null && that.getHomeExemption()!=null && this.getHomeExemption().equals(that.getHomeExemption()) ) )
 && ( (this.getSeniorExemption()==that.getSeniorExemption()) || ( this.getSeniorExemption()!=null && that.getSeniorExemption()!=null && this.getSeniorExemption().equals(that.getSeniorExemption()) ) )
 && ( (this.getAssessedValuationBuilding()==that.getAssessedValuationBuilding()) || ( this.getAssessedValuationBuilding()!=null && that.getAssessedValuationBuilding()!=null && this.getAssessedValuationBuilding().equals(that.getAssessedValuationBuilding()) ) )
 && ( (this.getAssessedValuationLand()==that.getAssessedValuationLand()) || ( this.getAssessedValuationLand()!=null && that.getAssessedValuationLand()!=null && this.getAssessedValuationLand().equals(that.getAssessedValuationLand()) ) )
 && ( (this.getAssessedValuationTotal()==that.getAssessedValuationTotal()) || ( this.getAssessedValuationTotal()!=null && that.getAssessedValuationTotal()!=null && this.getAssessedValuationTotal().equals(that.getAssessedValuationTotal()) ) )
 && ( (this.getMarketValue()==that.getMarketValue()) || ( this.getMarketValue()!=null && that.getMarketValue()!=null && this.getMarketValue().equals(that.getMarketValue()) ) )
 && ( (this.getAssesseeName()==that.getAssesseeName()) || ( this.getAssesseeName()!=null && that.getAssesseeName()!=null && this.getAssesseeName().equals(that.getAssesseeName()) ) )
 && ( (this.getAssesseeAddressLine1()==that.getAssesseeAddressLine1()) || ( this.getAssesseeAddressLine1()!=null && that.getAssesseeAddressLine1()!=null && this.getAssesseeAddressLine1().equals(that.getAssesseeAddressLine1()) ) )
 && ( (this.getAssesseeAddressCity()==that.getAssesseeAddressCity()) || ( this.getAssesseeAddressCity()!=null && that.getAssesseeAddressCity()!=null && this.getAssesseeAddressCity().equals(that.getAssesseeAddressCity()) ) )
 && ( (this.getAssesseeAddressState()==that.getAssesseeAddressState()) || ( this.getAssesseeAddressState()!=null && that.getAssesseeAddressState()!=null && this.getAssesseeAddressState().equals(that.getAssesseeAddressState()) ) )
 && ( (this.getAssesseeAddressZip()==that.getAssesseeAddressZip()) || ( this.getAssesseeAddressZip()!=null && that.getAssesseeAddressZip()!=null && this.getAssesseeAddressZip().equals(that.getAssesseeAddressZip()) ) )
 && ( (this.getTaxRate()==that.getTaxRate()) || ( this.getTaxRate()!=null && that.getTaxRate()!=null && this.getTaxRate().equals(that.getTaxRate()) ) )
 && ( (this.getEqualizationFactor()==that.getEqualizationFactor()) || ( this.getEqualizationFactor()!=null && that.getEqualizationFactor()!=null && this.getEqualizationFactor().equals(that.getEqualizationFactor()) ) )
 && ( (this.getTaxYear()==that.getTaxYear()) || ( this.getTaxYear()!=null && that.getTaxYear()!=null && this.getTaxYear().equals(that.getTaxYear()) ) )
 && ( (this.getAuctionId()==that.getAuctionId()) || ( this.getAuctionId()!=null && that.getAuctionId()!=null && this.getAuctionId().equals(that.getAuctionId()) ) )
 && ( (this.getPriorYearsDue()==that.getPriorYearsDue()) || ( this.getPriorYearsDue()!=null && that.getPriorYearsDue()!=null && this.getPriorYearsDue().equals(that.getPriorYearsDue()) ) )
 && ( (this.getAuctionInst1Due()==that.getAuctionInst1Due()) || ( this.getAuctionInst1Due()!=null && that.getAuctionInst1Due()!=null && this.getAuctionInst1Due().equals(that.getAuctionInst1Due()) ) )
 && ( (this.getAuctionInst2Due()==that.getAuctionInst2Due()) || ( this.getAuctionInst2Due()!=null && that.getAuctionInst2Due()!=null && this.getAuctionInst2Due().equals(that.getAuctionInst2Due()) ) )
 && ( (this.getAuctionYearBilled()==that.getAuctionYearBilled()) || ( this.getAuctionYearBilled()!=null && that.getAuctionYearBilled()!=null && this.getAuctionYearBilled().equals(that.getAuctionYearBilled()) ) )
 && ( (this.getAuctionYearDue()==that.getAuctionYearDue()) || ( this.getAuctionYearDue()!=null && that.getAuctionYearDue()!=null && this.getAuctionYearDue().equals(that.getAuctionYearDue()) ) )
 && ( (this.getOtherDue()==that.getOtherDue()) || ( this.getOtherDue()!=null && that.getOtherDue()!=null && this.getOtherDue().equals(that.getOtherDue()) ) )
 && ( (this.getSaleAmount()==that.getSaleAmount()) || ( this.getSaleAmount()!=null && that.getSaleAmount()!=null && this.getSaleAmount().equals(that.getSaleAmount()) ) )
 && ( (this.getAuctionStatSummary()==that.getAuctionStatSummary()) || ( this.getAuctionStatSummary()!=null && that.getAuctionStatSummary()!=null && this.getAuctionStatSummary().equals(that.getAuctionStatSummary()) ) )
 && ( (this.getLifetimeLtv()==that.getLifetimeLtv()) || ( this.getLifetimeLtv()!=null && that.getLifetimeLtv()!=null && this.getLifetimeLtv().equals(that.getLifetimeLtv()) ) )
 && ( (this.getPredRedemptionPct()==that.getPredRedemptionPct()) || ( this.getPredRedemptionPct()!=null && that.getPredRedemptionPct()!=null && this.getPredRedemptionPct().equals(that.getPredRedemptionPct()) ) )
 && ( (this.getPredBidRate()==that.getPredBidRate()) || ( this.getPredBidRate()!=null && that.getPredBidRate()!=null && this.getPredBidRate().equals(that.getPredBidRate()) ) )
 && ( (this.getGrade()==that.getGrade()) || ( this.getGrade()!=null && that.getGrade()!=null && this.getGrade().equals(that.getGrade()) ) )
 && ( (this.getAvgBidrate()==that.getAvgBidrate()) || ( this.getAvgBidrate()!=null && that.getAvgBidrate()!=null && this.getAvgBidrate().equals(that.getAvgBidrate()) ) )
 && ( (this.getForfeitStat()==that.getForfeitStat()) || ( this.getForfeitStat()!=null && that.getForfeitStat()!=null && this.getForfeitStat().equals(that.getForfeitStat()) ) )
 && ( (this.getRedemptionStat()==that.getRedemptionStat()) || ( this.getRedemptionStat()!=null && that.getRedemptionStat()!=null && this.getRedemptionStat().equals(that.getRedemptionStat()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getPropertyId() == null ? 0 : this.getPropertyId().hashCode() );
         result = 37 * result + ( getGradeId() == null ? 0 : this.getGradeId().hashCode() );
         result = 37 * result + ( getPin() == null ? 0 : this.getPin().hashCode() );
         result = 37 * result + ( getHeader() == null ? 0 : this.getHeader().hashCode() );
         result = 37 * result + ( getPinNd() == null ? 0 : this.getPinNd().hashCode() );
         result = 37 * result + ( getPiqAddress() == null ? 0 : this.getPiqAddress().hashCode() );
         result = 37 * result + ( getAssessor() == null ? 0 : this.getAssessor().hashCode() );
         result = 37 * result + ( getClerk() == null ? 0 : this.getClerk().hashCode() );
         result = 37 * result + ( getGis() == null ? 0 : this.getGis().hashCode() );
         result = 37 * result + ( getTreasurer() == null ? 0 : this.getTreasurer().hashCode() );
         result = 37 * result + ( getRecorder() == null ? 0 : this.getRecorder().hashCode() );
         result = 37 * result + ( getAssesmentTaxYear() == null ? 0 : this.getAssesmentTaxYear().hashCode() );
         result = 37 * result + ( getEqualizedValuation() == null ? 0 : this.getEqualizedValuation().hashCode() );
         result = 37 * result + ( getHomeExemption() == null ? 0 : this.getHomeExemption().hashCode() );
         result = 37 * result + ( getSeniorExemption() == null ? 0 : this.getSeniorExemption().hashCode() );
         result = 37 * result + ( getAssessedValuationBuilding() == null ? 0 : this.getAssessedValuationBuilding().hashCode() );
         result = 37 * result + ( getAssessedValuationLand() == null ? 0 : this.getAssessedValuationLand().hashCode() );
         result = 37 * result + ( getAssessedValuationTotal() == null ? 0 : this.getAssessedValuationTotal().hashCode() );
         result = 37 * result + ( getMarketValue() == null ? 0 : this.getMarketValue().hashCode() );
         result = 37 * result + ( getAssesseeName() == null ? 0 : this.getAssesseeName().hashCode() );
         result = 37 * result + ( getAssesseeAddressLine1() == null ? 0 : this.getAssesseeAddressLine1().hashCode() );
         result = 37 * result + ( getAssesseeAddressCity() == null ? 0 : this.getAssesseeAddressCity().hashCode() );
         result = 37 * result + ( getAssesseeAddressState() == null ? 0 : this.getAssesseeAddressState().hashCode() );
         result = 37 * result + ( getAssesseeAddressZip() == null ? 0 : this.getAssesseeAddressZip().hashCode() );
         result = 37 * result + ( getTaxRate() == null ? 0 : this.getTaxRate().hashCode() );
         result = 37 * result + ( getEqualizationFactor() == null ? 0 : this.getEqualizationFactor().hashCode() );
         result = 37 * result + ( getTaxYear() == null ? 0 : this.getTaxYear().hashCode() );
         result = 37 * result + ( getAuctionId() == null ? 0 : this.getAuctionId().hashCode() );
         result = 37 * result + ( getPriorYearsDue() == null ? 0 : this.getPriorYearsDue().hashCode() );
         result = 37 * result + ( getAuctionInst1Due() == null ? 0 : this.getAuctionInst1Due().hashCode() );
         result = 37 * result + ( getAuctionInst2Due() == null ? 0 : this.getAuctionInst2Due().hashCode() );
         result = 37 * result + ( getAuctionYearBilled() == null ? 0 : this.getAuctionYearBilled().hashCode() );
         result = 37 * result + ( getAuctionYearDue() == null ? 0 : this.getAuctionYearDue().hashCode() );
         result = 37 * result + ( getOtherDue() == null ? 0 : this.getOtherDue().hashCode() );
         result = 37 * result + ( getSaleAmount() == null ? 0 : this.getSaleAmount().hashCode() );
         result = 37 * result + ( getAuctionStatSummary() == null ? 0 : this.getAuctionStatSummary().hashCode() );
         result = 37 * result + ( getLifetimeLtv() == null ? 0 : this.getLifetimeLtv().hashCode() );
         result = 37 * result + ( getPredRedemptionPct() == null ? 0 : this.getPredRedemptionPct().hashCode() );
         result = 37 * result + ( getPredBidRate() == null ? 0 : this.getPredBidRate().hashCode() );
         result = 37 * result + ( getGrade() == null ? 0 : this.getGrade().hashCode() );
         result = 37 * result + ( getAvgBidrate() == null ? 0 : this.getAvgBidrate().hashCode() );
         result = 37 * result + ( getForfeitStat() == null ? 0 : this.getForfeitStat().hashCode() );
         result = 37 * result + ( getRedemptionStat() == null ? 0 : this.getRedemptionStat().hashCode() );

         return result;
    }


}

