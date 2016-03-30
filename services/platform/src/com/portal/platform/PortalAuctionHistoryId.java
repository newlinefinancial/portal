/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Embeddable;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * PortalAuctionHistoryId generated by hbm2java
 */
@Embeddable
public class PortalAuctionHistoryId  implements java.io.Serializable {

    
    private Integer propertyId;
    
    private Integer auctionId;
    
    private Integer auctionYear;
    
    private Double priorYearsDue;
    
    private Double auctionYearBilled;
    
    private Double auctionYearDue;
    
    private Double saleAmount;
    
    private Boolean removed;
    
    private Double marketValue;
    
    private Double assessedValuationBuilding;
    
    private Double assessedValuationLand;
    
    private Double assessedValuationTotal;
    
    private String assesseeAddressCity;
    
    private String assesseeAddressLine1;
    
    private String assesseeAddressState;
    
    private String assesseeAddressZip;
    
    private String assesseeName;
    
    private Double homeExemption;
    
    private Double seniorExemption;
    
    private Integer assessmentYear;
    
    private String code;
    
    private String description;
    
    private String propertyType;
    
    private String status;
    
    private Integer bidRate;
    
    private Date overrideTimestamp;
    
    private String overrideUser;
    
    private Date saleDate;
    
    private BigDecimal winningBid;
    
    private String buyer;
    
    private String auctionResult;
    
    private String auctionStatus;
    
    private Date dispositionDate;
    
    private Date dispositionResearchDate;

    public PortalAuctionHistoryId() {
    }


