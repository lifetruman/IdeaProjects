package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        //challenge
        byte byteNewNumber = 100;
        short shortNewNumber = 25000;
        int intNewNumber = 3000;
        long longNewSum = 50000L + 10L * (byteNewNumber + shortNewNumber + intNewNumber);
        System.out.println(longNewSum);

        short shortTotal = (short) (1000 + 10 *
                (byteNewNumber + shortNewNumber + intNewNumber));
        System.out.println(shortTotal);
    }
}
