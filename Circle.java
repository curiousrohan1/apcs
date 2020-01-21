class Circle {
    private int radius;

    public Circle(int r) {
        radius = r;
    }
    
    public double area() {
        double area = radius * radius * Math.PI;
        return area;
    }
    public double perimeter() {
        double circum = radius * 2 *Math.PI;
        return circum;
    }
}