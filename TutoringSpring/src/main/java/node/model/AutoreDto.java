package node.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import node.entity.AutoreEntity;

public class AutoreDto {
	@JsonProperty("AutoreResponse")
	
	
		
	
 

	private String idAutore;

	private String nome;
	
	private String cognome;
	
	private Integer eta;



	public String getIdAutore() {
		return idAutore;
	}

	public void setIdAutore(String idAutore) {
		this.idAutore = idAutore;
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

	public Integer getEta() {
		return eta;
	}

	public void setEta(Integer eta) {
		this.eta = eta;
	}

	public AutoreDto() {
		
	}

	public AutoreDto(AutoreEntity autore) {
		this.idAutore=autore.getId();
		this.nome=autore.getNome();
		this.cognome=autore.getCognome();
		this.eta=autore.getEta();
	}
	
	
}