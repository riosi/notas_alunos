package notas_alunos;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float notas[] = new float[10];
		
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota do aluno: ");
			notas[i] = sc.nextFloat();
		}
		
		sc.close();
		
		// calcula média
		float totalNotas = 0;
		for (int i = 0; i < notas.length; i++) {
			totalNotas = totalNotas + notas[i];
		}
		
		for (float nota : notas) {
			System.out.println(nota);
		}
		
		float mediaNotas = totalNotas/notas.length;
		System.out.println("A média dos alunos é = " + mediaNotas);
	}

}
