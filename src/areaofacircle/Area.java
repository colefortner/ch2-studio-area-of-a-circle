package areaofacircle;
import java.util.Scanner;


public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        Double radius = input.nextDouble();
//        Double area = 3.14 * radius * radius;
//        Double area = Circle.getArea(radius);
        System.out.println("The area of a circe of radius " + radius + " is: " + Circle.getArea(radius));
    }
}
