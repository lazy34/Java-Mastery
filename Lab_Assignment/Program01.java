package Lab_Assignment;


//The diameter of the Sun is approximately 865,000 miles. The diameter of the Earth is approximately
//        7600 miles. Use the methods in the class to calculate
//        a. The volume of the earth in cubic miles
//        b. The volume of the Sun in cubic miles
//        c. The ratio of the volume of the Sun to the volume of the Earth
//     Then output the three values. Treat both Sun and earth as spheres. The volume of a sphere is given
//     by 4𝜋𝑟3,where ‘r’ is the radius
//

import java.lang.Math;
public class Program01{
    public static final double PI = 3.14159265359;
    public static final double EARTH_DIAMETER = 7600;
    public static final double SUN_DIAMETER = 865000;

    public static double calculateEarthVolume() {
        double radius = EARTH_DIAMETER / 2;
        return (4.0 / 3.0) * PI * Math.pow(radius, 3);
    }

    public static double calculateSunVolume() {
        double radius = SUN_DIAMETER / 2;
        return (4.0 / 3.0) * PI * Math.pow(radius, 3);
    }

    public static double calculateSunToEarthVolumeRatio() {
        double sunVolume = calculateSunVolume();
        double earthVolume = calculateEarthVolume();
        return sunVolume / earthVolume;
    }

    public static void main(String[] args){
            double earthVolume = calculateEarthVolume();
            double sunVolume = calculateSunVolume();
            double sunToEarthVolumeRatio = calculateSunToEarthVolumeRatio();

            System.out.println("Volume of Earth: " + earthVolume + " cubic miles");
            System.out.println("Volume of Sun: " + sunVolume + " cubic miles");
            System.out.println("Sun to Earth volume ratio: " + sunToEarthVolumeRatio);

    }
}
