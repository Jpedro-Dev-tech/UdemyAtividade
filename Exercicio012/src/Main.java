/*import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        scanner.useLocale(Locale.US);
        float [] numeros = new float[5];
        numeros[0] = 0.25f;
        numeros[1] = 25.50f;
        numeros[2] = 50.75f;
        numeros[3] = 75.100f;
        numeros[4] = 100.125f;
        System.out.printf("Digite um numero: ");
        for (int i=0; i<numeros.length; i++) {
            if (numeros[i] == scanner.nextFloat()) {
                System.out.println("O numero " + numeros[i] + " Intervalo: " + i);
            }else{
                System.out.println("Fora de intervalo");
            }
        }
    }
}*/

//Correção do código acima
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double numero = sc.nextDouble();

        if (numero < 0.0 || numero > 100.0) {
            System.out.println("Fora de intervalo");
        }
        else if (numero <= 25.0) {
            System.out.println("Intervalo [0,25]");
        }
        else if (numero <= 50.0) {
            System.out.println("Intervalo (25,50]");
        }
        else if (numero <= 75.0) {
            System.out.println("Intervalo (50,75]");
        }
        else {
            System.out.println("Intervalo (75,100]");
        }

        sc.close();
    }
}