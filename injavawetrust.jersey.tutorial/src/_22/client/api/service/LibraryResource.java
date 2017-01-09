package _22.client.api.service;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import _22.client.api.model.Author;
import _22.client.api.model.Book;

@Path("/library-client-api")
public class LibraryResource {

	@GET
	@Path("/welcome")
	@Produces(MediaType.TEXT_PLAIN)
	public Response welcome() {
		String message = "Welcome Library!";
		ResponseBuilder builder = Response.ok(message);
		return builder.build();
	}
	
	@GET
	@Path("/book/{isbn}")
	@Produces(MediaType.APPLICATION_JSON)
	//// http://localhost:8080/injavawetrust.jersey.tutorial/library-client-api/book/100
	public Response getBookById(@PathParam("isbn") String ISBN) {		
		//assume that searched in DB.
		Book book = new Book(ISBN, "Livro do desassossego", 550, 23.72);
		ResponseBuilder builder = Response.ok(book);
		return builder.build();
	}
	

	@GET
	@Path("/book")
	// http://localhost:8080/injavawetrust.jersey.tutorial/library-client-api/book?name=Livro%20do%20desassossego
	public Response getBookByName(@QueryParam("name") String name) {
		//assume that searched in DB.
		Book book = new Book("123456",name, 550, 23.72);
		ResponseBuilder builder = Response.ok(book);
		return builder.build();
	}


	@GET
	@Path("/authors")
	@Produces(MediaType.APPLICATION_XML)
	//// http://localhost:8080/injavawetrust.jersey.tutorial/library-client-api/authors
	public List<Author> getAuthors() {
		Author author = new Author("1", "hebele", "hubele", "turkey");
		Author author2 = new Author("2", "hebele2", "hubele2", "turkey");
		return Arrays.asList(author, author2);
	}
	
	@GET
	@Path("/author")
	@Produces(MediaType.APPLICATION_XML)
	//// http://localhost:8080/injavawetrust.jersey.tutorial/library-client-api/author/ahmet
	public Response getAuthorByName(@QueryParam("name") String name) {
		Author author = new Author("1", "hebele", "hubele", "turkey");
		ResponseBuilder builder = Response.ok(author);
		return builder.build();
	}
}
