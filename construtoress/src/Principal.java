public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Carlos",1000);
        System.out.println(produto1.nome);
        System.out.println(produto1.quantidadeEstoque);
    }
}
