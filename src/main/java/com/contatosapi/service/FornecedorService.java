/**
 * 
 */
package com.contatosapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.contatosapi.model.Fornecedor;
import com.contatosapi.repository.FornecedorRepository;

/**
 * @author natancardosodev
 *
 */
@Service
public class FornecedorService {
	
	@Autowired
	private FornecedorRepository repository;
	
	@Transactional
	public void save(Fornecedor fornecedor) {
		this.repository.save(fornecedor);
	}
	
	@Transactional(readOnly=true)
	public List<Fornecedor> listar(){
		return this.repository.findAll();
	}
	
	@Transactional
	public void remove(Fornecedor fornecedor) {
		this.repository.delete(fornecedor);
	}
	
	@Transactional
	public void removeById(Long id) {
		this.repository.deleteById(id);
	}
	
	@Transactional
	public void atualizar(Fornecedor fornecedor) {
		this.repository.saveAndFlush(fornecedor);
	}
	
	@Transactional(readOnly=true)
	public Fornecedor getById(Long id) {
		return this.repository.getOne(id);
	}
	
	@Transactional(readOnly=true)
	public Fornecedor getByNome(String nome) {
		return this.repository.findByNome(nome);
	}
	
	@Transactional(readOnly=true)
	public Fornecedor getByEmail(String email) {
		return this.repository.findByEmail(email);
	}

}
