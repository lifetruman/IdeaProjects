package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Min value = " + (myMinIntValue - 1));
        System.out.println("Busted Max value = " + (myMaxIntValue + 1));

        int myMaxIntTest = 2_147_483_647;
        System.out.println(myMaxIntTest);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        System.out.println("Busted Min value = " + (myMinByteValue - 1));
        System.out.println("Busted Max value = " + (myMaxByteValue + 1));

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        System.out.println("Busted Min value = " + (myMinShortValue - 1));
        System.out.println("Busted Max value = " + (myMaxShortValue + 1));

        long myLongValue = 100;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        System.out.println("Busted Min value = " + (myMinLongValue - 1));
        System.out.println("Busted Max value = " + (myMaxLongValue + 1));
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;
        //왜 short, byte는 overflow, underflow가 적용이 안되는걸까..?

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShorValue = (short) (myMinShortValue / 2);

    }
}
