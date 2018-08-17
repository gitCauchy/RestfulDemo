package com.cauchy.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	
	private String loginId; //登录账号
	private String loginName; //用户姓名
	private String orgId; //所在机构编号
	private String mobileNo; //手机号
	private String email; //电子邮箱
	private String cardId; //身份证号码
	private String loginStatus; //用户状态
	
	// 无参数构造方法
	public Employee() {}
	
	// 含参数构造方法
	public Employee(String loginId, String loginName, String orgId, String mobileNo, String email, String cardId,
			String loginStatus) {
		this.loginId = loginId;
		this.loginName = loginName;
		this.orgId = orgId;
		this.mobileNo = mobileNo;
		this.email = email;
		this.cardId = cardId;
		this.loginStatus = loginStatus;
	}
	
	// 各个变量的get和set方法
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}
	
}
