/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * MatterParty generated by hbm2java
 */
@Entity
@Table(name="`matter_party`"
    ,schema="servicing"
)

public class MatterParty  implements java.io.Serializable {

    
    private Integer id;
    
    private String serviceType;
    
    private String service1Status;
    
    private String service1Reference;
    
    private String service2Flag;
    
    private String service2Status;
    
    private String service2Reference;
    
    private String service3Flag;
    
    private String service3Status;
    
    private String service3Reference;
    
    private InterestType interestTypeByInterestType3;
    
    private InterestType interestTypeByInterestType2;
    
    private InterestType interestTypeByInterestType1;
    
    private Matter matter;
    
    private Party party;

    public MatterParty() {
    }


    @Id @GeneratedValue(strategy=IDENTITY)
    

    @Column(name="`id`", precision=10)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    

    @Column(name="`service_type`", length=50)
    public String getServiceType() {
        return this.serviceType;
    }
    
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    

    @Column(name="`service1_status`", length=50)
    public String getService1Status() {
        return this.service1Status;
    }
    
    public void setService1Status(String service1Status) {
        this.service1Status = service1Status;
    }

    

    @Column(name="`service1_reference`", length=50)
    public String getService1Reference() {
        return this.service1Reference;
    }
    
    public void setService1Reference(String service1Reference) {
        this.service1Reference = service1Reference;
    }

    

    @Column(name="`service2_flag`", length=50)
    public String getService2Flag() {
        return this.service2Flag;
    }
    
    public void setService2Flag(String service2Flag) {
        this.service2Flag = service2Flag;
    }

    

    @Column(name="`service2_status`", length=50)
    public String getService2Status() {
        return this.service2Status;
    }
    
    public void setService2Status(String service2Status) {
        this.service2Status = service2Status;
    }

    

    @Column(name="`service2_reference`", length=50)
    public String getService2Reference() {
        return this.service2Reference;
    }
    
    public void setService2Reference(String service2Reference) {
        this.service2Reference = service2Reference;
    }

    

    @Column(name="`service3_flag`", length=50)
    public String getService3Flag() {
        return this.service3Flag;
    }
    
    public void setService3Flag(String service3Flag) {
        this.service3Flag = service3Flag;
    }

    

    @Column(name="`service3_status`", length=50)
    public String getService3Status() {
        return this.service3Status;
    }
    
    public void setService3Status(String service3Status) {
        this.service3Status = service3Status;
    }

    

    @Column(name="`service3_reference`", length=50)
    public String getService3Reference() {
        return this.service3Reference;
    }
    
    public void setService3Reference(String service3Reference) {
        this.service3Reference = service3Reference;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`interest_type3`")
    public InterestType getInterestTypeByInterestType3() {
        return this.interestTypeByInterestType3;
    }
    
    public void setInterestTypeByInterestType3(InterestType interestTypeByInterestType3) {
        this.interestTypeByInterestType3 = interestTypeByInterestType3;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`interest_type2`")
    public InterestType getInterestTypeByInterestType2() {
        return this.interestTypeByInterestType2;
    }
    
    public void setInterestTypeByInterestType2(InterestType interestTypeByInterestType2) {
        this.interestTypeByInterestType2 = interestTypeByInterestType2;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`interest_type1`")
    public InterestType getInterestTypeByInterestType1() {
        return this.interestTypeByInterestType1;
    }
    
    public void setInterestTypeByInterestType1(InterestType interestTypeByInterestType1) {
        this.interestTypeByInterestType1 = interestTypeByInterestType1;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`matter_id`")
    public Matter getMatter() {
        return this.matter;
    }
    
    public void setMatter(Matter matter) {
        this.matter = matter;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="`party_id`")
    public Party getParty() {
        return this.party;
    }
    
    public void setParty(Party party) {
        this.party = party;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof MatterParty) )
		    return false;

		 MatterParty that = (MatterParty) o;

		 return ( (this.getId()==that.getId()) || ( this.getId()!=null && that.getId()!=null && this.getId().equals(that.getId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );

         return result;
    }


}

