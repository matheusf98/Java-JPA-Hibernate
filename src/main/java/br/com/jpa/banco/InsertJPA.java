package br.com.jpa.banco;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.jpa.banco.model.Cliente;

public class InsertJPA {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BancoPU");
		EntityManager em = emf.createEntityManager();

		cliente.setNome("COCA-COLA");
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
