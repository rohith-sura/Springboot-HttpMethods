package com.project.main.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.main.message.Response;

@RestController
@RequestMapping(path = "/httpmethods")
public class HttpMethodsController {

	/*
	 * @Autowired private Service service;
	 */

	@GetMapping(path = "/sample")
	public String sample() {
		String name = "Rohith";
		return name;
	}

	@GetMapping("/get")
	public Response getResponse(
			@RequestParam(value = "Id", required = true) final String id,
			@RequestParam(value = "Name", required = true) final String name,
			@RequestParam(value = "Marks", required = true) final Integer marks) {
		Response response = new Response(id, name, marks);
		String id2 = "Rohith The Great";
		response.setId(id2);
		return response;
	}

}
