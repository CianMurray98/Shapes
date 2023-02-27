package ie.atu.ie.atu.week5;

import java.util.Scanner;

public class ShapeApp {

    public static void main(String[] args) {

        //Created first instance of rectangle

        System.out.println("Please enter the Length of the Rectangle");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        Rectangle shapeRect = new Rectangle();
        shapeRect.setLength(length);
        System.out.println("You entered : " + shapeRect.getLength());

        System.out.println("Please enter the Width of the Rectangle");
        double width = input.nextDouble();
        shapeRect.setWidth(width);
        System.out.println("You entered : " + shapeRect.getWidth());

        //Created second instance of rectangle

        Rectangle shapeRect2 = new Rectangle();
        System.out.println("Please enter the Length of the Second Rectangle");
        double length2 = input.nextDouble();
        shapeRect2.setLength(length2);
        System.out.println("You entered : " + shapeRect2.getLength());
        System.out.println("Please enter the Width of the Second Rectangle");
        double width2 = input.nextDouble();
        shapeRect2.setWidth(width2);
        System.out.println("You entered : " + shapeRect2.getWidth());

        Rectangle shapeRect3 = new Rectangle(23,15);
        System.out.println("You entered for width: " + shapeRect3.getWidth());
        System.out.println("You entered for length: " + shapeRect3.getLength());
    }

}
