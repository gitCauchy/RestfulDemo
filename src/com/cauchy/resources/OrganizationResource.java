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
import com.cauchy.bean.Organization;
import com.cauchy.storage.OrganizationStore;

@Path("/organizations")
public class OrganizationResource {
	
	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	
	@GET
	@Produces({MediaType.APPLICATION_ATOM_XML,MediaType.APPLICATION_JSON})
	public List<Organization> getOrganizations(){
		List<Organization> organizations = new ArrayList<Organization>();
		organizations.addAll(OrganizationStore.getStore().values());
		return organizations;
	}
	
}
