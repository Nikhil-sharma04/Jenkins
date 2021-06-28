package com.nagarro.training.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.training.entity.Employee;

/**
 * To perform crud operations on employee.
 * @author nikhilsharma05
 *
 */
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Long> {

}
