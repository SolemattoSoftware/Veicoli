import Persone.Viaggiatore;
import Veicoli.Aeromobili.Aereo;


class Main {

    public static void main(String[] args) {

        Aereo piper = new Aereo();


        Viaggiatore giapponese = new Viaggiatore("Yamato", "Moto", 47, "555-NoSonoGiaponesse");
        giapponese.viaggia(piper);
    }

}
