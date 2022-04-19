package HomeWork3.calcs.additional;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMemory {

    public ICalculator iCalculator;

    public CalculatorWithMemory(ICalculator calculator) {
        this.iCalculator = calculator;
    }
    double memory;


    public double add(double a, double b){
         memory = iCalculator.add(a , b);
         return memory;
    }
    public double sub(double a, double b){
        memory = iCalculator.sub(a , b);
        return memory;
    }
    public double mult(double a, double b){
        memory = iCalculator.mult(a , b);
        return memory;
    }
    public double div(double a, double b){
        memory = iCalculator.div(a , b);
        return memory;
    }
    public double pow(double a, int b){
        memory = iCalculator.pow(a , b);
        return memory;
    }
    public double sqrt(double a){
        memory = iCalculator.sqrt(a);
        return memory;
    }
    public double abs(double a){
        memory = iCalculator.abs(a);
        return memory;
    }
    public double inMemory(){
        return memory;
    }
}
