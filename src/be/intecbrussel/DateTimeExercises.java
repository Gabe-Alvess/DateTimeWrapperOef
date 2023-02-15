package be.intecbrussel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeExercises {
    public static void main(String[] args) {
        System.out.println("---- Date and Time ----");
        System.out.println("---- Oefening - 1 ----");
        // 1. Bij deze oefening gaan we gebruik maken van de volgende classes LocalDateTime, DateTimeFormatter en ChronoUnit.

        // Print huidige tijd uit.
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Huidige tijd en datum -> " + ldt);

        // Print nu een tijd in de toekomst uit. Gebruik de huidige tijd en zorg dat deze 3 jaar verder komt te staan.
        LocalDateTime futureDateTime = LocalDateTime.of(2026, 2, 10, 13, 5, 20);
        System.out.println("Toekomstige datum en tijd -> " + futureDateTime);

        // Bereken het verschil tussen deze 2 tijden: jaren, maanden, dagen, uren, minuten, secondes.
        LocalDateTime actualDateTime = LocalDateTime.of(2023, 2, 10, 13, 5, 20);

        long years = ChronoUnit.YEARS.between(actualDateTime, futureDateTime);
        long months = ChronoUnit.MONTHS.between(actualDateTime, futureDateTime);
        long weeks = ChronoUnit.WEEKS.between(actualDateTime, futureDateTime);
        long days = ChronoUnit.DAYS.between(actualDateTime, futureDateTime);
        long hours = ChronoUnit.HOURS.between(actualDateTime, futureDateTime);
        long minutes = ChronoUnit.MINUTES.between(actualDateTime, futureDateTime);
        long seconds = ChronoUnit.SECONDS.between(actualDateTime, futureDateTime);

        System.out.println(years + " years");
        System.out.println(months + " months");
        System.out.println(weeks + " weeks");
        System.out.println(days + " days");
        System.out.println(hours + " hours");
        System.out.println(minutes + " minutes");
        System.out.println(seconds + " seconds");

        // Formateer deze 2 tijden als strings met dit patroon: "yyyy-MM-dd HH:mm:ss".
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formattedActualDate = actualDateTime.format(format);
        String formattedFutureDate = futureDateTime.format(format);
        System.out.println("Actual date and time formatted -> " + formattedActualDate + "\n" + "Future date and time formatted -> " + formattedFutureDate);

        System.out.println("---- Oefening - 2 ----");
        // Schrijf een programma dat van je geboortedatum het volgende afdrukt:
        // Bij deze oefening gaan we gebruik maken van de volgende classes LocalDate, LocalTime en LocalDateTime.

        // De hoeveelste dag van dat jaar het was.
        LocalDate birthDate = LocalDate.of(2000, 11, 20);
        System.out.println("My birth date -> " + birthDate + "\n" + "Day of the year -> " + birthDate.getDayOfYear());

        // De dag van de maand.
        System.out.println("Day of the month -> " + birthDate.getDayOfMonth());

        // De dag van de week.
        System.out.println("Day of the week -> " + birthDate.getDayOfWeek());

        // of je geboorte jaar in een schrikkeljaar was.
        System.out.println("Was it a leap year? -> " + (birthDate.isLeapYear()? "Yes" : "No"));

        System.out.println("---- Github ----");
        System.out.println("---- Oefening - 1 ----");
        // 1. Schrijf een programma om de huidige tijd en datum te krijgen.
        LocalDateTime huidigeTijdAndDatum = LocalDateTime.now();
        System.out.println(huidigeTijdAndDatum.format(format));

        System.out.println("---- Oefening - 2 ----");
        // 2. Schrijf een programma om de tijd en datum te formatteren naar: ma, 22 aug. 2022 14:54:24
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("E, dd MMM yyyy HH:mm:ss");
        LocalDateTime randomDateTime = LocalDateTime.of(2022,8, 22, 14, 54, 24);
        String formattedDateTime = randomDateTime.format(format1);
        System.out.println(formattedDateTime);

        System.out.println("---- Oefening - 3 ----");
        // 3. Schrijf een programma om je leeftijd te berekenen in dagen, maanden en jaren.

        // Niet Duidelijk!
    }
}
