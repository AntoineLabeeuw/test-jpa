package TestJpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import TestJpa.entites.Livre;

/**
 * classe éxécutable pour les tests JPA
 * 
 * @author antoinelabeeuw
 *
 */
public class TestJpa {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println(entityManager);

		// selection d'un livre selon l'ID et affichage du titre et de l'auteur
		Livre l = entityManager.find(Livre.class, 1);
		System.out.println("Titre : " + l.getTitre() + ", Auteur : " + l.getAuteur());

		// insertion d'un nouveau livre dans la BDD : necessite un contexte de
		// transaction
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();

		Livre newLivre = new Livre(6, "Biochimie", "Donald VOET et Judith G.VOET");
		try {
			entityManager.persist(newLivre);
			tx.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// modification du livre avec l'id 5

		Livre livreAmodifier = entityManager.find(Livre.class, 5);
		if (livreAmodifier != null) {
			livreAmodifier.setTitre("Du plaisir dans la cuisine");
		}
		try {
			entityManager.merge(livreAmodifier);
			tx.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// requête JPQL sur le titre du livre
		String titreARecuperer = "Biochimie";
		TypedQuery<Livre> query = entityManager
				.createQuery("select l from Livre l where titre='" + titreARecuperer + "'", Livre.class);
		List<Livre> listeLivres = query.getResultList();
		System.out.println(listeLivres.get(0));

		// requête JPQL sur l'auteur
		String auteurARecuperer = "Jules Verne";
		TypedQuery<Livre> query2 = entityManager
				.createQuery("select l from Livre l where auteur='" + auteurARecuperer + "'", Livre.class);
		List<Livre> listeLivres2 = query2.getResultList();
		System.out.println(listeLivres2.get(0));

		// suppression d'un livre
		Livre livreASupprimer = entityManager.find(Livre.class, 2);
		if (livreASupprimer != null) {
			System.out.println("Suppression du livre : " + livreASupprimer);
			entityManager.remove(livreASupprimer);
			tx.commit();
		}

		// affichage de tous les livres dans la BDD
		TypedQuery<Livre> query3 = entityManager.createQuery("select l from Livre l", Livre.class);
		List<Livre> listetousLivres = query3.getResultList();
		for (Livre livre : listetousLivres) {
			System.out.println("Titre : " + livre.getTitre() + "\t Auteur : " + livre.getAuteur());
		}

		entityManager.close();
		entityManagerFactory.close();
	}

}
