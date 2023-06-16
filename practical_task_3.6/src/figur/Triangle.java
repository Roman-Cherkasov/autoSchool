package figur;

import java.lang.Math;

public class Triangle extends GeometricFigure {
    private double side_A, side_B, side_C;

    public Triangle() {
    }

    public Triangle(Point2D a, Point2D b, Point2D c, String name) {
        super.name = name;
        super.coordinates = new Point2D[3];
        coordinates[0] = a;
        coordinates[1] = b;
        coordinates[2] = c;

        side_A = Math.sqrt(Math.pow(coordinates[1].getX() - coordinates[0].getX(), 2) + Math.pow(coordinates[1].getY() - coordinates[0].getY(), 2));
        side_B = Math.sqrt(Math.pow(coordinates[2].getX() - coordinates[1].getX(), 2) + Math.pow(coordinates[2].getY() - coordinates[1].getY(), 2));
        side_C = Math.sqrt(Math.pow(coordinates[0].getX() - coordinates[2].getX(), 2) + Math.pow(coordinates[0].getY() - coordinates[2].getY(), 2));

        if (side_A + side_B < side_C || side_A + side_C < side_B || side_B + side_C < side_A) {
            System.out.println("For a triangle, the sum of any two sides must be greater than the third." +
                    "\nEnter the coordinates at which the triangle can be drawn.");
            System.exit(1);
        }

        if (name == "") {
            System.out.println("You didn't specify a figure name, create a new figure and don't forget to give it a name.");
            System.exit(1);
        }
    }

    @Override
    public double calculateArea() {
        super.area = Math.abs((coordinates[1].getX() - coordinates[0].getX()) * (coordinates[2].getY() - coordinates[0].getY()) - (coordinates[2].getX() - coordinates[0].getX()) * (coordinates[1].getY() - coordinates[0].getY())) / 2;
        return  Math.round(area * 100.0) / 100.0;
    }

    @Override
    public Point2D[] getCoordinates() {
        return coordinates;
    }
}

