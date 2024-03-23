import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Principal2 {
    public static void main(String[] args) {
        ZoneId zona1 = ZoneId.systemDefault();
        System.out.println(zona1);
        ZonedDateTime dataFestSaoPaulo = ZonedDateTime
                .parse("2025-03-16T20:00:00-03:00[America/Sao_Paulo]");

        ZonedDateTime dataFestaLosAngeles = dataFestSaoPaulo.withZoneSameInstant
                (ZoneId.of("America/Los_Angeles"));

        System.out.println(dataFestSaoPaulo);
        System.out.println(dataFestaLosAngeles);
        System.out.println(dataFestSaoPaulo.isEqual(dataFestaLosAngeles));

        LocalDateTime horarioFesta = LocalDateTime.parse("2025-09-23T20:00:00");
        ZonedDateTime horarioFestaFuso = ZonedDateTime.of(horarioFesta,ZoneId.of("America/Sao_Paulo"));

        System.out.println(horarioFestaFuso);

    }
}
