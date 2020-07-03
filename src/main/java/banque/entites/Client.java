package banque.entites;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Classe qui conceptualise un Client
 * 
 * @author antoinelabeeuw
 *
 */
/**
 * @author antoinelabeeuw
 *
 */
@Entity
@Table(name = "CLIENT")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	/** nom */
	@Column(name = "NOM")
	private String nom;
	/** prenom */
	@Column(name = "PRENOM")
	private String prenom;
	/** dateDeNaissance */
	@Column(name = "DATE_NAISSANCE")
	private LocalDate dateDeNaissance;
	/** adresse */
	@Embedded
	private Adresse adresse;
	/** banque */
	@ManyToOne
	@JoinColumn(name = "ID_BANQUE")
	private Banque banque;
	/** comptes */
	@ManyToMany
	@JoinTable(name = "LISTE_COMPTE", joinColumns = @JoinColumn(name = "ID_CLIENT", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_COMPTE", referencedColumnName = "ID"))
	private List<Compte> comptes;

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
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * Setter
	 * 
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

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
	 * Getter
	 * 
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Setter
	 * 
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Getter
	 * 
	 * @return the dateDeNaissance
	 */
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	/**
	 * Setter
	 * 
	 * @param dateDeNaissance the dateDeNaissance to set
	 */
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	/**
	 * Getter
	 * 
	 * @return the banque
	 */
	public Banque getBanque() {
		return banque;
	}

	/**
	 * Setter
	 * 
	 * @param banque the banque to set
	 */
	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	/**
	 * Getter
	 * 
	 * @return the comptes
	 */
	public List<Compte> getComptes() {
		return comptes;
	}

	/**
	 * Setter
	 * 
	 * @param comptes the comptes to set
	 */
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	/**
	 * permet d'ajouter un compte à la liste de comptes
	 * 
	 * @param cpt : le compte à ajouter
	 */
	public void addCompte(Compte cpt) {
		comptes.add(cpt);
	}

	/**
	 * Permet d'enlever un compte à la liste de comptes
	 * 
	 * @param cpt : le compte à enlever
	 */
	public void removeCompte(Compte cpt) {
		comptes.remove(cpt);
	}

	/**
	 * Constructeur
	 * 
	 */
	public Client() {
		this.comptes = new ArrayList<Compte>();
	}

}
