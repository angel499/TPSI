package model;

import java.math.BigInteger;

public class prodotto{
	private String categoria, codice, marca,modello,descrizione;
	private double prezzo;
	private BigInteger quantita;
	public prodotto(String categoria, String codice, String marca, String modello, String descrizione, double prezzo,
			BigInteger quantita) {
		super();
		this.categoria = categoria;
		this.codice = codice;
		this.marca = marca;
		this.modello = modello;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.quantita = quantita;
	}
	
	public prodotto() {
		super();
		this.categoria = "";
		this.codice = "";
		this.marca = "";
		this.modello = "";
		this.descrizione = "";
		this.prezzo = 0;
		this.quantita = new BigInteger("0");
	}
	
	

	@Override
	public String toString() {
		return "prodotto [categoria=" + categoria + ", codice=" + codice + ", marca=" + marca + ", modello=" + modello
				+ ", descrizione=" + descrizione + ", prezzo=" + prezzo + ", quantita=" + quantita + "]";
	}
	
	
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public BigInteger getQuantita() {
		return quantita;
	}

	public void setQuantita(BigInteger quantita) {
		this.quantita = quantita;
	}
	
	
	
	
	
}
