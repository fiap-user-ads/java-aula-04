package br.com.fiap.beans;

public class Endereco {
	private String logradouro;
	private int numeroEndereco;
	private String bairro;
	private String municipio;
	
	// SET
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public void setNumeroEndereco(int numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	// GET
	public String getLogradouro() {
		return logradouro;
	}
	public int getNumeroEndereco() {
		return numeroEndereco;
	}
	public String getBairro() {
		return bairro;
	}
	public String getMunicipio() {
		return municipio;
	}
}
