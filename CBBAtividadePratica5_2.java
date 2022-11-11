import java.util.Scanner;

public class CBBAtividadePratica5_2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
			
		String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta","Sábado", "Domingo"};

		int i = 0; 
		do {
			System.out.println("O dia é: " + dias[i]);
			i++;
		}while (i<dias.length);

		
        entrada.close();
	}

}