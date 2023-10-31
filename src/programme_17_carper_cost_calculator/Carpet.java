package programme_17_carper_cost_calculator;

/**
 * 2.Write a class with the name Carpet. The class needs one field (instance variable) with name cost of
 * type double
 * he class needs to have one constructor with parameter cost of type double and it needs to initialize
 * the field.
 * In case the cost parameter is less than 0 it needs to set the cost field value to 0
 */

public class Carpet {
    double cost;
     public Carpet(double cost){
        if(cost < 0){
        }else {
            this.cost = 0;
        }
    }
    public double getCost(){
        return this.cost;
    }
}
