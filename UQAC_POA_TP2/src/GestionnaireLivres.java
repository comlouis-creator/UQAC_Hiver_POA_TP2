import java.util.ArrayList;
import java.util.List;

public class GestionnaireLivres {
	
	private static GestionnaireLivres instance = new GestionnaireLivres();
	private List<Livre> livres;

    private GestionnaireLivres() {
    	// Initialise la liste de livres
        livres = new ArrayList<>();
    }

    public static GestionnaireLivres getInstance() {
        return instance;
    }
    
    // Ajouter un livre à la liste
    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    // Retirer un livre de la liste
    public void retirerLivre(Livre livre) {
        livres.remove(livre);
    }

    // Obtenir tous les livres
    public List<Livre> getLivres() {
        return livres;
    }
    
 // Rechercher un livre par titre
    public Livre rechercherParTitre(String titre) {
        for (Livre livre : livres) {
            if (livre.getTitre().equalsIgnoreCase(titre)) {
                return livre;
            }
        }
        return null; // Retourne null si aucun livre correspondant n'est trouvé
    }

    // Rechercher un livre par auteur
    public List<Livre> rechercherParAuteur(String auteur) {
        List<Livre> livresAuteur = new ArrayList<>();
        for (Livre livre : livres) {
            if (livre.getAuteur().equalsIgnoreCase(auteur)) {
                livresAuteur.add(livre);
            }
        }
        return livresAuteur;
    }

    // Rechercher un livre par ISBN
    public Livre rechercherParISBN(String isbn) {
        for (Livre livre : livres) {
            if (livre.getISBN().equals(isbn)) {
                return livre;
            }
        }
        return null;
    }

    // Obtenir la liste des livres empruntés
    public List<Livre> getLivresEmpruntes() {
        List<Livre> livresEmpruntes = new ArrayList<>();
        for (Livre livre : livres) {
            if (livre.isEmprunte()) {
                livresEmpruntes.add(livre);
            }
        }
        return livresEmpruntes;
    }

    // Obtenir la liste des livres disponibles
    public List<Livre> getLivresDisponibles() {
        List<Livre> livresDisponibles = new ArrayList<>();
        for (Livre livre : livres) {
            if (!livre.isEmprunte()) {
                livresDisponibles.add(livre);
            }
        }
        return livresDisponibles;
    }

}
