package Persone;

import Veicoli.Veicolo;

public class Viaggiatore extends Persona {

	public Viaggiatore(String nome, String cognome, int eta) {
		super(nome, cognome, eta);
		
	}
	
	public Viaggiatore(String nome, String cognome, int eta, String telefono) {
		super(nome,cognome,eta,telefono);
	}

	public void viaggia(Veicolo veicolo) {
		veicolo.giroDiProva();
	}
}
