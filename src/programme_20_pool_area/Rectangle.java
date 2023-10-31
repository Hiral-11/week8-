package programme_20_pool_area;

/**
 * Write a class with name Rectangle. the class needs two fields(instance variable)
 * with name width and length both of type double
 */

public class Rectangle {
    double width;
    double length;

    public Rectangle(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getArea() {
        return width * length;
    }
}

