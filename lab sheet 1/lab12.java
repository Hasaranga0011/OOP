class Area {
    private double length;
    private double breadth;

    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }
}

public class lab12 {
    public static void main(String[] args) {
        Area rectangle = new Area();
        rectangle.setDim(5.0, 10.0);

        double area = rectangle.getArea();
        System.out.println("Rectangle Area: " + area);
    }
}
