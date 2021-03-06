/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * NoteType generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`note_type`", schema = "review")
public class NoteType implements Serializable {

    private int id;
    private String type;
    private String name;
    private String underwriting;
    private boolean autoGenerate;
    private Integer delay;
    private Integer duration;
    private List<Note> notes = new ArrayList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`id`", nullable = false, scale = 0, precision = 10)
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "`type`", nullable = false, length = 50)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "`name`", nullable = false, length = 50)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "`underwriting`", nullable = false, length = 50)
    public String getUnderwriting() {
        return this.underwriting;
    }

    public void setUnderwriting(String underwriting) {
        this.underwriting = underwriting;
    }

    @Column(name = "`auto_generate`", nullable = false)
    public boolean isAutoGenerate() {
        return this.autoGenerate;
    }

    public void setAutoGenerate(boolean autoGenerate) {
        this.autoGenerate = autoGenerate;
    }

    @Column(name = "`delay`", nullable = true, scale = 0, precision = 10)
    public Integer getDelay() {
        return this.delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    @Column(name = "`duration`", nullable = true, scale = 0, precision = 10)
    public Integer getDuration() {
        return this.duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "noteType")
    public List<Note> getNotes() {
        return this.notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NoteType)) return false;
        final NoteType noteType = (NoteType) o;
        return Objects.equals(getId(), noteType.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

