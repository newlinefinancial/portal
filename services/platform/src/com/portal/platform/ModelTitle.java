/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import java.math.BigDecimal;
import java.math.BigInteger;
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
 * ModelTitle generated by hbm2java
 */
@Entity
@Table(name="`model_title`"
    ,schema="review"
)
@IdClass(value=ModelTitleId.class)
public class ModelTitle  implements java.io.Serializable {

    
    private Integer auctionId;
    
    private Integer propertyId;
    
    private BigDecimal demoFlg;
    
    private Integer gov;
    
    private Integer govLien;
    
    private Integer numMortgages;
    
    private BigInteger valMortgages;
    
    private BigInteger maxValMortgages;
    
    private BigInteger minValMortgages;
    
    private Integer newestMortgage;
    
    private Integer oldestMortgage;
    
    private Integer numDeed;
    
    private BigInteger valDeed;
    
    private BigInteger maxValDeed;
    
    private BigInteger minValDeed;
    
    private Integer newestDeed;
    
    private Integer oldestDeed;
    
    private Integer numLien;
    
    private BigInteger valLien;
    
    private BigInteger maxValLien;
    
    private BigInteger minValLien;
    
    private Integer newestLien;
    
    private Integer oldestLien;
    
    private Integer numLis;
    
    private BigInteger valLis;
    
    private BigInteger maxValLis;
    
    private BigInteger minValLis;
    
    private Integer newestLis;
    
    private Integer oldestLis;
    
    private Integer numAssignment;
    
    private BigInteger valAssignment;
    
    private BigInteger maxValAssignment;
    
    private BigInteger minValAssignment;
    
    private Integer newestAssignment;
    
    private Integer oldestAssignment;
    
    private Integer numQuit;
    
    private BigInteger valQuit;
    
    private BigInteger maxValQuit;
    
    private BigInteger minValQuit;
    
    private Integer newestQuit;
    
    private Integer oldestQuit;
    
    private Integer numForeclosure;
    
    private BigInteger valForeclosure;
    
    private BigInteger maxValForeclosure;
    
    private BigInteger minValForeclosure;
    
    private Integer newestForeclosure;
    
    private Integer oldestForeclosure;
    
    private Integer numRents;
    
    private BigInteger valRents;
    
    private BigInteger maxValRents;
    
    private BigInteger minValRents;
    
    private Integer newestRents;
    
    private Integer oldestRents;
    
    private Integer numBuilding;
    
    private BigInteger valBuilding;
    
    private BigInteger maxValBuilding;
    
    private BigInteger minValBuilding;
    
    private Integer newestBuilding;
    
    private Integer oldestBuilding;

    public ModelTitle() {
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
    

    @Column(name="`property_id`", insertable=false, updatable=false, precision=10)
    public Integer getPropertyId() {
        return this.propertyId;
    }
    
    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }
    @Id 
    

    @Column(name="`demo_flg`", insertable=false, updatable=false, precision=53, scale=9)
    public BigDecimal getDemoFlg() {
        return this.demoFlg;
    }
    
    public void setDemoFlg(BigDecimal demoFlg) {
        this.demoFlg = demoFlg;
    }
    @Id 
    

    @Column(name="`gov`", insertable=false, updatable=false, precision=10)
    public Integer getGov() {
        return this.gov;
    }
    
    public void setGov(Integer gov) {
        this.gov = gov;
    }
    @Id 
    

    @Column(name="`gov_lien`", insertable=false, updatable=false, precision=10)
    public Integer getGovLien() {
        return this.govLien;
    }
    
    public void setGovLien(Integer govLien) {
        this.govLien = govLien;
    }
    @Id 
    

    @Column(name="`num_mortgages`", insertable=false, updatable=false, precision=10)
    public Integer getNumMortgages() {
        return this.numMortgages;
    }
    
    public void setNumMortgages(Integer numMortgages) {
        this.numMortgages = numMortgages;
    }
    @Id 
    

    @Column(name="`val_mortgages`", insertable=false, updatable=false, precision=20)
    public BigInteger getValMortgages() {
        return this.valMortgages;
    }
    
    public void setValMortgages(BigInteger valMortgages) {
        this.valMortgages = valMortgages;
    }
    @Id 
    

    @Column(name="`max_val_mortgages`", insertable=false, updatable=false, precision=20)
    public BigInteger getMaxValMortgages() {
        return this.maxValMortgages;
    }
    
    public void setMaxValMortgages(BigInteger maxValMortgages) {
        this.maxValMortgages = maxValMortgages;
    }
    @Id 
    

    @Column(name="`min_val_mortgages`", insertable=false, updatable=false, precision=20)
    public BigInteger getMinValMortgages() {
        return this.minValMortgages;
    }
    
    public void setMinValMortgages(BigInteger minValMortgages) {
        this.minValMortgages = minValMortgages;
    }
    @Id 
    

