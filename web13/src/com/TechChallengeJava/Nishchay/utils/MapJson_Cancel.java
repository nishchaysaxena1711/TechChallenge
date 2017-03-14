package com.TechChallengeJava.Nishchay.utils;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

import com.TechChallengeJava.Nishchay.Bean.Marketplace;
import com.TechChallengeJava.Nishchay.Bean.ParentBeans;

public class MapJson_Cancel {

	public ParentBeans mpjon_cancel(String l1) {
		ObjectMapper om1 = new ObjectMapper();
		ParentBeans pb1 = null;
		try {
			pb1 = om1.readValue(l1, ParentBeans.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(">>>>>>>>>>>>>>>>>>");
		Marketplace mp1  = pb1.getMarketplace();
		System.out.println(mp1.getBaseUrl());
		return pb1;
	}
}
