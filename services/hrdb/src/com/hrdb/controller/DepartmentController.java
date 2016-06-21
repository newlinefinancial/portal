/*Copyright (c) 2016-2017 newlinefinancial.com All Rights Reserved.
 This software is the confidential and proprietary information of newlinefinancial.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with newlinefinancial.com*/
package com.hrdb.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.hrdb.service.DepartmentService;
import com.hrdb.service.EmployeeService;
import java.io.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.hibernate.TypeMismatchException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.util.WMMultipartUtils;
import com.wavemaker.runtime.util.WMRuntimeUtils;
import com.wavemaker.runtime.file.model.DownloadResponse;
import com.wordnik.swagger.annotations.*;
import com.hrdb.*;
import com.hrdb.service.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

/**
 * Controller object for domain model class Department.
 * @see com.hrdb.Department
 */
@RestController(value = "Hrdb.DepartmentController")
@RequestMapping("/hrdb/Department")
@Api(description = "Exposes APIs to work with Department resource.", value = "DepartmentController")
public class DepartmentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    @Qualifier("hrdb.DepartmentService")
    private DepartmentService departmentService;

    @Autowired
    @Qualifier("hrdb.EmployeeService")
    private EmployeeService employeeService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of Department instances matching the search criteria.")
    public Page<Department> findDepartments(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Departments list");
        return departmentService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of Department instances.")
    public Page<Department> getDepartments(Pageable pageable) {
        LOGGER.debug("Rendering Departments list");
        return departmentService.findAll(pageable);
    }

    @RequestMapping(value = "/{id:.+}/employees", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the employees instance associated with the given id.")
    public Page<Employee> findAssociatedemployees(Pageable pageable, @PathVariable("id") Integer id) {
        LOGGER.debug("Fetching all associated employees");
        return employeeService.findAssociatedValues(id, "department", "deptid", pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setDepartmentService(DepartmentService service) {
        this.departmentService = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new Department instance.")
    public Department createDepartment(@RequestBody Department instance) {
        LOGGER.debug("Create Department with information: {}", instance);
        instance = departmentService.create(instance);
        LOGGER.debug("Created Department with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of Department instances.")
    public Long countAllDepartments() {
        LOGGER.debug("counting Departments");
        Long count = departmentService.countAll();
        return count;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the Department instance associated with the given id.")
    public Department getDepartment(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting Department with id: {}", id);
        Department instance = departmentService.findById(id);
        LOGGER.debug("Department details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the Department instance associated with the given id.")
    public Department editDepartment(@PathVariable(value = "id") Integer id, @RequestBody Department instance) throws EntityNotFoundException {
        LOGGER.debug("Editing Department with id: {}", instance.getDeptid());
        instance.setDeptid(id);
        instance = departmentService.update(instance);
        LOGGER.debug("Department details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the Department instance associated with the given id.")
    public boolean deleteDepartment(@PathVariable(value = "id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting Department with id: {}", id);
        Department deleted = departmentService.delete(id);
        return deleted != null;
    }
}
