package node.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "libri")

	    
public class LibroEntity {
	
	@Id
	@Column(name ="id_libro")
	private int id_libro;
	
	@Column(nullable=false, name="titolo")
	private String titolo;
	
	@Column(name="numero_pagine")
	private int numeroPagine;
	
	
	
	
	

	@ManyToOne
	@JoinColumn(name="id_autore")
	private AutoreEntity id;

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

	public AutoreEntity getId() {
		return id;
	}

	public void setId(AutoreEntity id) {
		this.id = id;
	}

	
	
	
}
