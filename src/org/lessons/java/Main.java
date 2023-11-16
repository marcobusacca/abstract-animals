package org.lessons.java;

import org.lessons.java.pojo.Aquila;
import org.lessons.java.pojo.Cane;
import org.lessons.java.pojo.Delfino;
import org.lessons.java.pojo.Passerotto;
import org.lessons.java.pojo.abs.Animale;
import org.lessons.java.pojo.inter.INuotante;
import org.lessons.java.pojo.inter.IVolante;

public class Main {

	public static void main(String[] args) {
		
		final int ANIMALI_COUNT = 4;
		
		Animale[] animali = new Animale[ANIMALI_COUNT];
		
		Cane c1 = new Cane("cane-1");
		Passerotto p1 = new Passerotto("passerotto-1");
		Aquila a1 = new Aquila("aquila-1");
		Delfino d1 = new Delfino("delfino-1");
		
		animali[0] = c1;
		animali[1] = p1;
		animali[2] = a1;
		animali[3] = d1;
		
		
		for (int i = 0; i < ANIMALI_COUNT; i++) {
			
			Animale a = animali[i];
			
			System.out.println(a);
			System.out.print("\nDorme: ");
			a.dormi();
			System.out.print("Verso: ");
			a.verso();
			System.out.print("Mangia: ");
			a.mangia();
		}
	}
	public static void faiVolare(IVolante volante) {
		volante.vola();
	}
	public static void faiNuotare(INuotante nuotante) {
		nuotante.nuota();
	}
}
