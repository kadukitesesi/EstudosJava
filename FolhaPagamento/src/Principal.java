import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        BancoDeHoras salario = new BancoDeHoras();

        System.out.println("Me fale quantas horas você trabalha por semana: ");
        salario.horasFixas = entrada.nextDouble();
        System.out.println("Você fez horas extras? ");
        salario.fezHoraExtra = entrada.nextBoolean();
        System.out.println("Qual o valor da sua hora em dias normais? ");
        salario.valorHora = entrada.nextDouble();
        System.out.println("Qual o valor da sua hora extra? ");
        salario.valorHoraExtra = entrada.nextDouble();

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        if(salario.fezHoraExtra) {
            System.out.println("Me diga quantas");
            salario.horasExtras = entrada.nextDouble();
            
        } else {
            salario.horasExtras = 0;
        }

        double calculoSalario = folhaPagamento.calculaSalario(salario);

        System.out.printf("O seu salário é de: %.2f", calculoSalario);


    }
}
