package edu.ti.caih313.recursion.simple;

public class TenToTheN {


    public static int tenToTheN(int n){
        int val;
        if(n == 0){
            val = 1;
        }
        else if(n == 1){
            val = 10;
        }
        else if(n == 2){
            val = 100;
        }
        else if (n % 2 == 0){
            int valHalf = tenToTheN(n/2);
            val = valHalf * valHalf;
        }
        else{
            int valHalfIsh = tenToTheN((n-1)/2);
            val = 10 * valHalfIsh * valHalfIsh;

        }
        return val;
    }
    public static int iterateTenToTheN(int n){
        int initialN = n;
        int result = 10;
        if (n % 2 == 0){
            n /= 2;
        }
        else{
            n = ((n - 1) / 2);
        }
        if(n == 0){
            result = 1;
        }
        else if(n == 1){
            result = 10;
        }
        else if(n == 2){
            result = 100;
        }
        else{

            for(int i = 0; i < n; i++){
                result *= 10;
            }
        }

        result *= result;
        if (initialN % 2 != 0){
            result *= 10;
        }
        return result;
    }

}
