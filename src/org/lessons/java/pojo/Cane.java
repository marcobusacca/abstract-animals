package org.lessons.java.pojo;

import org.lessons.java.pojo.abs.Animale;
import org.lessons.java.pojo.inter.INuotante;

public class Cane extends Animale implements INuotante {
	
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
	public void nuota() {
		System.out.println(getNome() + " dice: sto nuotando!");
	}
	
	
	@Override
	public String toString() {
		
		return "-----------------------\n"
				+ "Cane\n"
				+ super.toString();
	}
}
