package node.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LibroDto {
	@JsonProperty("BookResponse")
	
	private int id_libro;
	private String titolo;
	private int numeroPagine;
	private String id_autore;
	

	public int getId_libro() {
		return id_libro;
	}
	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public int getNumeroPagine() {
		return numeroPagine;
	}
	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}
	public String getId_autore() {
		return id_autore;
	}
	public void setId_autore(String id_autore) {
		this.id_autore = id_autore;
	}
	
		
		
	
}
