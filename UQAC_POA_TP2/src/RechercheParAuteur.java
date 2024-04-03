import java.util.List;

public class RechercheParAuteur implements Strategy {

	private List<Livre> livres;

    public RechercheParAuteur(List<Livre> livres) {
        this.livres = livres;
    }
	
	@Override
    public void rechercherLivre(String critere) {
        System.out.println("Résultats de la recherche par auteur pour : " + critere);
        for (Livre livre : livres) {
            if (livre.getAuteur().toLowerCase().contains(critere.toLowerCase())) {
                System.out.println(livre.getTitre() + " - " + livre.getAuteur());
            }
        }
    }
	
}