    @Column(name="`newest_mortgage`", insertable=false, updatable=false, precision=10)
    public Integer getNewestMortgage() {
        return this.newestMortgage;
    }
    
    public void setNewestMortgage(Integer newestMortgage) {
        this.newestMortgage = newestMortgage;
    }
    @Id 
    

    @Column(name="`oldest_mortgage`", insertable=false, updatable=false, precision=10)
    public Integer getOldestMortgage() {
        return this.oldestMortgage;
    }
    
    public void setOldestMortgage(Integer oldestMortgage) {
        this.oldestMortgage = oldestMortgage;
    }
    @Id 
    

    @Column(name="`num_deed`", insertable=false, updatable=false, precision=10)
    public Integer getNumDeed() {
        return this.numDeed;
    }
    
    public void setNumDeed(Integer numDeed) {
        this.numDeed = numDeed;
    }
    @Id 
    

    @Column(name="`val_deed`", insertable=false, updatable=false, precision=20)
    public BigInteger getValDeed() {
        return this.valDeed;
    }
    
    public void setValDeed(BigInteger valDeed) {
        this.valDeed = valDeed;
    }
    @Id 
    

    @Column(name="`max_val_deed`", insertable=false, updatable=false, precision=20)
    public BigInteger getMaxValDeed() {
        return this.maxValDeed;
    }
    
    public void setMaxValDeed(BigInteger maxValDeed) {
        this.maxValDeed = maxValDeed;
    }
    @Id 
    

    @Column(name="`min_val_deed`", insertable=false, updatable=false, precision=20)
    public BigInteger getMinValDeed() {
        return this.minValDeed;
    }
    
    public void setMinValDeed(BigInteger minValDeed) {
        this.minValDeed = minValDeed;
    }
    @Id 
    

    @Column(name="`newest_deed`", insertable=false, updatable=false, precision=10)
    public Integer getNewestDeed() {
        return this.newestDeed;
    }
    
    public void setNewestDeed(Integer newestDeed) {
        this.newestDeed = newestDeed;
    }
    @Id 
    

    @Column(name="`oldest_deed`", insertable=false, updatable=false, precision=10)
    public Integer getOldestDeed() {
        return this.oldestDeed;
    }
    
    public void setOldestDeed(Integer oldestDeed) {
        this.oldestDeed = oldestDeed;
    }
    @Id 
    

    @Column(name="`num_LIEN`", insertable=false, updatable=false, precision=10)
    public Integer getNumLien() {
        return this.numLien;
    }
    
    public void setNumLien(Integer numLien) {
        this.numLien = numLien;
    }
    @Id 
    

    @Column(name="`val_LIEN`", insertable=false, updatable=false, precision=20)
    public BigInteger getValLien() {
        return this.valLien;
    }
    
    public void setValLien(BigInteger valLien) {
        this.valLien = valLien;
    }
    @Id 
    

    @Column(name="`max_val_LIEN`", insertable=false, updatable=false, precision=20)
    public BigInteger getMaxValLien() {
        return this.maxValLien;
    }
    
    public void setMaxValLien(BigInteger maxValLien) {
        this.maxValLien = maxValLien;
    }
    @Id 
    

    @Column(name="`min_val_LIEN`", insertable=false, updatable=false, precision=20)
    public BigInteger getMinValLien() {
        return this.minValLien;
    }
    
    public void setMinValLien(BigInteger minValLien) {
        this.minValLien = minValLien;
    }
    @Id 
    

    @Column(name="`newest_LIEN`", insertable=false, updatable=false, precision=10)
    public Integer getNewestLien() {
        return this.newestLien;
    }
    
    public void setNewestLien(Integer newestLien) {
        this.newestLien = newestLien;
    }
    @Id 
    

    @Column(name="`oldest_LIEN`", insertable=false, updatable=false, precision=10)
    public Integer getOldestLien() {
        return this.oldestLien;
    }
    
    public void setOldestLien(Integer oldestLien) {
        this.oldestLien = oldestLien;
    }
    @Id 
    

    @Column(name="`num_LIS`", insertable=false, updatable=false, precision=10)
    public Integer getNumLis() {
        return this.numLis;
    }
    
    public void setNumLis(Integer numLis) {
        this.numLis = numLis;
    }
    @Id 
    

    @Column(name="`val_LIS`", insertable=false, updatable=false, precision=20)
    public BigInteger getValLis() {
        return this.valLis;
    }
    
    public void setValLis(BigInteger valLis) {
        this.valLis = valLis;
    }
    @Id 
    

    @Column(name="`max_val_LIS`", insertable=false, updatable=false, precision=20)
    public BigInteger getMaxValLis() {
        return this.maxValLis;
    }
    
    public void setMaxValLis(BigInteger maxValLis) {
        this.maxValLis = maxValLis;
    }
    @Id 
    

