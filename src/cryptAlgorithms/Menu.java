package cryptAlgorithms;

import java.util.*;

public class Menu {

	public static void menu() {
		System.out.println("\n====Crypt Calculator====\n");
		System.out.println("0. Exit");
		System.out.println("1. César cipher");
		System.out.println("2. Playfair cipher");
		System.out.println("3. Vigenere cipher");
		System.out.println("4. Product cipher");
		System.out.println("Option:");
	}

	public static void main(String[] args) {
		int option;
		Scanner input = new Scanner(System.in);

		CesarCipher cc = new CesarCipher();
		PlayfairCipher pf = new PlayfairCipher();
		VigenereCipher vg = new VigenereCipher();
		ProductCipher pr = new ProductCipher();

		do {
			menu();
			option = input.nextInt();

			switch (option) {
			case 0:
				break;
			case 1:
				cc.run();
				break;
			case 2:
				pf.run();
				break;
			case 3:
				vg.run();
				break;
			case 4:
				pr.run();
				break;

			default:
				System.out.println("Invalid option");
			}
		} while (option != 0);
	}
}
