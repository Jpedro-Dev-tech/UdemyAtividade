import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu numero: ");
        int num = scanner.nextInt();
        System.out.println("Valor da hora trabalhada: ");
        float valor = scanner.nextInt();
        System.out.println("Digite a quantidade de horas: ");
        int hora = scanner.nextInt();
        double horasTrabalhada = valor * hora;

        System.out.println("Valor total de horas do empregado " + num + " é " + horasTrabalhada);
    }
}