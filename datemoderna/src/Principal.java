import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class Principal {
    public static void main(String[] args) {

        //Só fala da sua data local, bom quando a aplicação não necessita de horários.
        LocalDate local = LocalDate.of(2003,03,16);

        System.out.println(local);


        //Fala o horário, bom para quando precisamos apenas do horário, independente de fuso horário
        LocalTime localtime = LocalTime.now();

        System.out.println(localtime);


        /*Fala o horário e a data, boa para quando precisamos de data e hora, por exemplo um
        sistema de cinema etc */
        LocalDateTime horaDataLocal = LocalDateTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofLocalizedDateTime(
                FormatStyle.SHORT, FormatStyle.SHORT
        ).withLocale(new Locale("pt","BR"));

        System.out.println(horaDataLocal.format(formatador));

        //Convertendo

        Instant instant = Instant.parse("2020-08-20T19:50:20Z");

        System.out.println(instant);

        System.out.println(ChronoField.DAY_OF_MONTH.getFrom(horaDataLocal));

        LocalDate hoje = LocalDate.now();

        LocalDate ontem = hoje.minusDays(1);

        System.out.println(hoje);
        System.out.println(ontem);

        YearMonth anoMes = YearMonth.parse("2020-09");

        System.out.println(anoMes.plus(Period.parse("P2Y5M")));

        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("EEEE", new Locale("pt", "BR"));
        LocalDate natal = local.with(new NatalAdjust());
        String natalFormatado = natal.format(formatter);
        System.out.println(natalFormatado);
    }
}
