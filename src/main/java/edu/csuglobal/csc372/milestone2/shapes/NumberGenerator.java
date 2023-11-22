package edu.csuglobal.csc372.milestone2.shapes;

import java.util.Random;

public final class NumberGenerator {

    private NumberGenerator() {}
    public static void main(String[] args) {
        Random random = new Random();
        double x = random.nextDouble(1, 9.9);
        double y = random.nextDouble(1, 9.9);
        double z = random.nextDouble(1, x + y); // only used for third side of a triangle.
        RandomGenerator randomGenerator = new RandomGenerator(x, y, z);
        x = randomGenerator.getX();
        y = randomGenerator.getY();
        z = randomGenerator.getZ();

        System.out.printf("The randomly generated numbers are: %f, %f, and %f\n", x, y, z);
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
