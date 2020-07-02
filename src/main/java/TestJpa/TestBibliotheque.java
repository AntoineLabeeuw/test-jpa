package TestJpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import TestJpa.entites.Emprunt;
import TestJpa.entites.Livre;
import TestJpa.entites.Client;

/**
 * Classe éxécutable pour un essai de bibliothèque
 * 
 * @author antoinelabeeuw
 *
 */
public class TestBibliotheque {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction etx = entityManager.getTransaction();
		etx.begin();
		
		// extraction des livres d'un emprunt
		System.out.println("-------------------- livres de l'emprunt n° 1 --------------------");
		Emprunt emp = entityManager.find(Emprunt.class, 1);
		System.out.println(emp.getLivres());
		System.out.println("------------------------------------------------------------------");
		
		// extraction des emprunts d'un client
		System.out.println("-------------------- Emprunts du client n° 1 --------------------");
		Client client = entityManager.find(Client.class, 1);
		System.out.println("Nom : " + client.getNom() + " Prenom : " + client.getPrenom());
		System.out.println(client.getEmprunts());
		System.out.println("------------------------------------------------------------------");
		
		
	}

}
