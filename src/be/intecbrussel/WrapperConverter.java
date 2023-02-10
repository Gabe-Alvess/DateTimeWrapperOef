package be.intecbrussel;

public class WrapperConverter {
    public static void main(String[] args) {
        System.out.println("---- Convert primitive to wrapper ----");
        // 1. Maak een class met de naam WrapperConverter en in deze class maak je een main methode.
        // 2. Maak 2 variabelen aan: 1ste int en de 2de Integer.
        int myInt = 500000;
        Integer myInteger = 10;

        // 3. Nu converteer de 'int' naar zijn wrapper class Integer en de Integer naar een int.
        Integer intObj = myInt;
        int intValue = myInteger;

        // 4. Bewijs dit met een methode om te zien of de variabelen zijn geconverteerd.
        // Tip: Bij de 'int' kunnen we natuurlijk niet een methode gebruiken, maar wees creatief.

        String myStrInt1 = intObj.toString();
        System.out.println("Het int getal is nu een string geworden -> " + myStrInt1 + myStrInt1);

        String myStrInt2 = Integer.toString(intValue);
        System.out.println("Het int getal is nu een string geworden -> " + myStrInt2 + myStrInt2);

        // 5. Nu ga je van de Integer variable een String maken en print je de lengte af van deze string.
        System.out.println("De lengte van de Integer variable is -> " + myStrInt1.length());
    }
}
