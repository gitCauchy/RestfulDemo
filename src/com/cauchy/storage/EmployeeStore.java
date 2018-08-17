package com.cauchy.storage;

import java.util.HashMap;
import java.util.Map;

import com.cauchy.bean.Employee;


public class EmployeeStore {
	
	private static Map<String,Employee> store;
	private static EmployeeStore instance = null;
	
	private EmployeeStore() {
		store = new HashMap<String,Employee>();
		initOneEmployee();
	}
	
	public static Map<String,Employee> getStore(){
		if(instance == null ) {
			instance = new EmployeeStore();
		}
		return store;
	}
	private static void initOneEmployee() {
		Employee wuchunlei = new Employee("wuchunlei",
				"吴春磊","1002","13812345678", "mail_wcl@163.com", "110108199595192711", "1");
		Employee chenmao = new Employee("chenmao",
				"陈茂","1002","13112345678","mail_chenmao@163.com","110110199501022121","1");
		store.put(wuchunlei.getLoginId(),wuchunlei);
		store.put(chenmao.getLoginId(),chenmao);
	}
}
