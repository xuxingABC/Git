package entity;

import java.sql.Date;

public class Provider {
	private Integer pro_id;
	private Integer user_id;
	private String pro_name;
	private String pro_desc;
	private String pro_contact;
	private String pro_phone;
	private String pro_address;
	private String pro_fax;
	private Date op_time;
	public Integer getPro_id() {
		return pro_id;
	}
	public void setPro_id(Integer pro_id) {
		this.pro_id = pro_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public String getPro_desc() {
		return pro_desc;
	}
	public void setPro_desc(String pro_desc) {
		this.pro_desc = pro_desc;
	}
	public String getPro_contact() {
		return pro_contact;
	}
	public void setPro_contact(String pro_contact) {
		this.pro_contact = pro_contact;
	}
	public String getPro_phone() {
		return pro_phone;
	}
	public void setPro_phone(String pro_phone) {
		this.pro_phone = pro_phone;
	}
	public String getPro_address() {
		return pro_address;
	}
	public void setPro_address(String pro_address) {
		this.pro_address = pro_address;
	}
	public String getPro_fax() {
		return pro_fax;
	}
	public void setPro_fax(String pro_fax) {
		this.pro_fax = pro_fax;
	}
	public Date getOp_time() {
		return op_time;
	}
	public void setOp_time(Date op_time) {
		this.op_time = op_time;
	}
	@Override
	public String toString() {
		return "Provider [pro_id=" + pro_id + ", user_id=" + user_id
				+ ", pro_name=" + pro_name + ", pro_desc=" + pro_desc
				+ ", pro_contact=" + pro_contact + ", pro_phone=" + pro_phone
				+ ", pro_address=" + pro_address + ", pro_fax=" + pro_fax
				+ ", op_time=" + op_time + ", getPro_id()=" + getPro_id()
				+ ", getUser_id()=" + getUser_id() + ", getPro_name()="
				+ getPro_name() + ", getPro_desc()=" + getPro_desc()
				+ ", getPro_contact()=" + getPro_contact()
				+ ", getPro_phone()=" + getPro_phone() + ", getPro_address()="
				+ getPro_address() + ", getPro_fax()=" + getPro_fax()
				+ ", getOp_time()=" + getOp_time() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	

}
