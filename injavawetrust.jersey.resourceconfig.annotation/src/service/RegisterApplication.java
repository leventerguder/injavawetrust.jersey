package service;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import controller.MessageService;

@ApplicationPath("/root-path")
public class RegisterApplication extends ResourceConfig {

	public RegisterApplication() {
		registerClasses(MessageService.class);
	}

}