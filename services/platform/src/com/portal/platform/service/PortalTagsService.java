/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/

package com.portal.platform.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.portal.platform.*;

/**
 * Service object for domain model class PortalTags.
 * @see com.portal.platform.PortalTags
 */

public interface PortalTagsService {
   /**
	 * Creates a new portaltags.
	 * 
	 * @param created
	 *            The information of the created portaltags.
	 * @return The created portaltags.
	 */
	public PortalTags create(PortalTags created);

	/**
	 * Deletes a portaltags.
	 * 
	 * @param portaltagsId
	 *            The id of the deleted portaltags.
	 * @return The deleted portaltags.
	 * @throws EntityNotFoundException
	 *             if no portaltags is found with the given id.
	 */
	public PortalTags delete(PortalTagsId portaltagsId) throws EntityNotFoundException;

	/**
	 * Finds all portaltagss.
	 * 
	 * @return A list of portaltagss.
	 */
	public Page<PortalTags> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<PortalTags> findAll(Pageable pageable);
	
	/**
	 * Finds portaltags by id.
	 * 
	 * @param id
	 *            The id of the wanted portaltags.
	 * @return The found portaltags. If no portaltags is found, this method returns
	 *         null.
	 */
	public PortalTags findById(PortalTagsId id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a portaltags.
	 * 
	 * @param updated
	 *            The information of the updated portaltags.
	 * @return The updated portaltags.
	 * @throws EntityNotFoundException
	 *             if no portaltags is found with given id.
	 */
	public PortalTags update(PortalTags updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the portaltagss in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the portaltags.
	 */

	public long countAll();


    public Page<PortalTags> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

