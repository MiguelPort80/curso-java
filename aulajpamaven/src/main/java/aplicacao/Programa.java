package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(null,"eric dyer", "ericdyer@gmail.com");
		Pessoa p2 = new Pessoa(null,"Ed perpin", "edperpin@gmail.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		/*em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.getTransaction().commit();*/
		
		Pessoa p3 = em.find(Pessoa.class, 2);
		
		IO.println(p3);
		
		IO.println("Pronto");
		
		em.close();
		emf.close();
	}

}
