package zenbakirenBatazbestekoa;

import java.util.Scanner;

public class zenbakiBatazbestekoa {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.println("Sartu 0 zenbakia: ");
		int zenb1 = sc.nextInt();

		System.out.println("Sartu beste zenbaki bat: ");
		int zenb2 = sc.nextInt();

		if (zenb1 > zenb2 || zenb1 == 0) {
			int erantz = zenb2 / 2;
			System.out.println(erantz);
		}
	}

}
