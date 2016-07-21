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

import com.portal.platform.AuctionStat;
import com.portal.platform.AuctionStatId;

/**
 * Service object for domain model class AuctionStat.
 *
 * @see {@link AuctionStat}
 */
public interface AuctionStatService {


	/**
	 * Finds AuctionStat by id.
	 *
	 * @param auctionStatId The id of the wanted AuctionStat.
	 * @return The found AuctionStat. If no AuctionStat is found, this method returns null.
	 */
	AuctionStat getById(AuctionStatId auctionStatId) throws EntityNotFoundException;

	/**
	 * Finds all AuctionStats.
	 *
	 * @return A list of AuctionStats.
	 */
    @Deprecated
	Page<AuctionStat> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Finds all AuctionStats.
	 * @return A list of AuctionStats.
	 */
    Page<AuctionStat> findAll(String query, Pageable pageable);

    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the AuctionStats in the repository with matching query.
     *
     * @param query query to filter results.
	 * @return The count of the AuctionStat.
	 */
	long count(String query);

    Page<AuctionStat> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);

}

