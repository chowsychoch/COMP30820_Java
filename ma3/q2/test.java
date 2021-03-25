package ma.ma3.q2;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        //Q2 Test
        RegularPolygon Polygon1 = new RegularPolygon(3, 10.0);
        RegularPolygon Polygon2 = new RegularPolygon(6,7.5);
        RegularPolygon Polygon3 = new RegularPolygon(8,3.5);
        RegularPolygon Polygon4 = new RegularPolygon(12,4.0);
        double[] perimeter = new double[]{Polygon1.getPerimeter(), Polygon2.getPerimeter(), Polygon3.getPerimeter(), Polygon4.getPerimeter()};
        Arrays.sort(perimeter);
        double[] area = new double[]{Polygon1.getArea(), Polygon2.getArea(), Polygon3.getArea(), Polygon4.getArea()};
        Arrays.sort(area);
        System.out.println("The smallest perimeter: "+perimeter[0]);
        System.out.println("The largest area: "+area[3]);
        System.out.println(Polygon1.toString());
        System.out.println(Polygon2.toString());
        System.out.println(Polygon3.toString());
        System.out.println(Polygon4.toString());
    }

}
