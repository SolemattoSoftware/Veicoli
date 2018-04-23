package Veicoli.Aeromobili;

import Veicoli.Veicolo;;

public class Aereo extends Veicolo implements Volante{
	
	@Override
	public void accelera() {
		
		System.out.println("Accellera");
	}
	
	@Override
	public void decelera() {
		System.out.println("Decellera");
	}
	
	public void decolla() {
		System.out.println("Decolla");
	}
	
	 public void atterra() {
		System.out.println("Atterra");
	}
	 
	 public void giroDiProva() {
		 this.accelera();
		 this.decolla();
		 this.decelera();
		 this.atterra();
	 }
	 
	
}
