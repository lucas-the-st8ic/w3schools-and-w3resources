package BasicPart1;

import java.util.Scanner;

public class Exercicio2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int primeiroNumero;
        int segundoNumero;
        int resultado;
        System.out.println("Digite o primeiro numero: ");
        primeiroNumero = input.nextInt();

        System.out.println("Digite o segundo numero: ");
        segundoNumero = input.nextInt();

        resultado = primeiroNumero + segundoNumero;

        System.out.println(primeiroNumero + " + " + segundoNumero + " = " + resultado);

    }
}
