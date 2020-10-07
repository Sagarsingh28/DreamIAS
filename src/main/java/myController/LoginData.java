package myController;

public class LoginData {
	private String userEmail;
	private String userName;
	private String userPass;
	private String userRepass;
	private String userState;
	private String userPhoneNumber="+91";
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String name) {
		this.userName = name;
	}
	public String getUserPasscode() {
		return userPass;
	}
	public void setUserPasscode(String passcode) {
		this.userPass = passcode;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}
	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}
	@Override
	public String toString() {
		return "LoginData [userEmail=" + userEmail + ", userName=" + userName + ", userPass=" + userPass
				+ ", userPhoneNumber=" + userPhoneNumber + "]";
	}
	public String getUserRepass() {
		return userRepass;
	}
	public void setUserRepass(String userRepass) {
		this.userRepass = userRepass;
	}
	public String getUserState() {
		return userState;
	}
	public void setUserState(String userState) {
		this.userState = userState;
	}
	
	
}
