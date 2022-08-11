package com.cg.student;

	import java.sql.Connection;
	import java.sql.SQLException;

	import com.cg.crud.CrudOperation;
	import com.cg.util.DBUtil;

	public class Student {

		public static void main(String[] args) throws SQLException {
			Connection connection = DBUtil.getConnection();
			if(connection != null) {
				System.out.println("JDBC: Connection is established");
			}
			CrudOperation.createStudent();
		}

	}

