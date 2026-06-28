interface Test {
    void square(int n);
}

class Arithmetic implements Test {
    public void square(int n) {
        System.out.println("Square = " + (n * n));
    }
}

class Outer {

    void display() {
        System.out.println("Display method of Outer class");
    }

    class Inner {
        void display() {
            System.out.println("Display method of Inner class");
        }
    }
}

class Point {

    private int x;
    private int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("Point = (" + x + ", " + y + ")");
    }
}

class Box {

    protected double length;
    protected double breadth;

    public Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }
}

class Box3D extends Box {

    private double height;

    public Box3D(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public double volume() {
        return length * breadth * height;
    }

    public void display() {
        System.out.println("Length  = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Height  = " + height);
        System.out.println("Area    = " + area());
        System.out.println("Volume  = " + volume());
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("===== Question 1 =====");
        Arithmetic a = new Arithmetic();
        a.square(5);

        System.out.println("\n===== Question 2 =====");
        Outer outer = new Outer();
        outer.display();

        Outer.Inner inner = outer.new Inner();
        inner.display();

        System.out.println("\n===== Question 3 =====");
        Point p = new Point();
        p.display();

        Point p1 = new Point(10, 20);
        p1.display();

        p1.setX(30);
        p1.setY(40);
        p1.display();

        p1.setXY(50, 60);
        p1.display();

        System.out.println("\n===== Question 4 =====");
        Box3D box = new Box3D(10, 5, 4);
        box.display();
    }
}
