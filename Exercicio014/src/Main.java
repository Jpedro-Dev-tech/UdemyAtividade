import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float taxa = 0.08f;
        float taxad = 0.18f;
        float superTaxa = 28.0f;
        float salario;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Salario: ");
        salario = scanner.nextFloat();
        if (salario >= 4500.00) {
            superTaxa = salario * superTaxa / 100;
            System.out.println("Super Taxa: R$ " + String.format("%.2f", superTaxa));
        } else if (salario > 3000.00) {
            taxa = (salario * taxa) / 100;
            System.out.println("Taxa: R$ " + String.format("%.2f", taxa));
        } else {
            System.out.println("Isento");
        }
    }
}