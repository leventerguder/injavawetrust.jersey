package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/messages")
public class MessageService {

	@GET
	@Path("/message")
	// http://localhost:8080/injavawetrust.jersey.annotation/root-path/messages/message
	public String getMessage() {

		String message = "Welcome to injavawetrust.com Jersey Example with @ApplicationPath !";
		return message;

	}
}
