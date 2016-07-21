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

import com.portal.platform.TaxHistory;

/**
 * Service object for domain model class TaxHistory.
 *
 * @see {@link TaxHistory}
 */
public interface TaxHistoryService {


	/**
	 * Finds TaxHistory by id.
	 *
	 * @param taxHistoryId The id of the wanted TaxHistory.
	 * @return The found TaxHistory. If no TaxHistory is found, this method returns null.
	 */
	TaxHistory getById(Integer taxHistoryId) throws EntityNotFoundException;

	/**
	 * Finds all TaxHistories.
	 *
	 * @return A list of TaxHistories.
	 */
    @Deprecated
	Page<TaxHistory> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Finds all TaxHistories.
	 * @return A list of TaxHistories.
	 */
    Page<TaxHistory> findAll(String query, Pageable pageable);

    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the TaxHistories in the repository with matching query.
     *
     * @param query query to filter results.
	 * @return The count of the TaxHistory.
	 */
	long count(String query);

    Page<TaxHistory> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);

}

