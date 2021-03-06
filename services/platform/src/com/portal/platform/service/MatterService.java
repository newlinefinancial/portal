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

import com.portal.platform.Matter;

/**
 * Service object for domain model class Matter.
 *
 * @see {@link Matter}
 */
public interface MatterService {


	/**
	 * Finds Matter by id.
	 *
	 * @param matterId The id of the wanted Matter.
	 * @return The found Matter. If no Matter is found, this method returns null.
	 */
	Matter getById(Integer matterId) throws EntityNotFoundException;

	/**
	 * Finds all Matters.
	 *
	 * @return A list of Matters.
	 */
    @Deprecated
	Page<Matter> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Finds all Matters.
	 * @return A list of Matters.
	 */
    Page<Matter> findAll(String query, Pageable pageable);

    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the Matters in the repository with matching query.
     *
     * @param query query to filter results.
	 * @return The count of the Matter.
	 */
	long count(String query);

    Page<Matter> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);

}

