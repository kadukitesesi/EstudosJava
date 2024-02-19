import com.kadukitesesi.banco.Conta;
import com.kadukitesesi.banco.ContaEspecial;
import com.kadukitesesi.banco.Pessoa;

public class Principal {
    public static void main(String[] args) {

        Pessoa titular = new Pessoa("João da Silva", 22);
        ContaEspecial conta1 = new ContaEspecial(titular, 1234, 999999, 90);
        conta1.setLimiteChequeEspecial(500);

        conta1.depositar(100);
        conta1.extratoConta();


        conta1.sacar(600);
        conta1.extratoConta();

    }
}
