import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Principal {
    public static void main(String[] args) {


        //24H atrás
        Date data = new Date(System.currentTimeMillis() - (24 * 60 * 60 * 1000));
        System.out.println(data);

        //Não deve ser usado, isto é a forma de usar na API legado
        // System.out.println(data.getHours());

        Date hoje = new Date();

        DateFormat dataFormatada = new SimpleDateFormat("dd/mm");

        System.out.println(dataFormatada.format(hoje));


    }


}
