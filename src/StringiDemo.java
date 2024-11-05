public class StringiDemo {
    public static void main(String[] args) {

        String name = "Eugeniusz";

        int dlugosc;
        dlugosc = name.length();

        char inicjal;
        inicjal = name.charAt(5);

        System.out.println("Ilość znaków: " + dlugosc + ", inicjał: " + inicjal);

        String duze, male;
        duze = name.toUpperCase();
        male = name.toLowerCase();

        System.out.println(duze + ", " + male);

    }
}
