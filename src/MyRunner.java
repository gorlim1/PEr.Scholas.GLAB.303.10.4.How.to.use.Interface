public class MyRunner {

    public static void main(String[] args) {

        Circle c1 = new Circle(1, 2, 2);
        System.out.println("Area of Circle " + c1.getArea());
        System.out.println("Coordinates are " + c1.getCoordinate());

        c1.moveDown();
        System.out.println("After move Down, Coordinates are " + c1.getCoordinate());

        c1.moveRight();
        System.out.println("After move right, Coordinates are " + c1.getCoordinate());

        c1.moveUp();
        System.out.println("After move Up, Coordinates are " + c1.getCoordinate());

        c1.moveLeft();
        System.out.println("After move left, Coordinates are " + c1.getCoordinate());


        System.out.println("--------Test Polymorphism-------");
        Movable c2 = new Circle(5, 10, 200);  // upcast
        c2.moveUp();
        System.out.println("After move up , Coordinates are " + c2.getCoordinate());

        c2.moveLeft();
        System.out.println("After move Left , Coordinates are " + c2.getCoordinate());
        System.out.println();


        Rectangle objectRectangle1 = new Rectangle(0,0,10, 20);
        System.out.println("Area of Rectangle " + objectRectangle1.getArea());
        System.out.println("Coordinates of the rectangle's lower left corner" +
                " are " + objectRectangle1.getCoordinate());

        objectRectangle1.moveDown();
        System.out.println("After move Down, Coordinates are " + objectRectangle1.getCoordinate());

        objectRectangle1.moveRight();
        System.out.println("After move right, Coordinates are " + objectRectangle1.getCoordinate());

        objectRectangle1.moveUp();
        System.out.println("After move Up, Coordinates are " + objectRectangle1.getCoordinate());

        objectRectangle1.moveLeft();
        System.out.println("After move left, Coordinates are " + objectRectangle1.getCoordinate());
        System.out.println();


        Triangle objectTriangle1 = new Triangle(0,0,10, 20);
        System.out.println("Area of Triangle " + objectTriangle1.getArea());
        System.out.println("Coordinates of the triangle's lower left corner" +
                " are " + objectTriangle1.getCoordinate());

        objectTriangle1.moveDown();
        System.out.println("After move Down, Coordinates are " + objectTriangle1.getCoordinate());

        objectTriangle1.moveRight();
        System.out.println("After move right, Coordinates are " + objectTriangle1.getCoordinate());

        objectTriangle1.moveUp();
        System.out.println("After move Up, Coordinates are " + objectTriangle1.getCoordinate());

        objectTriangle1.moveLeft();
        System.out.println("After move left, Coordinates are " + objectTriangle1.getCoordinate());
    }
}