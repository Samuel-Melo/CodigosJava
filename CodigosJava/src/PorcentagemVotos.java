package atividade;

import java.util.Scanner;

public class Teste {
		
		static String nome;
		static int eleitores, nulo, branco, valido;
		static float porcNulo, porcBranco, porcValido;
		static char P = '%';
		static boolean R = false;
		
		public static void main(String[] args) {
			
			try(Scanner scn = new Scanner(System.in)) {
				
				System.out.print("Informe o nome do Município: "); nome = scn.nextLine();
			do {
				System.out.format("\n");
				System.out.print("Informe a quantidade total de eleitores: "); eleitores = scn.nextInt();
				System.out.print("Informe a quantidade de votos brancos: "); branco = scn.nextInt();
				System.out.print("Informe a quantidade de votos nulos: "); nulo = scn.nextInt();
				System.out.print("Informe a quantidade de votos validos: "); valido = scn.nextInt();
				if (nulo+branco+valido==eleitores) {
					R = true;
				}else {
					System.out.print("\nTotal de votos e eleitores não batem!\nInsira os valores novamente.");
					System.out.print("\n");
				}
			}while(R == false);
			}
			porcNulo = ((nulo*100)/eleitores);
			porcBranco = ((branco*100)/eleitores);
			porcNulo = ((nulo*100)/eleitores);
			porcValido = ((valido*100)/eleitores);
			System.out.printf("\nO município de %s teve um total de %d eleitores, sendo: ", (nome), (eleitores));
			System.out.printf("\n %.2f%c de votos brancos", (porcBranco), (P));
			System.out.printf("\n %.2f%c de votos nulos", (porcNulo), (P));
			System.out.printf("\n %.2f%c de votos validos", (porcValido), (P));
		}
	}

	}

}
