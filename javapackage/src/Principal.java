import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Principal {
    public static void main(String[] args) {
        Predicate<String> predicate = str -> str.startsWith("t");
        boolean comecaComT = predicate.test("tUNIA");
        System.out.println(comecaComT);

        Function<String, LocalDate> function = str -> LocalDate.parse(str);
        LocalDate data = function.apply("2023-10-25");
        System.out.println(data);

        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now().;
        LocalDateTime horas = supplier.get();
        System.out.println(horas);


    }
}
