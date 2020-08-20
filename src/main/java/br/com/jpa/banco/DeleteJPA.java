package br.com.jpa.banco;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.jpa.banco.model.Cliente;

public class DeleteJPA {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BancoPU");
		EntityManager em = emf.createEntityManager();
		
		Cliente cliente = em.find(Cliente.class, 5);
		em.getTransaction().begin();
		em.remove(cliente);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
