package com.example.dslist.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dslist.dto.GameListaDTO;
import com.example.dslist.entidades.GameLista;
import com.example.dslist.repositorio.GameListaRepositorio;

@Service
public class GameListaServico {
	
	@Autowired
	private GameListaRepositorio gameListaRepositorio;
	
	public List<GameListaDTO> findAll() {
		List<GameLista> resultado = gameListaRepositorio.findAll();
		List<GameListaDTO> dto = resultado.stream().map(x ->
			new GameListaDTO(x)).toList();				
		return dto;
	}
}
