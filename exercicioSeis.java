import java.util.Scanner;

public class exercicioSeis {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

         int contador = 1;
         int numero;
         int menor = Integer.MAX_VALUE; 
 
         do {
             System.out.print("Digite um número inteiro positivo: ");
             numero = entrada.nextInt();
 
             if (numero > 0) {
                 if (numero < menor) {
                     menor = numero;
                 }
                 contador++;
             } 
 
         } while (contador <= 10);
 
         System.out.println("O menor número digitado foi: " + menor);
 
         entrada.close();
     }
 }
   