package com.example.dslist.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dslist.entidades.Game;

public interface GameRepositorio extends JpaRepository<Game, Long>{

}
