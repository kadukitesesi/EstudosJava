import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);


        int[] alunos = new int[] {
                2,
                3,
                5
        };

        System.out.println("Qual posição você quer ver");
       int posicao = leia.nextInt();

        System.out.println(alunos[posicao]);



    }
}
