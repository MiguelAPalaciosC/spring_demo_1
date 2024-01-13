package com.company.ejercicio1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MiAppSpring {

	public static void main(String[] args) {
		
		//cargar la configuracion de spring desde un archivo xml
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		InstrumentoMusical instrumento = context.getBean("miInstrumento", InstrumentoMusical.class);
		
		System.out.println(instrumento.obtenerSonido());
		
		System.out.println(instrumento.obtenerAfinacion());
		
		//violin
		
		Violin violin = context.getBean("miViolin", Violin.class);
		
		System.out.println(violin.obtenerSonido());
		
		System.out.println(violin.obtenerAfinacion());

		context.close();// cerramos contexto de spring 
	}

}
