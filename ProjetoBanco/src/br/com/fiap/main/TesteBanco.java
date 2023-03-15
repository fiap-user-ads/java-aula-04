package br.com.fiap.main;

import br.com.fiap.beans.Banco;
import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;

public class TesteBanco {
	public static void main(String[] args) {
		Banco objBanco = new Banco();
		Cliente objCliente = new Cliente();
		Endereco objEndereco = new Endereco();
		
		// entrada
		objBanco.setNomeBanco("Itau");
		objBanco.setAgencia(123);
		objBanco.setCliente(objCliente);
		objBanco.setEndereco(objEndereco);
			
		objCliente.setNomeCliente("Erick");	
		objCliente.setIdade(18);
		objCliente.setRg("123123-2");
		objCliente.setNumeroCartao(1231231);
		
		objEndereco.setLogradouro("Fiap 4 andar");
		objEndereco.setNumeroEndereco(173);
		objEndereco.setBairro("Paulista");
		objEndereco.setMunicipio("Sao Paulo");
				
		// saida
		System.out.println("Nome do banco: " + objBanco.getNomeBanco() + 
							"\nAgencia : " + objBanco.getAgencia() +
							"\n---" +
							"\nNome do cliente: " + objBanco.getCliente().getNomeCliente() +
							"\nIdade do cliente: " + objBanco.getCliente().getIdade() +
							"\nRG do cliente: " + objBanco.getCliente().getRg() +
							"\nN do cartao: " + objBanco.getCliente().getNumeroCartao() +
							"\n---" +
							"\nEndereço: " + objBanco.getEndereco().getLogradouro() +
							"\nNumero: " + objBanco.getEndereco().getNumeroEndereco() +
							"\nBairro: " + objBanco.getEndereco().getBairro() +
							"\nMunicipio: " + objBanco.getEndereco().getMunicipio());
	}
}