package com.cauchy.resources;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import com.cauchy.bean.Employee;
import com.cauchy.storage.EmployeeStore;

@Path("/employees")
public class EmployeesResource{
	
	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	@GET
	@Produces({MediaType.APPLICATION_ATOM_XML,MediaType.APPLICATION_JSON})
	public List<Employee> getEmployees(){
		List<Employee> employees = new ArrayList<Employee>();
		employees.addAll(EmployeeStore.getStore().values());
		return employees;
	}
}
