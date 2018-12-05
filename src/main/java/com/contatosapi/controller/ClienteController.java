/**
 * 
 */
package com.contatosapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.contatosapi.model.Cliente;
import com.contatosapi.model.Response;
import com.contatosapi.service.ClienteService;

/**
 * @author natancardosodev
 *
 */
@RestController
@RequestMapping("/api")
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	@PostMapping("/clientes")
	public @ResponseBody Response save(@Valid @RequestBody Cliente cliente) {
		try {
			this.service.save(cliente);
			
			return new Response(1,"Cliente salvo com sucesso");
			
		}catch(Exception e){
			return new Response(0,e.getMessage());
		}
	}
	
	@PutMapping("/clientes")
	public @ResponseBody Response atualizar(@RequestBody Cliente cliente) {
		try {
			this.service.atualizar(cliente);
			
			return new Response(1,"Cliente atualizado com sucesso");
			
		}catch(Exception e){
			return new Response(0,e.getMessage());
		}
	}
	
	@GetMapping("/clientes")
	public @ResponseBody List<Cliente> listar(){
		List<Cliente> clientes = this.service.listar();
		return clientes;
	}
	
	@DeleteMapping("/clientes")
	public @ResponseBody Response remove(@RequestBody Cliente cliente) {
		try {
			this.service.remove(cliente);
			
			return new Response(1,"Cliente removido com sucesso");
			
		}catch(Exception e){
			return new Response(0,e.getMessage());
		}
	}
	
	@DeleteMapping("/clientes/{id}")
	public @ResponseBody Response removeById(@PathVariable Long id) {
		Cliente cliente = this.service.getById(id);
		
		if(cliente != null) {
			this.service.removeById(id);
			
			return new Response(1,"Cliente removido com sucesso");
		}else {
			return new Response(0,"Cliente não encontrado. Falha ao remover.");
		}
	}
	
	@GetMapping("/clientes/{nome}")
	public @ResponseBody Cliente getByNome(@PathVariable String nome) {
		Cliente cliente = this.service.getByNome(nome);
		return cliente;
	}
	
	@GetMapping("/clientes/email/{email}")
	public @ResponseBody Cliente getByEmail(@PathVariable String email) {
		Cliente cliente = this.service.getByEmail(email);
		return cliente;
	}
	
}
