package id.aasmit.withjava.basic;

public class a8Object {

    public static void main(String[] args){
        Point p = new Point(100,100);
        for (int i = 0; i < 5; i++) {
            p.scale();
            p.print();
        }
        p.print();

    }

}

//Everything in Java is within classes and objects. Java objects hold a state,
//state are variables which are saved together within an object, we call them fields or member variables.
class Point {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        System.out.println("(" + x + "," + y + ")");
    }

    void scale(){
        x = x/2;
        y = y/2;
    }

}