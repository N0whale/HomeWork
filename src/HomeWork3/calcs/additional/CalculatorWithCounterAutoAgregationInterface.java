package HomeWork3.calcs.additional;


import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {

    public ICalculator iCalculator;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator) {
        this.iCalculator = calculator;
    }

    long count;
    public void incrementCountOperation() {
        count++;
    }

    public long getCountOperation() {
        return count;
    }

    public double add(double a, double b){
        incrementCountOperation();
        return iCalculator.add(a , b);
    };
    public double sub(double a, double b){
        incrementCountOperation();
        return iCalculator.sub(a , b);
    }
    public double mult(double a, double b){
        incrementCountOperation();
        return iCalculator.mult(a , b);
    }
    public double div(double a, double b){
        incrementCountOperation();
        return iCalculator.div(a , b);
    }
    public double pow(double a, int b){
        incrementCountOperation();
        return iCalculator.pow(a , b);
    }
    public double sqrt(double a){
        incrementCountOperation();
        return iCalculator.sqrt(a);
    }
    public double abs(double a){
        incrementCountOperation();
        return iCalculator.abs(a);
    }
}