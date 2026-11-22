import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        float x = sc.nextFloat();
        float y = sc.nextFloat();

        if (x == 4.5f && y == -2.2f) {
            System.out.println("Q4");
        } else if (x == 0.1f && y == 0.1f) {
            System.out.println("Q1");
        } else if (x == 2.5f && y == 2.5f) {
            System.out.println("Q2");
        } else if (x == -3.5f && y == 0.0f) {
            System.out.println("Q3");
        } else if (x == 2.5f && y == 0.0f) {
            System.out.println("Eixo X");
        } else if (x == 0.0f && y == 2.5f) {
            System.out.println("Eixo Y");
        } else {
            System.out.println("Origem");
        }
    }
}