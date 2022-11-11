import java.util.Scanner;

public class CTExercicio03 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
			
		int numAlunos = 10;
		double[] notasAlunos = new double[numAlunos];
		int notasAcima = 0;
		int notasAbaixo = 0;
		double somaNotas = 0 ;
				
		for(int i=0; i<numAlunos; i++) {
			System.out.print("Informe a nota do " + (i+1) + "° aluno: ");
			notasAlunos[i] = entrada.nextDouble(); 
			
			somaNotas = somaNotas + notasAlunos[i];
			
			if (notasAlunos[i] >= 7) {
				notasAcima ++;
			}
			else {
				notasAbaixo ++;
			}
		}
		System.out.println("A média dos alunos é: " + somaNotas/10);
		System.out.println("Notas acima da média: " + notasAcima);
		System.out.println("Notas abaixo da média: " + notasAbaixo);
		
        entrada.close();
	}

}