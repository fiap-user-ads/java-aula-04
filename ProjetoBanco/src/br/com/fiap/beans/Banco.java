package br.com.fiap.beans;

public class Banco {
	private String nomeBanco;
	private int agencia;
	private Cliente cliente;
	private Endereco endereco;
	
	// SET
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	// GET
	public String getNomeBanco() {
		return nomeBanco;
	}
	public int getAgencia() {
		return agencia;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public Endereco getEndereco() {
		return endereco;
	}
}
