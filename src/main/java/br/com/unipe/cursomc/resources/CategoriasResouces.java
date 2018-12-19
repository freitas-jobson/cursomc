package br.com.unipe.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.unipe.cursomc.domain.Categoria;
import br.com.unipe.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriasResouces {
	
	@Autowired
	private CategoriaService service;
	
	/*/obs: troquei o buscar pelo find*/
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Categoria obj = service.find(id);
		return ResponseEntity.ok().body(obj);
				
	}
		
		
}

