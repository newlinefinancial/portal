/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * State generated by hbm2java
 */
@Entity
@Table(name="`state`"
    ,schema="data"
)

public class State  implements java.io.Serializable {

    
    private Integer id;
    
    private String state;
    
    private String interestType;
    
    private String frequency;
    
    private Integer certPeriod;
    
    private Integer subPeriod;
    
    private BigDecimal subRate;
    
    private Integer termMonths;
    
    private Set<County> counties = new HashSet<County>(0);

    public State() {
    }


    @Id @GeneratedValue(strategy=IDENTITY)
    

    @Column(name="`id`", precision=10)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    

    @Column(name="`state`", length=2)
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }

    

    @Column(name="`interest_type`", length=9)
    public String getInterestType() {
        return this.interestType;
    }
    
    public void setInterestType(String interestType) {
        this.interestType = interestType;
    }

    

    @Column(name="`frequency`", length=2)
    public String getFrequency() {
        return this.frequency;
    }
    
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    

    @Column(name="`cert_period`", precision=10)
    public Integer getCertPeriod() {
        return this.certPeriod;
    }
    
    public void setCertPeriod(Integer certPeriod) {
        this.certPeriod = certPeriod;
    }

    

    @Column(name="`sub_period`", precision=10)
    public Integer getSubPeriod() {
        return this.subPeriod;
    }
    
    public void setSubPeriod(Integer subPeriod) {
        this.subPeriod = subPeriod;
    }

    

    @Column(name="`sub_rate`", precision=53, scale=9)
    public BigDecimal getSubRate() {
        return this.subRate;
    }
    
    public void setSubRate(BigDecimal subRate) {
        this.subRate = subRate;
    }

    

    @Column(name="`term_months`", precision=10)
    public Integer getTermMonths() {
        return this.termMonths;
    }
    
    public void setTermMonths(Integer termMonths) {
        this.termMonths = termMonths;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="state")
    public Set<County> getCounties() {
        return this.counties;
    }
    
    public void setCounties(Set<County> counties) {
        this.counties = counties;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof State) )
		    return false;

		 State that = (State) o;

		 return ( (this.getId()==that.getId()) || ( this.getId()!=null && that.getId()!=null && this.getId().equals(that.getId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );

         return result;
    }


}

