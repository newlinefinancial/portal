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
 * Service object for domain model class GradeStat.
 * @see com.portal.platform.GradeStat
 */

public interface GradeStatService {
   /**
	 * Creates a new gradestat.
	 * 
	 * @param created
	 *            The information of the created gradestat.
	 * @return The created gradestat.
	 */
	public GradeStat create(GradeStat created);

	/**
	 * Deletes a gradestat.
	 * 
	 * @param gradestatId
	 *            The id of the deleted gradestat.
	 * @return The deleted gradestat.
	 * @throws EntityNotFoundException
	 *             if no gradestat is found with the given id.
	 */
	public GradeStat delete(Integer gradestatId) throws EntityNotFoundException;

	/**
	 * Finds all gradestats.
	 * 
	 * @return A list of gradestats.
	 */
	public Page<GradeStat> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<GradeStat> findAll(Pageable pageable);
	
	/**
	 * Finds gradestat by id.
	 * 
	 * @param id
	 *            The id of the wanted gradestat.
	 * @return The found gradestat. If no gradestat is found, this method returns
	 *         null.
	 */
	public GradeStat findById(Integer id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a gradestat.
	 * 
	 * @param updated
	 *            The information of the updated gradestat.
	 * @return The updated gradestat.
	 * @throws EntityNotFoundException
	 *             if no gradestat is found with given id.
	 */
	public GradeStat update(GradeStat updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the gradestats in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the gradestat.
	 */

	public long countAll();


    public Page<GradeStat> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

