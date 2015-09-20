package com.gotprint.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

import com.gotprint.domain.Note;
import com.gotprint.validators.NoteFacade;
import com.gotprint.validators.UserValidator;

public class UserNoteRestfulWebservice {

	@GET
	@Path("/{userEmail}")
	@Produces("application/json")
	public Response getUserNotes(@PathParam("userEmail") String userEmail) {
		List<Note> note = new ArrayList<Note>();
		UserValidator userValidator = new UserValidator();
		JSONObject jsonObject = new JSONObject();

		try {
		
			userValidator.validate(userEmail);
			NoteFacade notefacade = new NoteFacade();
			note = notefacade.getUserNotes(userEmail);
			jsonObject.put("User Notes", note);

		} catch (Exception e) {
			e.printStackTrace();
		}
		String result = "@Produces(\"application/json\") Output: \n\nUser notes Output: \n\n"
				+ jsonObject;
		return Response.status(200).entity(result).build();
	}
}
