package com.example.dslist.dto;

import java.io.Serializable;

import com.example.dslist.entidades.GameLista;

public class GameListaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	
	public GameListaDTO() {
	}

	public GameListaDTO(GameLista entidade) {
		id = entidade.getId();
		this.nome = entidade.getNome();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}	
}
