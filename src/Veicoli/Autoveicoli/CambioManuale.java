package Veicoli.Autoveicoli;

public interface CambioManuale {

	default void innestaRetromarcia() {
		System.out.println("Retromarcia innestata");
	}
}
