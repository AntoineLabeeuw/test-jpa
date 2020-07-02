package banque.entites;

import java.time.LocalDateTime;

/**
 * Classe qui conceptualise une operation sur un compte
 * 
 * @author antoinelabeeuw
 *
 */
/**
 * @author antoinelabeeuw
 *
 */
public class Operation {
	/** date */
	private LocalDateTime date;
	/** montant */
	private double montant;
	/** motif */
	private String motif;

	/**
	 * Getter
	 * 
	 * @return the date
	 */
	public LocalDateTime getDate() {
		return date;
	}

	/**
	 * Setter
	 * 
	 * @param date the date to set
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	/**
	 * Getter
	 * 
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}

	/**
	 * Setter
	 * 
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}

	/**
	 * Getter
	 * 
	 * @return the motif
	 */
	public String getMotif() {
		return motif;
	}

	/**
	 * Setter
	 * 
	 * @param motif the motif to set
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}

	/**
	 * Constructeur
	 * 
	 * @param date    : la date de l'operation
	 * @param montant : le montant de l'operation
	 * @param motif   : le motif de l'operation
	 */
	public Operation(LocalDateTime date, double montant, String motif) {
		super();
		this.date = date;
		this.montant = montant;
		this.motif = motif;
	}

	/**
	 * Constructeur
	 * 
	 */
	public Operation() {
	}

}
