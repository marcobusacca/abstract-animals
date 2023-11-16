package org.lessons.java.pojo;

import org.lessons.java.pojo.abs.Animale;

public class Delfino extends Animale {
	
	public static final String VERSO = "Clicks";
	public static final String CIBO = "Pesci";
	
	
	public Delfino(String nome) {
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
				+ "Delfino\n"
				+ super.toString();
	}
}
