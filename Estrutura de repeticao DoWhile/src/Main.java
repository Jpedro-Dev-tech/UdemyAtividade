/*public class Main {
    public static void main(String[] args) {
        int contador = 0;
        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador < 5);
    }
}*/
/*
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
}*/
/*
public class Main {
    public static void main(String[] args) {
        //Soma de numeros pares de 0 a 10
        int soma = 0;
        int i = 0;
        do {
            if (i %2 == 0) {
                soma += i;
            }
            i++;
        } while (i <= 10);
        System.out.println("Soma dos números pares de 0 a 10: " + soma);
    }
}*/

public class Main {
    public static void main(String[] args) {
        //Exibindo os números de 1 a 10 usando do-while apenas os números ímpares
        int numero = 1;
        do {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
            numero++;
        } while (numero <= 10);
    }
}