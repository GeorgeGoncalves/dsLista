package com.example.dslist.entidades;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class PertencePk implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "game_id")
	private Game game;
	
	@ManyToOne
	@JoinColumn(name = "lista_id")
	private GameLista lista;
	
	public PertencePk() {
	}

	public PertencePk(Game game, GameLista lista) {
		this.game = game;
		this.lista = lista;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public GameLista getLista() {
		return lista;
	}

	public void setLista(GameLista lista) {
		this.lista = lista;
	}

	@Override
	public int hashCode() {
		return Objects.hash(game, lista);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PertencePk other = (PertencePk) obj;
		return Objects.equals(game, other.game) && Objects.equals(lista, other.lista);
	}	
}
