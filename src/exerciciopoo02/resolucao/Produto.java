package exerciciopoo02.resolucao;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public void status() {
        System.out.println("Produto: " + nome +
                "\nPreço: " + preco +
                "\nQuantidade: " + quantidade);
        System.out.println(totalValorEmEstoque());
    }

    public double totalValorEmEstoque() {
        return quantidade * preco;
    }

    public void adicionarProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeProdutos(int quatidade) {
        this.quantidade -= quatidade;
    }

}
