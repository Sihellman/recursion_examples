package edu.ti.caih313.recursion;

public class OddDigits {

    public static int CountOddDigits(int n){
        int result = 0;
        if (n == 0){
            result = 0;
        }
        else if((n < 10) && (n > -10)){
            if(n % 2 != 0){
                result = 1;
            }
        }
        else if(n % 2 != 0){
            result = CountOddDigits(n / 10) + 1;
        }
        return result;

    }
    static int IterateOdd(int n){
        int result = 0;
        while ((n >= 10) || (n <= -10)){
            if (n % 2 != 0){
                result++;
            }
            n /= 10;

        }
        if(n % 2 != 0){
            result++;
        }
        return result;
    }
}
