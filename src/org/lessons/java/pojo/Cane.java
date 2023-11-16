package org.lessons.java.pojo;

import org.lessons.java.pojo.abs.Animale;

public class Cane extends Animale {
	
	public static final String VERSO = "Woof";
	public static final String CIBO = "Croccantini";
	
	
	public Cane(String nome) {
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
				+ "Cane\n"
				+ super.toString();
	}
}
