import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Codigo do item: ");
        float codigo = scanner.nextFloat();
        System.out.print("Quantidade desejada: ");
        float quantidade = scanner.nextFloat();
        System.out.print("Valor do produto: ");
        float valor = scanner.nextFloat();
        valor = valor * quantidade;
        System.out.printf(String.valueOf(valor));
    }
}