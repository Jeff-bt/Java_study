package propriedade_static;

public class Papel {
	
	private String cor;
	private static int quantidade;
	
	public Papel(String cor) {
		this.cor = cor;
		quantidade++;
	}

	public static int getQuantidade() {
		return quantidade;
	}
}
