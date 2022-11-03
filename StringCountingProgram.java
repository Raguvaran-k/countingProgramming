package Data;

import java.util.HashMap;
import java.util.Scanner;

public class StringCountingProgram {

	private static int[] counter;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ram;
		int i;
		int counter[] = new int[256];
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		ram   = scanner.nextLine();

		for (i = 0; i < ram.length(); i++) {
			if (ram.charAt(i) != ' ') {

				counter[ram.charAt(i)]++;
			}
		}
		for (i = 0; i < 256; i++) {
			if (counter[i] != 0) {
				System.out.println((char) i + " = " + counter[i]);
			}
		}

	}

}
