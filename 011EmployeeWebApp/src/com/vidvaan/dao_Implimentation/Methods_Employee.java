package com.vidvaan.dao_Implimentation;

import java.util.List;

import com.vidvaan.model.EmployDetails;

public interface Methods_Employee {
	
	void save(EmployDetails emp);
	void update(EmployDetails emp);
	List<EmployDetails>  getAllEmployee();
	void delete(int id);

}
