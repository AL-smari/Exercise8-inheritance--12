public class Square extends Rectangle{
    public Square(){

    }
    public Square(double side){
       super(side,side);

    }

    public Square(double side, String color, boolean filled) {
        super(side,side,color,filled);

    }
    public double getSide(){

        return super.getWidth();
    }
    public void setSide(double width){
        super.setWidth(width);

    }

    public String toString(){

        return " A Squire with side = "+getSide()+" which is subclass of "+super.toString();
    }
}
