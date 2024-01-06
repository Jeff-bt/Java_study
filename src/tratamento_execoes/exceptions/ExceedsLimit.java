package tratamento_execoes.exceptions;

public class ExceedsLimit extends Exception {
	private static final long serialVersionUID = 1L;
	
	public ExceedsLimit(String msg) {
		super(msg);
	}
}
