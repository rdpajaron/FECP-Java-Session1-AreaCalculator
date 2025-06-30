package org.example;

import java.util.Scanner;

/**
 * Calculates area of a shape (circle, triangle, rectangle)
 */
public class Main {
    static double area;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Area Calculator ===");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.print("Choose a shape: ");

        //get shape
        int shape = scanner.nextInt();

        //circle area
        if(shape == 1){
            System.out.print("Enter the radius: ");
            double radius = scanner.nextDouble();
            area = calculateCircleArea(radius);
            System.out.printf("Area of the circle: %.2f%n", area);
        }

        //triangle area
        if(shape == 2){
            System.out.println("Enter the base: ");
            double base = scanner.nextDouble();
            System.out.println("Enter the height: ");
            double height = scanner.nextDouble();
            area = calculateTriangleArea(base, height);
            System.out.printf("Area of the triangle: %.2f%n", area);

        }

        //rectangle area
        if(shape == 3){
            System.out.println("Enter the length: ");
            double length = scanner.nextDouble();
            System.out.println("Enter the width: ");
            double width = scanner.nextDouble();
            area = calculateRectangleArea(length, width);
            System.out.printf("Area of the rectangle: %.2f%n", area);
        }

    }

    public static double calculateCircleArea(double radius){
        return Math.PI * radius * radius;
    }

    public static double calculateTriangleArea(double base, double height){
        return (base * height) / 2;
    }

    public static double calculateRectangleArea(double length, double width){

        return length * width;

    }

}