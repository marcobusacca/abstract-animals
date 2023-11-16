package org.lessons.java.pojo;

import org.lessons.java.pojo.abs.Animale;

public class Aquila extends Animale {
	
	public static final String VERSO = "Screech";
	public static final String CIBO = "Topi";
	
	
	public Aquila(String nome) {
		super(nome);
	}
	
	
	@Override
	public void verso() {
		System.out.println(VERSO);
	}
	@Override
	public void mangia() {
		System.out.println(CIBO);
	}
	
	
	@Override
	public String toString() {
		
		return "-----------------------\n"
				+ "Aquila\n"
				+ super.toString();
	}
}
