package com.vidvaan.sql_queries;

public interface DbQuries {
	public static final String INSERT_QUERY = "INSERT INTO EMPLOY VALUES(?,?,?,?,?)";
	public static final String DELETET_QUERY = "DELETE FROM EMPLOY WHERE ID=?";
	public static final String UPDATE_QUERY = "UPDATE EMPLOY SET NAME=?,GENDER=? , SALARY=?,  DEPARTMENT=? WHERE ID=?";
	public static final String SELECTALL_QUERY = "SELECT * FROM EMPLOY";
	public static final String FiNDBY_ID = "SELECT * FROM EMPLOY WHERE ID=?";

}
