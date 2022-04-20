package F_N;

import java.sql.Time;
import java.util.Timer;

import javax.sound.sampled.SourceDataLine;

class Fib {
    
    public static long FibonacciNumber(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        long result = FibonacciNumber(n - 2) + FibonacciNumber(n - 1);
        return result;
    }

    public static long FibonacciNumberDP(int n, long memo[]) {
        if(memo[n]!=0){
            return memo[n];
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        long result = FibonacciNumberDP(n - 2, memo) + FibonacciNumberDP(n - 1, memo);
        memo[n] = result;
        return result;
    }
}

public class Fibonacci {
    public static void main(String args[]) {
        int n = 50;
        long[] memo = new long[n+1];
        long startTime = System.currentTimeMillis();
        long res = Fib.FibonacciNumber(n);
        //long res = Fib.FibonacciNumberDP(n, memo);
        long endTime = System.currentTimeMillis();
        System.out.println("Result is: " + res + ", Time taken: " + (endTime-startTime) + "ms");
    }
}
