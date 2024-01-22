public class Principal {
    public static void main(String[] args) {

        Carro uno = new Carro();
        uno.anoFabricacao = 2023;
        uno.cor = "Verde";
        uno.fabricante = "Fiat";
        uno.modelo = "Mili";

        System.out.printf("-------Uno--------%n");

        System.out.printf("Modelo: %s%n",uno.modelo);
        System.out.printf("Ano: %d%n", uno.anoFabricacao);

        System.out.printf("-------Mobi--------%n");

        Carro mobi = new Carro();
        mobi.anoFabricacao = 2022;
        mobi.cor = "Azul";
        mobi.fabricante = "Fiat";
        mobi.modelo = "Mobi";

        System.out.printf("Modelo: %s%n", mobi.modelo);
        System.out.printf("Ano: %d%n", mobi.anoFabricacao);

    }
}
