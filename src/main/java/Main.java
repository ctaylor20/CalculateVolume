abstract class Shape {

    abstract double getVolume(int length);

    public double convertToTwoDecimalPlaces(double volume) {

        String formattedVolume = String.format("%.2f", volume);
        return Double.parseDouble(formattedVolume);
    }

}

class Sphere extends Shape {


    public double getVolume(int radius) {

        // The volume of a shpere is 4/3 * pi r cubed
        int radiusCubed = radius * radius * radius;
        double pi = Math.PI;
        double fourByThree = 4.0 / 3.0;
        double piTimesRadiusCubed = pi * radiusCubed;
        double volume = fourByThree * piTimesRadiusCubed;

        // Format volume to 2 decimal places
        double formattedVolume = convertToTwoDecimalPlaces(volume);
        System.out.println("The volume of the sphere is " + formattedVolume);
        return formattedVolume;
    }
}

class Cube extends Shape {


    public double getVolume(int width) {

        // The volume of a cube is the width of one side, cubed
        double volume = width * width * width;

        // Format volume to 2 decimal places
        double formattedVolume = convertToTwoDecimalPlaces(volume);
        System.out.println("The volume of the cube is " + formattedVolume);
        return formattedVolume;
    }

}

class Tetrahedron extends Shape {


    public double getVolume(int edge) {

        // The volume of a tetrahedron is the edge cubed divided by 6 * square root of 2
        int edgeCubed = edge * edge * edge;
        double squareRoot2 = Math.sqrt(2);
        double denominator = 6.0 * squareRoot2;

        double volume = edgeCubed / denominator;

        // Format volume to 2 decimal places
        double formattedVolume = convertToTwoDecimalPlaces(volume);
        System.out.println("The volume of a tetrahedron is " + formattedVolume);
        return formattedVolume;
    }
}


public class Main {

    public static void main(String[] args) {

        Sphere sphere = new Sphere();
        sphere.getVolume(1);
        sphere.getVolume(5);

        Cube cube = new Cube();
        cube.getVolume(1);
        cube.getVolume(5);

        Tetrahedron tetrahedron = new Tetrahedron();
        tetrahedron.getVolume(1);
        tetrahedron.getVolume(5);

    }

}
