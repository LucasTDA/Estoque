package Mercado;

public class produto {

    //atributos da classe
public String nome = "TV";
public float preco = 900;
public int quantidade = 10;
private  float valorTotalEstoque;

//Construtor da classe para atualizar o valor do estoque
    public produto() {

        valorTotalEstoque = preco * quantidade;

    }
    // obtendo o valor do estoque atualizado
    public float getTotalValorEstoque() {

        return valorTotalEstoque;
    }

    // Metodo para Adicionar itens ao estoqu
    public void adicionarItens (int qtdadeAdiciona){

       quantidade += qtdadeAdiciona;
        valorTotalEstoque = preco*quantidade;

    }

    // Metodo para Remover itens do estoque
    public void removerItens(int qtdadeRemove){
        quantidade -= qtdadeRemove;

        if (quantidade < 0) {
            quantidade = 0;
        }
        valorTotalEstoque = preco * quantidade;
    }

    //Sobrepondo a operação toString
    public  String toString(){
        return "Nome: "
                + nome
                + "\nPreço: " + preco
                + "\nQuantidade: " + quantidade
                + "\nValor Total Estoque: " + getTotalValorEstoque();
    }
}




