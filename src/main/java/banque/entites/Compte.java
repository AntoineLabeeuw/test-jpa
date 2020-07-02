package banque.entites;

/**
 * Classe conceptualisant un compte
 * 
 * @author antoinelabeeuw
 *
 */
public class Compte {
	/** numero */
	private String numero;
	/** solde */
	private double solde;

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
	 * Constructeur
	 * 
	 * @param numero
	 * @param solde
	 */
	public Compte(String numero, double solde) {
		super();
		this.numero = numero;
		this.solde = solde;
	}

	/**
	 * Constructeur
	 * 
	 */
	public Compte() {
	}

}
