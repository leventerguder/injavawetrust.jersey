package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/messages")
public class MessageService {

	@GET
	@Path("/message")
	// http://localhost:8080/injavawetrust.jersey.register/application-subclass/messages/message
	public String getMessage() {

		String message = "Welcome to injavawetrust.com Jersey Tutorial !";
		return message;

	}
}
