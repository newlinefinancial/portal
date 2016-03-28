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
 * Service object for domain model class Accrual.
 * @see com.portal.platform.Accrual
 */

public interface AccrualService {
   /**
	 * Creates a new accrual.
	 * 
	 * @param created
	 *            The information of the created accrual.
	 * @return The created accrual.
	 */
	public Accrual create(Accrual created);

	/**
	 * Deletes a accrual.
	 * 
	 * @param accrualId
	 *            The id of the deleted accrual.
	 * @return The deleted accrual.
	 * @throws EntityNotFoundException
	 *             if no accrual is found with the given id.
	 */
	public Accrual delete(Integer accrualId) throws EntityNotFoundException;

	/**
	 * Finds all accruals.
	 * 
	 * @return A list of accruals.
	 */
	public Page<Accrual> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<Accrual> findAll(Pageable pageable);
	
	/**
	 * Finds accrual by id.
	 * 
	 * @param id
	 *            The id of the wanted accrual.
	 * @return The found accrual. If no accrual is found, this method returns
	 *         null.
	 */
	public Accrual findById(Integer id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a accrual.
	 * 
	 * @param updated
	 *            The information of the updated accrual.
	 * @return The updated accrual.
	 * @throws EntityNotFoundException
	 *             if no accrual is found with given id.
	 */
	public Accrual update(Accrual updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the accruals in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the accrual.
	 */

	public long countAll();


    public Page<Accrual> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

