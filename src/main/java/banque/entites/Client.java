package banque.entites;

import java.time.LocalDate;

/**
 * Classe qui conceptualise un Client
 * 
 * @author antoinelabeeuw
 *
 */
/**
 * @author antoinelabeeuw
 *
 */
public class Client {
	/** nom */
	private String nom;
	/** prenom */
	private String prenom;
	/** dateDeNaissance */
	private LocalDate dateDeNaissance;

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
	 * Getter
	 * 
	 * @return the dateDeNaissance
	 */
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	/**
	 * Setter
	 * 
	 * @param dateDeNaissance the dateDeNaissance to set
	 */
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	/**
	 * Constructeur
	 * 
	 * @param nom             : le nom du client
	 * @param prenom          : le prenom du client
	 * @param dateDeNaissance : la date de naissance du client
	 */
	public Client(String nom, String prenom, LocalDate dateDeNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
	}

	/**
	 * Constructeur
	 * 
	 */
	public Client() {
	}

}
