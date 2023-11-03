package org.example.recursion;

public class Factorial {
    public static int factorialIterative(int n){
        int f = 1;
        for(int i = 1; i < n; i++){
            f *=i;
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println(Factorial.factorialIterative(10));
    }
}
