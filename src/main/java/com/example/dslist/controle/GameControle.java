package com.example.dslist.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dslist.dto.GameDTO;
import com.example.dslist.dto.GameDTOTodos;
import com.example.dslist.servico.GameServico;

@RestController
@RequestMapping(value = "/games")
public class GameControle {
	
	@Autowired
	private GameServico gameservico;
	
	@GetMapping
	public List<GameDTO> findAll(){
		List<GameDTO> resultado = gameservico.findAll();
		return resultado;
	}
	
	@GetMapping(value = "/{id}")
	public GameDTOTodos findById(@PathVariable Long id) {
		GameDTOTodos resultado = gameservico.findById(id);
		return resultado;
	}	
}
