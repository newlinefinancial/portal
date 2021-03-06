/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PortalCertificateNote generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`portal_certificate_note`", schema = "review")
@IdClass(PortalCertificateNoteId.class)
public class PortalCertificateNote implements Serializable {

    private int noteId;
    private int certificateId;
    private String user;
    private java.util.Date created;
    private java.util.Date due;
    private java.util.Date done;
    private String noteDescription;
    private int noteTypeId;

    @Id
    @Column(name = "`note_id`", nullable = false, scale = 0, precision = 10)
    public int getNoteId() {
        return this.noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    @Id
    @Column(name = "`certificate_id`", nullable = false, scale = 0, precision = 10)
    public int getCertificateId() {
        return this.certificateId;
    }

    public void setCertificateId(int certificateId) {
        this.certificateId = certificateId;
    }

    @Id
    @Column(name = "`user`", nullable = false, length = 10)
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Id
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "`created`", nullable = false)
    public java.util.Date getCreated() {
        return this.created;
    }

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    @Id
    @Temporal(TemporalType.DATE)
    @Column(name = "`due`", nullable = true)
    public java.util.Date getDue() {
        return this.due;
    }

    public void setDue(java.util.Date due) {
        this.due = due;
    }

    @Id
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "`done`", nullable = true)
    public java.util.Date getDone() {
        return this.done;
    }

    public void setDone(java.util.Date done) {
        this.done = done;
    }

    @Id
    @Column(name = "`note_description`", nullable = false, length = 255)
    public String getNoteDescription() {
        return this.noteDescription;
    }

    public void setNoteDescription(String noteDescription) {
        this.noteDescription = noteDescription;
    }

    @Id
    @Column(name = "`note_type_id`", nullable = false, scale = 0, precision = 10)
    public int getNoteTypeId() {
        return this.noteTypeId;
    }

    public void setNoteTypeId(int noteTypeId) {
        this.noteTypeId = noteTypeId;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PortalCertificateNote)) return false;
        final PortalCertificateNote portalCertificateNote = (PortalCertificateNote) o;
        return Objects.equals(getNoteId(), portalCertificateNote.getNoteId()) &&
                Objects.equals(getCertificateId(), portalCertificateNote.getCertificateId()) &&
                Objects.equals(getUser(), portalCertificateNote.getUser()) &&
                Objects.equals(getCreated(), portalCertificateNote.getCreated()) &&
                Objects.equals(getDue(), portalCertificateNote.getDue()) &&
                Objects.equals(getDone(), portalCertificateNote.getDone()) &&
                Objects.equals(getNoteDescription(), portalCertificateNote.getNoteDescription()) &&
                Objects.equals(getNoteTypeId(), portalCertificateNote.getNoteTypeId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNoteId(),
                getCertificateId(),
                getUser(),
                getCreated(),
                getDue(),
                getDone(),
                getNoteDescription(),
                getNoteTypeId());
    }
}

