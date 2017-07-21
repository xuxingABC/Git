package entity;

import java.sql.Date;

public class User {
	private Integer user_id;
	private String name;
	private String loginname;
	private String loginpwd;
	private Integer gender;
	private Date birthDate;
	private String phone;
	private String addree;
	private Integer user_type;
	private String pro_name;
	
	
	public Integer getUser_id() {
		return user_id;
	}


	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLoginname() {
		return loginname;
	}


	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}


	public String getLoginpwd() {
		return loginpwd;
	}


	public void setLoginpwd(String loginpwd) {
		this.loginpwd = loginpwd;
	}


	public Integer getGender() {
		return gender;
	}


	public void setGender(Integer gender) {
		this.gender = gender;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddree() {
		return addree;
	}


	public void setAddree(String addree) {
		this.addree = addree;
	}


	public Integer getUser_type() {
		return user_type;
	}


	public void setUser_type(Integer user_type) {
		this.user_type = user_type;
	}


	public String getPro_name() {
		return pro_name;
	}


	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}


	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", loginname="
				+ loginname + ", loginpwd=" + loginpwd + ", gender=" + gender
				+ ", birthDate=" + birthDate + ", phone=" + phone + ", addree="
				+ addree + ", user_type=" + user_type + ", pro_name="
				+ pro_name + "]";
	}


	
	
	

}
