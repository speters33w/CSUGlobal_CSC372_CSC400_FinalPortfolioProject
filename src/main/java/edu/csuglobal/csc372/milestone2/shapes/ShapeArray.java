package edu.csuglobal.csc372.milestone2.shapes;

import java.util.Random;
/*

 */

/**
 * Runner class for Module 3 Critical Thinking.
 */
public final class ShapeArray {

    private ShapeArray() {}
    public static void main(String[] args) {
        Random random = new Random();
        double x = random.nextDouble(1, 9.9);
        double y = random.nextDouble(1, 9.9);
        double z = random.nextDouble(1, x + y); // only used for third side of a triangle.
        RandomGenerator randomGenerator = new RandomGenerator(x, y, z);
        x = randomGenerator.getX();
        y = randomGenerator.getY();
        z = randomGenerator.getZ();

        System.out.println();

        shapes2D(x, y, z);
        shapes3D(x, y);
    }

    public static void shapes2D(double x, double y, double z) {
        Shape2D[] shapeArray = new Shape2D[3];
        shapeArray[0] = new Rectangle(x, y);
        shapeArray[1] = new Circle(x);
        shapeArray[2] = new Triangle(x, y, z);
        for (Shape2D shape : shapeArray) {
            System.out.printf("%s", shape.toString());
        }
    }

    public static void shapes3D(double x, double y) {
        Shape3D[] shapeArray = new Shape3D[3];
        shapeArray[0] = new Sphere(x);
        shapeArray[1] = new Cylinder(x, y);
        shapeArray[2] = new Cone(x, y);
        for (Shape3D shape : shapeArray) {
            System.out.printf("%s", shape.toString());
        }
    }

    /**
     * Validates three numbers can be valid sides of a triangle.
     * If not, generates three random numbers that can be valid sides of a triangle.
     */
    static class RandomGenerator {
        double x;
        double y;
        double z;
        Random random = new Random();
        RandomGenerator(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
            while (this.z - this.y > this.x || this.y - this.z > this.x
                   || this.z - this.x > this.y || this.x - this.z > this.y
                   || this.y - this.x > this.z || this.x - this.y > this.z) {
                this.x = random.nextDouble(1, y + z);
                this.y = random.nextDouble(1, x + z);
                this.z = random.nextDouble(1, x + y);
            }
        }
        public double getX() {
            return x;
        }
        public double getY() {
            return y;
        }
        public double getZ() {
            return z;
        }
    }
}
