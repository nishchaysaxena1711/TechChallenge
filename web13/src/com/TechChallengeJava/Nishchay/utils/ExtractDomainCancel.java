package com.TechChallengeJava.Nishchay.utils;

import com.TechChallengeJava.Nishchay.Bean.ParentBeans;
import com.TechChallengeJava.Nishchay.Domain.UserDataCancel;

public class ExtractDomainCancel {
 
	public void extractdomaincancel(ParentBeans p) {
		UserDataCancel udc = new UserDataCancel();
		udc.setEmail(p.getCreator().getEmail());
	}
}
