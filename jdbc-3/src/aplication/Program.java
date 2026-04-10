package aplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement st = null;
		SimpleDateFormat smt = new SimpleDateFormat("dd/MM/yyyy");
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement(
					"INSERT INTO seller"
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
					+ "VALUES "
					+ "(?,?,?,?,?)");
			
			st.setString(1, "Ed Perpin");
			st.setString(2, "euodeioolula@gmail.com");
			st.setDate(3, new java.sql.Date(smt.parse("22/03/2001").getTime()));
			st.setDouble(4, 5000.00);
			st.setInt(5,2);
			
			int rows = st.executeUpdate();
			
			IO.println("Done! Rows affected: " + rows);
					
		} catch (SQLException | ParseException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
