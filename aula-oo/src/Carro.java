public class Carro {

        // Caracteristicas
        String fabricante;
        String modelo;
        String cor;
        int anoFabricacao;
        Proprietario pessoa;
        double precoCompra;

        void calcularValorRevenda() {
              int tempoDeUso = 2023 - anoFabricacao;
              int vidaUtilEmAnos = 20;

                double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUso);

              if(valorRevenda < 0 ) {
                      valorRevenda = 0;
              }

                System.out.printf("Tempo de uso: %d%n", tempoDeUso);
                System.out.printf("Valor revenda %6.2f %n", valorRevenda);
        }

}
