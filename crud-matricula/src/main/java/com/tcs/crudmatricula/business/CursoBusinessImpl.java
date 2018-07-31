package com.tcs.crudmatricula.business;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import com.tcs.crudmatricula.model.Curso;


@Service
public class CursoBusinessImpl implements CursoBusiness {

	private static List<Curso> cursos;

	@PostConstruct
	public void postConstruct() {
		cursos = new ArrayList<>();

		Curso curso = new Curso();
		curso.setId(1L);
		curso.setNombre("Fisica");
		curso.setArea("Ciencias");
		
		Curso curso2 = new Curso();
		curso2.setId(2L);
		curso2.setNombre("Historia");
		curso2.setArea("Sociales");
		
		Curso curso3 = new Curso();
		curso3.setId(3L);
		curso3.setNombre("Lengua");
		curso3.setArea("Letras");
		
		cursos.add(curso);
		cursos.add(curso2);
		cursos.add(curso3);

	}

	@Override
	public List<Curso> listarCursos() {
		// TODO Auto-generated method stub
		return cursos;
	}

	@Override
	public Curso getCurso(long idCurso) {
		for (Curso curso : cursos) {
			if (curso.getId() == idCurso) {
				return curso;
			}
		}
		return null;
	}

	@Override
	public Curso createCurso(Curso curso) {
		cursos.add(curso);
		return curso;
	}

	@Override
	public Curso updateCurso(Curso curso) {
		int index = getIndex(curso.getId());
		if(index == -1) {
			return null;
		}
		cursos.set(index, curso);
		return curso;
	}
	
	private int getIndex(long idCurso) {
		for (int i=0; i< cursos.size(); i++){
			Curso curso = cursos.get(i);
			if (curso.getId() == idCurso ) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public Curso deleteCurso(long idCurso) {
		int index = getIndex(idCurso);
		if (index == -1) {
			return null;
		}
		return cursos.remove(index);
	}
}
