package Veicoli.Acquatici;

import Veicoli.Veicolo;

public class Nave extends Veicolo {

	@Override
	public void accelera() {
		System.out.println("Accelera Nave");

	}

	@Override
	public void decelera() {
		System.out.println("Decelera Nave");

	}

	@SuppressWarnings("WeakerAccess")
	public void gettaAncora() {
		System.out.println("Getta l'ancora");
	}
	
	public void giroDiProva() {
		accelera();
		decelera();
		gettaAncora();
	}

}
