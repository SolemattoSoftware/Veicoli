package Persone;

public class Persona {
	private String nome, cognome, telefono;
	private int eta;

	public Persona(String nome, String cognome, int eta) {
		this.setNome(nome);
		this.setCognome(cognome);
		this.setEta(eta);
	}

	public Persona(String nome, String cognome, int eta, String telefono) {
		this(nome, cognome, eta);
		this.setTelefono(telefono);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
