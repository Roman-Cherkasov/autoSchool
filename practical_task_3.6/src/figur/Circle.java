package figur;
public class Circle extends GeometricFigure {
    public Circle(Point2D a, Point2D b, String name) {
//        super.a = a;
//        super.b = b;
        super.name = name;
        super.coordinates = new Point2D[2];
        coordinates[0] = a;
        coordinates[1] = b;
//        super.coordinates_222 = new ArrayList<String>();

        if (a.getX() == b.getX() && a.getY() == b.getY()) {
            System.out.println("You entered the coordinates of a single point - circles of zero radius (degenerate circle)."
                    + "\nPlease enter the coordinates of a non-degenerate circle.");
            System.exit(1);
        }

        if (name == "") {
            System.out.println("You didn't specify a figure name, create a new figure and don't forget to give it a name.");
            System.exit(1);
        }
    }

    @Override
    public double calculateArea() {
//        super.area = Math.PI * Math.pow(Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2)), 2);
        super.area = Math.PI * Math.pow(Math.sqrt(Math.pow(getPoint(1).getX() - getPoint(0).getX(), 2) + Math.pow(getPoint(1).getY() - getPoint(0).getY(), 2)), 2);
//        System.out.println(getPoint(1).getY());
//        return super.area;
        return  Math.round(super.area * 100.0) /100.0 ;
    }
    @Override
    public Point2D[] getCoordinates(){
        return coordinates;
    }
}
