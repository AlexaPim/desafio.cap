package questoes;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String nome, senha;

		System.out.println(
				"Sua senha deve conter no mínimo 1 letra minúscula, 1 letra maiúscula, números e caracteres especiais: !@#$%^&*()-+ ");
		System.out.println("Nela deve conter no mínimo 6 digitos utilizando a instrução inicial para que sua senha seja considerada forte.");

		System.out.println("Usuario: ");
		nome = scanner.next();
		System.out.println("Senha: ");
		senha = scanner.next();

		if (senhaForte(senha) == 0) {
			System.out.println("Senha forte.");

		} else {
			System.out.println("Senha inválida");
			System.out.println("Você vai precisar de pelo menos " + senhaForte(senha) + " dos caracteres da instrução inicial.");
		}

	}

	public static int senhaForte(String senha) {

		int tamanhoFaltaSenha = 0;

		if (senha.length() < 6);
			
		tamanhoFaltaSenha = 6 - senha.length();

		boolean encontrouNumero = true;
		boolean encontrouMaiuscula = true;
		boolean encontrouMinuscula = true;
		boolean encontrouSimbolo = true;

		int caracQueFalta = 0;

		for (char c : senha.toCharArray()) {
			if (c >= '0' && c <= '9') {
				encontrouNumero = false;
			} else if (c >= 'A' && c <= 'Z') {
				encontrouMaiuscula = false;
			} else if (c >= 'a' && c <= 'z') {
				encontrouMinuscula = false;
			} else if (("!@#$%^&*()-+").indexOf(c) != (-1)) {
				encontrouSimbolo = false;
			}
		}
		if (encontrouMinuscula) {
			caracQueFalta += 1;
		}
		if (encontrouNumero) {
			caracQueFalta += 1;
		}
		if (encontrouSimbolo) {
			caracQueFalta += 1;
		}
		if (encontrouMaiuscula) {
			caracQueFalta += 1;
		}
		if (caracQueFalta >= tamanhoFaltaSenha) {
			return caracQueFalta;
		} else {
			return tamanhoFaltaSenha;
		}

	}

}
