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

public class EmployeeClient {
	public static void main(String[] args) {
		Client client = Client.create();
		WebResource EmpResource = client.resource("http://localhost:8080/RestfulDemo/rest/employees");
		WebResource	OrgResource = client.resource("http://localhost:8080/RestfulDemo/rest/organizations"); 
		// 得到两个List集合
		List<Employee> empList = getEmployees(EmpResource);
		List<Organization> orgList = getOrganizations(OrgResource);
		
	}
	public static List<Employee> getEmployees(WebResource webResource) {
		String empJsonRes = webResource.accept(MediaType.APPLICATION_JSON).get(String.class);
		empJsonRes = empJsonRes.substring(empJsonRes.indexOf("["),empJsonRes.lastIndexOf("}"));
		Gson gson = new Gson();
		JsonParser parser = new JsonParser();
		JsonArray jarray = parser.parse(empJsonRes).getAsJsonArray();
		ArrayList<Employee> empList = new ArrayList<Employee>();
		for(JsonElement obj : jarray) {
			Employee emp = gson.fromJson(obj, Employee.class);
			empList.add(emp);
		}
		System.out.println(empList);
		return empList;
	}
	public static List<Organization> getOrganizations(WebResource webResource) {
		String orgJsonRes = webResource.accept(MediaType.APPLICATION_JSON).get(String.class);
		orgJsonRes = orgJsonRes.substring(orgJsonRes.indexOf("["), orgJsonRes.lastIndexOf("}"));
		Gson gson = new Gson();
		JsonParser parser = new JsonParser();
		JsonArray jsonArray = parser.parse(orgJsonRes).getAsJsonArray();
		ArrayList<Organization> orgList = new ArrayList<Organization>();
		for(JsonElement obj : jsonArray) {
			Organization org = gson.fromJson(obj, Organization.class);
			orgList.add(org);
		}
		System.out.println(orgList);
		return orgList;
	}
}
