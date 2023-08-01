package workintech.s14d1.main;
import workintech.s14d1.model.Cuboid;
import workintech.s14d1.model.Rectangle;
import workintech.s14d1.model.Circle;
import workintech.s14d1.model.Cylinder;

import workintech.s14d1.employee.SeniorDeveloper;
import workintech.s14d1.employee.MidDeveloper;
import workintech.s14d1.employee.JuniorDeveloper;
import workintech.s14d1.employee.HRManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("********Silindir********");

        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());

        System.out.println("********Havuzun Alanı********");

        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());}
}