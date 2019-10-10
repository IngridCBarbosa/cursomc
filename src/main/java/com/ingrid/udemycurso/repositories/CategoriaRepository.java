package com.ingrid.udemycurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ingrid.udemycurso.domain.Categoria;


/* camada de acesso a dados */ 

@Repository 
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>  {
	
}
