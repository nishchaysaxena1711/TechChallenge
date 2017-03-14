package com.TechChallengeJava.Nishchay.utils;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

import com.TechChallengeJava.Nishchay.Bean.Creator;
import com.TechChallengeJava.Nishchay.Bean.Marketplace;
import com.TechChallengeJava.Nishchay.Bean.ParentBeans;
import com.TechChallengeJava.Nishchay.Domain.UserData;

public class MapJson {

	public ParentBeans mapJson(String l) {
		ObjectMapper om = new ObjectMapper();
		ParentBeans pb=null;
		try {
			pb = om.readValue(l, ParentBeans.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("*******");
		Marketplace mp  = pb.getMarketplace();
		System.out.println(mp.getBaseUrl());
		Creator c = pb.getCreator();
		System.out.println(c.getEmail());
		UserData ud = new UserData();
		ud.setEmail(c.getEmail());
		return pb;
	}
}
