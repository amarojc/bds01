package com.devsuperior.bds01.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.devsuperior.bds01.dto.DepartmentDTO;
import com.devsuperior.bds01.entities.Department;
import com.devsuperior.bds01.repositories.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	public List<DepartmentDTO> findAll() {
		List<Department> listDepartments = departmentRepository.findAll(Sort.by("name"));
		return listDepartments.stream()
				.map(dep -> new DepartmentDTO(dep))
				.collect(Collectors.toList());
	}
	
	
}
