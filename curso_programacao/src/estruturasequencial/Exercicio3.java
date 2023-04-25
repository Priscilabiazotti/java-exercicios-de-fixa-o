package estruturasequencial;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int A, B, C, D, dif;

		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

		dif = A * B - C * D;

		System.out.println("DIFERENCA = " + dif);

		sc.close();
	}
}
