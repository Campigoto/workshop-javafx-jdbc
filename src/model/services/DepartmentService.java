package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {
	
	public List<Department> findAll() {
		
		List<Department> list = new ArrayList<>();
		list.add(new Department(1, "Books"));
		list.add(new Department(2, "Computers"));
		list.add(new Department(3, "Electronics"));
		list.add(new Department(4, "Flowers"));
		list.add(new Department(5, "Mobile Phone"));
		list.add(new Department(6, "Foods"));
		return list;
	}

}
