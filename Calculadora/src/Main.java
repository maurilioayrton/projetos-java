import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner resultado = new Scanner(System.in);
        int valor1, valor2, result;

        System.out.println("Digite o primeiro valor: ");
        valor1 = resultado.nextInt();
        System.out.println("Digite o segundo valor: ");
        valor2 = resultado.nextInt();

        result = valor1 + valor2;

        System.out.println("A soma dos dois valores é: " + result);

        }
    }