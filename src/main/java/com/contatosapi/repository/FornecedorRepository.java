/**
 * 
 */
package com.contatosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contatosapi.model.Fornecedor;

/**
 * @author natancardosodev
 *
 */
@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
	
	public Fornecedor findByNome(String nome);
	
	public Fornecedor findByEmail(String email);
	
}
