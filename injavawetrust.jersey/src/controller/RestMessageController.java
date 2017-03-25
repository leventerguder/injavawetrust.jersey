package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/messages")
public class RestMessageController {

	@GET
	@Path("/message")
	// http://localhost:8080/injavawetrust.jersey/application/messages/message
	public String getMessage() {

		String message = "Welcome to injavawetrust.com Jersey Tutorial!";
		return message;

	}
}
