public class ExemploBoolean {
    public static void main(String[] args){
        int quantidadeEmEstoque = 14;
        int quantidadePedido = 12;

        boolean disponibilidadeEstoque = quantidadeEmEstoque >= quantidadePedido;

        System.out.println("disponivel: " + disponibilidadeEstoque);
    }

}
