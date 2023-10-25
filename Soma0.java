import java.util.Scanner;

public class Soma0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha um número: ");
        int num1 = scanner.nextInt();
        System.out.print("Escolha outro número: ");
        int num2 = scanner.nextInt();

        int resultado = num1 + num2;

        System.out.println("O resultado da soma de "+ num1 +" e "+ num2 +" é igual a "+ resultado);

        scanner.close();
    }
}