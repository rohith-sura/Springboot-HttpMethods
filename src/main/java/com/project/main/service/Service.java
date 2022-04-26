package com.project.main.service;

import com.project.main.message.Response;

public class Service {

	public Response getResponse(String id, String name, Integer marks) {
		
		Response response = new Response(id, name, marks);
		//response.setId("ST2");
		response.setId("ST2");		
		return response;
	}

}
