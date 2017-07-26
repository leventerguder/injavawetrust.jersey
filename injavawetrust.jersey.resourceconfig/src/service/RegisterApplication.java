package service;

import org.glassfish.jersey.server.ResourceConfig;

import controller.MessageService;

public class RegisterApplication extends ResourceConfig {

	public RegisterApplication() {
		registerClasses(MessageService.class);
	}

}