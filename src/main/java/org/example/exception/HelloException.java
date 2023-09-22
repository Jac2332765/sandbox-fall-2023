package org.example.exception;

import java.util.Scanner;

public class HelloException {
    public static void main(String[] args) {

        //try-catch block
        try {
            //do something
        } catch(Exception e) {
            e.printStackTrace();
        }
        // do other stuff

        //try-catch-catch block
        try {
            //do something
        } catch(NullPointerException e) {
            //do something if NullPointerException is thrown
        } catch(Exception e) {
            // do something if exception is thrown
            e.printStackTrace();
        }
        // do other stuff
            try{

            }catch (Exception e){
                // do something if exception is thrown
            }finally{

                try{

                }catch (Exception e){

                    e.printStackTrace();
                }
                // always gets executed
                // closing the connection to a database, etc...
            }


        //java 7 multi-try-catch
        try{

        } catch(ArithmeticException | NullPointerException e){

        }

        try(Scanner scanner1 = new Scanner(System.in)){
        // do something
        }



        try(Scanner scanner1 = new Scanner(System.in)){
            // do something
        } catch(NullPointerException e){

        }
    }


}






