package org.example.fib;
import java.util.HashMap;
import java.util.Map;

public class FibonacciNumbers {

    private Map<Integer, Long> dictionary = new HashMap<>();

    // psvm
    public static void main(String[] args) {


        FibonacciNumbers fn = new FibonacciNumbers();

        for (int x = 0; x <=60; x++) {


            System.out.println(x + " : " + fn.fib(x));
            //sout
        }
    }

    private long fib(int x) {
        if (x == 0) {
            return 0L;
        }

        if (x == 1) {
            return 1L;
        }

        return fib(x - 1) + fib(x - 2);


    }
    private long memo(int m) {
        Long value = dictionary.get(m);
        if (value != null){
            return value;

        }

        value = fib(m);
        dictionary.put(Integer.valueOf(m), value);
        return value;

    }
}
