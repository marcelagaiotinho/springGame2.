package com.senai.marcela.PrjGame.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.marcela.PrjGame.entities.Jogo;


public interface JogoRepository extends JpaRepository <Jogo, Long> { 

}
