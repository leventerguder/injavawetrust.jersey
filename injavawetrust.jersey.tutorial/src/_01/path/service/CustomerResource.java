package _01.path.service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/customer-path")
public class CustomerResource {
	
	@GET
	//http://localhost:8080/injavawetrust.jersey.tutorial/customer-path with HTTP GET
	public String greeting() {

		String message = "greeting is called.";
		return message;

	}

	// Jersey implementation throws exception for ambiguous @GET default method.
	// @GET
	// public String greeting2() {
	//
	// String message = "greeting is called.";
	// return message;
	//
	// }

	@POST
	//http://localhost:8080/injavawetrust.jersey.tutorial/customer-path with HTTP POST
	public String greetingForPOST() {

		String message = "greetingForPOST is called.";
		return message;

	}
	
		
	@GET
	@Path("/customers")
	//http://localhost:8080/injavawetrust.jersey.tutorial/customer-path/customers
	public String getAllCustomers() {

		String message = "getAllCustomers is called.";
		return message;

	}

	
	@GET
	@Path("/vip.customers")
	//http://localhost:8080/injavawetrust.jersey.tutorial/customer-path/vip.customers
	public String getVIPCustomers() {

		String message = "getVIPCustomers is called.";
		return message;

	}

}
