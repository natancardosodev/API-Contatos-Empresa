/**
 * 
 */
package com.contatosapi.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author natancardosodev
 *
 */
@Entity
public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String email;
	
	private String telefone;
	
	private String cpf;

	/**
	 * @return id para acessar
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id para modificar
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return nome para acessar
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome para modificar
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return email para acessar
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email para modificar
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return telefone para acessar
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone para modificar
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * @return cpf para acessar
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf para modificar
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
