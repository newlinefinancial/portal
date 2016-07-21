/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class AuctionStatId implements Serializable {

    private int auctionId;
    private int auctionYear;
    private BigDecimal lifetimeInvestment;
    private Integer countPublished;
    private Integer countAuctioned;
    private Integer countForfeited;
    private Integer countOpensales;
    private Integer countOpenpriors;

    public int getAuctionId() {
        return this.auctionId;
    }

    public void setAuctionId(int auctionId) {
        this.auctionId = auctionId;
    }

    public int getAuctionYear() {
        return this.auctionYear;
    }

    public void setAuctionYear(int auctionYear) {
        this.auctionYear = auctionYear;
    }

    public BigDecimal getLifetimeInvestment() {
        return this.lifetimeInvestment;
    }

    public void setLifetimeInvestment(BigDecimal lifetimeInvestment) {
        this.lifetimeInvestment = lifetimeInvestment;
    }

    public Integer getCountPublished() {
        return this.countPublished;
    }

    public void setCountPublished(Integer countPublished) {
        this.countPublished = countPublished;
    }

    public Integer getCountAuctioned() {
        return this.countAuctioned;
    }

    public void setCountAuctioned(Integer countAuctioned) {
        this.countAuctioned = countAuctioned;
    }

    public Integer getCountForfeited() {
        return this.countForfeited;
    }

    public void setCountForfeited(Integer countForfeited) {
        this.countForfeited = countForfeited;
    }

    public Integer getCountOpensales() {
        return this.countOpensales;
    }

    public void setCountOpensales(Integer countOpensales) {
        this.countOpensales = countOpensales;
    }

    public Integer getCountOpenpriors() {
        return this.countOpenpriors;
    }

    public void setCountOpenpriors(Integer countOpenpriors) {
        this.countOpenpriors = countOpenpriors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AuctionStat)) return false;
        final AuctionStat auctionStat = (AuctionStat) o;
        return Objects.equals(getAuctionId(), auctionStat.getAuctionId()) &&
                Objects.equals(getAuctionYear(), auctionStat.getAuctionYear()) &&
                Objects.equals(getLifetimeInvestment(), auctionStat.getLifetimeInvestment()) &&
                Objects.equals(getCountPublished(), auctionStat.getCountPublished()) &&
                Objects.equals(getCountAuctioned(), auctionStat.getCountAuctioned()) &&
                Objects.equals(getCountForfeited(), auctionStat.getCountForfeited()) &&
                Objects.equals(getCountOpensales(), auctionStat.getCountOpensales()) &&
                Objects.equals(getCountOpenpriors(), auctionStat.getCountOpenpriors());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuctionId(),
                getAuctionYear(),
                getLifetimeInvestment(),
                getCountPublished(),
                getCountAuctioned(),
                getCountForfeited(),
                getCountOpensales(),
                getCountOpenpriors());
    }
}
