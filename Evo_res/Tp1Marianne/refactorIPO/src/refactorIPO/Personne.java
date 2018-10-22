package refactorIPO;

public class Personne {
	
	String nom;
	
	int numeroRue;
	String  nomRue;
	String ville;
	int codePostal;
	String pays;
	
	public Personne(String nom, int numeroRue, String nomRue, String ville, int codePostal, String pays) {
		super();
		this.nom = nom;
		this.numeroRue = numeroRue;
		this.nomRue = nomRue;
		this.ville = ville;
		this.codePostal = codePostal;
		this.pays = pays;
	}
	
	/**
	 * Déménagement de l'étudiant à l'adresse indiquée par les champs si dessous 
	 * @param numeroRue
	 * @param nomRue
	 * @param ville
	 * @param codePostal
	 * @param pays
	 */
	
	public void MoveIn(int numeroRue, String nomRue, String ville, int codePostal, String pays){
		this.numeroRue = numeroRue;
		this.nomRue = nomRue;
		this.ville = ville;
		this.codePostal = codePostal;
		this.pays = pays;
	}
	
	/**
	 * Refactor: réification des éléments de l'adresse en une classe adresse qui gère l'adresse (diminution d'argument/clarification du constructeur et movein)
	 */
	
	public static void main(String[] args){
		Etudiant p = new Etudiant("Michel", 17, "rue des orchidés", "Pignan", 34540,"France",20112018);
	}

}