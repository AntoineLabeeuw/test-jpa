package banque.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Classe conceptualisant un compte
 * 
 * @author antoinelabeeuw
 *
 */
@Entity
@Table(name = "COMPTE")
@Inheritance(strategy = InheritanceType.JOINED)
public class Compte {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	/** numero */
	@Column(name = "NUMERO", unique = true)
	private String numero;
	/** solde */
	@Column(name = "SOLDE")
	private double solde;
	@OneToMany(mappedBy = "compte")
	private List<Operation> operations;
	@ManyToMany(mappedBy = "comptes")
	private List<Client> clients;

	/**
	 * Getter
	 * 
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Setter
	 * 
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter
	 * 
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter
	 * 
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Permet d'ajouter une opération au compte
	 * 
	 * @param op
	 */
	public void addOperation(Operation op) {
		operations.add(op);
		this.solde += op.getMontant();
	}

	/**
	 * permet de supprimer une opération du compte
	 * 
	 * @param op
	 */
	public void removeOperation(Operation op) {
		operations.remove(op);
		this.solde -= op.getMontant();
	}

	/**
	 * Getter
	 * 
	 * @return the operations
	 */
	public List<Operation> getOperations() {
		return operations;
	}

	/**
	 * Setter
	 * 
	 * @param operations the operations to set
	 */
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	/**
	 * permet d'ajouter un client a la liste de clients du compte
	 * 
	 * @param cl : le client a ajouter
	 */
	public void addClient(Client cl) {
		clients.add(cl);
	}

	/**
	 * Permet d'enlever un client de la liste des clients du compte
	 * 
	 * @param cl : le client à enlever
	 */
	public void removeClient(Client cl) {
		clients.remove(cl);
	}

	/**
	 * Getter
	 * 
	 * @return the clients
	 */
	public List<Client> getClients() {
		return clients;
	}

	/**
	 * Setter
	 * 
	 * @param clients the clients to set
	 */
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	/**
	 * Constructeur
	 * 
	 */
	public Compte() {
		super();
		this.operations = new ArrayList<Operation>();
		this.clients = new ArrayList<Client>();
	}

}
