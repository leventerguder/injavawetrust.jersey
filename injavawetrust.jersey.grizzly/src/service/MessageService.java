package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/messages")
public class MessageService {

	@GET
	@Path("/greeting")
	// http://localhost:8080/injavawetrust.jersey.grizzly/messages/greeting
	public String getGreetingMessage() {
		return "Welcome to injavawetrust.com RESTful Tutorial!";
	}

}
