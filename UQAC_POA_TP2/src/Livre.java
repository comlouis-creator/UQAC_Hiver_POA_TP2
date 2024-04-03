import java.time.LocalDate;

public class Livre {

	private String titre;
	private String auteur;
	private String ISBN;
	private boolean emprunte;
	private LocalDate dateRetourPrevue;

	public Livre(String titre, String auteur, String ISBN) {
		this.titre = titre;
		this.auteur = auteur;
		this.ISBN = ISBN;
		this.emprunte = false;
	}

	public String getTitre() {
		return titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public String getISBN() {
		return ISBN;
	}

	public boolean isEmprunte() {
		return emprunte;
	}

	public void emprunter() {
		if (!emprunte) {
			emprunte = true;
			System.out.println("Le livre \"" + titre + "\" a été emprunté.");
		} else {
			System.out.println("Le livre \"" + titre + "\" est déjà emprunté.");
		}
	}

	public void retourner() {
		if (emprunte) {
			emprunte = false;
			System.out.println("Le livre \"" + titre + "\" a été retourné.");
		} else {
			System.out.println("Le livre \"" + titre + "\" n'a pas été emprunté.");
		}
	}

}
