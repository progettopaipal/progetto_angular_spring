package com.piero.webapp2;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utente {
	 @Id
	  private String  email;
	 private String nome;
	 private String cognome;
	private String data;
	private int cellulare;
	private String password;
	public String getEmail() {
		return email;
	}
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public String getData() {
		return data;
	}
	public int getCellulare() {
		return cellulare;
	}
	public String getPassword() {
		return password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public void setData(String data) {
		this.data = data;
	}
	public void setCellulare(int cellulare) {
		this.cellulare = cellulare;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	 
	 
}
