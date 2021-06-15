public class ComparableCircle extends  Circle
implements Comparable<ComparableCircle>{
    public  ComparableCircle(){

    }
    public  ComparableCircle(double radius){
        super(radius);
    }

    public ComparableCircle(String color, boolean filled, double raddius) {
        super(color, filled, raddius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if(getRaddius() > o.getRaddius()) return 1;
        else if(getRaddius() < o.getRaddius()) return  -1;
        else return 1;
    }
}
