public class FolhaPagamento {

    double calculaSalario(BancoDeHoras salario) {
        double calculoSalario = ((salario.horasFixas * salario.valorHora) +
                (salario.horasExtras * salario.valorHoraExtra)) * 4;
        return calculoSalario;
    }
}
