package banque.entites;

import javax.persistence.Embeddable;

/**
 * Classe qui conceptualise une adresse
 * 
 * @author antoinelabeeuw
 *
 */
@Embeddable
public class Adresse {
	/** numero */
	private int numero;
	/** rue */
	private String rue;
	/** codePostal */
	private int codePostal;
	/** ville */
	private String ville;

	/**
	 * Getter
	 * 
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Setter
	 * 
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Getter
	 * 
	 * @return the rue
	 */
	public String getrue() {
		return rue;
	}

	/**
	 * Setter
	 * 
	 * @param rue the rue to set
	 */
	public void setrue(String rue) {
		this.rue = rue;
	}

	/**
	 * Getter
	 * 
	 * @return the codePostal
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * Setter
	 * 
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * Getter
	 * 
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * Setter
	 * 
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * Constructeur
	 * 
	 * @param numero     : le numero de la rue
	 * @param rue        : la rue
	 * @param codePostal : le code postal
	 * @param ville      : la ville
	 */
	public Adresse(int numero, String rue, int codePostal, String ville) {
		super();
		this.numero = numero;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	/**
	 * Constructeur
	 * 
	 */
	public Adresse() {
	}

}
