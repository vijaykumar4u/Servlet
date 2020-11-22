package com.vidvaan.dao_Implimentation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vidvaan.dbconnectionutil.Connection_Db;
import com.vidvaan.model.EmployDetails;
import com.vidvaan.sql_queries.DbQuries;

public class Dao_Method_Implimentation implements Methods_Employee {
	Connection connection = null;
	PreparedStatement ps = null;
	ResultSet resultSet = null;

	@Override
	public void save(EmployDetails emp) {
		try {
			connection = Connection_Db.getConnection();
			ps = connection.prepareStatement(DbQuries.INSERT_QUERY);
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setString(3, emp.getGender());
			ps.setDouble(4, emp.getSalary());
			ps.setString(5, emp.getDepartment());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Connection_Db.closeStatement(ps);

	}

	@Override
	public void update(EmployDetails emp) {
		connection = Connection_Db.getConnection();
		try {
			ps = connection.prepareStatement(DbQuries.UPDATE_QUERY);
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getGender());
			ps.setDouble(3, emp.getSalary());
			ps.setString(4, emp.getDepartment());
			ps.setInt(5, emp.getId());
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<EmployDetails> getAllEmployee() {

		try {
			connection = Connection_Db.getConnection();
			ps = connection.prepareStatement(DbQuries.SELECTALL_QUERY);
			resultSet = ps.executeQuery();
			List<EmployDetails> elist = new ArrayList<>();
			while (resultSet.next()) {

				EmployDetails emp = new EmployDetails();
				emp.setId(resultSet.getInt(1));
				emp.setName(resultSet.getString(2));
				emp.setGender(resultSet.getString(3));
				emp.setSalary(resultSet.getDouble(4));
				emp.setDepartment(resultSet.getString(5));
				elist.add(emp);
			}
			return elist;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public void delete(int id) {
		connection = Connection_Db.getConnection();
		try {
			ps = connection.prepareStatement(DbQuries.DELETET_QUERY);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection_Db.closeStatement(ps);
	}

	public EmployDetails getById(int eId) {
		connection=Connection_Db.getConnection();
		try {
			ps =connection.prepareStatement(DbQuries.FiNDBY_ID);
			ps.setInt(1, eId);
			resultSet=ps.executeQuery();
			EmployDetails empD = new EmployDetails();
			if(resultSet.next()) {
				empD.setId(resultSet.getInt(1));
				empD.setName(resultSet.getString(2));
				empD.setGender(resultSet.getString(3));
				empD.setSalary(resultSet.getDouble(4));
				empD.setDepartment(resultSet.getString(5));
			}
			return empD;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			Connection_Db.closeStatement(ps);
		}
		return null;
		
	}

}
