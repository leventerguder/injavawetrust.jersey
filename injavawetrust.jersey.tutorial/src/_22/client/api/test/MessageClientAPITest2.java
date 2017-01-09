package _22.client.api.test;

import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

public class MessageClientAPITest2 {

	public static void main(String[] args) {

		String uri = "http://localhost:8080/injavawetrust.jersey.tutorial/message-client-api/messages";
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(uri);
		Invocation.Builder builder = target.request();
		
		List<String> resultList = builder.get(new GenericType<List<String>>() {});

		System.out.println(resultList);

		client.close();
	}
}
