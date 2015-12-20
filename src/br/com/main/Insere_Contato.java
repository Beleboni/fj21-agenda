package br.com.main;

import java.util.Calendar;

import br.com.dao.ContatoDAO;
import br.com.model.Contato;

public class Insere_Contato {
	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Pedro da Alvorada");
		contato.setEmail("pedro.alvorada@hotmail.com");
		contato.setEndereco("Rua das Andradas, 980");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDAO contatoDAO = new ContatoDAO();
		contatoDAO.adciona(contato);
		
		System.out.println("Gravado com sucesso !!!");
	}
}
