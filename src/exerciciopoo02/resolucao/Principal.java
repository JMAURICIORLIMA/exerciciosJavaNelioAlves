package exerciciopoo02.resolucao;

public class Principal {

    public static void main(String[] args) {

        Produto tv = new Produto();

        tv.nome = "Tv 32";
        tv.preco = 900.00;
        tv.quantidade = 10;

        tv.adicionarProduto(5);

        tv.status();
    }
}
