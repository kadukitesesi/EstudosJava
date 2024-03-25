import java.util.ArrayList;
import java.util.List;

import com.kadukitesesi.crm.CadastroCliente;
import com.kadukitesesi.crm.Cliente;

public class Principal {
    public static void main(String[] args) {
        var cadastroClientes = new CadastroCliente();
        cadastroClientes.adicionar(new Cliente("Carlos", 12));
        cadastroClientes.adicionar(new Cliente("joacom", 25));
        cadastroClientes.adicionar(new Cliente("joseph partison", 35));

        List<Cliente> clientes = cadastroClientes.consultar(cliente -> cliente.getIdade() >= 21);

        for (Cliente cliente : clientes) {
            System.out.printf("%s - %d%n",cliente.getNome(),cliente.getIdade());
        }
    }
}
