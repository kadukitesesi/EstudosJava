import com.kadukitesesi.banco.Conta;
import com.kadukitesesi.banco.ContaEspecial;
import com.kadukitesesi.banco.Pessoa;

public class Principal {
    public static void main(String[] args) {
        ContaEspecial conta1 = new ContaEspecial();
        conta1.setPessoa(new Pessoa("Carlos",20));
        conta1.setLimiteChequeEspecial(500);

        conta1.depositar(100);
        conta1.setConta("102929");
        conta1.setAgencia("12344");
        conta1.extratoConta();


        conta1.sacar(600);
        conta1.extratoConta();

    }
}
