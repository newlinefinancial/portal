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

import com.portal.platform.CertificateParty;

/**
 * Service object for domain model class CertificateParty.
 *
 * @see {@link CertificateParty}
 */
public interface CertificatePartyService {


	/**
	 * Finds CertificateParty by id.
	 *
	 * @param certificatePartyId The id of the wanted CertificateParty.
	 * @return The found CertificateParty. If no CertificateParty is found, this method returns null.
	 */
	CertificateParty getById(Integer certificatePartyId) throws EntityNotFoundException;

	/**
	 * Finds all CertificateParties.
	 *
	 * @return A list of CertificateParties.
	 */
    @Deprecated
	Page<CertificateParty> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Finds all CertificateParties.
	 * @return A list of CertificateParties.
	 */
    Page<CertificateParty> findAll(String query, Pageable pageable);

    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the CertificateParties in the repository with matching query.
     *
     * @param query query to filter results.
	 * @return The count of the CertificateParty.
	 */
	long count(String query);

    Page<CertificateParty> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);

}

