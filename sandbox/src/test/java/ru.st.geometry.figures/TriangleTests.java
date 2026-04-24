package ru.st.geometry.figures;

public class TriangleTests {

    @Test
    void canCalculateArea() {

        double result = Triangle.triangleArea(13, 14, 15);
        Assertions.assertEquals(84.0, result);
    }

    @Test
    void canCalculateArea2() {

        double result = Triangle.triangleArea(30, 34, 25);
        Assertions.assertEquals(363.47618560230325, result);
    }
}