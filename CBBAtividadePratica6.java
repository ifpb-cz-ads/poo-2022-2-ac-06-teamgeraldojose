import java.util.Scanner;

public class CBBAtividadePratica6 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
			
		int[] num = new int[10];
		int numMaior = 0;
				
		for(int i=0; i<10; i++) {
			System.out.print("Informe o " + (i+1) + "° número: ");
			num[i] = entrada.nextInt(); 
			
			if (num[i] > numMaior) {
				numMaior = num[i];
			}
		}
		for(int i=0; i<10; i++) {
			System.out.println("O " + (i+1) + "° número é: " + num[i]);
		}
		System.out.println("O maior número é: " + numMaior);
		
        entrada.close();
	}

}