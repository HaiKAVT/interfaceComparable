public class Circle extends Shape {
    private  double raddius = 1.0;

    public Circle() {
    }

    public Circle(double raddius) {
        this.raddius = raddius;
    }

    public Circle(String color, boolean filled, double raddius) {
        super(color, filled);
        this.raddius = raddius;
    }

    public double getRaddius() {
        return raddius;
    }

    public void setRaddius(double raddius) {
        this.raddius = raddius;
    }
    public  double getArea(){
        return  raddius*raddius*Math.PI;
    }
    public  double getPerimeter(){
        return  2*raddius*Math.PI;
    }

    @Override
    public String toString() {
        return " A Circle with " +
                " raddius= " + getRaddius() +
                ", Which is a subclass of " + super.toString();
    }
}
