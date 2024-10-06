package com.test.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class company {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	private String cname;
	private String cemail;
	private String cpass;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public String getCpass() {
		return cpass;
	}
	public void setCpass(String cpass) {
		this.cpass = cpass;
	}
	@Override
	public String toString() {
		return "company [cid=" + cid + ", cname=" + cname + ", cemail=" + cemail + ", cpass=" + cpass + "]";
	}
	
	
	
	
}
