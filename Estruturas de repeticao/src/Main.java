// Estruturas de repetição for contando de 1 a 10
/*public class Main {
    public static void main(String[] args) {
        for (int i=1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}*/

// Estruturas de repetição while contando de 10 a 1
/*public class Main {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {
            System.out.println("Valor de i: "+i);
            i--;
            }
        }
    }*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int soma = 0;

        while (x!= 0) {
            soma = soma + x;
            x = scanner.nextInt();
        }
        System.out.println(soma);
    }
}