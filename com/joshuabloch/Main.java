package joshuabloch;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

    }
}

interface AreaInterface {
    public int calculateArea();
}

class Rectangle implements AreaInterface {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int calculateArea() {
        return width * height;
    }
}

class Circle implements AreaInterface {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public int calculateArea() {
        return (int)(radius * radius * 3.14);
    }
}

class AreaCalculator {
    int getAreaOf(AreaInterface shape){
        return shape.calculateArea();
    }
}