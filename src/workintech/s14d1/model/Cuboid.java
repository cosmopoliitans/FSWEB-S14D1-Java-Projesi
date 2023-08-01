package workintech.s14d1.model;

public class Cuboid extends Rectangle{

    private double height;

    private void checkHeight(double height){
        if(height <0){
            height = 0;
        } else {
            this.height = height;
        }
    }

    public Cuboid(double with, double lenght, double height){
        super(with, lenght);
        checkHeight(height);
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        checkHeight(height);
    }

    public double getVolume(){
        return getArea() * height;
    }
}
