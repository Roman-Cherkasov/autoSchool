package figur;

public class Point2D {
    private double x, y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return  Math.round(x * 100.0) /100.0;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return Math.round(y * 100.0) /100.0;
    }

    public void setY(double y) {
        this.y = y;
    }

}
