/**
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
 * casas decimais conforme exemplos.
 * Fórmula da área: area = π . raio2
 * Considere o valor de π = 3.14159
 */
public class Main {
    public static void main(String[] args) {
        double raio = 100.64;//Valor do raio do círculo
        double pi = 3.14159; //Valor de π
        double area = pi * raio * raio; //Cálculo da área do círculo
        System.out.println("Valor do raio: " + raio);
        System.out.printf("Área do círculo: %.4f%n", area);
    }
}