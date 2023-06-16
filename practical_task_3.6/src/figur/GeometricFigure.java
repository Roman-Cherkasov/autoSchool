package figur;

public abstract class GeometricFigure {
    protected String name;
    protected double area;
    protected Point2D[] coordinates;

    public Point2D getPoint(int pointIndex) {
        check(pointIndex);
        return coordinates[pointIndex];
    }

    public void setPoint(int pointIndex, Point2D pointCoordinates) {
        check(pointIndex);
        coordinates[pointIndex] = pointCoordinates;
    }

    private void check(int pointIndex) {
        try {
            Point2D temp = coordinates[pointIndex];
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("This figure consists of only " + coordinates.length + " coordinates");
            System.exit(1);
        }
    }
    public abstract double calculateArea();

    public abstract Point2D[] getCoordinates();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}