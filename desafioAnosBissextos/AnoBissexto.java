import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Me diga um ano de sua preferencia para eu verrificar se é bissexto ou não: %n");
        int anoInserido = entrada.nextInt();

        boolean verificaAnoBissexto = anoInserido % 400 == 0 || (anoInserido % 4 == 0 && anoInserido % 100 != 0);

        System.out.printf("É um ano bissexto?%b%n ",verificaAnoBissexto);

    }
}
