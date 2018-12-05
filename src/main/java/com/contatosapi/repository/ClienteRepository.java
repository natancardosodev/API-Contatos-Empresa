/**
 * 
 */
package com.contatosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contatosapi.model.Cliente;

/**
 * @author natancardosodev
 *
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	public Cliente findByNome(String nome);
	
	public Cliente findByEmail(String email);
	
}
