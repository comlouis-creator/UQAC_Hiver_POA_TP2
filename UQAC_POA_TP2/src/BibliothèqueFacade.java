import java.util.List;

public class BibliothèqueFacade {

	private GestionnaireLivres gestionnaireLivres;
	
    private GestionRetours gestionRetours;

    public BibliothèqueFacade() {
        this.gestionnaireLivres = GestionnaireLivres.getInstance();
        this.gestionRetours = new GestionRetours();
    }
	
 // Méthode pour emprunter un livre
    public void emprunterLivre(Livre livre) {
        // Vérifier si le livre est disponible
        if (!livre.isEmprunte()) {
            // Effectuer l'emprunt du livre
            livre.emprunter();
            System.out.println("Le livre \"" + livre.getTitre() + "\" a été emprunté avec succès.");
        } else {
            System.out.println("Le livre \"" + livre.getTitre() + "\" est déjà emprunté.");
        }
    }

    // Méthode pour retourner un livre
    public void retournerLivre(Livre livre) {
        // Vérifier si le livre est emprunté
        if (livre.isEmprunte()) {
            // Effectuer le retour du livre
            livre.retourner();
            System.out.println("Le livre \"" + livre.getTitre() + "\" a été retourné avec succès.");
        } else {
            System.out.println("Le livre \"" + livre.getTitre() + "\" n'est pas emprunté.");
        }
    }

    // Méthode pour rechercher un livre par titre
    public Livre rechercherParTitre(String titre) {
        return gestionnaireLivres.rechercherParTitre(titre);
    }

    // Méthode pour rechercher un livre par auteur
    public List<Livre> rechercherParAuteur(String auteur) {
        return gestionnaireLivres.rechercherParAuteur(auteur);
    }

    // Méthode pour rechercher un livre par ISBN
    public Livre rechercherParISBN(String isbn) {
        return gestionnaireLivres.rechercherParISBN(isbn);
    }

    // Méthode pour obtenir la liste des livres empruntés
    public List<Livre> getLivresEmpruntes() {
        return gestionnaireLivres.getLivresEmpruntes();
    }

    // Méthode pour obtenir la liste des livres disponibles
    public List<Livre> getLivresDisponibles() {
        return gestionnaireLivres.getLivresDisponibles();
    }
    
}
