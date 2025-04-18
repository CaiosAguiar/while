import java.util.Scanner;

public class exercicioCinco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 1;

        do {
            System.out.println("5 * " + contador + " = " +(5 * contador));
            contador++;
        } while (contador <= 10);
    entrada.close();
    }
}
