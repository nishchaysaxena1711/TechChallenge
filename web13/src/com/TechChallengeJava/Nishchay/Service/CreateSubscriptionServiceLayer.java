package com.TechChallengeJava.Nishchay.Service;

import java.sql.SQLException;

import com.TechChallengeJava.DaO.CreateSubscription;
import com.TechChallengeJava.Nishchay.Domain.UserData;

public class CreateSubscriptionServiceLayer {

	public void InsertValues() {
		UserData ud = new UserData();
		String email = ud.getEmail();
		String appUid = ud.getApplicationUuid();
		String fname = ud.getFirstName();
		String lname = ud.getLastName();
		String flag = ud.getFlag();
		String lang = ud.getLanguage();
		String editionCode = ud.getEditionCode();
		String price = ud.getPricingDuration();
		String cmpnyName = ud.getCompanyName();
		String cmpnyCountry = ud.getCompanyCountry();
		String cmpnyPhn = ud.getCompanyPhNumber();
		String cmpnyWeb = ud.getCompanyWebsite();
		String cmpnyID = ud.getCompanyExternalId();
		
		System.out.println(email + "" + appUid + ""+ fname + "" +lname +""+ flag+""+ lang+ ""+ editionCode + "" + price);
		CreateSubscription objDao = new CreateSubscription();
		try {
			objDao.insert(fname, lname, email, appUid, flag, lang, editionCode, price, cmpnyName, cmpnyCountry, cmpnyPhn, cmpnyWeb, cmpnyID);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
