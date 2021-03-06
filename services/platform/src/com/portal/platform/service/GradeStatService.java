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

import com.portal.platform.GradeStat;

/**
 * Service object for domain model class GradeStat.
 *
 * @see {@link GradeStat}
 */
public interface GradeStatService {


	/**
	 * Finds GradeStat by id.
	 *
	 * @param gradeStatId The id of the wanted GradeStat.
	 * @return The found GradeStat. If no GradeStat is found, this method returns null.
	 */
	GradeStat getById(Integer gradeStatId) throws EntityNotFoundException;

	/**
	 * Finds all GradeStats.
	 *
	 * @return A list of GradeStats.
	 */
    @Deprecated
	Page<GradeStat> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Finds all GradeStats.
	 * @return A list of GradeStats.
	 */
    Page<GradeStat> findAll(String query, Pageable pageable);

    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the GradeStats in the repository with matching query.
     *
     * @param query query to filter results.
	 * @return The count of the GradeStat.
	 */
	long count(String query);

    Page<GradeStat> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);

}

