
import java.util.Scanner;
public class Main {
    private static int[] tablica = new int[10];

    public static void main(String[] args) {
        fillArray(tablica);
    }


    public static int readNumber() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int liczba = scanner.nextInt();
        if (liczba < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed.");
        }
        return liczba;

    }

    public static void fillArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            try {
                tablica[i] = readNumber();
            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
                tablica[i] = 0;
            }
        }
        for (int i : tablica) {
            System.out.println(i);
        }
    }


}


