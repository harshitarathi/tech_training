package com.techment.emp;

import java.util.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/empapi")

public class RestfulEmpApi {
	@GET
	@Path("/getall")
	@Produces(MediaType.APPLICATION_JSON)
	 
	public List<Employee> getall(){
		RepositoryEmp r=new RepositoryEmp();
		return r.getAll();
	}
	
	@POST
	@Path("/add")
	public String addemployee(Employee emp) {
		RepositoryEmp r=new RepositoryEmp();
		return r.addemployee(emp);
	}
	@DELETE
	@Path("/del/{emp_id}")
	public String Deleteemp(@QueryParam("emp_id") int emp_id) {
		RepositoryEmp r=new RepositoryEmp();
		return r.removeemployee(emp_id);
	}
}

