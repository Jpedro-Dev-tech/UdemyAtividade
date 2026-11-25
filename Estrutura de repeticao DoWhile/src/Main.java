/*public class Main {
    public static void main(String[] args) {
        int contador = 0;
        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador < 5);
    }
}*/

public class Main {
    public static void main(String[] args) {
        int y = 0; //soma y mais 5 e incrementa mais 1, enquanto y for menor que x
        int x = 5;
        do {
            System.out.print(y + ",");
            y = y + 5;
            y++;
        }while (y  < x);
        System.out.println(y);
    }
}