import java.util.Scanner;

public class CBBAtividadePratica5_3 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
			
		String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta","Sábado", "Domingo"};

		for(int i=0; i<dias.length; i++) {
			System.out.println("O dia é: " + dias[i]);
		}

		
        entrada.close();
	}

}