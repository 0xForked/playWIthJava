package id.aasmit.withjava.basic;

public class a7Function {

    //In Java, all function definitions must be inside classes.
    public static void main(String[] args){

        //get data from multiplication function
        int b = multiplication(1, 2);
        System.out.println("1 + 2 = "+b);

        //set and get name from fullName function
        String name = fullName("Asu", "Coy");
        System.out.println("fullName function : "+name);

        //set and get name from another class function
        Name member = new Name();
        member.setName(name);
        System.out.println("getName from other class : "+member.getName());

    }

    private static int multiplication(int numA, int numB){
        return numA * numB;
    }

    private static String fullName(String firstName, String lastName){
        return firstName + " " +lastName;
    }



}

//Other class called name
//Non static methods
//Non static methods in Java are used more than static methods.
//Those methods can only be run on objects and not on the whole class.
//Non static methods can access and alter the field of the object.
class Name {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}