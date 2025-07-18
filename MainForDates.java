package katas_java;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainForDates {

    public static void main(String[] args) {

        // Instanciando uma data atual (sem hora)
        LocalDate d1 = LocalDate.now();

        // Instanciando uma data atual COM hora
        LocalDateTime d2 = LocalDateTime.now();

        // Instanciando com hora GMT (letra de Z)
        Instant d3 = Instant.now();

        // Instanciando uma data/hora via string
        LocalDate d4 = LocalDate.parse("2025-07-17");
        LocalDateTime d5 = LocalDateTime.parse("2025-07-17T22:57:50.026816500");
        Instant d6 = Instant.parse("2025-07-18T01:58:45.280469400Z");

        // Definindo o formato da data/hora
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d7 = LocalDate.parse("17/07/2025",dtf);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);



    }

}
