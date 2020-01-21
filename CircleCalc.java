class CircleCalc{
    public static void main(String[]args){
        int radius = Integer.parseInt(args[0]);
        Circle c = new Circle(radius);
        System.out.println("If the radius of the circle is " 
        + radius 
        + ", then the area is approximately " 
        + c.area() 
        + ", and the circumference is about " 
        + c.perimeter()+ ".");
        // double circum = radius * 2 *Math.PI;
        // double area = radius * radius * Math.PI;
        // System.out.println("If the radius of the circle is " + radius + ", then the area is approximately " + area + ", and the circumference is about "+circum+".");
    }
}