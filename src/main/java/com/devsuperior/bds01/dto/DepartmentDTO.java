package com.devsuperior.bds01.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.devsuperior.bds01.entities.Department;

public class DepartmentDTO implements Serializable{


	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private List<EmployeeDTO> employees = new ArrayList<>();
	
	public DepartmentDTO() {
	}

	public DepartmentDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public DepartmentDTO(Department department) {
		this.id = department.getId();
		this.name = department.getName();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<EmployeeDTO> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeeDTO> employees) {
		this.employees = employees;
	}
	
	
	
}
