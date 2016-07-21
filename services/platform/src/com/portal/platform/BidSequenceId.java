/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

public class BidSequenceId implements Serializable {

    private int auctionId;
    private int taxYear;
    private int propertyId;
    private Integer auctionDay;
    private BigInteger order;

    public int getAuctionId() {
        return this.auctionId;
    }

    public void setAuctionId(int auctionId) {
        this.auctionId = auctionId;
    }

    public int getTaxYear() {
        return this.taxYear;
    }

    public void setTaxYear(int taxYear) {
        this.taxYear = taxYear;
    }

    public int getPropertyId() {
        return this.propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public Integer getAuctionDay() {
        return this.auctionDay;
    }

    public void setAuctionDay(Integer auctionDay) {
        this.auctionDay = auctionDay;
    }

    public BigInteger getOrder() {
        return this.order;
    }

    public void setOrder(BigInteger order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BidSequence)) return false;
        final BidSequence bidSequence = (BidSequence) o;
        return Objects.equals(getAuctionId(), bidSequence.getAuctionId()) &&
                Objects.equals(getTaxYear(), bidSequence.getTaxYear()) &&
                Objects.equals(getPropertyId(), bidSequence.getPropertyId()) &&
                Objects.equals(getAuctionDay(), bidSequence.getAuctionDay()) &&
                Objects.equals(getOrder(), bidSequence.getOrder());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuctionId(),
                getTaxYear(),
                getPropertyId(),
                getAuctionDay(),
                getOrder());
    }
}
