package cryptAlgorithms;

import java.util.Scanner;

public class CesarCipher {
	private static Scanner in;

	public void run() {
		in = new Scanner(System.in);
		System.out.print("1. Encryption\n2. Decryption\nChoose(1,2): ");
		int option = in.nextInt();
		in.nextLine();

		if (option == 1) {
			System.out.println("---Encrypting---");
			encrypt();
		} else if (option == 2) {
			System.out.println("---Decrypting---");
			decrypt();
		} else {
			System.out.println("Incorrect Choice");
		}
	}

	public void encrypt() {
		Scanner t = new Scanner(System.in);
		Scanner v = new Scanner(System.in);
		char ascii;
		char x, y;
		System.out.println("Enter plain text: ");
		String txt = t.nextLine();
		System.out.println("Enter encryption key: ");
		int key = v.nextInt();

		while (key >= 26) {// key max 26 number = alphabet number
			key = key - 26;
		}
		for (int i = 0; i < txt.length(); i++) {
			// uppercase letters treatment
			if (txt.charAt(i) >= 97 && txt.charAt(i) <= 122) {// lowercase letters in ASCII
				if ((int) (txt.charAt(i) + key) > 122) {
					x = (char) (txt.charAt(i) + key);
					y = (char) (x - 122);
					ascii = (char) (96 + y);
					System.out.print(ascii);
				} else {
					ascii = (char) (txt.charAt(i) + key);
					System.out.print(ascii);
				}
			}
			// lowercase letters treatment
			if (txt.charAt(i) >= 65 && txt.charAt(i) <= 90) {
				if (txt.charAt(i) + key > 90) {
					x = (char) (txt.charAt(i) + key);
					y = (char) (x - 90);
					ascii = (char) (64 + y);
					System.out.print(ascii);
				} else {
					ascii = (char) (txt.charAt(i) + key);
					System.out.print(ascii);
				}
			}
		}
	}

	public void decrypt() {
		Scanner t = new Scanner(System.in);
		Scanner v = new Scanner(System.in);
		char ascii;
		char x, y;
		System.out.println("Enter plain text: ");
		String txt = t.nextLine();
		System.out.println("Enter encryption key: ");
		int key = v.nextInt();

		while (key >= 26) {
			key = key - 26;
		}

		for (int i = 0; i < txt.length(); i++) {

			if (txt.charAt(i) >= 97 && txt.charAt(i) <= 122) {
				if ((int) (txt.charAt(i) + key) > 122) {
					x = (char) (txt.charAt(i) + key);
					y = (char) (x - 122);
					ascii = (char) (96 - y);
					System.out.print(ascii);
				} else {
					ascii = (char) (txt.charAt(i) - key);
					System.out.print(ascii);
				}
			}

			if (txt.charAt(i) >= 65 && txt.charAt(i) <= 90) {
				if (txt.charAt(i) + key > 90) {
					x = (char) (txt.charAt(i) + key);
					y = (char) (x - 90);
					ascii = (char) (64 - y);
					System.out.print(ascii);
				} else {
					ascii = (char) (txt.charAt(i) - key);
					System.out.print(ascii);
				}
			}
		}
	}
}