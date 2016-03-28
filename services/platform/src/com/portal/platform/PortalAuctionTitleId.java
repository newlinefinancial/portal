/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Embeddable;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * PortalAuctionTitleId generated by hbm2java
 */
@Embeddable
public class PortalAuctionTitleId  implements java.io.Serializable {

    
    private Double consideration;
    
    private java.util.Date date;
    
    private String docNumber;
    
    private String grantee;
    
    private String grantor;
    
    private Integer id;
    
    private Integer propertyId;
    
    private String titleType;
    
    private String category;
    
    private String name;

    public PortalAuctionTitleId() {
    }


    public Double getConsideration() {
        return this.consideration;
    }
    
    public void setConsideration(Double consideration) {
        this.consideration = consideration;
    }
    public java.util.Date getDate() {
        return this.date;
    }
    
    public void setDate(java.util.Date date) {
        this.date = date;
    }
    public String getDocNumber() {
        return this.docNumber;
    }
    
    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }
    public String getGrantee() {
        return this.grantee;
    }
    
    public void setGrantee(String grantee) {
        this.grantee = grantee;
    }
    public String getGrantor() {
        return this.grantor;
    }
    
    public void setGrantor(String grantor) {
        this.grantor = grantor;
    }
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getPropertyId() {
        return this.propertyId;
    }
    
    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }
    public String getTitleType() {
        return this.titleType;
    }
    
    public void setTitleType(String titleType) {
        this.titleType = titleType;
    }
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof PortalAuctionTitleId) )
		    return false;

		 PortalAuctionTitleId that = (PortalAuctionTitleId) o;

         return ( (this.getConsideration()==that.getConsideration()) || ( this.getConsideration()!=null && that.getConsideration()!=null && this.getConsideration().equals(that.getConsideration()) ) )
 && ( (this.getDate()==that.getDate()) || ( this.getDate()!=null && that.getDate()!=null && this.getDate().equals(that.getDate()) ) )
 && ( (this.getDocNumber()==that.getDocNumber()) || ( this.getDocNumber()!=null && that.getDocNumber()!=null && this.getDocNumber().equals(that.getDocNumber()) ) )
 && ( (this.getGrantee()==that.getGrantee()) || ( this.getGrantee()!=null && that.getGrantee()!=null && this.getGrantee().equals(that.getGrantee()) ) )
 && ( (this.getGrantor()==that.getGrantor()) || ( this.getGrantor()!=null && that.getGrantor()!=null && this.getGrantor().equals(that.getGrantor()) ) )
 && ( (this.getId()==that.getId()) || ( this.getId()!=null && that.getId()!=null && this.getId().equals(that.getId()) ) )
 && ( (this.getPropertyId()==that.getPropertyId()) || ( this.getPropertyId()!=null && that.getPropertyId()!=null && this.getPropertyId().equals(that.getPropertyId()) ) )
 && ( (this.getTitleType()==that.getTitleType()) || ( this.getTitleType()!=null && that.getTitleType()!=null && this.getTitleType().equals(that.getTitleType()) ) )
 && ( (this.getCategory()==that.getCategory()) || ( this.getCategory()!=null && that.getCategory()!=null && this.getCategory().equals(that.getCategory()) ) )
 && ( (this.getName()==that.getName()) || ( this.getName()!=null && that.getName()!=null && this.getName().equals(that.getName()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getConsideration() == null ? 0 : this.getConsideration().hashCode() );
         result = 37 * result + ( getDate() == null ? 0 : this.getDate().hashCode() );
         result = 37 * result + ( getDocNumber() == null ? 0 : this.getDocNumber().hashCode() );
         result = 37 * result + ( getGrantee() == null ? 0 : this.getGrantee().hashCode() );
         result = 37 * result + ( getGrantor() == null ? 0 : this.getGrantor().hashCode() );
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getPropertyId() == null ? 0 : this.getPropertyId().hashCode() );
         result = 37 * result + ( getTitleType() == null ? 0 : this.getTitleType().hashCode() );
         result = 37 * result + ( getCategory() == null ? 0 : this.getCategory().hashCode() );
         result = 37 * result + ( getName() == null ? 0 : this.getName().hashCode() );

         return result;
    }


}

