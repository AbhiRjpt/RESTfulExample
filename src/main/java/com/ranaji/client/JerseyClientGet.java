package com.ranaji.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class JerseyClientGet {

	public static void main(String[] args) {
		try {

			Client client = Client.create();

			WebResource webResource = client
					.resource("http://localhost:8080/RESTfulExample/rest/book/get");

			ClientResponse response = webResource.accept("application/json")
					.get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed to fetch data, Status code : " + response.getStatus());
			}

			String output = response.getEntity(String.class);
			System.out.println("---------RANA-JI-------------");
			System.out.println("Server Output: "+output);
			System.out.println("---------RANA-JI-------------");


		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}