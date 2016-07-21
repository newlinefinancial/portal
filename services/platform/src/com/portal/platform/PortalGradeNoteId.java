/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class PortalGradeNoteId implements Serializable {

    private int gradeId;
    private int noteId;
    private String user;
    private Date created;
    private Date done;
    private String noteDescription;
    private int noteTypeId;

    public int getGradeId() {
        return this.gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public int getNoteId() {
        return this.noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getDone() {
        return this.done;
    }

    public void setDone(Date done) {
        this.done = done;
    }

    public String getNoteDescription() {
        return this.noteDescription;
    }

    public void setNoteDescription(String noteDescription) {
        this.noteDescription = noteDescription;
    }

    public int getNoteTypeId() {
        return this.noteTypeId;
    }

    public void setNoteTypeId(int noteTypeId) {
        this.noteTypeId = noteTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PortalGradeNote)) return false;
        final PortalGradeNote portalGradeNote = (PortalGradeNote) o;
        return Objects.equals(getGradeId(), portalGradeNote.getGradeId()) &&
                Objects.equals(getNoteId(), portalGradeNote.getNoteId()) &&
                Objects.equals(getUser(), portalGradeNote.getUser()) &&
                Objects.equals(getCreated(), portalGradeNote.getCreated()) &&
                Objects.equals(getDone(), portalGradeNote.getDone()) &&
                Objects.equals(getNoteDescription(), portalGradeNote.getNoteDescription()) &&
                Objects.equals(getNoteTypeId(), portalGradeNote.getNoteTypeId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGradeId(),
                getNoteId(),
                getUser(),
                getCreated(),
                getDone(),
                getNoteDescription(),
                getNoteTypeId());
    }
}
