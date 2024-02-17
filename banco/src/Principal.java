import conta.Conta;
import conta.Pessoa;

public class Principal {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setPessoa(new Pessoa("Carlos",20));

        conta1.depositar(100);
        conta1.setConta("102929");
        conta1.setAgencia("12344");
        conta1.extratoConta();

    }
}
