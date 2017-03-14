package com.TechChallengeJava.Nishchay.Model;

public class ResponseSuccess {

	private boolean success;
	private String accountIdentifier;
	
	public ResponseSuccess(boolean success, String accountIdentifier) {
		this.success=success;
		this.accountIdentifier=accountIdentifier;
	}
	
	public boolean getSuccess() {
		return success;
	}
	
	public void setSuccess(boolean success) {
		this.success=success;
	}
	
	public String getAccountIdentifier() {
		return accountIdentifier;
	}
	
	public void setAccountIdentifier(String accountIdentifier) {
		this.accountIdentifier=accountIdentifier;
	}
}
