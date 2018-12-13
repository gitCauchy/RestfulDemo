package com.cauchy.client;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;
import com.cauchy.bean.Employee;
import com.cauchy.bean.Organization;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
/**
 * 
 * @author Cauchy
 * @description : 只需要这两个方法就可以获取信息
 */
public class EmployeeClient {
	public static List<Employee> getEmployees() {
		Client client = Client.create();
		WebResource EmpResource = client.resource("http://localhost:8080/RestfulDemo/rest/employees");
		String empJsonRes = EmpResource.accept(MediaType.APPLICATION_JSON).get(String.class);
		empJsonRes = empJsonRes.substring(empJsonRes.indexOf("["),empJsonRes.lastIndexOf("}"));
		Gson gson = new Gson();
		JsonParser parser = new JsonParser();
		JsonArray jarray = parser.parse(empJsonRes).getAsJsonArray();
		ArrayList<Employee> empList = new ArrayList<Employee>();
		for(JsonElement obj : jarray) {
			Employee emp = gson.fromJson(obj, Employee.class);
			empList.add(emp);
		}
		return empList;
	}
	public static List<Organization> getOrganizations() {
		Client client = Client.create();
		WebResource	OrgResource = client.resource("http://localhost:8080/RestfulDemo/rest/organizations"); 
		String orgJsonRes = OrgResource.accept(MediaType.APPLICATION_JSON).get(String.class);
		orgJsonRes = orgJsonRes.substring(orgJsonRes.indexOf("["), orgJsonRes.lastIndexOf("}"));
		Gson gson = new Gson();
		JsonParser parser = new JsonParser();
		JsonArray jsonArray = parser.parse(orgJsonRes).getAsJsonArray();
		ArrayList<Organization> orgList = new ArrayList<Organization>();
		for(JsonElement obj : jsonArray) {
			Organization org = gson.fromJson(obj, Organization.class);
			orgList.add(org);
		}
		return orgList;
	}
}
