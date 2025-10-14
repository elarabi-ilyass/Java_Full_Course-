import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class GestionDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre date de naissance (AAAA-MM-JJ) : ");
        String dateNaissanceStr = scanner.nextLine();

        LocalDate dateNaissance = LocalDate.parse(dateNaissanceStr);
        LocalDate aujourdhui = LocalDate.now();

        long age = ChronoUnit.YEARS.between(dateNaissance, aujourdhui);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Vous êtes né le : " + dateNaissance.format(formatter));
        System.out.println("Vous avez " + age + " ans");

        scanner.close();
    }
}