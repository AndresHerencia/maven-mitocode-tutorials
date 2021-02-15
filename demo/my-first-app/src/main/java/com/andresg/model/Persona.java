package com.andresg.model;

public class Persona {

    private int id;
    private String nombres;
	private int edad;

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

    @Override
	public String toString() {
		return "Persona [id=" + id + ", nombres=" + nombres + ", edad=" + edad + "]";
	}

}
