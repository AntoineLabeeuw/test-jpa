package banque.entites;

import java.time.LocalDateTime;

/**
 * Classe qui conceptualise un virement d'un compte vers un beneficiaire
 * 
 * @author antoinelabeeuw
 *
 */
public class Virement extends Operation {
	/** beneficiaire */
	private String beneficiaire;

	/**
	 * Getter
	 * 
	 * @return the beneficiaire
	 */
	public String getBeneficiaire() {
		return beneficiaire;
	}

	/**
	 * Setter
	 * 
	 * @param beneficiaire the beneficiaire to set
	 */
	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}

	/**
	 * Constructeur
	 * 
	 * @param date         : la date du virement
	 * @param montant      : le montant du virement
	 * @param motif        : le motif du virement
	 * @param beneficiaire : le beneficiaire du virement
	 */
	public Virement(LocalDateTime date, double montant, String motif, String beneficiaire) {
		super(date, montant, motif);
		this.beneficiaire = beneficiaire;
	}

	/**
	 * Constructeur
	 * 
	 */
	public Virement() {
	}

}
