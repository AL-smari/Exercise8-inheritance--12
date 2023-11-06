// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Shape sh = new Shape();
        System.out.println(sh.toString());
        System.out.println("--------------------------------------------------");

        Circle c1 = new Circle("red",false,7);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.toString());
        System.out.println("--------------------------------------------------");

        Circle c2 = new Circle(5);
        System.out.println(c2.toString());
        System.out.println("--------------------------------------------------");


        Rectangle r1 = new Rectangle(4,5);

        System.out.println(r1.getPerimeter());
        System.out.println(r1.getArea());
        System.out.println("--------------------------------------------------");

        Square s1 = new Square(9,"blue",true);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.toString());
        s1.setSide(5);
        System.out.println(s1.getSide());
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.toString());
        System.out.println("--------------------------------------------------");

        Circle c3 = new Circle();
        Rectangle r2 =new Rectangle();
        Square s2 = new Square();
        c3.setColor("red");
        System.out.println(c3.toString());
        r2.setFilled(false);
        r2.setLength(5);
        r2.setWidth(9);
        System.out.println(r2.toString());
        s2.setColor("black");
        s2.setSide(4);
        s2.setFilled(false);
        System.out.println(s2.toString());






    }
}