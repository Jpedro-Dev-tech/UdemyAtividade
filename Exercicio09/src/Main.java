public class Main {
    public static void main(String[] args) {
        int A = 6; // Você pode alterar o valor para testar diferentes casos
        int B = 25; // Você pode alterar o valor para testar diferentes casos
        int multiplicacao = A * B;

        //Se o resto da divisão de A por B for igual a zero OU o resto da divisão de B por A for igual a zero, execute o bloco de código do if."
        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos: " + multiplicacao);
        } else {
            System.out.println("Nao sao Multiplos: " + multiplicacao);
        }
    }
}