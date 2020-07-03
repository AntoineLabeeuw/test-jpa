package banque.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Classe qui conceptualise une banque
 * 
 * @author antoinelabeeuw
 *
 */
@Entity
@Table(name = "BANQUE")
public class Banque {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	/** nom */
	@Column(name = "NOM")
	private String nom;
	@OneToMany(mappedBy = "banque")
	private List<Client> clients;

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
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
	 * ajoute un client à la liste de client
	 * 
	 * @param cl : le client a ajouter
	 */
	public void addClient(Client cl) {
		clients.add(cl);
	}

	/**
	 * enleve un client à la liste de client
	 * 
	 * @param cl : le client a enlever
	 */
	public void removeClient(Client cl) {
		clients.remove(cl);
	}

	/**
	 * Constructeur
	 * 
	 */
	public Banque() {
		super();
		this.clients = new ArrayList<Client>();
	}

}
