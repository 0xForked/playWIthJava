package id.aasmit.withjava.basic;

/*
* In Java, every line of code that can actually run needs to be inside a class.
* This line declares a class named a2HelloWorld, which is public,
* that means that any other class can access it.
*/
public class a2HelloWorld {


    /**
     * @Title Main function
     * @Description function:
         * This is the entry point of Java program.
         * public again means that anyone can access it.
         * static means that you can run this method without creating an instance of Main.
         * void means that this method doesn't return any value.
         * main is the name of the method.
     * @Description print:
         * System is a pre-defined class that Java provides us and it holds some useful methods and variables.
         * out is a static variable within System that represents the output of your program (stdout).
         * println is a method of out that can be used to print a line.
     */

    public static void main(String[] args){

        System.out.print("Hello World");

    }



}
