package edu.ti.caih313.recursion.simple;

public class Sum {

    static int DigitSum(int n){
        int result = 0;
        if(n >= 0){
            if (n < 10){
              result = n;
            }
            else{
                result = DigitSum(n / 10) + (n % 10);
            }

        }
        else{
            System.out.println("negative number, returning 0");
        }
        return result;
    }
    static int IterateDigitSum(int n){
        int result = 0;
        if (n >= 0){
            while(n >= 10){
                result = result + (n % 10);
                n /= 10;
            }
            result += n;
        }
        else{
            System.out.println("negative number, returning 0");
        }
        return result;

    }
}
