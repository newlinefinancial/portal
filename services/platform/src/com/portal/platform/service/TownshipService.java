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

import com.portal.platform.Township;

/**
 * Service object for domain model class Township.
 *
 * @see {@link Township}
 */
public interface TownshipService {


	/**
	 * Finds Township by id.
	 *
	 * @param townshipId The id of the wanted Township.
	 * @return The found Township. If no Township is found, this method returns null.
	 */
	Township getById(Integer townshipId) throws EntityNotFoundException;

	/**
	 * Finds all Townships.
	 *
	 * @return A list of Townships.
	 */
    @Deprecated
	Page<Township> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Finds all Townships.
	 * @return A list of Townships.
	 */
    Page<Township> findAll(String query, Pageable pageable);

    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the Townships in the repository with matching query.
     *
     * @param query query to filter results.
	 * @return The count of the Township.
	 */
	long count(String query);

    Page<Township> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);

}

