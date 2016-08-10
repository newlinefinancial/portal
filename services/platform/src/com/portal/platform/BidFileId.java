/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

public class BidFileId implements Serializable {

    private int auctionId;
    private int taxYear;
    private Integer auctionDay;
    private Integer advNumber;
    private String pinNumber;
    private Integer bid;

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

    public Integer getAuctionDay() {
        return this.auctionDay;
    }

    public void setAuctionDay(Integer auctionDay) {
        this.auctionDay = auctionDay;
    }

    public Integer getAdvNumber() {
        return this.advNumber;
    }

    public void setAdvNumber(Integer advNumber) {
        this.advNumber = advNumber;
    }

    public String getPinNumber() {
        return this.pinNumber;
    }

    public void setPinNumber(String pinNumber) {
        this.pinNumber = pinNumber;
    }

    public Integer getBid() {
        return this.bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BidFile)) return false;
        final BidFile bidFile = (BidFile) o;
        return Objects.equals(getAuctionId(), bidFile.getAuctionId()) &&
                Objects.equals(getTaxYear(), bidFile.getTaxYear()) &&
                Objects.equals(getAuctionDay(), bidFile.getAuctionDay()) &&
                Objects.equals(getAdvNumber(), bidFile.getAdvNumber()) &&
                Objects.equals(getPinNumber(), bidFile.getPinNumber()) &&
                Objects.equals(getBid(), bidFile.getBid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuctionId(),
                getTaxYear(),
                getAuctionDay(),
                getAdvNumber(),
                getPinNumber(),
                getBid());
    }
}