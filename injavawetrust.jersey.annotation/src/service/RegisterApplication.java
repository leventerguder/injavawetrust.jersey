package service;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/root-path")
public class RegisterApplication extends Application {
	// We don't need to register resource classes.
}
