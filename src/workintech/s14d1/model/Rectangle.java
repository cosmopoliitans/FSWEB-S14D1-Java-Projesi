package workintech.s14d1.model;

public class Rectangle {
    private double width;
    private double length;

    private void checkWidth(double width){
        if( width < 0 ){
            width = 0;
        } else {
            this.width = width;
        }
    }

    private void checkLength(double length){
        if( length < 0 ){
            length = 0;
        } else {
            this.length = length;
        }
    }

    public Rectangle(double width, double length){
        checkLength(length);
        checkWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        checkWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        checkLength(length);
    }

    public double getArea(){
        return width * length;
    }
}
