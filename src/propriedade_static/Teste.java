package propriedade_static;

public class Teste {
	public static void main(String[] args) {
		Papel p1 = new Papel("azul");
		Papel p2 = new Papel("azul");
		Papel p3 = new Papel("verde");
		Papel p4 = new Papel("verde");
		Papel p5 = new Papel("verde");
		
		System.out.println(Papel.getQuantidade());
	}
}
