package type_arrays;

public class TiposArrays {
	public static void main(String[] args) {
		
		String nomes[] = {"Jeff", "Esther", "Lucas"}; 
		
		//for
		for(int x = 0; x < nomes.length; x++) {
			System.out.println("nome: " + nomes[x]);
		}
		
		System.out.println("-------------------");
		
		//forEach
		for(String i: nomes) {
			System.out.println("nome: " + i);
		}
	}
}
