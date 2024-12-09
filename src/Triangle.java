public class Triangle extends Shape implements Movable {

    int xCoordinate;
    int yCoordinate;

    public Triangle(int xCoordinate, int yCoordinate, int width, int height) {

        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {

        double area = (width * height) / 2;
        return area;
    }

    @Override
    public void moveUp() {

        xCoordinate++;
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
