package BasicPart1;

import java.util.Scanner;

public class Exercicio1 {
    //Solicita o nome do usuário
    //depois imprime Olá e o nome
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Olá");
        System.out.println(nome);
    }
}
