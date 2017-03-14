package com.TechChallengeJava.Nishchay.Service;

import java.sql.SQLException;

import com.TechChallengeJava.DaO.CancelSubscription;
import com.TechChallengeJava.Nishchay.Domain.UserData;

public class UpdateSubscriptionServiceLayer {

	public void UpdateValues() {
		UserData ud = new UserData();
		String email = ud.getEmail();
		
		//System.out.println(email + "" + appUid + ""+ fname + "" +lname +""+ flag+""+ lang+ ""+ editionCode + "" + price);
		CancelSubscription objDao = new CancelSubscription();
		try {
			objDao.update(email);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
