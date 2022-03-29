package pratica_29_03_2022;

import java.util.Scanner;

public class Pratica_exerc_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num, result;
		System.out.println("Informe o número que deseja da Tabuada: ");
		num = input.nextDouble();
		for(int i = 0; i <= 10; i++) {
			result = num * i;
			System.out.println(num + " X " + i + " = " + result);
		}
		input.close();
	}
}
