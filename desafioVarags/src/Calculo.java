
public class Calculo {
    double mediaNumeros(double... numeros) {
        double soma = 0;
        if (numeros.length < 2) {
            System.out.println("Pelo menos dois números devem ser fornecidos.");
        }
        for(
    double numero :numeros)
        {
        soma += numero;
    }
        return soma / numeros.length;
    }
}
