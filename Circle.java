public class Circle extends Shape {
    private double radius =1.0;
    public Circle (){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*(radius*radius);
    }
    public  double getPerimeter(){
        return 2*(3.14*radius);
    }

    public String toString(){

        return " A Circle radius= "+radius+" which is subclass of"+super.toString();
    }
}
