import java.util.Scanner;

public class ExameCortisol {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Cortisol: ");
        double cortisol = entrada.nextDouble();

        //Operador lógico && (and)
        boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4;
        System.out.printf("Seu cortisol está normal?  %b%n",resultadoNormal);

        boolean resultadoAnormal = cortisol  <  6.0 || cortisol > 18.4;

        System.out.printf("Seu  cortisol está anormal? %b", resultadoAnormal);
    }
}
