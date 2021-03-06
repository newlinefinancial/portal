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

import com.portal.platform.PortalCertificateAddress;
import com.portal.platform.PortalCertificateAddressId;

/**
 * Service object for domain model class PortalCertificateAddress.
 *
 * @see {@link PortalCertificateAddress}
 */
public interface PortalCertificateAddressService {


	/**
	 * Finds PortalCertificateAddress by id.
	 *
	 * @param portalCertificateAddressId The id of the wanted PortalCertificateAddress.
	 * @return The found PortalCertificateAddress. If no PortalCertificateAddress is found, this method returns null.
	 */
	PortalCertificateAddress getById(PortalCertificateAddressId portalCertificateAddressId) throws EntityNotFoundException;

	/**
	 * Finds all PortalCertificateAddresses.
	 *
	 * @return A list of PortalCertificateAddresses.
	 */
    @Deprecated
	Page<PortalCertificateAddress> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Finds all PortalCertificateAddresses.
	 * @return A list of PortalCertificateAddresses.
	 */
    Page<PortalCertificateAddress> findAll(String query, Pageable pageable);

    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the PortalCertificateAddresses in the repository with matching query.
     *
     * @param query query to filter results.
	 * @return The count of the PortalCertificateAddress.
	 */
	long count(String query);

    Page<PortalCertificateAddress> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);

}

