import java.util.Scanner;

public class Soma2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha um número: ");
        int num1 = scanner.nextInt();
        System.out.print("Escolha outro número: ");
        int num2 = scanner.nextInt();
        
        int resultado = somatoria(num1, num2);
        System.out.println("A soma é: "+ resultado);
        
    }
    public static int somatoria(int num1, int num2) {
        return num1 + num2;
    }
}
