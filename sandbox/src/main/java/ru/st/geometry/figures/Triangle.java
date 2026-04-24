package ru.st.geometry.figures;

public class Triangle {
    public static double triangleArea(double side1, double side2, double side3){

        double p = (side1+side2+side3)/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    public static void printTriangleArea(double a, double b, double c){

        System.out.println("Найти площадь треугольника = " + triangleArea(a,b,c));
    }
}