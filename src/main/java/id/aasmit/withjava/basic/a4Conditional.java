package id.aasmit.withjava.basic;

public class a4Conditional {

    public static void main(String[] args){

        //Boolean variable to evaluate condition
        int a = 10;
        boolean b = a == 10;

        if (b) {
            System.out.println("It's true!");
        }

        int c = 12;

        if (c == 12) {
            System.out.println("c is 12");
        }


        //There aren't that many operators to use in conditional
        //statements and most of them are pretty strait forward:
        int d = 4;
        int e = 5;
        boolean result;
        result = d < e; // true
        result = d > e; // false
        result = d <= 4; // a smaller or equal to 4 - true
        result = e >= 6; // b bigger or equal to 6 - false
        result = d == e; // a equal to b - false
        result = d != e; // a is not equal to b - true
        result = d > e || d < e; // Logical or - true
        result = 3 < d && d < 6; // Logical and - true
        result = !result; // Logical not - false


        //The if, else statement in java is pretty simple.
        if (d == e) {
            // 1 and 2 are equal, let's do something cool
        }

        if (d == e) {
            // We already know this part
        } else {
            // a and b are not equal... :/
        }

        //The if - else statements doesn't have to be in several lines with {},
        //if can be used in one line, or without the {}, for a single line statement.
        if (d == e)
            System.out.println("Another line Wow!");
        else
            System.out.println("Double rainbow!");

        //There is a another way to write a one line
        // if - else statement by using the operator ? :

        int f = 4;
        int result1 = f == 4 ? 1 : 8;

        // result will be 1
        // This is equivalent to
        int result2;

        if (f == 4) {
            result2 = 1;
        } else {
            result2 = 8;
        }

        String asd = "asd";
        String qwe = "qwe";
        boolean r1 = a == c;      // This is false, since a and c are not the same object
        boolean r2 = asd.equals(qwe); // This is will be true, if asd and qwe are logically equals
        boolean r3 = qwe == qwe;  // This is will be true, since asd and qwe are really the same object
    }

}
