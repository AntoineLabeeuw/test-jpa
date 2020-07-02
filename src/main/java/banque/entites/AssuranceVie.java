package banque.entites;

import java.time.LocalDate;

/**
 * Classe qui conceptualise une assurance vie.
 * 
 * @author antoinelabeeuw
 *
 */
public class AssuranceVie extends Compte {
	/** dateFin */
	private LocalDate dateFin;
	/** taux */
	private double taux;

	/**
	 * Getter
	 * 
	 * @return the dateFin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/**
	 * Setter
	 * 
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

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
	 * @param numero
	 * @param solde
	 * @param dateFin
	 * @param taux
	 */
	public AssuranceVie(String numero, double solde, LocalDate dateFin, double taux) {
		super(numero, solde);
		this.dateFin = dateFin;
		this.taux = taux;
	}

}
