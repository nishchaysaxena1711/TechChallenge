package com.TechChallengeJava.Nishchay.utils;

import com.TechChallengeJava.Nishchay.Bean.ParentBeans;
import com.TechChallengeJava.Nishchay.Domain.UserData;

public class ExtractDomain {
	
	public void extractDomain(ParentBeans p)
	{
		UserData ud = new UserData();
		System.out.println(p.getCreator().getEmail()+"<>");
		ud.setApplicationUuid(p.getApplicationUuid());
		ud.setCompanyCountry(p.getPayload().getCompany().getCountry());
		ud.setCompanyExternalId(p.getPayload().getCompany().getExternalId());
		ud.setCompanyName(p.getPayload().getCompany().getName());
		ud.setCompanyPhNumber(p.getPayload().getCompany().getPhoneNumber());
		ud.setCompanyWebsite(p.getPayload().getCompany().getWebsite());
		ud.setEditionCode(p.getPayload().getOrder().getEditionCode());
		ud.setEmail(p.getCreator().getEmail());
		ud.setFirstName(p.getCreator().getFirstName());
		ud.setFlag(p.getFlag());
		ud.setLanguage(p.getCreator().getLanguage());
		ud.setLastName(p.getCreator().getLastName());
		ud.setPricingDuration(p.getPayload().getOrder().getPricingDuration());
	}

}
