package id.aasmit.withjava.basic;

public class a3VariableAndDataTypes {

    /**
     * @Description Primitive Data Types in Java
     * byte (number, 1 byte)
     * short (number, 2 bytes)
     * int (number, 4 bytes)
     * long (number, 8 bytes)
     * float (float number, 4 bytes)
     * double (float number, 8 bytes)
     * char (a character, 2 bytes)
     * boolean (true or false, 1 byte)
     */

    public static void main(String[] args){

        //Declare a variable
        int numberOne;
        numberOne = 5;

        //Another way (combine them)
        int numberTwo = 5;

        //Float
        float fl = 2.1F;
        float fl2 = (float) 2.1;

        //Double
        double dou = 2.333;

        //Char
        char cr = 'H';

        //String is not a primitive data type btw
        String name = new String("Some Name, ");
        String otherName = "Other Name";
        String addName = name + otherName;

        //But you can also concat String to primitives
        String itsString = "My name is : " + name + "I'm now : " + numberTwo + " years old";

        //Boolean
        //Every comparison operator in java will return the type boolean
        //boolean can only accept two special values: true or false.
        boolean b = false;
        b = true;

        System.out.print(itsString);
    }

}
