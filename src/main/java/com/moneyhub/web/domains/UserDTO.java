package com.moneyhub.web.domains;

import java.io.Serializable;
import org.springframework.stereotype.Component;

@Component
public class UserDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private String uid,
	pwd,
	cstate,
	level,
	hub_account,
	reg,
	wdd;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getCstate() {
		return cstate;
	}
	public void setCstate(String cstate) {
		this.cstate = cstate;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getHub_account() {
		return hub_account;
	}
	public void setHub_account(String hub_account) {
		this.hub_account = hub_account;
	}
	public String getReg() {
		return reg;
	}
	public void setReg(String reg) {
		this.reg = reg;
	}
	public String getWdd() {
		return wdd;
	}
	public void setWdd(String wdd) {
		this.wdd = wdd;
	}
	
	
}
