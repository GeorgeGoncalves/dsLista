package com.example.dslist.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dslist.dto.GameDTO;
import com.example.dslist.dto.GameDTOTodos;
import com.example.dslist.entidades.Game;
import com.example.dslist.repositorio.GameRepositorio;

@Service
public class GameServico {
	
	@Autowired
	private GameRepositorio gameRepositorio;

	public List<GameDTO> findAll() {
		List<Game> resultado = gameRepositorio.findAll();
		List<GameDTO> dto = resultado.stream().map(x ->
			new GameDTO(x)).toList();				
		return dto;
	}

	public GameDTOTodos findById(Long id) {
		Game resultado = gameRepositorio.findById(id).get();
		GameDTOTodos dtoTodos = new GameDTOTodos(resultado);
		return dtoTodos;
	}
}