    @Column(name="`min_val_LIS`", insertable=false, updatable=false, precision=20)
    public BigInteger getMinValLis() {
        return this.minValLis;
    }
    
    public void setMinValLis(BigInteger minValLis) {
        this.minValLis = minValLis;
    }
    @Id 
    

    @Column(name="`newest_LIS`", insertable=false, updatable=false, precision=10)
    public Integer getNewestLis() {
        return this.newestLis;
    }
    
    public void setNewestLis(Integer newestLis) {
        this.newestLis = newestLis;
    }
    @Id 
    

    @Column(name="`oldest_LIS`", insertable=false, updatable=false, precision=10)
    public Integer getOldestLis() {
        return this.oldestLis;
    }
    
    public void setOldestLis(Integer oldestLis) {
        this.oldestLis = oldestLis;
    }
    @Id 
    

    @Column(name="`num_ASSIGNMENT`", insertable=false, updatable=false, precision=10)
    public Integer getNumAssignment() {
        return this.numAssignment;
    }
    
    public void setNumAssignment(Integer numAssignment) {
        this.numAssignment = numAssignment;
    }
    @Id 
    

    @Column(name="`val_ASSIGNMENT`", insertable=false, updatable=false, precision=20)
    public BigInteger getValAssignment() {
        return this.valAssignment;
    }
    
    public void setValAssignment(BigInteger valAssignment) {
        this.valAssignment = valAssignment;
    }
    @Id 
    

    @Column(name="`max_val_ASSIGNMENT`", insertable=false, updatable=false, precision=20)
    public BigInteger getMaxValAssignment() {
        return this.maxValAssignment;
    }
    
    public void setMaxValAssignment(BigInteger maxValAssignment) {
        this.maxValAssignment = maxValAssignment;
    }
    @Id 
    

    @Column(name="`min_val_ASSIGNMENT`", insertable=false, updatable=false, precision=20)
    public BigInteger getMinValAssignment() {
        return this.minValAssignment;
    }
    
    public void setMinValAssignment(BigInteger minValAssignment) {
        this.minValAssignment = minValAssignment;
    }
    @Id 
    

    @Column(name="`newest_ASSIGNMENT`", insertable=false, updatable=false, precision=10)
    public Integer getNewestAssignment() {
        return this.newestAssignment;
    }
    
    public void setNewestAssignment(Integer newestAssignment) {
        this.newestAssignment = newestAssignment;
    }
    @Id 
    

    @Column(name="`oldest_ASSIGNMENT`", insertable=false, updatable=false, precision=10)
    public Integer getOldestAssignment() {
        return this.oldestAssignment;
    }
    
    public void setOldestAssignment(Integer oldestAssignment) {
        this.oldestAssignment = oldestAssignment;
    }
    @Id 
    

    @Column(name="`num_QUIT`", insertable=false, updatable=false, precision=10)
    public Integer getNumQuit() {
        return this.numQuit;
    }
    
    public void setNumQuit(Integer numQuit) {
        this.numQuit = numQuit;
    }
    @Id 
    

    @Column(name="`val_QUIT`", insertable=false, updatable=false, precision=20)
    public BigInteger getValQuit() {
        return this.valQuit;
    }
    
    public void setValQuit(BigInteger valQuit) {
        this.valQuit = valQuit;
    }
    @Id 
    

    @Column(name="`max_val_QUIT`", insertable=false, updatable=false, precision=20)
    public BigInteger getMaxValQuit() {
        return this.maxValQuit;
    }
    
    public void setMaxValQuit(BigInteger maxValQuit) {
        this.maxValQuit = maxValQuit;
    }
    @Id 
    

    @Column(name="`min_val_QUIT`", insertable=false, updatable=false, precision=20)
    public BigInteger getMinValQuit() {
        return this.minValQuit;
    }
    
    public void setMinValQuit(BigInteger minValQuit) {
        this.minValQuit = minValQuit;
    }
    @Id 
    

    @Column(name="`newest_QUIT`", insertable=false, updatable=false, precision=10)
    public Integer getNewestQuit() {
        return this.newestQuit;
    }
    
    public void setNewestQuit(Integer newestQuit) {
        this.newestQuit = newestQuit;
    }
    @Id 
    

    @Column(name="`oldest_QUIT`", insertable=false, updatable=false, precision=10)
    public Integer getOldestQuit() {
        return this.oldestQuit;
    }
    
    public void setOldestQuit(Integer oldestQuit) {
        this.oldestQuit = oldestQuit;
    }
    @Id 
    

    @Column(name="`num_FORECLOSURE`", insertable=false, updatable=false, precision=10)
    public Integer getNumForeclosure() {
        return this.numForeclosure;
    }
    
    public void setNumForeclosure(Integer numForeclosure) {
        this.numForeclosure = numForeclosure;
    }
    @Id 
    

