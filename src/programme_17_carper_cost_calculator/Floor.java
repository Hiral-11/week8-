package programme_17_carper_cost_calculator;

/**
 * 3.Write a class with name Calculator. The class needs two fields(instance variables) with name floor of type Floor
 * and carpet of type Carpet++
 */

public class Floor {
    double width;
    double length;

    public Floor(double width, double length){
       if (width < 0) {
           this.width = 0;
       }else {
           this.width = width;
       }
       if (length < 0){
           this.length = length;
       }
    }

    public double getArea(){

        return width * length;
    }
}
