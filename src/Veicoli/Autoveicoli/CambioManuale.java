package Veicoli.Autoveicoli;

interface CambioManuale {

	default void innestaRetromarcia() {
		System.out.println("Retromarcia innestata");
	}
}
