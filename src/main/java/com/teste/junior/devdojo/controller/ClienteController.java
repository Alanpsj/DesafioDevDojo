package com.teste.junior.devdojo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.junior.devdojo.domain.Cliente;
@RestController
@RequestMapping("transactions")
public class ClienteController {	
	
	//localhost:8080/cliente/lista
	@GetMapping(path="/lista")
	public List<Cliente> listaDeClientes(){
		// lista para testar se a aplicação tá funcionando
		return Arrays.asList(new Cliente("João"), new Cliente("Maria"));
	}
	


}
