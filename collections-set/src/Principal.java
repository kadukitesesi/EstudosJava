import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class Principal {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();

        numeros.add(100);
        numeros.add(10);
        numeros.add(200);
        numeros.add(3);
        numeros.add(500);

        for (Integer numero : numeros) {
            System.out.println(numero);

        }
    }
}
