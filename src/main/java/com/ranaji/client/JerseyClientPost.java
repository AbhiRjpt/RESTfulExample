package com.ranaji.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class JerseyClientPost {

	public static void main(String[] args) {

		try {

			Client client = Client.create();

			WebResource webResource = client
					.resource("http://localhost:8080/RESTfulExample/rest/book/post");

			String input = "{\"writerName\":\"Rana-ji\",\"bookName\":\"The House  Of Coding\",\"publicationName\":\"Code House Publications\"}";

			ClientResponse response = webResource.type("application/json")
					.post(ClientResponse.class, input);

			if (response.getStatus() != 201) {
				throw new RuntimeException("Failed to save data!! Status Error: "+ response.getStatus());
			}

			String output = response.getEntity(String.class);
			System.out.println("---------------- RANA-Ji-----------------");
			System.out.println("Server Output: "+output);
			System.out.println("---------------- RANA-Ji-----------------");

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
