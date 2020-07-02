package banque.entites;

/**
 * Classe conceptualisant un livret A
 * 
 * @author antoinelabeeuw
 *
 */
public class LivretA extends Compte {
	/** taux */
	private double taux;

	/**
	 * Getter
	 * 
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/**
	 * Setter
	 * 
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	/**
	 * Constructeur
	 * 
	 */
	public LivretA() {
	}

	/**
	 * Constructeur
	 * 
	 * @param numero : le numero du compte
	 * @param solde  : le solde du compte
	 * @param taux   : le taux de remuneration
	 */
	public LivretA(String numero, double solde, double taux) {
		super(numero, solde);
		this.taux = taux;
	}

}
