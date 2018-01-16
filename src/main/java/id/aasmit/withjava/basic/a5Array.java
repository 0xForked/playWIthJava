package id.aasmit.withjava.basic;

public class a5Array {

    public static void main(String[] args){
        //Arrays in Java are also objects.
        //They need to be declared and then created.
        //In order to declare a variable that will hold an array of integers,
        //we use the following syntax:
        int[] arr;

        //Notice there is no size,
        //since we didn't create the array yet.
        arr = new int[10];

        System.out.println(arr.length);

        //We can access the array and set values
        arr[0] = 4;
        arr[1] = arr[0] + 5;

        //Java arrays are 0 based,
        //which means the first element in an array is accessed at index 0
        //(e.g: arr[0] which accesses the first element). Also, as an example,
        //an array of size 5 will only go up to index 4 due to it being 0 based.
        int[] array = new int[5];
        //accesses and sets the first element
        array[0] = 4;

        //We can also create an array with values in the same line
        int[] arrays = {1, 2, 3, 4, 5};
    }

}
