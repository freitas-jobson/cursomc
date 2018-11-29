package br.com.unipe.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriasResouces {
	
	@RequestMapping(method=RequestMethod.GET)
	public String Lista() {
		return "rest está funcionando!";
	}
}
