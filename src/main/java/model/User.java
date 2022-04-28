package model;

import java.util.List;

public class User {
    private String username;
    private Password password;
    private List<Website> websites;
    private String securityQuestion;
    private String securityAnswer;
    private PasswordSettings passwordSettings;
    
    public User (String username, Password password, List<Website> websites, String securityQuestion, String securityAnswer, PasswordSettings passwordSettings) {
    	this.username = username;
    	this.password = password;
    	this.websites = websites;
    	this.securityQuestion = securityQuestion;
    	this.securityAnswer = securityAnswer;
    	this.passwordSettings = passwordSettings;
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Password getPassword() {
		return password;
	}

	public void setPassword(Password password) {
		this.password = password;
	}

	public List<Website> getWebsites() {
		return websites;
	}

	public void setWebsites(List<Website> websites) {
		this.websites = websites;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	public PasswordSettings getPasswordSettings() {
		return passwordSettings;
	}

	public void setPasswordSettings(PasswordSettings passwordSettings) {
		this.passwordSettings = passwordSettings;
	}


}
