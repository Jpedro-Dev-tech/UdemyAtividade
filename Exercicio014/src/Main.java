//Minha primeira solução para o exercício 14 do curso de Java da Udemy, que consiste em calcular o imposto de renda de acordo com o salário do usuário.
/*
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
}*/

//Versão corrigida do exercício 14 do curso de Java da Udemy, que consiste em calcular o imposto de renda de acordo com o salário do usuário.

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        double imposto;
        if (salario <= 2000.0) {
            imposto = 0.0;
        }
        else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
    }
}

//Conclusão: A primeira versão do código continha erros de cálculo e lógica, enquanto a segunda versão corrige esses problemas e calcula corretamente o imposto de renda com base nas faixas salariais.
