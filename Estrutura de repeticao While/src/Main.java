/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira a senha: ");
        int senha = scanner.nextInt();
        while (senha != 2001) {
            System.out.println("Senha invalida");
            System.out.println("Digite a senha novamente: ");
            senha = scanner.nextInt();
        }
        System.out.println("Acesso permitido");
    }
}*/

public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        while (x > 2) {
            System.out.print(x);
            y = y + x;
            x = x - 1;
        }
        System.out.println(y);
    }
}