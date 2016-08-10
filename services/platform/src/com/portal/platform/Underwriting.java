/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Underwriting generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`underwriting`", schema = "review", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"`auction_id`"})})
public class Underwriting implements Serializable {

    private int id;
    private String status;
    private String decisionMethod;
    private Integer bidRate;
    private Double bidAmount;
    private String modelDecision;
    private java.util.Date modelTimestamp;
    private Float predRedemptionPct;
    private Integer predBidRate;
    private Float predBidConfidence;
    private java.util.Date overrideTimestamp;
    private String overrideUser;
    private Auction auction;
    private Property property;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`id`", nullable = false, scale = 0, precision = 10)
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "`status`", nullable = false, length = 50)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "`decision_method`", nullable = true, length = 50)
    public String getDecisionMethod() {
        return this.decisionMethod;
    }

    public void setDecisionMethod(String decisionMethod) {
        this.decisionMethod = decisionMethod;
    }

    @Column(name = "`bid_rate`", nullable = true, scale = 0, precision = 10)
    public Integer getBidRate() {
        return this.bidRate;
    }

    public void setBidRate(Integer bidRate) {
        this.bidRate = bidRate;
    }

    @Column(name = "`bid_amount`", nullable = true, scale = 4, precision = 19)
    public Double getBidAmount() {
        return this.bidAmount;
    }

    public void setBidAmount(Double bidAmount) {
        this.bidAmount = bidAmount;
    }

    @Column(name = "`model_decision`", nullable = true, length = 50)
    public String getModelDecision() {
        return this.modelDecision;
    }

    public void setModelDecision(String modelDecision) {
        this.modelDecision = modelDecision;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "`model_timestamp`", nullable = true)
    public java.util.Date getModelTimestamp() {
        return this.modelTimestamp;
    }

    public void setModelTimestamp(java.util.Date modelTimestamp) {
        this.modelTimestamp = modelTimestamp;
    }

    @Column(name = "`pred_redemption_pct`", nullable = true, scale = 2, precision = 3)
    public Float getPredRedemptionPct() {
        return this.predRedemptionPct;
    }

    public void setPredRedemptionPct(Float predRedemptionPct) {
        this.predRedemptionPct = predRedemptionPct;
    }

    @Column(name = "`pred_bid_rate`", nullable = true, scale = 0, precision = 10)
    public Integer getPredBidRate() {
        return this.predBidRate;
    }

    public void setPredBidRate(Integer predBidRate) {
        this.predBidRate = predBidRate;
    }

    @Column(name = "`pred_bid_confidence`", nullable = true, scale = 2, precision = 3)
    public Float getPredBidConfidence() {
        return this.predBidConfidence;
    }

    public void setPredBidConfidence(Float predBidConfidence) {
        this.predBidConfidence = predBidConfidence;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "`override_timestamp`", nullable = true)
    public java.util.Date getOverrideTimestamp() {
        return this.overrideTimestamp;
    }

    public void setOverrideTimestamp(java.util.Date overrideTimestamp) {
        this.overrideTimestamp = overrideTimestamp;
    }

    @Column(name = "`override_user`", nullable = true, length = 50)
    public String getOverrideUser() {
        return this.overrideUser;
    }

    public void setOverrideUser(String overrideUser) {
        this.overrideUser = overrideUser;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`auction_id`", referencedColumnName = "`id`", insertable = true, updatable = true)
    public Auction getAuction() {
        return this.auction;
    }

    public void setAuction(Auction auction) {
        this.auction = auction;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`property_id`", referencedColumnName = "`ID`", insertable = true, updatable = true)
    public Property getProperty() {
        return this.property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Underwriting)) return false;
        final Underwriting underwriting = (Underwriting) o;
        return Objects.equals(getId(), underwriting.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

