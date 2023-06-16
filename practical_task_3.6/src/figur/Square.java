package figur;

public class Square extends GeometricFigure {

    private double sideA, sideB, sideC, sideD, diagonalBD, diagonalCA;

    public Square(Point2D a, Point2D b, Point2D c, Point2D d, String name) {
        super.name = name;
        super.coordinates = new Point2D[4];
        coordinates[0] = a;
        coordinates[1] = b;
        coordinates[2] = c;
        coordinates[3] = d;

        sideA = Math.sqrt(Math.pow(coordinates[1].getX() - coordinates[0].getX(), 2) + Math.pow(coordinates[1].getY() - coordinates[0].getY(), 2));
        sideB = Math.sqrt(Math.pow(coordinates[1].getX() - coordinates[2].getX(), 2) + Math.pow(coordinates[1].getY() - coordinates[2].getY(), 2));

        sideC = Math.sqrt(Math.pow(coordinates[2].getX() - coordinates[3].getX(), 2) + Math.pow(coordinates[2].getY() - coordinates[3].getY(), 2));
        sideD = Math.sqrt(Math.pow(coordinates[3].getX() - coordinates[0].getX(), 2) + Math.pow(coordinates[3].getY() - coordinates[0].getY(), 2));
        diagonalBD = Math.sqrt(Math.pow(coordinates[3].getX() - coordinates[1].getX(), 2) + Math.pow(coordinates[3].getY() - coordinates[1].getY(), 2));
        diagonalCA = Math.sqrt(Math.pow(coordinates[0].getX() - coordinates[2].getX(), 2) + Math.pow(coordinates[2].getY() - coordinates[0].getY(), 2));

        if (!(sideA == sideB && sideB == sideC && sideC == sideD) && (diagonalBD != diagonalCA)) {
            System.out.println("All four sides of the square must be the same length and its diagonals must also be equal." +
                    "\nEnter the coordinates at which the square can be drawn.");
            System.exit(1);
        }

        if (name == "") {
            System.out.println("You didn't specify a figure name, create a new figure and don't forget to give it a name.");
            System.exit(1);
        }
    }
    @Override
    public double calculateArea() {
        super.area = Math.sqrt(Math.pow(coordinates[1].getX() - coordinates[0].getX(), 2)
                + Math.pow(coordinates[1].getY() - coordinates[0].getY(), 2)) *
                Math.sqrt(Math.pow(coordinates[1].getX() - coordinates[2].getX(), 2)
                        + Math.pow(coordinates[1].getY() - coordinates[2].getY(), 2));
        return Math.round(area * 100.0) / 100.0;
    }

    @Override
    public Point2D[] getCoordinates() {
        return coordinates;
    }
}
