package exemplo2;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Joaquim",22));
        clientes.add(new Cliente("Maria Joaquina",15));
        clientes.add(new Cliente("Barbosa",23));

        Cliente.ordenarPorIdade(clientes);
        System.out.println(clientes);
    }
}
