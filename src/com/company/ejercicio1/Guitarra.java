package com.company.ejercicio1;

public class Guitarra implements InstrumentoMusical{
	
	private Afinar afinar;
	
	public Guitarra() {
		super();
	}

	public Guitarra(Afinar afinar) {
		this.afinar = afinar;
	}

	@Override
	public String obtenerSonido()
	{
		return "Sonido de una guitarra";
	}

	@Override
	public String obtenerAfinacion() {
		return "Guitarra - " + afinar.afinacion();
	}
}
