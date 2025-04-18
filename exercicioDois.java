import java.util.Scanner;

public class exercicioDois {
    public static void main(String[]args){
    Scanner entrada = new Scanner(System.in);

    int contador;
    contador = 1;
    int numeros;
    int totalPares = 1;
    int totalImpares = 1;

    while (contador <= 10) {
        System.out.println("Digite o " +contador+ "º número: ");
        numeros = entrada.nextInt();  
    
    if (numeros % 2 == 0) {
        System.out.println("Total de números pares: " + totalPares);
        totalPares++;
    } else {
        System.out.println("Total de números ímpares: " + totalImpares);
        totalImpares++;
    }
    contador++;
    }
    entrada.close();
    }
 }   

