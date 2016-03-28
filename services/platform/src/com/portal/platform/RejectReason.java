/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
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
 * RejectReason generated by hbm2java
 */
@Entity
@Table(name="`reject_reason`"
    ,schema="review"
)

public class RejectReason  implements java.io.Serializable {

    
    private Integer id;
    
    private String rejectReason;
    
    private String type;
    
    private Integer noteTypeId;
    
    private Integer newNoteTypeId;
    
    private Set<Inspection> inspections = new HashSet<Inspection>(0);

    public RejectReason() {
    }


    @Id @GeneratedValue(strategy=IDENTITY)
    

    @Column(name="`Id`", precision=10)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    

    @Column(name="`reject_reason`", length=50)
    public String getRejectReason() {
        return this.rejectReason;
    }
    
    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    

    @Column(name="`type`", length=50)
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    

    @Column(name="`note_type_id`", precision=10)
    public Integer getNoteTypeId() {
        return this.noteTypeId;
    }
    
    public void setNoteTypeId(Integer noteTypeId) {
        this.noteTypeId = noteTypeId;
    }

    

    @Column(name="`new_note_type_id`", precision=10)
    public Integer getNewNoteTypeId() {
        return this.newNoteTypeId;
    }
    
    public void setNewNoteTypeId(Integer newNoteTypeId) {
        this.newNoteTypeId = newNoteTypeId;
    }

    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="rejectReason")
    public Set<Inspection> getInspections() {
        return this.inspections;
    }
    
    public void setInspections(Set<Inspection> inspections) {
        this.inspections = inspections;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof RejectReason) )
		    return false;

		 RejectReason that = (RejectReason) o;

		 return ( (this.getId()==that.getId()) || ( this.getId()!=null && that.getId()!=null && this.getId().equals(that.getId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );

         return result;
    }


}

