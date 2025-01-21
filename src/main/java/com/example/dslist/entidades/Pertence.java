package com.example.dslist.entidades;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Pertence implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private PertencePk id = new PertencePk();
	
	private Integer posicao;
	
	public Pertence() {
	}

	public Pertence(Game game, GameLista lista, Integer posicao) {
		id.setGame(game);
		id.setLista(lista);
		this.posicao = posicao;
	}

	public PertencePk getId() {
		return id;
	}

	public void setId(PertencePk id) {
		this.id = id;
	}

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pertence other = (Pertence) obj;
		return Objects.equals(id, other.id);
	}	
}