    public Integer getPropertyId() {
        return this.propertyId;
    }
    
    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }
    public Integer getAuctionId() {
        return this.auctionId;
    }
    
    public void setAuctionId(Integer auctionId) {
        this.auctionId = auctionId;
    }
    public Integer getAuctionYear() {
        return this.auctionYear;
    }
    
    public void setAuctionYear(Integer auctionYear) {
        this.auctionYear = auctionYear;
    }
    public Double getPriorYearsDue() {
        return this.priorYearsDue;
    }
    
    public void setPriorYearsDue(Double priorYearsDue) {
        this.priorYearsDue = priorYearsDue;
    }
    public Double getAuctionYearBilled() {
        return this.auctionYearBilled;
    }
    
    public void setAuctionYearBilled(Double auctionYearBilled) {
        this.auctionYearBilled = auctionYearBilled;
    }
    public Double getAuctionYearDue() {
        return this.auctionYearDue;
    }
    
    public void setAuctionYearDue(Double auctionYearDue) {
        this.auctionYearDue = auctionYearDue;
    }
    public Double getSaleAmount() {
        return this.saleAmount;
    }
    
    public void setSaleAmount(Double saleAmount) {
        this.saleAmount = saleAmount;
    }
    public Boolean getRemoved() {
        return this.removed;
    }
    
    public void setRemoved(Boolean removed) {
        this.removed = removed;
    }
    public Double getMarketValue() {
        return this.marketValue;
    }
    
    public void setMarketValue(Double marketValue) {
        this.marketValue = marketValue;
    }
    public Double getAssessedValuationBuilding() {
        return this.assessedValuationBuilding;
    }
    
    public void setAssessedValuationBuilding(Double assessedValuationBuilding) {
        this.assessedValuationBuilding = assessedValuationBuilding;
    }
    public Double getAssessedValuationLand() {
        return this.assessedValuationLand;
    }
    
    public void setAssessedValuationLand(Double assessedValuationLand) {
        this.assessedValuationLand = assessedValuationLand;
    }
    public Double getAssessedValuationTotal() {
        return this.assessedValuationTotal;
    }
    
    public void setAssessedValuationTotal(Double assessedValuationTotal) {
        this.assessedValuationTotal = assessedValuationTotal;
    }
    public String getAssesseeAddressCity() {
        return this.assesseeAddressCity;
    }
    
    public void setAssesseeAddressCity(String assesseeAddressCity) {
        this.assesseeAddressCity = assesseeAddressCity;
    }
    public String getAssesseeAddressLine1() {
        return this.assesseeAddressLine1;
    }
    
    public void setAssesseeAddressLine1(String assesseeAddressLine1) {
        this.assesseeAddressLine1 = assesseeAddressLine1;
    }
    public String getAssesseeAddressState() {
        return this.assesseeAddressState;
    }
    
    public void setAssesseeAddressState(String assesseeAddressState) {
        this.assesseeAddressState = assesseeAddressState;
    }
    public String getAssesseeAddressZip() {
        return this.assesseeAddressZip;
    }
    
    public void setAssesseeAddressZip(String assesseeAddressZip) {
        this.assesseeAddressZip = assesseeAddressZip;
    }
    public String getAssesseeName() {
        return this.assesseeName;
    }
    
    public void setAssesseeName(String assesseeName) {
        this.assesseeName = assesseeName;
    }
    public Double getHomeExemption() {
        return this.homeExemption;
    }
    
    public void setHomeExemption(Double homeExemption) {
        this.homeExemption = homeExemption;
    }
    public Double getSeniorExemption() {
        return this.seniorExemption;
    }
    
    public void setSeniorExemption(Double seniorExemption) {
        this.seniorExemption = seniorExemption;
    }
    public Integer getAssessmentYear() {
        return this.assessmentYear;
    }
    
    public void setAssessmentYear(Integer assessmentYear) {
        this.assessmentYear = assessmentYear;
    }
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getPropertyType() {
        return this.propertyType;
    }
    
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Integer getBidRate() {
        return this.bidRate;
    }
    
    public void setBidRate(Integer bidRate) {
        this.bidRate = bidRate;
    }
    public Date getOverrideTimestamp() {
        return this.overrideTimestamp;
    }
    
    public void setOverrideTimestamp(Date overrideTimestamp) {
        this.overrideTimestamp = overrideTimestamp;
    }
    public String getOverrideUser() {
        return this.overrideUser;
    }
    
    public void setOverrideUser(String overrideUser) {
        this.overrideUser = overrideUser;
    }
    public Date getSaleDate() {
        return this.saleDate;
    }
    
    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }
    public BigDecimal getWinningBid() {
        return this.winningBid;
    }
    
    public void setWinningBid(BigDecimal winningBid) {
        this.winningBid = winningBid;
    }
    public String getBuyer() {
        return this.buyer;
    }
    
    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }
    public String getAuctionResult() {
        return this.auctionResult;
    }
    
    public void setAuctionResult(String auctionResult) {
        this.auctionResult = auctionResult;
    }
    public String getAuctionStatus() {
        return this.auctionStatus;
    }
    
    public void setAuctionStatus(String auctionStatus) {
        this.auctionStatus = auctionStatus;
    }
    public Date getDispositionDate() {
        return this.dispositionDate;
    }
    
    public void setDispositionDate(Date dispositionDate) {
        this.dispositionDate = dispositionDate;
    }
    public Date getDispositionResearchDate() {
        return this.dispositionResearchDate;
    }
    
    public void setDispositionResearchDate(Date dispositionResearchDate) {
        this.dispositionResearchDate = dispositionResearchDate;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof PortalAuctionHistoryId) )
		    return false;

		 PortalAuctionHistoryId that = (PortalAuctionHistoryId) o;

         return ( (this.getPropertyId()==that.getPropertyId()) || ( this.getPropertyId()!=null && that.getPropertyId()!=null && this.getPropertyId().equals(that.getPropertyId()) ) )
 && ( (this.getAuctionId()==that.getAuctionId()) || ( this.getAuctionId()!=null && that.getAuctionId()!=null && this.getAuctionId().equals(that.getAuctionId()) ) )
 && ( (this.getAuctionYear()==that.getAuctionYear()) || ( this.getAuctionYear()!=null && that.getAuctionYear()!=null && this.getAuctionYear().equals(that.getAuctionYear()) ) )
 && ( (this.getPriorYearsDue()==that.getPriorYearsDue()) || ( this.getPriorYearsDue()!=null && that.getPriorYearsDue()!=null && this.getPriorYearsDue().equals(that.getPriorYearsDue()) ) )
 && ( (this.getAuctionYearBilled()==that.getAuctionYearBilled()) || ( this.getAuctionYearBilled()!=null && that.getAuctionYearBilled()!=null && this.getAuctionYearBilled().equals(that.getAuctionYearBilled()) ) )
 && ( (this.getAuctionYearDue()==that.getAuctionYearDue()) || ( this.getAuctionYearDue()!=null && that.getAuctionYearDue()!=null && this.getAuctionYearDue().equals(that.getAuctionYearDue()) ) )
 && ( (this.getSaleAmount()==that.getSaleAmount()) || ( this.getSaleAmount()!=null && that.getSaleAmount()!=null && this.getSaleAmount().equals(that.getSaleAmount()) ) )
 && ( (this.getRemoved()==that.getRemoved()) || ( this.getRemoved()!=null && that.getRemoved()!=null && this.getRemoved().equals(that.getRemoved()) ) )
 && ( (this.getMarketValue()==that.getMarketValue()) || ( this.getMarketValue()!=null && that.getMarketValue()!=null && this.getMarketValue().equals(that.getMarketValue()) ) )
 && ( (this.getAssessedValuationBuilding()==that.getAssessedValuationBuilding()) || ( this.getAssessedValuationBuilding()!=null && that.getAssessedValuationBuilding()!=null && this.getAssessedValuationBuilding().equals(that.getAssessedValuationBuilding()) ) )
 && ( (this.getAssessedValuationLand()==that.getAssessedValuationLand()) || ( this.getAssessedValuationLand()!=null && that.getAssessedValuationLand()!=null && this.getAssessedValuationLand().equals(that.getAssessedValuationLand()) ) )
 && ( (this.getAssessedValuationTotal()==that.getAssessedValuationTotal()) || ( this.getAssessedValuationTotal()!=null && that.getAssessedValuationTotal()!=null && this.getAssessedValuationTotal().equals(that.getAssessedValuationTotal()) ) )
 && ( (this.getAssesseeAddressCity()==that.getAssesseeAddressCity()) || ( this.getAssesseeAddressCity()!=null && that.getAssesseeAddressCity()!=null && this.getAssesseeAddressCity().equals(that.getAssesseeAddressCity()) ) )
 && ( (this.getAssesseeAddressLine1()==that.getAssesseeAddressLine1()) || ( this.getAssesseeAddressLine1()!=null && that.getAssesseeAddressLine1()!=null && this.getAssesseeAddressLine1().equals(that.getAssesseeAddressLine1()) ) )
 && ( (this.getAssesseeAddressState()==that.getAssesseeAddressState()) || ( this.getAssesseeAddressState()!=null && that.getAssesseeAddressState()!=null && this.getAssesseeAddressState().equals(that.getAssesseeAddressState()) ) )
 && ( (this.getAssesseeAddressZip()==that.getAssesseeAddressZip()) || ( this.getAssesseeAddressZip()!=null && that.getAssesseeAddressZip()!=null && this.getAssesseeAddressZip().equals(that.getAssesseeAddressZip()) ) )
 && ( (this.getAssesseeName()==that.getAssesseeName()) || ( this.getAssesseeName()!=null && that.getAssesseeName()!=null && this.getAssesseeName().equals(that.getAssesseeName()) ) )
 && ( (this.getHomeExemption()==that.getHomeExemption()) || ( this.getHomeExemption()!=null && that.getHomeExemption()!=null && this.getHomeExemption().equals(that.getHomeExemption()) ) )
 && ( (this.getSeniorExemption()==that.getSeniorExemption()) || ( this.getSeniorExemption()!=null && that.getSeniorExemption()!=null && this.getSeniorExemption().equals(that.getSeniorExemption()) ) )
 && ( (this.getAssessmentYear()==that.getAssessmentYear()) || ( this.getAssessmentYear()!=null && that.getAssessmentYear()!=null && this.getAssessmentYear().equals(that.getAssessmentYear()) ) )
 && ( (this.getCode()==that.getCode()) || ( this.getCode()!=null && that.getCode()!=null && this.getCode().equals(that.getCode()) ) )
 && ( (this.getDescription()==that.getDescription()) || ( this.getDescription()!=null && that.getDescription()!=null && this.getDescription().equals(that.getDescription()) ) )
 && ( (this.getPropertyType()==that.getPropertyType()) || ( this.getPropertyType()!=null && that.getPropertyType()!=null && this.getPropertyType().equals(that.getPropertyType()) ) )
 && ( (this.getStatus()==that.getStatus()) || ( this.getStatus()!=null && that.getStatus()!=null && this.getStatus().equals(that.getStatus()) ) )
 && ( (this.getBidRate()==that.getBidRate()) || ( this.getBidRate()!=null && that.getBidRate()!=null && this.getBidRate().equals(that.getBidRate()) ) )
 && ( (this.getOverrideTimestamp()==that.getOverrideTimestamp()) || ( this.getOverrideTimestamp()!=null && that.getOverrideTimestamp()!=null && this.getOverrideTimestamp().equals(that.getOverrideTimestamp()) ) )
 && ( (this.getOverrideUser()==that.getOverrideUser()) || ( this.getOverrideUser()!=null && that.getOverrideUser()!=null && this.getOverrideUser().equals(that.getOverrideUser()) ) )
 && ( (this.getSaleDate()==that.getSaleDate()) || ( this.getSaleDate()!=null && that.getSaleDate()!=null && this.getSaleDate().equals(that.getSaleDate()) ) )
 && ( (this.getWinningBid()==that.getWinningBid()) || ( this.getWinningBid()!=null && that.getWinningBid()!=null && this.getWinningBid().equals(that.getWinningBid()) ) )
 && ( (this.getBuyer()==that.getBuyer()) || ( this.getBuyer()!=null && that.getBuyer()!=null && this.getBuyer().equals(that.getBuyer()) ) )
 && ( (this.getAuctionResult()==that.getAuctionResult()) || ( this.getAuctionResult()!=null && that.getAuctionResult()!=null && this.getAuctionResult().equals(that.getAuctionResult()) ) )
 && ( (this.getAuctionStatus()==that.getAuctionStatus()) || ( this.getAuctionStatus()!=null && that.getAuctionStatus()!=null && this.getAuctionStatus().equals(that.getAuctionStatus()) ) )
 && ( (this.getDispositionDate()==that.getDispositionDate()) || ( this.getDispositionDate()!=null && that.getDispositionDate()!=null && this.getDispositionDate().equals(that.getDispositionDate()) ) )
 && ( (this.getDispositionResearchDate()==that.getDispositionResearchDate()) || ( this.getDispositionResearchDate()!=null && that.getDispositionResearchDate()!=null && this.getDispositionResearchDate().equals(that.getDispositionResearchDate()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getPropertyId() == null ? 0 : this.getPropertyId().hashCode() );
         result = 37 * result + ( getAuctionId() == null ? 0 : this.getAuctionId().hashCode() );
         result = 37 * result + ( getAuctionYear() == null ? 0 : this.getAuctionYear().hashCode() );
         result = 37 * result + ( getPriorYearsDue() == null ? 0 : this.getPriorYearsDue().hashCode() );
         result = 37 * result + ( getAuctionYearBilled() == null ? 0 : this.getAuctionYearBilled().hashCode() );
         result = 37 * result + ( getAuctionYearDue() == null ? 0 : this.getAuctionYearDue().hashCode() );
         result = 37 * result + ( getSaleAmount() == null ? 0 : this.getSaleAmount().hashCode() );
         result = 37 * result + ( getRemoved() == null ? 0 : this.getRemoved().hashCode() );
         result = 37 * result + ( getMarketValue() == null ? 0 : this.getMarketValue().hashCode() );
         result = 37 * result + ( getAssessedValuationBuilding() == null ? 0 : this.getAssessedValuationBuilding().hashCode() );
         result = 37 * result + ( getAssessedValuationLand() == null ? 0 : this.getAssessedValuationLand().hashCode() );
         result = 37 * result + ( getAssessedValuationTotal() == null ? 0 : this.getAssessedValuationTotal().hashCode() );
         result = 37 * result + ( getAssesseeAddressCity() == null ? 0 : this.getAssesseeAddressCity().hashCode() );
         result = 37 * result + ( getAssesseeAddressLine1() == null ? 0 : this.getAssesseeAddressLine1().hashCode() );
         result = 37 * result + ( getAssesseeAddressState() == null ? 0 : this.getAssesseeAddressState().hashCode() );
         result = 37 * result + ( getAssesseeAddressZip() == null ? 0 : this.getAssesseeAddressZip().hashCode() );
         result = 37 * result + ( getAssesseeName() == null ? 0 : this.getAssesseeName().hashCode() );
         result = 37 * result + ( getHomeExemption() == null ? 0 : this.getHomeExemption().hashCode() );
         result = 37 * result + ( getSeniorExemption() == null ? 0 : this.getSeniorExemption().hashCode() );
         result = 37 * result + ( getAssessmentYear() == null ? 0 : this.getAssessmentYear().hashCode() );
         result = 37 * result + ( getCode() == null ? 0 : this.getCode().hashCode() );
         result = 37 * result + ( getDescription() == null ? 0 : this.getDescription().hashCode() );
         result = 37 * result + ( getPropertyType() == null ? 0 : this.getPropertyType().hashCode() );
         result = 37 * result + ( getStatus() == null ? 0 : this.getStatus().hashCode() );
         result = 37 * result + ( getBidRate() == null ? 0 : this.getBidRate().hashCode() );
         result = 37 * result + ( getOverrideTimestamp() == null ? 0 : this.getOverrideTimestamp().hashCode() );
         result = 37 * result + ( getOverrideUser() == null ? 0 : this.getOverrideUser().hashCode() );
         result = 37 * result + ( getSaleDate() == null ? 0 : this.getSaleDate().hashCode() );
         result = 37 * result + ( getWinningBid() == null ? 0 : this.getWinningBid().hashCode() );
         result = 37 * result + ( getBuyer() == null ? 0 : this.getBuyer().hashCode() );
         result = 37 * result + ( getAuctionResult() == null ? 0 : this.getAuctionResult().hashCode() );
         result = 37 * result + ( getAuctionStatus() == null ? 0 : this.getAuctionStatus().hashCode() );
         result = 37 * result + ( getDispositionDate() == null ? 0 : this.getDispositionDate().hashCode() );
         result = 37 * result + ( getDispositionResearchDate() == null ? 0 : this.getDispositionResearchDate().hashCode() );

         return result;
    }


}

