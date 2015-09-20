package com.gotprint.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.gotprint.domain.Note;
import com.gotprint.validators.UserValidator;

public class UserNoteRestfulWebservice {

	@GET
	@Path("/{userEmail}")
	@Produces("application/json")
	public List<Note> getUserNotes(@PathParam("userEmail") String userEmail) {
		List<Note> note = new ArrayList();
		try {
			UserValidator userValidator = new UserValidator();
			userValidator.validate(userEmail);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return note;
	}

}
