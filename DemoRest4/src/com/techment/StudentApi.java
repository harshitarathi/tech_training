package com.techment;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/student")
public class StudentApi {

	@GET
	@Path("/studentDetails")
	public String getStudentDetails() {
		return "Hello this  is tudent details";
	}

	@GET
	@Path("/byname/{name}")
	public String getDetailsByName(@PathParam("name") String name) {
		return ("Hello this is student by name "+name) ;
	}
}