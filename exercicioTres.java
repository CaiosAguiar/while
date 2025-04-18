import java.util.Scanner;

public class exercicioTres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

     int contador;
     contador = 1;

    System.out.println("Digite um número inteiro: ");
    int numero = entrada.nextInt();

    while (contador <= numero){
        System.out.println("Sequência: " + contador);
        contador *= 2;
    }
    entrada.close();
}
}
