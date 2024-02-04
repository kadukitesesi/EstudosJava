import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Calculo calculo = new Calculo();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero1 = entrada.nextDouble();

        System.out.println("Digite outro número: ");
        double numero2 = entrada.nextDouble();

        double calculado  = calculo.mediaNumeros(numero1, numero2);
        System.out.printf("Média: %.2f %n",calculado);
    }
}
