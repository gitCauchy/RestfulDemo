package com.cauchy.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Organization {
	
	private String orgId; // 机构编号
	private String orgName; // 机构名称
	private String progId; // 父机构编号
	private String orgDesc; // 机构描述
	private String orgStatus; // 机构状态
	
	// 无参数构造方法
	public Organization () {}
	
	// 构造方法
	public Organization(String orgId, String orgName, String progId, String orgDesc, String orgStatus) {
		super();
		this.orgId = orgId;
		this.orgName = orgName;
		this.progId = progId;
		this.orgDesc = orgDesc;
		this.orgStatus = orgStatus;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getProgId() {
		return progId;
	}

	public void setProgId(String progId) {
		this.progId = progId;
	}

	public String getOrgDesc() {
		return orgDesc;
	}

	public void setOrgDesc(String orgDesc) {
		this.orgDesc = orgDesc;
	}

	public String getOrgStatus() {
		return orgStatus;
	}

	public void setOrgStatus(String orgStatus) {
		this.orgStatus = orgStatus;
	}

}
