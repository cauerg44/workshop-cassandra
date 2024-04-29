package com.devsuperior.workshopcassandra.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.workshopcassandra.model.dto.DepartmentDTO;
import com.devsuperior.workshopcassandra.model.entities.Department;
import com.devsuperior.workshopcassandra.repositories.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository repository;
	
	public List<DepartmentDTO> findAll() {
		List<Department> list = repository.findAll();
		return list.stream().map(x -> new DepartmentDTO(x)).toList();
	}
	
}
