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

import com.portal.platform.Accounting;
import com.portal.platform.AccountingId;

/**
 * Service object for domain model class Accounting.
 *
 * @see {@link Accounting}
 */
public interface AccountingService {


	/**
	 * Finds Accounting by id.
	 *
	 * @param accountingId The id of the wanted Accounting.
	 * @return The found Accounting. If no Accounting is found, this method returns null.
	 */
	Accounting getById(AccountingId accountingId) throws EntityNotFoundException;

	/**
	 * Finds all Accountings.
	 *
	 * @return A list of Accountings.
	 */
    @Deprecated
	Page<Accounting> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Finds all Accountings.
	 * @return A list of Accountings.
	 */
    Page<Accounting> findAll(String query, Pageable pageable);

    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the Accountings in the repository with matching query.
     *
     * @param query query to filter results.
	 * @return The count of the Accounting.
	 */
	long count(String query);

    Page<Accounting> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);

}

