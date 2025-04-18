import java.util.Scanner;

public class exercicioQuatro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double digiteNumero = 1;

        do {
            System.out.println("Digite um número de 10 a 20: ");
            digiteNumero = entrada.nextInt();

        } while (digiteNumero == 1);
        double divisao = digiteNumero / 2;
        System.out.println("A metade de " + digiteNumero + " é: " + divisao);

        entrada.close();
    }
    
}
