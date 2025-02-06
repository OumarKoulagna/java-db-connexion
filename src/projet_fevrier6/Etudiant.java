package projet_fevrier6;

public class Etudiant {
	private String nom;
	private String prenom;
	private String mail;
	private int age;
	
	//contructeur avec parametres
	public Etudiant(String nom, String prenom, String mail, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.age = age;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	//fonction _toString
	 @Override
	    public String toString() {
	        return "Etudiant [Nom=" + nom + ", Prénom=" + prenom + ", Email=" + mail + ", Âge=" + age + "]";
	    }
	
	

}
