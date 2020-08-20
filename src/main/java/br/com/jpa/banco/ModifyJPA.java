package br.com.jpa.banco;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.jpa.banco.model.Cliente;

public class ModifyJPA {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BancoPU");
		EntityManager em = emf.createEntityManager();

		cliente.setNome("CAELUM");
		cliente.setId(3);
		em.getTransaction().begin();
		em.merge(cliente);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
