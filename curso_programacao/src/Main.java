import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int hora;

		System.out.println("Quantas horas?");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia!");
		} else if (hora < 18) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");
		}

		System.out.println("Digite os números para somar:");
		sc.nextInt(); // adiciona essa linha para aguardar a entrada do usuário

		int x = sc.nextInt();
		int soma = 0;
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}

		System.out.println("Soma = " + soma);
		sc.close();
	}
}
