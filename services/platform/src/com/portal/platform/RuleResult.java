/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * RuleResult generated by hbm2java
 */
@Entity
@Table(name="`rule_result`"
    ,schema="review"
)

public class RuleResult  implements java.io.Serializable {

    
    private Integer id;
    
    private Integer auctionId;
    
    private Date batch;
    
    private String inputs;
    
    private String rules;
    
    private String underwritingStatus;

    public RuleResult() {
    }


    @Id @GeneratedValue(strategy=IDENTITY)
    

    @Column(name="`id`", precision=10)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    

    @Column(name="`auction_id`", precision=10)
    public Integer getAuctionId() {
        return this.auctionId;
    }
    
    public void setAuctionId(Integer auctionId) {
        this.auctionId = auctionId;
    }

    @Temporal(TemporalType.TIMESTAMP)

    @Column(name="`batch`", length=23)
    public Date getBatch() {
        return this.batch;
    }
    
    public void setBatch(Date batch) {
        this.batch = batch;
    }

    

    @Column(name="`inputs`")
    public String getInputs() {
        return this.inputs;
    }
    
    public void setInputs(String inputs) {
        this.inputs = inputs;
    }

    

    @Column(name="`rules`")
    public String getRules() {
        return this.rules;
    }
    
    public void setRules(String rules) {
        this.rules = rules;
    }

    

    @Column(name="`underwriting_status`", length=50)
    public String getUnderwritingStatus() {
        return this.underwritingStatus;
    }
    
    public void setUnderwritingStatus(String underwritingStatus) {
        this.underwritingStatus = underwritingStatus;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof RuleResult) )
		    return false;

		 RuleResult that = (RuleResult) o;

		 return ( (this.getId()==that.getId()) || ( this.getId()!=null && that.getId()!=null && this.getId().equals(that.getId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );

         return result;
    }


}

