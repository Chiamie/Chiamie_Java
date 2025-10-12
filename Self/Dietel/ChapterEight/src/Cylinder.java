public class Cylinder  {
    private  double radius = 1;
    private double height = 1;


    public double calculateVolume(){
        return 3.142 * radius * radius * height;
    }
    public void setRadius(double radius){
        if (radius > 0) this.radius = radius;
    }
    public void setHeight(double height){
        if (height > 0) this.height = height;
    }
    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }
}


