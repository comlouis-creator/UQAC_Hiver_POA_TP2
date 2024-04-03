import java.util.List;

public class RechercheParISBN implements Strategy {

	private List<Livre> livres;

    public RechercheParISBN(List<Livre> livres) {
        this.livres = livres;
    }
	
	@Override
    public void rechercherLivre(String critere) {
		System.out.println("Résultats de la recherche par ISBN pour : " + critere);
        for (Livre livre : livres) {
            if (livre.getISBN().equals(critere)) {
                System.out.println(livre.getTitre() + " - " + livre.getAuteur());
                return; // Arrête la recherche après avoir trouvé le premier livre correspondant
            }
        }
        System.out.println("Aucun livre trouvé avec l'ISBN : " + critere);
    }
	
}
