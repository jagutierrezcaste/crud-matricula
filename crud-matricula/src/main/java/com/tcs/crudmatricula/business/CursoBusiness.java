package com.tcs.crudmatricula.business;

import java.util.List;

import com.tcs.crudmatricula.model.Curso;

public interface CursoBusiness {
	
	List<Curso> listarCursos();
	Curso getCurso(long idCurso);
	Curso createCurso(Curso curso);
	Curso updateCurso(Curso curso);
	Curso deleteCurso(long idCurso);

}
