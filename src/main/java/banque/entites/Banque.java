package banque.entites;

/**
 * Classe qui conceptualise une banque
 * 
 * @author antoinelabeeuw
 *
 */
public class Banque {
	/** nom */
	private String nom;

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
	 * Constructeur
	 * 
	 * @param nom : le nom de la banque
	 */
	public Banque(String nom) {
		super();
		this.nom = nom;
	}

	/**
	 * Constructeur
	 * 
	 */
	public Banque() {
	}

}
