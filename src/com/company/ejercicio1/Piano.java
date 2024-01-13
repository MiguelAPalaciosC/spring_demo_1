package com.company.ejercicio1;

public class Piano implements InstrumentoMusical {
	
	private Afinar afinar;

	public Piano() {
		super();
	}
	
	public Piano(Afinar afinar) {
		super();
		this.afinar = afinar;
	}

	@Override
	public String obtenerSonido() {
		return "Obteniendo el sonido del piano";
	}

	@Override
	public String obtenerAfinacion() {
		return "Piano - " + afinar.afinacion();
	}

}
