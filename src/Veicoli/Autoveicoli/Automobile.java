package Veicoli.Autoveicoli;

import Veicoli.Veicolo;

public class Automobile extends Veicolo implements CambioManuale{

	@Override
	public void accelera() {
		System.out.println("Accelera Automobile");
	}

	@Override
	public void decelera() {
		System.out.println("Decelera automobile");
	}
	
	@Override
	public void giroDiProva() {
		innestaRetromarcia();
		accelera();
		decelera();
		
		
	}
}
