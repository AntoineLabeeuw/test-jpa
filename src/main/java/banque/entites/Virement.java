package banque.entites;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Classe qui conceptualise un virement d'un compte vers un beneficiaire
 * 
 * @author antoinelabeeuw
 *
 */
@Entity
public class Virement extends Operation {
	/** beneficiaire */
	@Column(name = "BENEFICIAIRE", length = 60)
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
	 */
	public Virement() {
		super();
	}

}
