public class HouseDimension {

    private final double minimum;
    private final double maximum;

    private double current;

    public HouseDimension(double minimum, double maximum){
        this.maximum = maximum;
        this.minimum = minimum;

        //set current to minimum
        current = minimum;
    }

    public double getCurrent(){
        return current;
    }

    public void setCurrent(double current){
        if(current > maximum){
            current = maximum;
        }
        if(current < minimum){
            current = minimum;
        }

        //set the object current value to passed in value
        this.current = current;
    }
}
