package publisher;

import java.net.URI;

import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import service.MessageService;

public class WebServicePublisher {

	private static final String BASE_URI = "http://localhost:8080/injavawetrust.jersey.grizzly/";

	public static void main(String[] args) {

		// register package or class
		// ResourceConfig rc = new ResourceConfig().packages("service");

		ResourceConfig rc = new ResourceConfig().registerClasses(MessageService.class);
		GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
		System.out.println("WebServicePublisher is running...");
		System.out.println("You can check WADL ...");
		System.out.println("http://localhost:8080/injavawetrust.jersey.grizzly/application.wadl");
		// Web Application Description Language
	}
}
