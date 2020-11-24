package com.teste.junior.devdojo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cliente {
	private int id;
	private String name;
	
	public Cliente(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Cliente(String name) {
		super();
		this.name = name;
	}	
	
	public Cliente() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
