package ordenacao.bubble.sort;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Informe a quantidade de números que serão fornecidos: ");
			int n = sc.nextInt();
			int[] vet = new int[n];
			int aux;
			boolean controle;

			for (int i = 0; i < vet.length; i++) {
				System.out.print("Digite o " + (i + 1) + " º número: ");
				vet[i] = sc.nextInt();
			}

			System.out.println();
			System.out.print("Números digitados: ");

			for (int i = 0; i < vet.length; i++) {
				System.out.print(vet[i] + " ");
			}

			for (int i = 0; i < vet.length - 1; i++) {
				controle = true;
				for (int j = i + 1; j < vet.length; j++) {
					if (vet[i] > vet[j]) {
						aux = vet[i];
						vet[i] = vet[j];
						vet[j] = aux;
						controle = false;
					}
				}
				if (controle) {
					break;
				}
			}

			System.out.print("\nNúmeros ordenados: ");

			for (int i = 0; i < vet.length; i++) {
				System.out.print(vet[i] + " ");
			}
		}
	}
}
