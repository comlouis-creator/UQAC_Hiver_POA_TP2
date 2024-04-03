import java.util.ArrayList;
import java.util.List;

public class GestionRetours {

	private List<Observer> observateurs = new ArrayList<>();

    public void addObservateur(Observer observateur) {
        observateurs.add(observateur);
    }

    public void notifierRetard() {
        for (Observer observateur : observateurs) {
            observateur.update();
        }
    }
	
}
