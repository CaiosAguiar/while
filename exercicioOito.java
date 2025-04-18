import java.util.Scanner;

public class exercicioOito {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int aluno = 1;

        while (aluno <= 5) {
            System.out.println("Aluno " + aluno + ":");

            double nota1, nota2;

            do {
                System.out.print("Digite a primeira nota: ");
                nota1 = entrada.nextDouble();

                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota inválida. Tente novamente.");
                }
            } while (nota1 < 0 || nota1 > 10);
          
            do {
                System.out.print("Digite a segunda nota: ");
                nota2 = entrada.nextDouble();

                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota inválida. Tente novamente.");
                }
            } while (nota2 < 0 || nota2 > 10);

            double media = (nota1 + nota2) / 2;
            System.out.print("Média do aluno " +media);

            aluno++;
        }

        entrada.close();
    }
}
