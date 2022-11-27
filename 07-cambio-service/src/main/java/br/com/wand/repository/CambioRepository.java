package br.com.wand.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wand.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long>{
	
	Cambio findByFromAndTo(String from, String to);

}
