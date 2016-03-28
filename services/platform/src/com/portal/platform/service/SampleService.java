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
 * Service object for domain model class Sample.
 * @see com.portal.platform.Sample
 */

public interface SampleService {
   /**
	 * Creates a new sample.
	 * 
	 * @param created
	 *            The information of the created sample.
	 * @return The created sample.
	 */
	public Sample create(Sample created);

	/**
	 * Deletes a sample.
	 * 
	 * @param sampleId
	 *            The id of the deleted sample.
	 * @return The deleted sample.
	 * @throws EntityNotFoundException
	 *             if no sample is found with the given id.
	 */
	public Sample delete(Integer sampleId) throws EntityNotFoundException;

	/**
	 * Finds all samples.
	 * 
	 * @return A list of samples.
	 */
	public Page<Sample> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<Sample> findAll(Pageable pageable);
	
	/**
	 * Finds sample by id.
	 * 
	 * @param id
	 *            The id of the wanted sample.
	 * @return The found sample. If no sample is found, this method returns
	 *         null.
	 */
	public Sample findById(Integer id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a sample.
	 * 
	 * @param updated
	 *            The information of the updated sample.
	 * @return The updated sample.
	 * @throws EntityNotFoundException
	 *             if no sample is found with given id.
	 */
	public Sample update(Sample updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the samples in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the sample.
	 */

	public long countAll();


    public Page<Sample> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

