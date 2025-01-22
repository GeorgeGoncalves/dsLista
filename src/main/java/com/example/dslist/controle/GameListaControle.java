package com.example.dslist.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dslist.dto.GameListaDTO;
import com.example.dslist.servico.GameListaServico;

@RestController
@RequestMapping(value = "/listas")
public class GameListaControle {
	
	@Autowired
	private GameListaServico gameListaServico;
	
	@GetMapping
	public List<GameListaDTO> findAll(){
		List<GameListaDTO> resultado = gameListaServico.findAll();
		return resultado;
	}
}
