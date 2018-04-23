package Veicoli.Aeromobili;

import Veicoli.Aeromobili.Controllo.TorreDiControllo;
import Veicoli.Veicolo;

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

    @Override
	 public void giroDiProva() {
        TorreDiControllo torre = new TorreDiControllo();
        this.accelera();
        torre.autorizzaDecollo(this);
        this.decelera();
        torre.autorizzAtterraggio(this);
	 }
	 
	
}
