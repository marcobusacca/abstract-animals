package org.lessons.java.pojo;

import org.lessons.java.pojo.abs.Animale;

public class Passerotto extends Animale {
	
	public static final String VERSO = "Chirp";
	public static final String CIBO = "Semini";
	
	
	public Passerotto(String nome) {
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
				+ "Passerotto\n"
				+ super.toString();
	}
}
