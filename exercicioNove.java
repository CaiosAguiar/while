import java.util.Scanner;

public class exercicioNove {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int codigo, quantidade;
        double totalCompra = 0;

        do {
            System.out.print("Digite o código do produto: ");
            codigo = entrada.nextInt();

            System.out.print("Digite a quantidade desejada: ");
            quantidade = entrada.nextInt();

            double preco = 0;
            String produto = "";

            switch (codigo) {
                case 100:
                    produto = "Cachorro Quente";
                    preco = 1.20;
                    break;
                case 101:
                    produto = "Bauru Simples";
                    preco = 1.30;
                    break;
                case 102:
                    produto = "Bauru com Ovo";
                    preco = 1.50;
                    break;
                case 103:
                    produto = "Hambúrguer";
                    preco = 1.20;
                    break;
                case 104:
                    produto = "Cheeseburguer";
                    preco = 1.30;
                    break;
                case 105:
                    produto = "Refrigerante";
                    preco = 1.00;
                    break;
                default:
                    System.out.println("Código inválido! Tente novamente");
                    continue; 
            }

            double totalProduto = preco * quantidade;
            totalCompra += totalProduto;

            System.out.print("Você comprou " + quantidade+ produto+ totalProduto);

            System.out.print("Deseja comprar mais algum produto? (s/n): ");
            System.out.println();

        } while (codigo == 's');

        System.out.print("Valor total da compra: " + totalCompra);

        entrada.close();
    }
}
