import java.util.Scanner;

public class exercicioSete {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        int semObesidade = 0;

        do {
            System.out.print("Pessoa " + contador + ":");

            System.out.print("Digite a sua altura: ");
            double altura = entrada.nextDouble();

            System.out.print("Digite o seu peso: ");
            double peso = entrada.nextDouble();

            double imc = peso / (altura * altura);
            System.out.print("IMC: " + imc);

            if (imc >= 18.5 && imc <= 24.9) {
                semObesidade++;
            }

            contador++;

        } while (contador <= 10);

        System.out.println("Quantidade de pessoas com IMC entre 18.5 e 24.9 é: " + semObesidade);

        entrada.close();
    }
}
