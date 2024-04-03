import java.util.ArrayList;
import java.util.List;

public class GestionRetards {

	private List<Observer> observateurs = new ArrayList<>();

    public void addObservateur(Observer observateur) {
        observateurs.add(observateur);
    }

    public void notifierRetard(Notification notification) {
    	for (Observer observateur : observateurs) {
            observateur.update();
            if (observateur instanceof Utilisateur) {
                ((Utilisateur) observateur).recevoirNotification(notification);
            }
        }
    }
	
}
