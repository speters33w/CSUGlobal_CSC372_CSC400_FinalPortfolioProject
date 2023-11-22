package edu.csuglobal.csc372.milestone2.shapes;

import java.util.Random;

/**
 * Used to test the area calculation of the Triangle class.
 * Height required for simple on-line calculators.
 */
public final class TestTriangleAreaCalculation {

    private TestTriangleAreaCalculation() {}

    public static void main(String[] args) {
        Random random = new Random();
        double x = random.nextDouble(1, 9.9);
        double y = random.nextDouble(1, 9.9);
        double z = random.nextDouble(1, x + y); // only used for third side of a triangle.
        ShapeArray.RandomGenerator randomGenerator = new ShapeArray.RandomGenerator(x, y, z);
        x = randomGenerator.getX();
        y = randomGenerator.getY();
        z = randomGenerator.getZ();

        System.out.println();

        Triangle triangle = new Triangle(x, y, z);
        System.out.printf("The height of the triangle is %s.%n", triangle.height());
        System.out.printf("%s", triangle);
    }
}
