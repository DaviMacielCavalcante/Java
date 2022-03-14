package conceitos_basicos;

public class Main {

	public static void main(String[] args) {

		No_e_encadeamento<String> no1 = new No_e_encadeamento<>("Conteúdo no1");
		
		No_e_encadeamento<String> no2 = new No_e_encadeamento<>("Conteúdo no2");
		
		no1.setProxNo(no2);
		
		No_e_encadeamento<String> no3 = new No_e_encadeamento<>("Conteúdo no3");
		
		no2.setProxNo(no3);
		
		No_e_encadeamento<String> no4 = new No_e_encadeamento<>("Conteúdo no4");
		
		no3.setProxNo(no4);
		
		// no1 -> no2 -> no3 -> no4 -> null
		
		System.out.println(no1);
		System.out.println(no1.getProxNo());
		System.out.println(no2.getProxNo());
		System.out.println(no3.getProxNo());
		System.out.println(no4.getProxNo());
		
		System.out.println("--------------------------");
		
		System.out.println(no1);
		System.out.println(no1.getProxNo());
		System.out.println(no1.getProxNo().getProxNo());
		System.out.println(no1.getProxNo().getProxNo().getProxNo());
		System.out.println(no1.getProxNo().getProxNo().getProxNo().getProxNo());
	}

}
