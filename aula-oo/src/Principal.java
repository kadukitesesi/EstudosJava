import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        Carro uno = new Carro();
        uno.anoFabricacao = 2010;
        uno.cor = "Verde";
        uno.fabricante = "Fiat";
        uno.modelo = "Mili";
        uno.pessoa = new Proprietario();
        uno.pessoa.nome = "Carlos";
        uno.pessoa.cpf = "123.456.789-10";
        uno.pessoa.anoNascimento = 2003;
        uno.precoCompra = 17000;

        System.out.printf("-------Uno--------%n");

        System.out.printf("Modelo: %s%n",uno.modelo);
        System.out.printf("Ano: %d%n", uno.anoFabricacao);
        System.out.printf("Proprietário: %s%n", uno.pessoa.nome);
        System.out.printf("Valor pago: %6.2f%n", uno.precoCompra);
        uno.calcularValorRevenda();

        Carro mobi = new Carro();
        mobi.anoFabricacao = 2017;
        mobi.cor = "Azul";
        mobi.fabricante = "Fiat";
        mobi.modelo = "Mobi";
        mobi.pessoa = new Proprietario();
        mobi.pessoa.nome = "Juca";
        mobi.pessoa.cpf = "777.777.777-77";
        mobi.pessoa.anoNascimento = 2000;
        mobi.precoCompra = 27000;

        System.out.printf("-------Mobi--------%n");
        System.out.printf("Modelo: %s%n", mobi.modelo);
        System.out.printf("Ano: %d%n", mobi.anoFabricacao);
        System.out.printf("Proprietário: %s%n", mobi.pessoa.nome);
        System.out.printf("Valor da compra: %6.2f%n", mobi.precoCompra);
        mobi.calcularValorRevenda();

    }
}
