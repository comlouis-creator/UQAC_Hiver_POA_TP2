import java.util.List;

public class RechercheParTitre implements Strategy {

	private List<Livre> livres;
	
	public RechercheParTitre(List<Livre> livres) {
        this.livres = livres;
    }
	
	@Override
    public void rechercherLivre(String critere) {
		System.out.println("Résultats de la recherche par titre pour : " + critere);
        for (Livre livre : livres) {
            if (livre.getTitre().toLowerCase().contains(critere.toLowerCase())) {
                System.out.println(livre.getTitre() + " - " + livre.getAuteur());
            }
        }
    }
	
}
