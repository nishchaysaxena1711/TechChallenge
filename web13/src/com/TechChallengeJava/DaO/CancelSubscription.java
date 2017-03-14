package com.TechChallengeJava.DaO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.TechChallengeJava.Nishchay.utils.DbConnection;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class CancelSubscription {

	public void update(String email) throws ClassNotFoundException, SQLException {
		Connection conn = DbConnection.getConnection();
		String q1 = "SELECT Email FROM Creator";
		Statement stmt = conn.createStatement();
		ResultSet rs= stmt.executeQuery(q1);	
		int c=0;
		while(rs.next()) {
			String str = rs.getString(1);
			if((str.compareTo(email)==0)) {
				String q2 = "update Creator set Subscription= ? where email = ?";
		        PreparedStatement ps = (PreparedStatement) conn.prepareStatement(q2);
		        ps.setString(1, "1");
		        ps.setString(2, email);
		        ps.executeUpdate();
		        c=1;
			}
		}
		if(c==0) {
			System.out.println("Entry Not Found");
		}
	}
}
