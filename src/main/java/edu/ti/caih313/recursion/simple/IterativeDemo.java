package edu.ti.caih313.recursion.simple;

import java.util.Scanner;

public class IterativeDemo {
    public static void main(String[] args) {
        System.out.println("Enter an integer:");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        System.out.println("The digits in that number are:");
        displayAsWords(number);
        System.out.println();
        System.out.println("If you add ten to that number, ");
        System.out.println("the digits in the new number are:");
        number = number + 10;
        displayAsWords(number);
        System.out.println();
    }

    public static void displayAsWords(int number) {
        int divisor = getPowerOfTen(number);
        int next = number;
        while (divisor >= 10) {
            System.out.print(getWordFromDigit(next / divisor) +
                    " ");
            next = next % divisor;
            divisor = divisor / 10;
        }
        System.out.print(getWordFromDigit(next / divisor) + " ");
    }


    // Precondition: n >= 0.
    // Returns 10 raised to the power n.
    private static int getPowerOfTen(int n) {//n = 789
        int result = 1;
        while (n >= 10) {
            result = result * 10; //result = 10 result = 100
            n = n / 10; //n = 78 n = 7
        }
        return result;
    }

    static String getWordFromDigit(int n) {
        DigitAsWord digitAsWord;
        switch (n) {
            case 0:
                digitAsWord = DigitAsWord.ZERO;
                break;
            case 1:
                digitAsWord = DigitAsWord.ONE;
                break;
            case 2:
                digitAsWord = DigitAsWord.TWO;
                break;
            case 3:
                digitAsWord = DigitAsWord.THREE;
                break;
            case 4:
                digitAsWord = DigitAsWord.FOUR;
                break;
            case 5:
                digitAsWord = DigitAsWord.FIVE;
                break;
            case 6:
                digitAsWord = DigitAsWord.SIX;
                break;
            case 7:
                digitAsWord = DigitAsWord.SEVEN;
                break;
            case 8:
                digitAsWord = DigitAsWord.EIGHT;
                break;
            case 9:
                digitAsWord = DigitAsWord.NINE;
                break;
            default:
                throw new IllegalArgumentException("Argument " + n + " is not a digit.");
        }
        return digitAsWord.getDigitWord();
    }
}