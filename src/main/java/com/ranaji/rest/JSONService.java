package com.ranaji.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ranaji.Book;

@Path("/book")
public class JSONService {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Book getTrackInJSON() {

		Book book = new Book();
		book.setWriterName("Rana-ji");
		book.setBookName("The House  Of Coding");
		book.setPublicationName("Code House Publications");

		return book;

	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Book book) {

		String result = "Book Data saved : " + book;
		return Response.status(201).entity(result).build();
		
	}
	
}