package br.com.jpa.banco;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.jpa.banco.model.Cliente;

public class FindJPA {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BancoPU");
		EntityManager em = emf.createEntityManager();
		
		Cliente cliente = em.find(Cliente.class, 3);
		System.out.println("Nome Do Cliente: " + cliente.getNome());
		
		em.close();
		emf.close();
	}

}
