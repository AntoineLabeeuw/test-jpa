package banque;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import banque.entites.Adresse;
import banque.entites.AssuranceVie;
import banque.entites.Banque;
import banque.entites.Client;
import banque.entites.Compte;
import banque.entites.LivretA;
import banque.entites.Operation;
import banque.entites.Virement;

public class Application {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banque_essai");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction etx = entityManager.getTransaction();
		etx.begin();
		System.out.println(entityManager);
		// Création de banques
		Banque bNP = new Banque();
		bNP.setNom("BNP Pas paris haut");
		Banque caisseDeDilapidation = new Banque();
		caisseDeDilapidation.setNom("Caisse de Dilapidation");
		entityManager.persist(bNP);
		entityManager.persist(caisseDeDilapidation);
		// Création de plusieurs comptes
		LivretA c2 = new LivretA();
		c2.setNumero("2");
		c2.setSolde(300.03);
		c2.setTaux(0.60);

		AssuranceVie c3 = new AssuranceVie();
		c3.setNumero("3");
		c3.setSolde(400.04);
		c3.setDateFin(LocalDate.of(2020, 04, 21));
		c3.setTaux(1.2);

		// Création de différentes opérations
		Operation op1 = new Operation();
		op1.setDate(LocalDateTime.of(2019, 01, 07, 12, 21));
		op1.setMontant(-6.78);
		op1.setMotif("Paiement CB*0102 - Sandwich triangle");

		Virement vir1 = new Virement();
		vir1.setDate(LocalDateTime.of(2017, 01, 01, 18, 30));
		vir1.setMontant(-249.99);
		vir1.setMotif("Achat banquette");
		vir1.setBeneficiaire("BUT");

		op1.setCompte(c2);
		vir1.setCompte(c3);
		c2.addOperation(op1);
		c3.addOperation(vir1);

		// Création d'un client
		Client cl1 = new Client();
		cl1.setDateDeNaissance(LocalDate.of(1987, 02, 20));
		cl1.setNom("Client 1");
		cl1.setPrenom("Jeannette");
		Adresse adr1 = new Adresse(21, "Rue du poisson", 13000, "Marseille");
		cl1.setAdresse(adr1);
		cl1.addCompte(c2);
		cl1.addCompte(c3);
		cl1.setBanque(bNP);
		// persistance


		// TP5
		// le client cl1 a deja 2 comptes : 1 assurance vie, 1 livret 1. Question deja
		// faite
		// Les operations sont deja ajoutées aux comptes c2 et c3
		// Ajout d'un 2e client au compte c2
		Client cl2 = new Client();
		cl2.setDateDeNaissance(LocalDate.of(1987, 02, 20));
		cl2.setNom("Client 2");
		cl2.setPrenom("Jeannot");
		Adresse adr2 = new Adresse(23, "Rue des poissons", 13000, "Marseille");
		cl2.setAdresse(adr2);
		cl2.setBanque(bNP);
		cl2.addCompte(c2);
		c2.addClient(cl2);
		c2.addClient(cl1);
		
		entityManager.persist(c2);
		entityManager.persist(c3);
		entityManager.persist(op1);
		entityManager.persist(vir1);
		entityManager.persist(cl1);
		entityManager.persist(cl2);

		etx.commit();

		System.out.println("-------------------- Clients bénéficiaires du livret A --------------------");
		TypedQuery<Compte> query = entityManager.createQuery("select cl from Compte cl where numero=2",
				Compte.class);
		Compte compte1 = query.getSingleResult();
		List<Client> lCli = compte1.getClients();
		for (Client client : lCli) {
			System.out.println(client.getPrenom());
		}
		entityManager.close();
		entityManagerFactory.close();

	}

}
