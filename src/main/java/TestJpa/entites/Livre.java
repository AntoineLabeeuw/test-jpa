package TestJpa.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe conceptualisant un livre
 * 
 * @author antoinelabeeuw
 *
 */
@Entity
@Table(name = "LIVRE")
public class Livre {
	/** identifiant */
	@Id
	@Column(name = "ID")
	private Integer id;
	/** titre du livre */
	@Column(name = "TITRE")
	private String titre;
	/** auteur du livre */
	@Column(name = "AUTEUR")
	private String auteur;

	/**
	 * Getter
	 * 
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * Setter
	 * 
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * Getter
	 * 
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/**
	 * Setter
	 * 
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Constructeur
	 * 
	 * @param id
	 * @param titre
	 * @param auteur
	 */
	public Livre(Integer id, String titre, String auteur) {
		super();
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
	}

	/**
	 * Constructeur
	 * 
	 */
	public Livre() {
		super();
	}

	@Override
	public String toString() {
		return "Livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur + "]";
	}

}
