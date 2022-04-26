package com.project.main.message;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response {

	private String id;
	private String name;
	private Integer marks;
	
	public Response(String id, String name, Integer marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

}