    @Column(name="`val_FORECLOSURE`", insertable=false, updatable=false, precision=20)
    public BigInteger getValForeclosure() {
        return this.valForeclosure;
    }
    
    public void setValForeclosure(BigInteger valForeclosure) {
        this.valForeclosure = valForeclosure;
    }
    @Id 
    

    @Column(name="`max_val_FORECLOSURE`", insertable=false, updatable=false, precision=20)
    public BigInteger getMaxValForeclosure() {
        return this.maxValForeclosure;
    }
    
    public void setMaxValForeclosure(BigInteger maxValForeclosure) {
        this.maxValForeclosure = maxValForeclosure;
    }
    @Id 
    

    @Column(name="`min_val_FORECLOSURE`", insertable=false, updatable=false, precision=20)
    public BigInteger getMinValForeclosure() {
        return this.minValForeclosure;
    }
    
    public void setMinValForeclosure(BigInteger minValForeclosure) {
        this.minValForeclosure = minValForeclosure;
    }
    @Id 
    

    @Column(name="`newest_FORECLOSURE`", insertable=false, updatable=false, precision=10)
    public Integer getNewestForeclosure() {
        return this.newestForeclosure;
    }
    
    public void setNewestForeclosure(Integer newestForeclosure) {
        this.newestForeclosure = newestForeclosure;
    }
    @Id 
    

    @Column(name="`oldest_FORECLOSURE`", insertable=false, updatable=false, precision=10)
    public Integer getOldestForeclosure() {
        return this.oldestForeclosure;
    }
    
    public void setOldestForeclosure(Integer oldestForeclosure) {
        this.oldestForeclosure = oldestForeclosure;
    }
    @Id 
    

    @Column(name="`num_RENTS`", insertable=false, updatable=false, precision=10)
    public Integer getNumRents() {
        return this.numRents;
    }
    
    public void setNumRents(Integer numRents) {
        this.numRents = numRents;
    }
    @Id 
    

    @Column(name="`val_RENTS`", insertable=false, updatable=false, precision=20)
    public BigInteger getValRents() {
        return this.valRents;
    }
    
    public void setValRents(BigInteger valRents) {
        this.valRents = valRents;
    }
    @Id 
    

    @Column(name="`max_val_RENTS`", insertable=false, updatable=false, precision=20)
    public BigInteger getMaxValRents() {
        return this.maxValRents;
    }
    
    public void setMaxValRents(BigInteger maxValRents) {
        this.maxValRents = maxValRents;
    }
    @Id 
    

    @Column(name="`min_val_RENTS`", insertable=false, updatable=false, precision=20)
    public BigInteger getMinValRents() {
        return this.minValRents;
    }
    
    public void setMinValRents(BigInteger minValRents) {
        this.minValRents = minValRents;
    }
    @Id 
    

    @Column(name="`newest_RENTS`", insertable=false, updatable=false, precision=10)
    public Integer getNewestRents() {
        return this.newestRents;
    }
    
    public void setNewestRents(Integer newestRents) {
        this.newestRents = newestRents;
    }
    @Id 
    

    @Column(name="`oldest_RENTS`", insertable=false, updatable=false, precision=10)
    public Integer getOldestRents() {
        return this.oldestRents;
    }
    
    public void setOldestRents(Integer oldestRents) {
        this.oldestRents = oldestRents;
    }
    @Id 
    

    @Column(name="`num_BUILDING`", insertable=false, updatable=false, precision=10)
    public Integer getNumBuilding() {
        return this.numBuilding;
    }
    
    public void setNumBuilding(Integer numBuilding) {
        this.numBuilding = numBuilding;
    }
    @Id 
    

    @Column(name="`val_BUILDING`", insertable=false, updatable=false, precision=20)
    public BigInteger getValBuilding() {
        return this.valBuilding;
    }
    
    public void setValBuilding(BigInteger valBuilding) {
        this.valBuilding = valBuilding;
    }
    @Id 
    

    @Column(name="`max_val_BUILDING`", insertable=false, updatable=false, precision=20)
    public BigInteger getMaxValBuilding() {
        return this.maxValBuilding;
    }
    
    public void setMaxValBuilding(BigInteger maxValBuilding) {
        this.maxValBuilding = maxValBuilding;
    }
    @Id 
    

    @Column(name="`min_val_BUILDING`", insertable=false, updatable=false, precision=20)
    public BigInteger getMinValBuilding() {
        return this.minValBuilding;
    }
    
    public void setMinValBuilding(BigInteger minValBuilding) {
        this.minValBuilding = minValBuilding;
    }
    @Id 
    

    @Column(name="`newest_BUILDING`", insertable=false, updatable=false, precision=10)
    public Integer getNewestBuilding() {
        return this.newestBuilding;
    }
    
    public void setNewestBuilding(Integer newestBuilding) {
        this.newestBuilding = newestBuilding;
    }
    @Id 
    

