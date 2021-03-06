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

import com.portal.platform.NumberTable;

/**
 * Service object for domain model class NumberTable.
 *
 * @see {@link NumberTable}
 */
public interface NumberTableService {

    /**
     * Creates a new NumberTable.
     *
     * @param numberTable The information of the created CompositeTable.
     * @return The created NumberTable.
     */
	NumberTable create(NumberTable numberTable);


	/**
	 * Finds NumberTable by id.
	 *
	 * @param numberTableId The id of the wanted NumberTable.
	 * @return The found NumberTable. If no NumberTable is found, this method returns null.
	 */
	NumberTable getById(Integer numberTableId) throws EntityNotFoundException;

	/**
	 * Updates the information of a NumberTable.
	 *
	 * @param numberTable The information of the updated NumberTable.
	 * @return The updated NumberTable.
     *
	 * @throws EntityNotFoundException if no NumberTable is found with given id.
	 */
	NumberTable update(NumberTable numberTable) throws EntityNotFoundException;

    /**
	 * Deletes a NumberTable.
	 *
	 * @param numberTableId The id of the deleted NumberTable.
	 * @return The deleted NumberTable.
     *
	 * @throws EntityNotFoundException if no NumberTable is found with the given id.
	 */
	NumberTable delete(Integer numberTableId) throws EntityNotFoundException;

	/**
	 * Finds all NumberTables.
	 *
	 * @return A list of NumberTables.
	 */
    @Deprecated
	Page<NumberTable> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Finds all NumberTables.
	 * @return A list of NumberTables.
	 */
    Page<NumberTable> findAll(String query, Pageable pageable);

    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the NumberTables in the repository with matching query.
     *
     * @param query query to filter results.
	 * @return The count of the NumberTable.
	 */
	long count(String query);

    Page<NumberTable> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);

}

