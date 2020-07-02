package TestJpa.entites;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Classe conceptualisant l'emprunt d'un livre par un client
 * 
 * @author antoinelabeeuw
 *
 */
@Entity
@Table(name = "EMPRUNT")
public class Emprunt {
	/** identifiant de l'emprunt */
	@Id
	@Column(name = "ID")
	private int id;
	/** date du debut de l'emprunt */
	@Column(name = "DATE_DEBUT")
	private LocalDate dateDebut;
	/** date de fin de l'emprunt */
	@Column(name = "DATE_FIN")
	private LocalDate dateFin;
	/** delai */
	@Column(name = "DELAI")
	private int delai;
	/** identifiant du client */
	@ManyToOne
	@JoinColumn(name = "ID_CLIENT")
	private Client Client;
	@ManyToMany
	@JoinTable(name="COMPO",
		joinColumns=@JoinColumn(name="ID_LIV", referencedColumnName = "ID"),
		inverseJoinColumns=@JoinColumn(name="ID_EMP", referencedColumnName = "ID"))
	private Set<Livre> livres;

	/** Getter
	 * @return the livres
	 */
	public Set<Livre> getLivres() {
		return livres;
	}

	/** Setter
	 * @param livres the livres to set
	 */
	public void setLivres(Set<Livre> livres) {
		this.livres = livres;
	}



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
	 * @return the dateDebut
	 */
	public LocalDate getDateDebut() {
		return dateDebut;
	}

	/**
	 * Setter
	 * 
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

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
	 * @return the delai
	 */
	public int getDelai() {
		return delai;
	}

	/**
	 * Setter
	 * 
	 * @param delai the delai to set
	 */
	public void setDelai(int delai) {
		this.delai = delai;
	}

	/**
	 * Getter
	 * 
	 * @return the idClient
	 */
	public Client getClient() {
		return Client;
	}

	/**
	 * Setter
	 * 
	 * @param idClient the idClient to set
	 */
	public void setClient(Client Client) {
		this.Client = Client;
	}

	/**
	 * Constructeur
	 * 
	 */
	public Emprunt() {
	}

	@Override
	public String toString() {
		return "Emprunt [id=" + id + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", delai=" + delai
				+ ", Client=" + Client + "]";
	}

}
