
public class EmpruntCommand implements Command {

	private Livre livre;

    public EmpruntCommand(Livre livre) {
        this.livre = livre;
    }

    @Override
    public void execute() {
        livre.emprunter();
    }
	
}
