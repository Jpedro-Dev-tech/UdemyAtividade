import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a hora inicial do jogo: ");
        int horaInicial = scanner.nextInt();
        System.out.print("Digite a hora final do jogo: ");
        int horaFinal = scanner.nextInt();
        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaInicial - horaFinal;
        }else{
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.println("A duração do jogo foi de: " + duracao + "Horas");
    }
}