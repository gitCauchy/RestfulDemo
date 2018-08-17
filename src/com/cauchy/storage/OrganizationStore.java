package com.cauchy.storage;

import java.util.HashMap;
import java.util.Map;

import com.cauchy.bean.Organization;


public class OrganizationStore {
	
	private static Map<String,Organization> store;
	private static OrganizationStore instance = null;
	
	private OrganizationStore() {
		store = new HashMap<String,Organization>();
		initOneOrganization();
	}
	
	public static Map<String,Organization> getStore(){
		if(instance == null) {
			instance = new OrganizationStore();
		}
		return store;
	}
	private static void initOneOrganization() {
		Organization c1001 = new Organization("c1001","产品服务一部","10","产品服务1部门","1");
		Organization c1002 = new Organization("c1002","产品服务二部","10","产品服务2部门","2");
		
		store.put(c1001.getOrgId(),c1001);
		store.put(c1002.getOrgId(), c1002);
	}

}
