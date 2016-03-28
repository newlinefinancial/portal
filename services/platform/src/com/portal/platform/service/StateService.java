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
 * Service object for domain model class State.
 * @see com.portal.platform.State
 */

public interface StateService {
   /**
	 * Creates a new state.
	 * 
	 * @param created
	 *            The information of the created state.
	 * @return The created state.
	 */
	public State create(State created);

	/**
	 * Deletes a state.
	 * 
	 * @param stateId
	 *            The id of the deleted state.
	 * @return The deleted state.
	 * @throws EntityNotFoundException
	 *             if no state is found with the given id.
	 */
	public State delete(Integer stateId) throws EntityNotFoundException;

	/**
	 * Finds all states.
	 * 
	 * @return A list of states.
	 */
	public Page<State> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<State> findAll(Pageable pageable);
	
	/**
	 * Finds state by id.
	 * 
	 * @param id
	 *            The id of the wanted state.
	 * @return The found state. If no state is found, this method returns
	 *         null.
	 */
	public State findById(Integer id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a state.
	 * 
	 * @param updated
	 *            The information of the updated state.
	 * @return The updated state.
	 * @throws EntityNotFoundException
	 *             if no state is found with given id.
	 */
	public State update(State updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the states in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the state.
	 */

	public long countAll();


    public Page<State> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

