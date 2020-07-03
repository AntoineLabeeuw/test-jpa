package banque.entites;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Classe qui conceptualise une assurance vie.
 * 
 * @author antoinelabeeuw
 *
 */
@Entity
@Table(name = "ASSURANCE_VIE")
public class AssuranceVie extends Compte {
	/** dateFin */
	@Column(name = "DATE_FIN")
	private LocalDate dateFin;
	/** taux */
	@Column(name = "TAUX")
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
	 */
	public AssuranceVie() {
		super();
	}

}
