/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NumberTable generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`number`", schema = "dbo")
public class NumberTable implements Serializable {

    private int number;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`number`", nullable = false, scale = 0, precision = 10)
    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NumberTable)) return false;
        final NumberTable numberTable = (NumberTable) o;
        return Objects.equals(getNumber(), numberTable.getNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber());
    }
}

