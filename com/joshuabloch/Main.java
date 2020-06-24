package joshuabloch;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Jopa jopa = new Jopa();
        Jopa jopa1 = jopa.clone();
        System.out.println(jopa);
        System.out.println(jopa1);
        System.out.println(jopa == jopa1);
    }
}

class Jopa implements Cloneable{
    private int num = 10;
    private double aDouble = 15.0f;

    @Override
    public Jopa clone(){
        try{
            return (Jopa) super.clone();
        } catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Jopa{" +
                "num=" + num +
                ", aDouble=" + aDouble +
                '}';
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