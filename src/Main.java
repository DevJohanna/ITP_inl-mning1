import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Skapa instanser.
        Scanner scanner = new Scanner(System.in);
        Logic logic = new Logic();

        // Läs in text tills det blir stop
        String input = "";
        while (!logic.stop){
            System.out.print("Skriv in text: ");
            input = scanner.nextLine();
            logic.addRow(input);
        }

        // Skriv ut resultat.
        System.out.println("Antal rader: " + logic.rowCount());
        System.out.println("Antal tecken: " + logic.charCount());
    }
}