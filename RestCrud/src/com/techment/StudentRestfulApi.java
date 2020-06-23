package com.techment;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/studentapi")
public class StudentRestfulApi {

	@GET
	@Path("/getall")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudent() {

		Repository repository = new Repository();
		return repository.getAll();

	}

	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	public String addStudent(Student student) {

		Repository repository = new Repository();
		return repository.add(student);

	}

	@DELETE
	@Path("/delete/{id}")
	public String deleteStudent(@QueryParam("id") int id) {

		Repository repository = new Repository();
		return repository.deleteStudent(id);

	}

	@PUT
	@Path("/update")
	public String updateStudent(Student student) {

		Repository repository = new Repository();
		return repository.update(student);

	}

}