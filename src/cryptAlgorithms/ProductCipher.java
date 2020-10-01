package cryptAlgorithms;

import java.util.*;

public class ProductCipher {
	public void run() {
		int sub_key, len, i, x = 0, y = 0, j = 0, z = 0;
		String pt, cipher;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Plain text message");
		pt = sc.nextLine();
		pt = pt.toUpperCase();
		len = pt.length();
		char[] c1 = new char[len];
		char[] ct = new char[len];
		char[] rfc = new char[len];
		c1 = pt.toCharArray();
		System.out.println("\nEnter Key value for substitution cipher");
		sub_key = sc.nextInt();
		System.out.println("...........ENCRYPTION............ \nPlain Text:- " + pt);
		for (i = 0; i < len; i++) {
			x = (c1[i] + sub_key);
			if (x > 90) {
				y = x - 90;
				ct[i] = (char) (65 + (y - 1));
			} else
				ct[i] = (char) (x);
		}
		for (i = 0; i < len; i = i + 2) {
			rfc[j] = ct[i];
			j++;
		}
		for (i = 1; i < len; i = i + 2) {
			rfc[j] = ct[i];
			j++;
		}
		cipher = new String(rfc);
		System.out.println("Cipher Text:- " + cipher);
		System.out.println(".........DECRYPTION........\n CIPHER TEXT:- " + cipher);
		len = cipher.length();
		if (len % 2 != 0) {
			z = (len / 2);
			z = z + 1;
		} else
			z = (len / 2);
		rfc = cipher.toCharArray();
		j = z;
		for (i = 0, x = 0; i < z && j < len && x < len; i++, j++) {
			ct[x] = rfc[i];
			x++;
			ct[x] = rfc[j];
			x++;
		}
		for (i = 0; i < len; i++) {
			x = (ct[i] - sub_key);
			if (x < 65) {
				y = 65 - x;
				rfc[i] = (char) (90 - (y - 1));
			} else
				rfc[i] = (char) (x);

		}
		cipher = new String(rfc);
		System.out.println("PLAIN TEXT:- " + cipher);
	}
}
