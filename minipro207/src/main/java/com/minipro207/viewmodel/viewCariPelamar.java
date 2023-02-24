package com.minipro207.viewmodel;

public class viewCariPelamar {
	private String fullname;
	private String nickname;
	private String email;
	private String phonenumber1;
	private String major;
	private String schoolname;
	private Long id;
	
	
	
	public viewCariPelamar(String fullname, String nickname, String email, String phonenumber1, String major,
			String schoolname, Long id) {
		this.fullname = fullname;
		this.nickname = nickname;
		this.email = email;
		this.phonenumber1 = phonenumber1;
		this.major = major;
		this.schoolname = schoolname;
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber1() {
		return phonenumber1;
	}
	public void setPhonenumber1(String phonenumber1) {
		this.phonenumber1 = phonenumber1;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
}
