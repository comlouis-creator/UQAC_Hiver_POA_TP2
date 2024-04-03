
public class RetourCommand implements Command {

	private Livre livre;

    public RetourCommand(Livre livre) {
        this.livre = livre;
    }

    @Override
    public void execute() {
        livre.retourner();
    }
	
}
