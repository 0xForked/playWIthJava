package id.aasmit.withjava.basic;

public class a6Loops {

    public static void main(String[] args){
        //There are two kind of loops in Java, for and while.

        //The for loop
        for (int i = 0; i < 3; i++) {}

        // First section runs once when we enter the loop.

        // Second section is the gate keeper, if it returns true,
        // we run the statements in the loop, if it returns false,
        // we exit the loop. It runs right after the first section for the first time,
        // then every time the loop is finished and the third section is run.

        //The third section is the final statement that will run every time the loop runs.

        //So in the case we have just seen, the loop will run 3 times. Here is the order of the commands:
        //int i = 0;
        //i < 3 | 0 < 3 = true
        // Inside of loop
        //i++ | i is now 1
        //i < 3 | 1 < 3 = true
        // Inside of loop
        //i++ | i is now 2
        //i < 3 | 2 < 3 = true
        // Inside of loop
        //i++ | i is now 3
        //i < 3 | 3 < 3 = false
        // Loop is done...

        //The While loop
        boolean condition = false;
        while (condition) {  }

        do {
            //Some action
        } while(condition);

        //The Foreach loop
        //Another version of for, is the foreach.
        //The keyword we use is still for,
        //but when we want to iterate on the elements inside an array we can simply use it:
        int[] arr = {2, 0, 1, 3};

        //Foreach version
        for (int el : arr) {
            System.out.println(el);
        }

        //For version
        for (int i = 0; i < arr.length; i++) {
            int el = arr[i];
            System.out.println(el);
        }

        //break and continue
        int i;

        //These two keywords help us control the loop from within it.
        //break will cause the loop to stop and will go immediately to the next statement after the loop:
        for (i = 0; i < 5; i++) {
            if (i >= 2) {
                break;
            }
            System.out.println("Yuhu");
        }
        System.out.println(i);

        //continue will stop the current iteration and will move to the next one.
        //Notice that inside a for loop, it will still run the third section.
        for (i = 0; i < 5; i++) {
            if (i >= 3) {
                break;
            }
            System.out.println("Yuhu");
            if (i >= 1) {
                continue;
            }
            System.out.println("Tata");
        }
        System.out.println(i);

    }

}
