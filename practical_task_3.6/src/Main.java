import figur.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<GeometricFigure> ArrayOfFigures = new ArrayList();

        int[] ArrayOfNumbers = new int[10];
        for (int i = 0; i < 10; i++) {
            ArrayOfNumbers[i] = 1 + (int) (Math.random() * 3);
        }
        int numberOfCircles = 0, numberOfTriangles = 0, numberOfSquares = 0;
        for (int arrayOfNumber : ArrayOfNumbers) {
            if (arrayOfNumber == 1) {
                numberOfCircles++;
                ArrayOfFigures.add(new Circle(
                        new Point2D(1 + (Math.random() * 100), 1 + (Math.random() * 100)),
                        new Point2D(1 + (Math.random() * 100), 1 + (Math.random() * 100)),
                        String.format("Circle %s", numberOfCircles))
                );

            } else if (arrayOfNumber == 2) {
                numberOfTriangles++;
                ArrayOfFigures.add(new Triangle(
                        new Point2D(1 + (Math.random() * 100), 1 + (Math.random() * 100)),
                        new Point2D(1 + (Math.random() * 100), 1 + (Math.random() * 100)),
                        new Point2D(1 + (Math.random() * 100), 1 + (Math.random() * 100)),
                        String.format("Triangle %s", numberOfTriangles))
                );
            } else {
                numberOfSquares++;
                double aX = 1 + (Math.random() * 100);
//                bX = aX
                double cX = 1 + (Math.random() * 100);
//                dX = cX
                double aY = 1 + (Math.random() * 100);
//                dY = aY
                double bY = 1 + (Math.random() * 100);
//                cY = bY
                ArrayOfFigures.add(new Square(
                        new Point2D(aX, aY),
                        new Point2D(aX, bY),
                        new Point2D(cX, bY),
                        new Point2D(cX, aY),
                        String.format("Square %s", numberOfSquares))
                );
            }
        }


        double[] indexesAndAreas = new double[10];
        for (int i = 0; i < ArrayOfNumbers.length; i++) {

//            All figures

//            System.out.println(ArrayOfFigures.get(i).getName());
//            System.out.println(ArrayOfFigures.get(i).calculateArea());
//            System.out.println("--------------------------------------------");
            indexesAndAreas[i] = ArrayOfFigures.get(i).calculateArea();
        }
//        System.out.println("+++++++++++++++++++++++++After_sorting++++++++++++++++++++++++++++");
        Arrays.sort(indexesAndAreas);

        for (double indexesAndArea : indexesAndAreas) {
            for (int j = 0; j < indexesAndAreas.length; j++) {
                if (indexesAndArea == ArrayOfFigures.get(j).calculateArea()) {
                    System.out.println(ArrayOfFigures.get(j).getName());
                    System.out.println("S=" + ArrayOfFigures.get(j).calculateArea());
                    System.out.println();
                }
            }
        }



    }
}

