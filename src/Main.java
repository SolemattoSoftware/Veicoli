import Veicoli.Acquatici.Nave;
import Veicoli.Aeromobili.Aereo;
import Veicoli.Autoveicoli.Automobile;
import Persone.Viaggiatore;


public class Main {

	public static void main(String[] args) {
		
		//Aereo piper = new Aereo();
		Nave gommone = new Nave();
		//Automobile fiat500 = new Automobile();
		
		
		Viaggiatore giapponese = new Viaggiatore("Yamato","Moto",47,"555-NoSonoGiaponesse");
		giapponese.viaggia(gommone);
	}

}
