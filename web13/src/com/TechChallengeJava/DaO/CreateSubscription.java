 package com.TechChallengeJava.DaO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.TechChallengeJava.Nishchay.utils.DbConnection;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class CreateSubscription {

	public void insert(String fname, String lname, String email, String appUuid, String flag, String lang, String editionCode, String price , String cmpnyName, String cmpnyCountry, String cmpnyPhn, String cmpnyWeb, String cmpnyID) throws ClassNotFoundException, SQLException {
		Connection conn = DbConnection.getConnection();
		String q1 = "SELECT Email FROM Creator";
		Statement stmt = conn.createStatement();
		ResultSet rs= stmt.executeQuery(q1);	
		int c=0;
		while(rs.next()) {
			String str = rs.getString(1);
			if((str.compareTo(email)==0)) {
				System.out.println("hello");
				c=1;
				break;
			}
		}
		if(c==0) {
			String q2 = "INSERT INTO Creator(ApplicationUUid, Firstname, Lastname, Email, Language, EditionCode, PricingDuration, Flag,	CompanyName, CompanyCountry, CompanyWebsite, CompanyPhn, CompanyId, Subscription) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	        PreparedStatement ps = (PreparedStatement) conn.prepareStatement(q2);
	        ps.setString(1, appUuid);
	        ps.setString(2, fname);
	        ps.setString(3, lname);
	        ps.setString(4, email);
	        ps.setString(5, lang);
	        ps.setString(6, editionCode);
	        ps.setString(7, price);
	        ps.setString(8, flag);
	        ps.setString(9, cmpnyName);
	        ps.setString(10, cmpnyCountry);
	        ps.setString(11, cmpnyWeb);
	        ps.setString(12, cmpnyPhn);
	        ps.setString(13, cmpnyID);
	        ps.setString(14, "0");
	        ps.executeUpdate();
		}
		else {
			System.out.println("Duplicate Entry");
		}
	}
}
