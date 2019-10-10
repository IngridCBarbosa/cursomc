package com.ingrid.udemycurso.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ingrid.udemycurso.domain.Categoria;
import com.ingrid.udemycurso.repositories.CategoriaRepository;


/* Camada de  regras de negócio */

@Service
public class CategoriaService {
	
	@Autowired // anotação que já é automaticamente isntaciada 
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
