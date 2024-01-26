public class Principal {
    public static void main(String[] args) {


        double areaQuadrado = AreasDiversas.calculaAreaQuadrado(10.4);
        double areaCirculo = AreasDiversas.calculaAreaCirculo(5.8);

        System.out.printf("Área do quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Área do círculo: %.2f%n", areaCirculo);

    }
}
