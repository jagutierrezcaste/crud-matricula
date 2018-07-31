package com.tcs.crudmatricula.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.tcs.crudmatricula.business.CursoBusiness;
import com.tcs.crudmatricula.model.Curso;


@RestController
public class CursoController {
	
	@Autowired
	private CursoBusiness cursoBusiness;

	@GetMapping("/curso")
	public List<Curso> listarClientes() {
		return cursoBusiness.listarCursos();
	}
	
	@GetMapping("/curso/{idCurso}")
	public Curso getCurso(@PathVariable("idCurso") long idCurso) {
		return cursoBusiness.getCurso(idCurso);
	}
	
	@PostMapping("/curso")
	public Curso createCurso(@RequestBody Curso curso) {
	return cursoBusiness.createCurso(curso);	
	}
	
	@PutMapping("/curso")
	public Curso updateCurso(@RequestBody Curso curso) {
		return cursoBusiness.updateCurso(curso);
	}
	
	@DeleteMapping("curso/{idCurso}")
	public Curso deleteCurso(@PathVariable("idCurso") long idCurso) {
		return cursoBusiness.deleteCurso(idCurso);
	}


}