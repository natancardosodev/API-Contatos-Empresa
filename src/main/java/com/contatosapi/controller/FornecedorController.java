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

import com.contatosapi.model.Fornecedor;
import com.contatosapi.model.Response;
import com.contatosapi.service.FornecedorService;

/**
 * @author natancardosodev
 *
 */
@RestController
@RequestMapping("/api")
public class FornecedorController {
	
	@Autowired
	private FornecedorService service;
	
	@PostMapping("/fornecedores")
	public @ResponseBody Response save(@Valid @RequestBody Fornecedor fornecedor) {
		try {
			this.service.save(fornecedor);
			
			return new Response(1,"Fornecedor salvo com sucesso");
			
		}catch(Exception e){
			return new Response(0,e.getMessage());
		}
	}
	
	@PutMapping("/fornecedores")
	public @ResponseBody Response atualizar(@RequestBody Fornecedor fornecedor) {
		try {
			this.service.atualizar(fornecedor);
			
			return new Response(1,"Fornecedor atualizado com sucesso");
			
		}catch(Exception e){
			return new Response(0,e.getMessage());
		}
	}
	
	@GetMapping("/fornecedores")
	public @ResponseBody List<Fornecedor> listar(){
		List<Fornecedor> fornecedores = this.service.listar();
		return fornecedores;
	}
	
	@DeleteMapping("/fornecedores")
	public @ResponseBody Response remove(@RequestBody Fornecedor fornecedor) {
		try {
			this.service.remove(fornecedor);
			
			return new Response(1,"Fornecedor removido com sucesso");
			
		}catch(Exception e){
			return new Response(0,e.getMessage());
		}
	}
	
	@DeleteMapping("/fornecedores/{id}")
	public @ResponseBody Response removeById(@PathVariable Long id) {
		Fornecedor fornecedor = this.service.getById(id);
		
		if(fornecedor != null) {
			this.service.removeById(id);
			
			return new Response(1,"Fornecedor removido com sucesso");
		}else {
			return new Response(0,"Fornecedor não encontrado. Falha ao remover.");
		}
	}
	
	@GetMapping("/fornecedores/{nome}")
	public @ResponseBody Fornecedor getByNome(@PathVariable String nome) {
		Fornecedor fornecedor = this.service.getByNome(nome);
		return fornecedor;
	}
	
	@GetMapping("/fornecedores/email/{email}")
	public @ResponseBody Fornecedor getByEmail(@PathVariable String email) {
		Fornecedor fornecedor = this.service.getByEmail(email);
		return fornecedor;
	}

}
