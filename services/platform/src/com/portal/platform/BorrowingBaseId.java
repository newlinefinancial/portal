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
 * BorrowingBaseId generated by hbm2java
 */
@Embeddable
public class BorrowingBaseId  implements java.io.Serializable {

    
    private String state;
    
    private String county;
    
    private Integer taxYear;
    
    private Double certificatePrincipal;
    
    private Double subPrincipal;
    
    private Double trustReceipt;

    public BorrowingBaseId() {
    }


    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    public String getCounty() {
        return this.county;
    }
    
    public void setCounty(String county) {
        this.county = county;
    }
    public Integer getTaxYear() {
        return this.taxYear;
    }
    
    public void setTaxYear(Integer taxYear) {
        this.taxYear = taxYear;
    }
    public Double getCertificatePrincipal() {
        return this.certificatePrincipal;
    }
    
    public void setCertificatePrincipal(Double certificatePrincipal) {
        this.certificatePrincipal = certificatePrincipal;
    }
    public Double getSubPrincipal() {
        return this.subPrincipal;
    }
    
    public void setSubPrincipal(Double subPrincipal) {
        this.subPrincipal = subPrincipal;
    }
    public Double getTrustReceipt() {
        return this.trustReceipt;
    }
    
    public void setTrustReceipt(Double trustReceipt) {
        this.trustReceipt = trustReceipt;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof BorrowingBaseId) )
		    return false;

		 BorrowingBaseId that = (BorrowingBaseId) o;

         return ( (this.getState()==that.getState()) || ( this.getState()!=null && that.getState()!=null && this.getState().equals(that.getState()) ) )
 && ( (this.getCounty()==that.getCounty()) || ( this.getCounty()!=null && that.getCounty()!=null && this.getCounty().equals(that.getCounty()) ) )
 && ( (this.getTaxYear()==that.getTaxYear()) || ( this.getTaxYear()!=null && that.getTaxYear()!=null && this.getTaxYear().equals(that.getTaxYear()) ) )
 && ( (this.getCertificatePrincipal()==that.getCertificatePrincipal()) || ( this.getCertificatePrincipal()!=null && that.getCertificatePrincipal()!=null && this.getCertificatePrincipal().equals(that.getCertificatePrincipal()) ) )
 && ( (this.getSubPrincipal()==that.getSubPrincipal()) || ( this.getSubPrincipal()!=null && that.getSubPrincipal()!=null && this.getSubPrincipal().equals(that.getSubPrincipal()) ) )
 && ( (this.getTrustReceipt()==that.getTrustReceipt()) || ( this.getTrustReceipt()!=null && that.getTrustReceipt()!=null && this.getTrustReceipt().equals(that.getTrustReceipt()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getState() == null ? 0 : this.getState().hashCode() );
         result = 37 * result + ( getCounty() == null ? 0 : this.getCounty().hashCode() );
         result = 37 * result + ( getTaxYear() == null ? 0 : this.getTaxYear().hashCode() );
         result = 37 * result + ( getCertificatePrincipal() == null ? 0 : this.getCertificatePrincipal().hashCode() );
         result = 37 * result + ( getSubPrincipal() == null ? 0 : this.getSubPrincipal().hashCode() );
         result = 37 * result + ( getTrustReceipt() == null ? 0 : this.getTrustReceipt().hashCode() );

         return result;
    }


}

