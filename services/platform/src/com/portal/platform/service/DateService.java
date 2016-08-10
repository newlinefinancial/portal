/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.file.model.Downloadable;

import com.portal.platform.Date;

/**
 * Service object for domain model class Date.
 *
 * @see {@link Date}
 */
public interface DateService {

    /**
     * Creates a new Date.
     *
     * @param date The information of the created CompositeTable.
     * @return The created Date.
     */
	Date create(Date date);


	/**
	 * Finds Date by id.
	 *
	 * @param dateId The id of the wanted Date.
	 * @return The found Date. If no Date is found, this method returns null.
	 */
	Date getById(java.util.Date dateId) throws EntityNotFoundException;

	/**
	 * Updates the information of a Date.
	 *
	 * @param date The information of the updated Date.
	 * @return The updated Date.
     *
	 * @throws EntityNotFoundException if no Date is found with given id.
	 */
	Date update(Date date) throws EntityNotFoundException;

    /**
	 * Deletes a Date.
	 *
	 * @param dateId The id of the deleted Date.
	 * @return The deleted Date.
     *
	 * @throws EntityNotFoundException if no Date is found with the given id.
	 */
	Date delete(java.util.Date dateId) throws EntityNotFoundException;

	/**
	 * Finds all Dates.
	 *
	 * @return A list of Dates.
	 */
    @Deprecated
	Page<Date> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Finds all Dates.
	 * @return A list of Dates.
	 */
    Page<Date> findAll(String query, Pageable pageable);

    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the Dates in the repository with matching query.
     *
     * @param query query to filter results.
	 * @return The count of the Date.
	 */
	long count(String query);

    Page<Date> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);

}
