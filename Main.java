import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Wpisz pierwszą liczbę:");
        Scanner pobierz = new Scanner(System.in);
        int liczba1,liczba2;
        liczba1 = pobierz.nextInt();
				System.out.println("Wpisz drugą liczbę:");
        liczba2 = pobierz.nextInt();
        int ans;
        System.out.println("Wybierz operacje:\n 1 - Dodawanie \n 2 - Odejmowanie \n 3 - Mnożenie \n 4 - Dzielenie");
        int wybierz;
        wybierz = pobierz.nextInt();
        switch (wybierz){
        case 1:
            System.out.println("Wynik = "+dodawanie( liczba1,liczba2));
            break;
        case 2:
            System.out.println("Wynik = "+odejmowanie( liczba1,liczba2));
            break;      
        case 3:
            System.out.println("Wynik = "+mnozenie( liczba1,liczba2));
            break;
        case 4:
            System.out.println("Wynik = "+dzielenie( liczba1,liczba2));
            break;
            default:
                System.out.println("Błąd wybierz poprawnie");


        }



    }
    public static int dodawanie(int x, int y)
    {
        int wynik = x + y;
        return wynik;
    }
    public static int odejmowanie(int x, int y)
    {
        int wynik = x-y;
        return wynik;
    }
    public static int mnozenie(int x, int y)
    {
        int wynik = x*y;
        return wynik;
    }
    public static int dzielenie(int x, int y)
    {
        int wynik = x/y;
        return wynik;
    }

}