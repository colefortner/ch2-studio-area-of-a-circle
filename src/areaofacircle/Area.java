package areaofacircle;
import java.util.Scanner;


public class Area {
    public static void main(String[] args) {

        String validation = "Please enter a non-negative number.";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");

        if(!input.hasNextDouble()){
            System.out.println(validation);
        } else {
            Double radius = input.nextDouble();
            if(radius < 0){
                System.out.println(validation);
            } else {
                System.out.println("The area of a circe of radius " + radius + " is: " + Circle.getArea(radius));
            }
        }
    }
}

//        Double area = 3.14 * radius * radius;
//        Double area = Circle.getArea(radius);
