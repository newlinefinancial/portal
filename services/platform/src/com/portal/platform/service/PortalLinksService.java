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

import com.portal.platform.PortalLinks;
import com.portal.platform.PortalLinksId;

/**
 * Service object for domain model class PortalLinks.
 *
 * @see {@link PortalLinks}
 */
public interface PortalLinksService {


	/**
	 * Finds PortalLinks by id.
	 *
	 * @param portalLinksId The id of the wanted PortalLinks.
	 * @return The found PortalLinks. If no PortalLinks is found, this method returns null.
	 */
	PortalLinks getById(PortalLinksId portalLinksId) throws EntityNotFoundException;

	/**
	 * Finds all PortalLinks.
	 *
	 * @return A list of PortalLinks.
	 */
    @Deprecated
	Page<PortalLinks> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Finds all PortalLinks.
	 * @return A list of PortalLinks.
	 */
    Page<PortalLinks> findAll(String query, Pageable pageable);

    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the PortalLinks in the repository with matching query.
     *
     * @param query query to filter results.
	 * @return The count of the PortalLinks.
	 */
	long count(String query);

    Page<PortalLinks> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);

}

