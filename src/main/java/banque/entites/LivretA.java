package banque.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Classe conceptualisant un livret A
 * 
 * @author antoinelabeeuw
 *
 */
@Entity
@Table(name = "LIVRET_A")
public class LivretA extends Compte {
	/** taux */
	@Column(name = "TAUX")
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
		super();
	}

}
