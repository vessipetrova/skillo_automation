package lecture02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Print name");
        printName();
        System.out.println("Print triangle perimeter");
        printTrianglePerimeter();
        System.out.println("Print triangle area");
        printTriangleArea();
        System.out.println("Print pine tree");
        printPineTree();
        System.out.println("Print triangle perimeter input");
        printTrianglePerimeterInput();
        System.out.println("Print triangle area input");
        printTriangleAreaInput();
        System.out.println("Convert minutes to years and days");
        convertMinutesToYearsDays();
    }

    public static void printName() {
        String firstName = "Vessi";
        String middleName = "Luybomirova";
        String lastName = "Petrova";

        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println(fullName);
    }

    public static void printTrianglePerimeter() {
        int a = 3;
        int b = 5;
        int c = 8;

        int perimeter = a + b + c;

        System.out.println("Triangle Perimeter is: " + perimeter);
    }

    public static void printTriangleArea() {
        float a = 5.5F;
        float h = 3.0F;

        float triangleArea = (a * h) / 2;

        System.out.println("The area of triangle is: " + triangleArea);
    }

    public static void printPineTree() {
        char asterisk = '*';
        System.out.println("     " + asterisk);
        System.out.println("    " + asterisk + " " + asterisk);
        System.out.println("   " + asterisk + " " + asterisk + " " + asterisk);
    }

    public static void printTrianglePerimeterInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side a size");
        float a = scanner.nextFloat();

        System.out.println("Enter side b size");
        float b = scanner.nextFloat();

        System.out.println("Enter side c size");
        float c = scanner.nextFloat();

        float perimeter = a + b + c;

        System.out.println("Triangle Perimeter is: " + perimeter);
    }

    public static void printTriangleAreaInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side a size");
        float a = scanner.nextFloat();

        System.out.println("Enter side b size");
        float h = scanner.nextFloat();

        float area = (a * h) / 2;

        System.out.println("The area of the triangle is: " + area);
    }

    public static void convertMinutesToYearsDays() {
        byte minutesInHour = 60;
        byte hoursInDay = 24;
        short daysInYear = 365;
        int minutesInYear = minutesInHour * hoursInDay * daysInYear;

        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        long min = input.nextLong();

        long years = (min / minutesInYear);
        long days = (min / minutesInHour / hoursInDay) % daysInYear;

        System.out.println(min + " minutes is approximately " + years + " years and " + days + " days");
    }
}