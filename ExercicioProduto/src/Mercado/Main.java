package Mercado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Adicionando a entrada para o usuario digitar
       Scanner entrada = new Scanner(System.in);
       //Criando o objeto produtos
       produto produtos = new produto();
        // Printando o objeto produtos, configurado na classe produtos
       System.out.println(produtos);

       //Adicionando itens ao estoque, com a quantidade que o usuario desejar
       System.out.println("Quantos itens deseja adicionar ao estoque?");
       int qtadesProdutosA = entrada.nextInt();
        produtos.adicionarItens(qtadesProdutosA);
       System.out.println("Lista Atualizada: " + "\n" +  produtos);

       //Removendo itens do estoque, com a quantidade que o usuario desejar
       System.out.println("Quantos itens deseja remover do estoque?");
       int qtadesProdutosR = entrada.nextInt();
       produtos.removerItens(qtadesProdutosR);
       System.out.println("Lista Atualizada: " + "\n" +produtos);

       //Fechando a entrada
       entrada.close();

    }
}