/**
 * 
 */
package com.contatosapi.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.contatosapi.model.Cliente;
import com.contatosapi.repository.ClienteRepository;

/**
 * @author natancardosodev
 *
 */
@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	@Transactional
	public void save(Cliente cliente) {
		this.repository.save(cliente);
	}
	
	@Transactional(readOnly=true)
	public List<Cliente> listar(){
		return this.repository.findAll();
	}
	
	@Transactional
	public void remove(Cliente cliente) {
		this.repository.delete(cliente);
	}
	
	@Transactional
	public void removeById(Long id) {
		this.repository.deleteById(id);
	}
	
	@Transactional
	public void atualizar(Cliente cliente) {
		this.repository.saveAndFlush(cliente);
	}
	
	@Transactional(readOnly=true)
	public Cliente getById(Long id) {
		return this.repository.getOne(id);
	}
	
	@Transactional(readOnly=true)
	public Cliente getByNome(String nome) {
		return this.repository.findByNome(nome);
	}
	
	@Transactional(readOnly=true)
	public Cliente getByEmail(String email) {
		return this.repository.findByEmail(email);
	}

}
