package entity;

import java.sql.Date;

public class Bill {
	private Integer bill_id;
	private Integer pro_id;
	private Integer user_id;
	private String product_name;
	private String product_unit;
	private Integer product_count;
	private Integer bill_moeny;
	private Integer payed;
	private Date op_time;
	public Integer getBill_id() {
		return bill_id;
	}
	public void setBill_id(Integer bill_id) {
		this.bill_id = bill_id;
	}
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
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_unit() {
		return product_unit;
	}
	public void setProduct_unit(String product_unit) {
		this.product_unit = product_unit;
	}
	public Integer getProduct_count() {
		return product_count;
	}
	public void setProduct_count(Integer product_count) {
		this.product_count = product_count;
	}
	public Integer getBill_moeny() {
		return bill_moeny;
	}
	public void setBill_moeny(Integer bill_moeny) {
		this.bill_moeny = bill_moeny;
	}
	public Integer getPayed() {
		return payed;
	}
	public void setPayed(Integer payed) {
		this.payed = payed;
	}
	public Date getOp_time() {
		return op_time;
	}
	public void setOp_time(Date op_time) {
		this.op_time = op_time;
	}
	@Override
	public String toString() {
		return "Bill [bill_id=" + bill_id + ", pro_id=" + pro_id + ", user_id="
				+ user_id + ", product_name=" + product_name
				+ ", product_unit=" + product_unit + ", product_count="
				+ product_count + ", bill_moeny=" + bill_moeny + ", payed="
				+ payed + ", op_time=" + op_time + "]";
	}
	
	

}
