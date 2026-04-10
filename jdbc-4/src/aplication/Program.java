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
		String sql = "UPDATE seller SET Email = ? WHERE id = ?";
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement(sql);
			
			st.setString(1, "tarantula@gmail.com");
			st.setString(2, "1");
			
			
			int rows = st.executeUpdate();
			
			if(rows > 0) {
				IO.println("Done! Rows affected: " + rows);
			}else {
				IO.println("Id not found");
			}
			
					
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
