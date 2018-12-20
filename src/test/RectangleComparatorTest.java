package test;

import main.Rectangle;
import main.RectangleComparator;

import java.util.Arrays;
import java.util.Comparator;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle(3, 4);
        rectangles[2] = new Rectangle(4, 6, "indigo", false);
        System.out.println("Pre-sorted: ");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
        Comparator rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangles, rectangleComparator);
        System.out.println("After-sorted: ");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

    }


}
