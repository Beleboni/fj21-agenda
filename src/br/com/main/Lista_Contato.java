package br.com.main;

import java.util.List;

import br.com.dao.ContatoDAO;
import br.com.model.Contato;

public class Lista_Contato {
	
	ContatoDAO contatoDAO = new ContatoDAO();
	
	List<Contato> contatos = contatoDAO.getLista();
	
	for(Contato contato : contatos){
		System.out.println("Nome: " + contato.getNome());
		System.out.println("E-mail: " + contato.getEmail());
		System.out.println("Endereço: " + contato.getEndereco());
		System.out.println("Data de Nascimento: " + contato.getDataNascimento().getTime());
	}
}
