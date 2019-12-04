package com.collabera.Day24J;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.collabera.model.Employee;

@Path("myresource")
public class MyResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt() {
		return "Got it!";
	}

	@GET
	@Path("employee")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployee() {
		Employee emp = new Employee("QW", "Jon Snow");
		return emp;
	}
}
