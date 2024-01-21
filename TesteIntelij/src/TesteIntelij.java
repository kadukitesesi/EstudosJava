import java.util.Scanner;

public class TesteIntelij {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Hello world!");
        int numerais = entrada.nextInt();

        for (int i = 0; i < numerais; i++) {
            System.out.printf("SIm %d%n", i);
        }

    }
}