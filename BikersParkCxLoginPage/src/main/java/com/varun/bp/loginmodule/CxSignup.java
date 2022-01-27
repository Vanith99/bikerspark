package com.varun.bp.loginmodule;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "cxsignup")
public class CxSignup {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cxid;
	@Column
	private String user_name;
	@Column
	private String user_password;
	@Column
	private Long mob_no;
	@Column
	private String shop_address;

	public int getCxid() {
		return cxid;
	}

	public String getUser_name() {
		return user_name;
	}

	public String getUser_Password() {
		return user_password;
	}

	public Long getMob_no() {
		return mob_no;
	}

	public String getShop_address() {
		return shop_address;
	}

	public void setCxid(int cxid) {
		this.cxid = cxid;
	}

	public void setUser_name(String user_name) {

		this.user_name = user_name;
	}

	public void setUser_password(String user_password) {

		this.user_password = user_password;
	}

	public void setMob_no(Long mob_no) {
		this.mob_no = mob_no;
	}

	public void setShop_address(String shop_address) {
		this.shop_address = shop_address;
	}

	@Override
	public String toString() {
		return "CxSignup [cxid=" + cxid + ", user_name=" + user_name + ", user_password=" + user_password + ", mob_no="
				+ mob_no + ", shop_address=" + shop_address + "]";
	}

}
