package com.example.dslist.dto;

import java.io.Serializable;

import org.springframework.beans.BeanUtils;

import com.example.dslist.entidades.Game;

public class GameDTOTodos implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String titulo;
	private Integer ano;
	private String genero;
	private String plataforma;
	private Double pontuacao;
	private String imgUrl;
	private String curtaDescricao;
	private String longaDescricao;
	
	public GameDTOTodos() {
	}
	
	public GameDTOTodos(Game entidade) {
		BeanUtils.copyProperties(entidade, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public Double getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Double pontuacao) {
		this.pontuacao = pontuacao;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getCurtaDescricao() {
		return curtaDescricao;
	}

	public void setCurtaDescricao(String curtaDescricao) {
		this.curtaDescricao = curtaDescricao;
	}

	public String getLongaDescricao() {
		return longaDescricao;
	}

	public void setLongaDescricao(String longaDescricao) {
		this.longaDescricao = longaDescricao;
	}	
}
