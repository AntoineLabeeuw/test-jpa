package TestJpa.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe conceptualisant un client
 * 
 * @author antoinelabeeuw
 *
 */
@Entity
@Table(name = "CLIENT")
public class Client {
	/** identifiant */
	@Id
	@Column(name = "ID")
	private int id;
	/** nom du client */
	@Column(name = "NOM")
	private String nom;
	/** prenom du client */
	@Column(name = "PRENOM")
	private String prenom;

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
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Setter
	 * 
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Constructeur
	 * 
	 */
	public Client() {
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
}
