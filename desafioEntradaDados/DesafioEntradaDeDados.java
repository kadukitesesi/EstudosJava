import java.util.Scanner;

public class DesafioEntradaDeDados {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Me diga seu nome: ");
        String nome = entrada.nextLine();
        System.out.printf("Agora me diga o valor da sua hora: ");
        double valorHora = entrada.nextFloat();
        System.out.printf("Me diga a quantidade de horas que você rabalha na semana: ");
        int quantidadeHoras = entrada.nextInt();
        System.out.printf("Me diga o valor do desconto: ");
        double valorDescontos = entrada.nextFloat();


        System.out.printf("Nome:%s\nValor por hora:%2f\n Quantidade de horas: %d\n Valor do desconto: %2f\n",nome,valorHora,quantidadeHoras,valorDescontos);

    }
}
