package com.tcs.crudmatricula.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Curso {
	private long id;
	private String nombre;
	private int creditos;
	private String area;
}