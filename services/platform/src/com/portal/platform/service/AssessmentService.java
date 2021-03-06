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

import com.portal.platform.Assessment;

/**
 * Service object for domain model class Assessment.
 *
 * @see {@link Assessment}
 */
public interface AssessmentService {


	/**
	 * Finds Assessment by id.
	 *
	 * @param assessmentId The id of the wanted Assessment.
	 * @return The found Assessment. If no Assessment is found, this method returns null.
	 */
	Assessment getById(Integer assessmentId) throws EntityNotFoundException;

	/**
	 * Finds all Assessments.
	 *
	 * @return A list of Assessments.
	 */
    @Deprecated
	Page<Assessment> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Finds all Assessments.
	 * @return A list of Assessments.
	 */
    Page<Assessment> findAll(String query, Pageable pageable);

    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the Assessments in the repository with matching query.
     *
     * @param query query to filter results.
	 * @return The count of the Assessment.
	 */
	long count(String query);

    Page<Assessment> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);

}

