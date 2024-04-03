import java.util.ArrayList;
import java.util.List;

public class Utilisateur implements Observer {

	private String nom;
	private List<Notification> notifications;

    public Utilisateur(String nom) {
        this.nom = nom;
        this.notifications = new ArrayList<>();
    }
	
	@Override
    public void update() {
		 System.out.println("Notification de retard pour l'utilisateur " + nom);
    }
	
	public void recevoirNotification(Notification notification) {
        notifications.add(notification);
        System.out.println("Notification reçue par l'utilisateur " + nom + ": " + notification.getMessage());
    }
	
}
