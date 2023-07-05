package construtor;

public class Teste {

	public static void main(String[] args) {
		
		UsandoConstrutor pessoa = new UsandoConstrutor("Professor", 3000);
		
		System.out.println("Profissão: " + pessoa.getProfissao());
		System.out.println("Salário: " + pessoa.getSalario());

	}

}
