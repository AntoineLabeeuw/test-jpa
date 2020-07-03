package banque.entites;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
@Entity
@Table(name = "OPERATION")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE")
public class Operation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	/** date */
	@Column(name = "DATE")
	private LocalDateTime date;
	/** montant */
	@Column(name = "MONTANT")
	private double montant;
	/** motif */
	@Column(name = "MOTIF")
	private String motif;
	/** client du compte */
	@ManyToOne
	@JoinColumn(name = "ID_COMPTE")
	private Compte compte;

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter
	 * 
	 * @return the compte
	 */
	public Compte getCompte() {
		return compte;
	}

	/**
	 * Setter
	 * 
	 * @param compte the compte to set
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}

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
	 */
	public Operation() {
	}

}
