public class Rectangle extends Shape implements Movable {

    int xCoordinate = 0; //for the lower left corner
    int yCoordinate = 0; //for the lower left corner

    //Constructor
    public Rectangle(int xCoordinate, int yCoordinate, int width, int height) {

        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = this.width * this.height;
        return width * height;
    }

    @Override
    public void moveUp() {
        yCoordinate++;
    }

    @Override
    public void moveDown() {
        yCoordinate--;
    }

    @Override
    public void moveLeft() {
        xCoordinate--;
    }

    @Override
    public void moveRight() {
        xCoordinate++;
    }

    @Override
    public String getCoordinate() {
        return "(" + xCoordinate + ", " + yCoordinate + ")";
    }
}
