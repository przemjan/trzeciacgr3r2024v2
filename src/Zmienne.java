public class Zmienne {
    public static void main(String[] args) {
        int liczba1;
        liczba1 = 13;

        double liczba = 17.7;

        System.out.println("Moja zmienna: " + liczba1);

        int hours = 8;
        int days = 5;
        int weeks = 52;
        // zły przykład
        //int x1 = 8 * 5 * 52;

        int workHoursPerYear = hours * days * weeks;

        System.out.println("Wynik: " + workHoursPerYear);


        int wymiar1 = 2;
        int wymiar2 = 4;
        int pom1 = wymiar1 * wymiar2;

        wymiar1 = 7;
        wymiar2 = 4;
        int pom2 = wymiar1 * wymiar2;


        char znak = '#';


        String napis = "Dzisiaj\t jest \"ładna\" \\pogoda";
        //napis = napis + ".";
        napis += ".";

        System.out.println("Mój napis " + napis);
        System.out.print("Mój napis " + napis + " koniec \n");
        System.out.print("Mój napis " + napis);
        System.out.println("Mój napis " + napis);

        boolean sun = true; //false
        // https://github.com/przemjan/trzeciaCgr3r2024v2

    }
}
