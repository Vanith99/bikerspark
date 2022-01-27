package com.varun.bp.shopownerskillsetmodule;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ShopDetailsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int shop_id;
	@Column
	private String shop_name;
	@Column
	private String shop_address;
	@Column
	private String skill1;
	@Column
	private int price1;
	@Column
	private String skill2;
	@Column
	private int price2;
	@Column 
	private String skill3;
	public int getShop_id() {
		return shop_id;
	}
	public String getShop_name() {
		return shop_name;
	}
	public String getShop_address() {
		return shop_address;
	}
	public String getSkill1() {
		return skill1;
	}
	public int getPrice1() {
		return price1;
	}
	public String getSkill2() {
		return skill2;
	}
	public int getPrice2() {
		return price2;
	}
	public String getSkill3() {
		return skill3;
	}
	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}
	public void setShop_address(String shop_address) {
		this.shop_address = shop_address;
	}
	public void setSkill1(String skill1) {
		this.skill1 = skill1;
	}
	public void setPrice1(int price1) {
		this.price1 = price1;
	}
	public void setSkill2(String skill2) {
		this.skill2 = skill2;
	}
	public void setPrice2(int price2) {
		this.price2 = price2;
	}
	public void setSkill3(String skill3) {
		this.skill3 = skill3;
	}
	
	
   
    
	
	
	

}
