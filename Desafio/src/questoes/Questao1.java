package questoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		List<String> degraus = new ArrayList<String>();
		int qntDegraus;

		System.out.print("Digite a quantidade de degraus: ");
		qntDegraus = leia.nextInt();

		for (int n = 0; n < qntDegraus; n++) {
				degraus.add(" ".repeat(qntDegraus - n) + "*".repeat(n + 1));
		}
		

		for (String d : degraus) {
			System.out.println(d);
		}

	}


}
