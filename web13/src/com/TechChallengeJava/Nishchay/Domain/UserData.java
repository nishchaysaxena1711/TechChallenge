package com.TechChallengeJava.Nishchay.Domain;


public class UserData {
	private static String firstName;
	private static String lastName;
	private static String email;
	private static String applicationUuid;
	private static String flag;
	private static String language;
	private static String editionCode;
	private static String pricingDuration;
	private static String companyName;
	private static String companyPhNumber;
	private static String companyCountry;
	private static String companyWebsite;
	private static String companyExternalId;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		System.out.println(email+"!!");
		return email;	
	}
	public void setEmail(String email) {
		this.email = email;
		System.out.println(email+"><");
	}
	public String getApplicationUuid() {
		return applicationUuid;
	}
	public void setApplicationUuid(String applicationUuid) {
		this.applicationUuid = applicationUuid;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getEditionCode() {
		return editionCode;
	}
	public void setEditionCode(String editionCode) {
		this.editionCode = editionCode;
	}
	public String getPricingDuration() {
		return pricingDuration;
	}
	public void setPricingDuration(String pricingDuration) {
		this.pricingDuration = pricingDuration;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyPhNumber() {
		return companyPhNumber;
	}
	public void setCompanyPhNumber(String companyPhNumber) {
		this.companyPhNumber = companyPhNumber;
	}
	public String getCompanyCountry() {
		return companyCountry;
	}
	public void setCompanyCountry(String companyCountry) {
		this.companyCountry = companyCountry;
	}
	public String getCompanyWebsite() {
		return companyWebsite;
	}
	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}
	public String getCompanyExternalId() {
		return companyExternalId;
	}
	public void setCompanyExternalId(String companyExternalId) {
		this.companyExternalId = companyExternalId;
	}
}
