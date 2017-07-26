package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/messages")
public class MessageService {

	@GET
	@Path("/greeting")
	// http://localhost:8080/injavawetrust.jersey.resourceconfig.annotation/root-path/messages/greeting
	public String getMessage() {

		String message = "Jersey + ResourceConfig register example!";
		return message;

	}
}
