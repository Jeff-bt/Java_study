package construtor;

public class UsandoConstrutor {
	
	private String profissao;
	private float salario;
	
	//construtor
	public UsandoConstrutor(String profissao, float salario) {
		this.profissao = profissao;
		this.salario = salario;
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public float getSalario() {
		return salario;
	}
	
	
}



