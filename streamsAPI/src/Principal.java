import com.kadukitesesi.estoque.CadastroProduto;
import com.kadukitesesi.estoque.Produto;

import java.util.List;
import java.util.stream.Stream;

public class Principal {
    public static void main(String[] args) {

        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        for (Produto produto : produtos) {
//            produto.ativar();
//            System.out.println(produto);
//        }

        Stream<Produto> stream = produtos.stream();
//        stream.forEach(produto -> {
//            produto.ativar();
//            System.out.println(produto);
//        });

       stream.filter(produto -> produto.getQuantidade() > 10);

    }
}
