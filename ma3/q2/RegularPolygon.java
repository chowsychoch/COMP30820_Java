package ma.ma3.q2;

public class RegularPolygon {
    private int n;
    private double length;

    public RegularPolygon(){
        this.n = 3;
        this.length = 1;
    }

    public RegularPolygon(int n, double length){
        this.setN(n);
        this.setLength(length);
    }

    public int getN() {
        return n;
    }

    public double getLength() {
        return length;
    }

    public void setN(int n) {
        if (n < 0){
            System.out.println("Not a positive number");
        }else{
            this.n = n;
        }
    }

    public void setLength(double length) {
        if (length < 0){
            System.out.println("Not a positive number");
        }else{
            this.length = length;
        }
    }

    public double getPerimeter(){
        return this.getLength() * n;
    }

    public double getArea(){
        return (n * Math.pow(length,2))/ (4 * Math.tan(Math.PI/n));
    }

    public String toString(){
        return "Perimeter: " + getPerimeter() + " .Area: "+getArea();
    }


}
