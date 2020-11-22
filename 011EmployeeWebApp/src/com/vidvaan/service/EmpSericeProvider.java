package com.vidvaan.service;

import java.util.List;

import com.vidvaan.dao_Implimentation.Dao_Method_Implimentation;
import com.vidvaan.model.EmployDetails;

public class EmpSericeProvider {
	Dao_Method_Implimentation dAo = new Dao_Method_Implimentation();

	public List<EmployDetails> getDetails() {
		return dAo.getAllEmployee();
	}

	public void insertEmp(EmployDetails ep) {
		dAo.save(ep);
	}

	public void empDelete(int id) {
		dAo.delete(id);
	}

	public void empUpdate(EmployDetails emp) {
		dAo.update(emp);
	}

	public EmployDetails findById(int eId) {
		return dAo.getById(eId);
	}
}
