import java.util.Scanner;

public class CBBAtividadePratica5_1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
			
		String dias[] = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta","Sábado", "Domingo"};
		int i = 0; 
		while (i<dias.length){
			System.out.println("O dia é: " + dias[i]);
			i++;
		}

		
        entrada.close();
	}

}