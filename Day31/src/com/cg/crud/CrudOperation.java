package com.cg.crud;

	import java.sql.Connection;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import com.cg.util.DBUtil;

	public class CrudOperation {
		
		//Inserting Operation
		public static void createStudent() throws SQLException {
			Connection connection = DBUtil.getConnection();
			Statement st = connection.createStatement();
			String sqlinsert = "INSERT INTO student(rollNo,name,marks) " + "values(1,'Akash',82)";
			int execute  = st.executeUpdate(sqlinsert);
			if(execute==1) {
				System.out.println("Entry is added");
			}
			
		}
		
		//Updating Operation
		public static void updateStudent() throws SQLException {
			Connection connection = DBUtil.getConnection();
			Statement st = connection.createStatement();
			String sqlupdate = "UPDATE student SET marks=85,name='vinod' Where rollNo=2";
			int execute = st.executeUpdate(sqlupdate);
			if(execute==1) {
				System.out.println("Update is done");
			}
			
		}
		
		//Deleting Operation
		public static void deleteStudent() throws SQLException {
			Connection connection = DBUtil.getConnection();
			Statement st = connection.createStatement();
			String sqldelete = "DELETE FROM student Where rollNo=2";
			int execute = st.executeUpdate(sqldelete);
			if(execute== 1) {
				System.out.println("Delete is Success");
			}
		}
		
		//RetrieveID Operation
		public static void retriveByRollNoStudent() throws SQLException {
			Connection connection = DBUtil.getConnection();
			Statement st = connection.createStatement();
			String sqlretrieve = "SELECT * from student Where rollNo = 2";
			ResultSet rs = st.executeQuery(sqlretrieve);
			if(rs.next()) {
				int rollNo = rs.getInt(1);
				String name = rs.getString(2);
				int marks = rs.getInt(3);
				System.out.println(rollNo +" " + name + " " + marks);
			}
			else {
				System.out.println("Student is not of this class");
			}
			
		}
	}

