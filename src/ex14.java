import java.util.Scanner;

public class ex14 {
	
	public static void main(String[] args) {
		
		int [][] matriz = new int [3][3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quadrado mágico 3x3 de 1 a 9");
		
		System.out.print("\nInforme um número para a posição [0][0]: ");
		matriz [0][0] = sc.nextInt();
		System.out.print("Informe um número para a posição [0][1]: ");
		matriz [0][1] = sc.nextInt();
		System.out.print("Informe um número para a posição [0][2]: ");
		matriz [0][2] = sc.nextInt();
		System.out.print("Informe um número para a posição [0][0]: ");
		matriz [1][0] = sc.nextInt();
		System.out.print("Informe um número para a posição [0][1]: ");
		matriz [1][1] = sc.nextInt();
		System.out.print("Informe um número para a posição [0][2]: ");
		matriz [1][2] = sc.nextInt();
		System.out.print("Informe um número para a posição [0][0]: ");
		matriz [2][0] = sc.nextInt();
		System.out.print("Informe um número para a posição [0][1]: ");
		matriz [2][1] = sc.nextInt();
		System.out.print("Informe um número para a posição [0][2]: ");
		matriz [2][2] = sc.nextInt();
		
		if(quadradoMagico(matriz)) {
			System.out.println("\nÉ um quadrado mágico\n");
			System.out.print(matriz[0][0]+"  ");
			System.out.print(matriz[0][1]+"  ");
			System.out.print(matriz[0][2]+"\n");
			System.out.print(matriz[1][0]+"  ");
			System.out.print(matriz[1][1]+"  ");
			System.out.print(matriz[1][2]+"\n");
			System.out.print(matriz[2][0]+"  ");
			System.out.print(matriz[2][1]+"  ");
			System.out.print(matriz[2][2]+"  ");
		}else {
			System.out.println("\nNão é um quadrado mágico\n");
			System.out.print(matriz[0][0]+"  ");
			System.out.print(matriz[0][1]+"  ");
			System.out.print(matriz[0][2]+"\n");
			System.out.print(matriz[1][0]+"  ");
			System.out.print(matriz[1][1]+"  ");
			System.out.print(matriz[1][2]+"\n");
			System.out.print(matriz[2][0]+"  ");
			System.out.print(matriz[2][1]+"  ");
			System.out.print(matriz[2][2]+"  ");
		}
	}
	
	public static boolean quadradoMagico(int [][] matriz) {
		int soma = 0;
		int soma2 = 0;
		for(int j = 0; j < matriz.length; j++) {
			soma = soma + matriz[0][j];
		}
		
		for(int i = 1; i < matriz.length; i++) {
			soma2 = 0;
			for(int j = 0; j < matriz[0].length; j++) {
				soma2 = soma2 + matriz[i][j];				
			}
			if(soma2 != soma) {
				return false;
			}
		}
		
		for(int j = 0; j < matriz[0].length; j++) {
			soma2 = 0;
			for(int i = 0; i < matriz.length; i++) {
				soma2 = soma2 + matriz[i][j];
			}
			if(soma2 != soma) {
				return false;
			}
		}
		
		soma2 = 0;
		for(int i = 0; i < matriz.length; i++) {
			soma2 = soma2 + matriz[i][i];
		}
		if(soma2 != soma) {
			return false;
		}
		
		soma2 = 0;
		int i = 0;
		for(int j = matriz.length - 1; j >= 0; j--) {
			soma2 = soma2 + matriz[i][j];
			i++;
		}
		if(soma2 != soma) {
			return false;
		}
		return true;
	}	
}