package _22.client.api.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import _22.client.api.model.Author;

public class LibraryClientAPITest3 {

	public static void main(String[] args) {

		String uri = "http://localhost:8080/injavawetrust.resteasy.tutorial/library-client-api/author";
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(uri);
		Invocation.Builder invocationBuilder = target.request();

		Response response = invocationBuilder.get();

		Author author = response.readEntity(Author.class);

		Response responseXML = invocationBuilder.get();

		String xmlResponse = responseXML.readEntity(String.class);

		System.out.println(author);
		System.out.println(xmlResponse);

		client.close();
	}
}