    @Column(name="`oldest_BUILDING`", insertable=false, updatable=false, precision=10)
    public Integer getOldestBuilding() {
        return this.oldestBuilding;
    }
    
    public void setOldestBuilding(Integer oldestBuilding) {
        this.oldestBuilding = oldestBuilding;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof ModelTitle) )
		    return false;

		 ModelTitle that = (ModelTitle) o;

         return ( (this.getAuctionId()==that.getAuctionId()) || ( this.getAuctionId()!=null && that.getAuctionId()!=null && this.getAuctionId().equals(that.getAuctionId()) ) )
 && ( (this.getPropertyId()==that.getPropertyId()) || ( this.getPropertyId()!=null && that.getPropertyId()!=null && this.getPropertyId().equals(that.getPropertyId()) ) )
 && ( (this.getDemoFlg()==that.getDemoFlg()) || ( this.getDemoFlg()!=null && that.getDemoFlg()!=null && this.getDemoFlg().equals(that.getDemoFlg()) ) )
 && ( (this.getGov()==that.getGov()) || ( this.getGov()!=null && that.getGov()!=null && this.getGov().equals(that.getGov()) ) )
 && ( (this.getGovLien()==that.getGovLien()) || ( this.getGovLien()!=null && that.getGovLien()!=null && this.getGovLien().equals(that.getGovLien()) ) )
 && ( (this.getNumMortgages()==that.getNumMortgages()) || ( this.getNumMortgages()!=null && that.getNumMortgages()!=null && this.getNumMortgages().equals(that.getNumMortgages()) ) )
 && ( (this.getValMortgages()==that.getValMortgages()) || ( this.getValMortgages()!=null && that.getValMortgages()!=null && this.getValMortgages().equals(that.getValMortgages()) ) )
 && ( (this.getMaxValMortgages()==that.getMaxValMortgages()) || ( this.getMaxValMortgages()!=null && that.getMaxValMortgages()!=null && this.getMaxValMortgages().equals(that.getMaxValMortgages()) ) )
 && ( (this.getMinValMortgages()==that.getMinValMortgages()) || ( this.getMinValMortgages()!=null && that.getMinValMortgages()!=null && this.getMinValMortgages().equals(that.getMinValMortgages()) ) )
 && ( (this.getNewestMortgage()==that.getNewestMortgage()) || ( this.getNewestMortgage()!=null && that.getNewestMortgage()!=null && this.getNewestMortgage().equals(that.getNewestMortgage()) ) )
 && ( (this.getOldestMortgage()==that.getOldestMortgage()) || ( this.getOldestMortgage()!=null && that.getOldestMortgage()!=null && this.getOldestMortgage().equals(that.getOldestMortgage()) ) )
 && ( (this.getNumDeed()==that.getNumDeed()) || ( this.getNumDeed()!=null && that.getNumDeed()!=null && this.getNumDeed().equals(that.getNumDeed()) ) )
 && ( (this.getValDeed()==that.getValDeed()) || ( this.getValDeed()!=null && that.getValDeed()!=null && this.getValDeed().equals(that.getValDeed()) ) )
 && ( (this.getMaxValDeed()==that.getMaxValDeed()) || ( this.getMaxValDeed()!=null && that.getMaxValDeed()!=null && this.getMaxValDeed().equals(that.getMaxValDeed()) ) )
 && ( (this.getMinValDeed()==that.getMinValDeed()) || ( this.getMinValDeed()!=null && that.getMinValDeed()!=null && this.getMinValDeed().equals(that.getMinValDeed()) ) )
 && ( (this.getNewestDeed()==that.getNewestDeed()) || ( this.getNewestDeed()!=null && that.getNewestDeed()!=null && this.getNewestDeed().equals(that.getNewestDeed()) ) )
 && ( (this.getOldestDeed()==that.getOldestDeed()) || ( this.getOldestDeed()!=null && that.getOldestDeed()!=null && this.getOldestDeed().equals(that.getOldestDeed()) ) )
 && ( (this.getNumLien()==that.getNumLien()) || ( this.getNumLien()!=null && that.getNumLien()!=null && this.getNumLien().equals(that.getNumLien()) ) )
 && ( (this.getValLien()==that.getValLien()) || ( this.getValLien()!=null && that.getValLien()!=null && this.getValLien().equals(that.getValLien()) ) )
 && ( (this.getMaxValLien()==that.getMaxValLien()) || ( this.getMaxValLien()!=null && that.getMaxValLien()!=null && this.getMaxValLien().equals(that.getMaxValLien()) ) )
 && ( (this.getMinValLien()==that.getMinValLien()) || ( this.getMinValLien()!=null && that.getMinValLien()!=null && this.getMinValLien().equals(that.getMinValLien()) ) )
 && ( (this.getNewestLien()==that.getNewestLien()) || ( this.getNewestLien()!=null && that.getNewestLien()!=null && this.getNewestLien().equals(that.getNewestLien()) ) )
 && ( (this.getOldestLien()==that.getOldestLien()) || ( this.getOldestLien()!=null && that.getOldestLien()!=null && this.getOldestLien().equals(that.getOldestLien()) ) )
 && ( (this.getNumLis()==that.getNumLis()) || ( this.getNumLis()!=null && that.getNumLis()!=null && this.getNumLis().equals(that.getNumLis()) ) )
 && ( (this.getValLis()==that.getValLis()) || ( this.getValLis()!=null && that.getValLis()!=null && this.getValLis().equals(that.getValLis()) ) )
 && ( (this.getMaxValLis()==that.getMaxValLis()) || ( this.getMaxValLis()!=null && that.getMaxValLis()!=null && this.getMaxValLis().equals(that.getMaxValLis()) ) )
 && ( (this.getMinValLis()==that.getMinValLis()) || ( this.getMinValLis()!=null && that.getMinValLis()!=null && this.getMinValLis().equals(that.getMinValLis()) ) )
 && ( (this.getNewestLis()==that.getNewestLis()) || ( this.getNewestLis()!=null && that.getNewestLis()!=null && this.getNewestLis().equals(that.getNewestLis()) ) )
 && ( (this.getOldestLis()==that.getOldestLis()) || ( this.getOldestLis()!=null && that.getOldestLis()!=null && this.getOldestLis().equals(that.getOldestLis()) ) )
 && ( (this.getNumAssignment()==that.getNumAssignment()) || ( this.getNumAssignment()!=null && that.getNumAssignment()!=null && this.getNumAssignment().equals(that.getNumAssignment()) ) )
 && ( (this.getValAssignment()==that.getValAssignment()) || ( this.getValAssignment()!=null && that.getValAssignment()!=null && this.getValAssignment().equals(that.getValAssignment()) ) )
 && ( (this.getMaxValAssignment()==that.getMaxValAssignment()) || ( this.getMaxValAssignment()!=null && that.getMaxValAssignment()!=null && this.getMaxValAssignment().equals(that.getMaxValAssignment()) ) )
 && ( (this.getMinValAssignment()==that.getMinValAssignment()) || ( this.getMinValAssignment()!=null && that.getMinValAssignment()!=null && this.getMinValAssignment().equals(that.getMinValAssignment()) ) )
 && ( (this.getNewestAssignment()==that.getNewestAssignment()) || ( this.getNewestAssignment()!=null && that.getNewestAssignment()!=null && this.getNewestAssignment().equals(that.getNewestAssignment()) ) )
 && ( (this.getOldestAssignment()==that.getOldestAssignment()) || ( this.getOldestAssignment()!=null && that.getOldestAssignment()!=null && this.getOldestAssignment().equals(that.getOldestAssignment()) ) )
 && ( (this.getNumQuit()==that.getNumQuit()) || ( this.getNumQuit()!=null && that.getNumQuit()!=null && this.getNumQuit().equals(that.getNumQuit()) ) )
 && ( (this.getValQuit()==that.getValQuit()) || ( this.getValQuit()!=null && that.getValQuit()!=null && this.getValQuit().equals(that.getValQuit()) ) )
 && ( (this.getMaxValQuit()==that.getMaxValQuit()) || ( this.getMaxValQuit()!=null && that.getMaxValQuit()!=null && this.getMaxValQuit().equals(that.getMaxValQuit()) ) )
 && ( (this.getMinValQuit()==that.getMinValQuit()) || ( this.getMinValQuit()!=null && that.getMinValQuit()!=null && this.getMinValQuit().equals(that.getMinValQuit()) ) )
 && ( (this.getNewestQuit()==that.getNewestQuit()) || ( this.getNewestQuit()!=null && that.getNewestQuit()!=null && this.getNewestQuit().equals(that.getNewestQuit()) ) )
 && ( (this.getOldestQuit()==that.getOldestQuit()) || ( this.getOldestQuit()!=null && that.getOldestQuit()!=null && this.getOldestQuit().equals(that.getOldestQuit()) ) )
 && ( (this.getNumForeclosure()==that.getNumForeclosure()) || ( this.getNumForeclosure()!=null && that.getNumForeclosure()!=null && this.getNumForeclosure().equals(that.getNumForeclosure()) ) )
 && ( (this.getValForeclosure()==that.getValForeclosure()) || ( this.getValForeclosure()!=null && that.getValForeclosure()!=null && this.getValForeclosure().equals(that.getValForeclosure()) ) )
 && ( (this.getMaxValForeclosure()==that.getMaxValForeclosure()) || ( this.getMaxValForeclosure()!=null && that.getMaxValForeclosure()!=null && this.getMaxValForeclosure().equals(that.getMaxValForeclosure()) ) )
 && ( (this.getMinValForeclosure()==that.getMinValForeclosure()) || ( this.getMinValForeclosure()!=null && that.getMinValForeclosure()!=null && this.getMinValForeclosure().equals(that.getMinValForeclosure()) ) )
 && ( (this.getNewestForeclosure()==that.getNewestForeclosure()) || ( this.getNewestForeclosure()!=null && that.getNewestForeclosure()!=null && this.getNewestForeclosure().equals(that.getNewestForeclosure()) ) )
 && ( (this.getOldestForeclosure()==that.getOldestForeclosure()) || ( this.getOldestForeclosure()!=null && that.getOldestForeclosure()!=null && this.getOldestForeclosure().equals(that.getOldestForeclosure()) ) )
 && ( (this.getNumRents()==that.getNumRents()) || ( this.getNumRents()!=null && that.getNumRents()!=null && this.getNumRents().equals(that.getNumRents()) ) )
 && ( (this.getValRents()==that.getValRents()) || ( this.getValRents()!=null && that.getValRents()!=null && this.getValRents().equals(that.getValRents()) ) )
 && ( (this.getMaxValRents()==that.getMaxValRents()) || ( this.getMaxValRents()!=null && that.getMaxValRents()!=null && this.getMaxValRents().equals(that.getMaxValRents()) ) )
 && ( (this.getMinValRents()==that.getMinValRents()) || ( this.getMinValRents()!=null && that.getMinValRents()!=null && this.getMinValRents().equals(that.getMinValRents()) ) )
 && ( (this.getNewestRents()==that.getNewestRents()) || ( this.getNewestRents()!=null && that.getNewestRents()!=null && this.getNewestRents().equals(that.getNewestRents()) ) )
 && ( (this.getOldestRents()==that.getOldestRents()) || ( this.getOldestRents()!=null && that.getOldestRents()!=null && this.getOldestRents().equals(that.getOldestRents()) ) )
 && ( (this.getNumBuilding()==that.getNumBuilding()) || ( this.getNumBuilding()!=null && that.getNumBuilding()!=null && this.getNumBuilding().equals(that.getNumBuilding()) ) )
 && ( (this.getValBuilding()==that.getValBuilding()) || ( this.getValBuilding()!=null && that.getValBuilding()!=null && this.getValBuilding().equals(that.getValBuilding()) ) )
 && ( (this.getMaxValBuilding()==that.getMaxValBuilding()) || ( this.getMaxValBuilding()!=null && that.getMaxValBuilding()!=null && this.getMaxValBuilding().equals(that.getMaxValBuilding()) ) )
 && ( (this.getMinValBuilding()==that.getMinValBuilding()) || ( this.getMinValBuilding()!=null && that.getMinValBuilding()!=null && this.getMinValBuilding().equals(that.getMinValBuilding()) ) )
 && ( (this.getNewestBuilding()==that.getNewestBuilding()) || ( this.getNewestBuilding()!=null && that.getNewestBuilding()!=null && this.getNewestBuilding().equals(that.getNewestBuilding()) ) )
 && ( (this.getOldestBuilding()==that.getOldestBuilding()) || ( this.getOldestBuilding()!=null && that.getOldestBuilding()!=null && this.getOldestBuilding().equals(that.getOldestBuilding()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getAuctionId() == null ? 0 : this.getAuctionId().hashCode() );
         result = 37 * result + ( getPropertyId() == null ? 0 : this.getPropertyId().hashCode() );
         result = 37 * result + ( getDemoFlg() == null ? 0 : this.getDemoFlg().hashCode() );
         result = 37 * result + ( getGov() == null ? 0 : this.getGov().hashCode() );
         result = 37 * result + ( getGovLien() == null ? 0 : this.getGovLien().hashCode() );
         result = 37 * result + ( getNumMortgages() == null ? 0 : this.getNumMortgages().hashCode() );
         result = 37 * result + ( getValMortgages() == null ? 0 : this.getValMortgages().hashCode() );
         result = 37 * result + ( getMaxValMortgages() == null ? 0 : this.getMaxValMortgages().hashCode() );
         result = 37 * result + ( getMinValMortgages() == null ? 0 : this.getMinValMortgages().hashCode() );
         result = 37 * result + ( getNewestMortgage() == null ? 0 : this.getNewestMortgage().hashCode() );
         result = 37 * result + ( getOldestMortgage() == null ? 0 : this.getOldestMortgage().hashCode() );
         result = 37 * result + ( getNumDeed() == null ? 0 : this.getNumDeed().hashCode() );
         result = 37 * result + ( getValDeed() == null ? 0 : this.getValDeed().hashCode() );
         result = 37 * result + ( getMaxValDeed() == null ? 0 : this.getMaxValDeed().hashCode() );
         result = 37 * result + ( getMinValDeed() == null ? 0 : this.getMinValDeed().hashCode() );
         result = 37 * result + ( getNewestDeed() == null ? 0 : this.getNewestDeed().hashCode() );
         result = 37 * result + ( getOldestDeed() == null ? 0 : this.getOldestDeed().hashCode() );
         result = 37 * result + ( getNumLien() == null ? 0 : this.getNumLien().hashCode() );
         result = 37 * result + ( getValLien() == null ? 0 : this.getValLien().hashCode() );
         result = 37 * result + ( getMaxValLien() == null ? 0 : this.getMaxValLien().hashCode() );
         result = 37 * result + ( getMinValLien() == null ? 0 : this.getMinValLien().hashCode() );
         result = 37 * result + ( getNewestLien() == null ? 0 : this.getNewestLien().hashCode() );
         result = 37 * result + ( getOldestLien() == null ? 0 : this.getOldestLien().hashCode() );
         result = 37 * result + ( getNumLis() == null ? 0 : this.getNumLis().hashCode() );
         result = 37 * result + ( getValLis() == null ? 0 : this.getValLis().hashCode() );
         result = 37 * result + ( getMaxValLis() == null ? 0 : this.getMaxValLis().hashCode() );
         result = 37 * result + ( getMinValLis() == null ? 0 : this.getMinValLis().hashCode() );
         result = 37 * result + ( getNewestLis() == null ? 0 : this.getNewestLis().hashCode() );
         result = 37 * result + ( getOldestLis() == null ? 0 : this.getOldestLis().hashCode() );
         result = 37 * result + ( getNumAssignment() == null ? 0 : this.getNumAssignment().hashCode() );
         result = 37 * result + ( getValAssignment() == null ? 0 : this.getValAssignment().hashCode() );
         result = 37 * result + ( getMaxValAssignment() == null ? 0 : this.getMaxValAssignment().hashCode() );
         result = 37 * result + ( getMinValAssignment() == null ? 0 : this.getMinValAssignment().hashCode() );
         result = 37 * result + ( getNewestAssignment() == null ? 0 : this.getNewestAssignment().hashCode() );
         result = 37 * result + ( getOldestAssignment() == null ? 0 : this.getOldestAssignment().hashCode() );
         result = 37 * result + ( getNumQuit() == null ? 0 : this.getNumQuit().hashCode() );
         result = 37 * result + ( getValQuit() == null ? 0 : this.getValQuit().hashCode() );
         result = 37 * result + ( getMaxValQuit() == null ? 0 : this.getMaxValQuit().hashCode() );
         result = 37 * result + ( getMinValQuit() == null ? 0 : this.getMinValQuit().hashCode() );
         result = 37 * result + ( getNewestQuit() == null ? 0 : this.getNewestQuit().hashCode() );
         result = 37 * result + ( getOldestQuit() == null ? 0 : this.getOldestQuit().hashCode() );
         result = 37 * result + ( getNumForeclosure() == null ? 0 : this.getNumForeclosure().hashCode() );
         result = 37 * result + ( getValForeclosure() == null ? 0 : this.getValForeclosure().hashCode() );
         result = 37 * result + ( getMaxValForeclosure() == null ? 0 : this.getMaxValForeclosure().hashCode() );
         result = 37 * result + ( getMinValForeclosure() == null ? 0 : this.getMinValForeclosure().hashCode() );
         result = 37 * result + ( getNewestForeclosure() == null ? 0 : this.getNewestForeclosure().hashCode() );
         result = 37 * result + ( getOldestForeclosure() == null ? 0 : this.getOldestForeclosure().hashCode() );
         result = 37 * result + ( getNumRents() == null ? 0 : this.getNumRents().hashCode() );
         result = 37 * result + ( getValRents() == null ? 0 : this.getValRents().hashCode() );
         result = 37 * result + ( getMaxValRents() == null ? 0 : this.getMaxValRents().hashCode() );
         result = 37 * result + ( getMinValRents() == null ? 0 : this.getMinValRents().hashCode() );
         result = 37 * result + ( getNewestRents() == null ? 0 : this.getNewestRents().hashCode() );
         result = 37 * result + ( getOldestRents() == null ? 0 : this.getOldestRents().hashCode() );
         result = 37 * result + ( getNumBuilding() == null ? 0 : this.getNumBuilding().hashCode() );
         result = 37 * result + ( getValBuilding() == null ? 0 : this.getValBuilding().hashCode() );
         result = 37 * result + ( getMaxValBuilding() == null ? 0 : this.getMaxValBuilding().hashCode() );
         result = 37 * result + ( getMinValBuilding() == null ? 0 : this.getMinValBuilding().hashCode() );
         result = 37 * result + ( getNewestBuilding() == null ? 0 : this.getNewestBuilding().hashCode() );
         result = 37 * result + ( getOldestBuilding() == null ? 0 : this.getOldestBuilding().hashCode() );

         return result;
    }


}

