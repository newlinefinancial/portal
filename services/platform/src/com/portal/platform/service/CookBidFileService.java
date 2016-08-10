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

import com.portal.platform.CookBidFile;
import com.portal.platform.CookBidFileId;

/**
 * Service object for domain model class CookBidFile.
 *
 * @see {@link CookBidFile}
 */
public interface CookBidFileService {


	/**
	 * Finds CookBidFile by id.
	 *
	 * @param cookBidFileId The id of the wanted CookBidFile.
	 * @return The found CookBidFile. If no CookBidFile is found, this method returns null.
	 */
	CookBidFile getById(CookBidFileId cookBidFileId) throws EntityNotFoundException;

	/**
	 * Finds all CookBidFiles.
	 *
	 * @return A list of CookBidFiles.
	 */
    @Deprecated
	Page<CookBidFile> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Finds all CookBidFiles.
	 * @return A list of CookBidFiles.
	 */
    Page<CookBidFile> findAll(String query, Pageable pageable);

    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the CookBidFiles in the repository with matching query.
     *
     * @param query query to filter results.
	 * @return The count of the CookBidFile.
	 */
	long count(String query);

    Page<CookBidFile> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);

}

