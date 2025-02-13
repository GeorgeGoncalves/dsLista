package com.example.dslist.dto;

import java.io.Serializable;

import com.example.dslist.entidades.Game;

public class GameDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String titulo;
	private Integer ano;
	private String imgUrl;	
	private String curtaDescricao;
	
	public GameDTO() {
	}

	public GameDTO(Game entidade) {
		super();
		id = entidade.getId();
		titulo = entidade.getTitulo();
		ano = entidade.getAno();
		imgUrl = entidade.getImgUrl();
		curtaDescricao = entidade.getCurtaDescricao();
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getCurtaDescricao() {
		return curtaDescricao;
	}	
}
