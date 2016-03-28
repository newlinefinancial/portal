/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
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
 * PortalInspectFilter generated by hbm2java
 */
@Entity
@Table(name="`portal_inspect_filter`"
    ,schema="review"
)
@IdClass(value=PortalInspectFilterId.class)
public class PortalInspectFilter  implements java.io.Serializable {

    
    private String dropDown;
    
    private Integer order;
    
    private Integer inspected;
    
    private Integer inspId;
    
    private Integer propertyId;
    
    private Integer auctionId;
    
    private String pin;
    
    private String latlong;
    
    private String address;

    public PortalInspectFilter() {
    }


    @Id 
    

    @Column(name="`drop_down`", insertable=false, updatable=false, length=50)
    public String getDropDown() {
        return this.dropDown;
    }
    
    public void setDropDown(String dropDown) {
        this.dropDown = dropDown;
    }
    @Id 
    

    @Column(name="`order`", insertable=false, updatable=false, precision=10)
    public Integer getOrder() {
        return this.order;
    }
    
    public void setOrder(Integer order) {
        this.order = order;
    }
    @Id 
    

    @Column(name="`inspected`", insertable=false, updatable=false, precision=10)
    public Integer getInspected() {
        return this.inspected;
    }
    
    public void setInspected(Integer inspected) {
        this.inspected = inspected;
    }
    @Id 
    

    @Column(name="`insp_id`", insertable=false, updatable=false, precision=10)
    public Integer getInspId() {
        return this.inspId;
    }
    
    public void setInspId(Integer inspId) {
        this.inspId = inspId;
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
    

    @Column(name="`auction_id`", insertable=false, updatable=false, precision=10)
    public Integer getAuctionId() {
        return this.auctionId;
    }
    
    public void setAuctionId(Integer auctionId) {
        this.auctionId = auctionId;
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
    

    @Column(name="`latlong`", insertable=false, updatable=false, length=83)
    public String getLatlong() {
        return this.latlong;
    }
    
    public void setLatlong(String latlong) {
        this.latlong = latlong;
    }
    @Id 
    

    @Column(name="`address`", insertable=false, updatable=false, length=672)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof PortalInspectFilter) )
		    return false;

		 PortalInspectFilter that = (PortalInspectFilter) o;

         return ( (this.getDropDown()==that.getDropDown()) || ( this.getDropDown()!=null && that.getDropDown()!=null && this.getDropDown().equals(that.getDropDown()) ) )
 && ( (this.getOrder()==that.getOrder()) || ( this.getOrder()!=null && that.getOrder()!=null && this.getOrder().equals(that.getOrder()) ) )
 && ( (this.getInspected()==that.getInspected()) || ( this.getInspected()!=null && that.getInspected()!=null && this.getInspected().equals(that.getInspected()) ) )
 && ( (this.getInspId()==that.getInspId()) || ( this.getInspId()!=null && that.getInspId()!=null && this.getInspId().equals(that.getInspId()) ) )
 && ( (this.getPropertyId()==that.getPropertyId()) || ( this.getPropertyId()!=null && that.getPropertyId()!=null && this.getPropertyId().equals(that.getPropertyId()) ) )
 && ( (this.getAuctionId()==that.getAuctionId()) || ( this.getAuctionId()!=null && that.getAuctionId()!=null && this.getAuctionId().equals(that.getAuctionId()) ) )
 && ( (this.getPin()==that.getPin()) || ( this.getPin()!=null && that.getPin()!=null && this.getPin().equals(that.getPin()) ) )
 && ( (this.getLatlong()==that.getLatlong()) || ( this.getLatlong()!=null && that.getLatlong()!=null && this.getLatlong().equals(that.getLatlong()) ) )
 && ( (this.getAddress()==that.getAddress()) || ( this.getAddress()!=null && that.getAddress()!=null && this.getAddress().equals(that.getAddress()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getDropDown() == null ? 0 : this.getDropDown().hashCode() );
         result = 37 * result + ( getOrder() == null ? 0 : this.getOrder().hashCode() );
         result = 37 * result + ( getInspected() == null ? 0 : this.getInspected().hashCode() );
         result = 37 * result + ( getInspId() == null ? 0 : this.getInspId().hashCode() );
         result = 37 * result + ( getPropertyId() == null ? 0 : this.getPropertyId().hashCode() );
         result = 37 * result + ( getAuctionId() == null ? 0 : this.getAuctionId().hashCode() );
         result = 37 * result + ( getPin() == null ? 0 : this.getPin().hashCode() );
         result = 37 * result + ( getLatlong() == null ? 0 : this.getLatlong().hashCode() );
         result = 37 * result + ( getAddress() == null ? 0 : this.getAddress().hashCode() );

         return result;
    }


}

