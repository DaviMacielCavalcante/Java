package appl;

import entities.Client_Secao_19;

public class Exemplo_7 {

	public static void main(String[] args) {

		Client_Secao_19 c1 = new Client_Secao_19("Maria", "maria@gmail.com");
		Client_Secao_19 c2 = new Client_Secao_19("Maria", "maria@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		String s3 = new String("Test");
		String s4 = new String("Test");
		
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		

	}

}
