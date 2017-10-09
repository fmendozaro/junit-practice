package main.calculator;

public class Calc {

    public static void main(String[] args) {

    }

    public double sum(double[] nums){
        double sum = 0;
        for(double num : nums){
            sum += num;
        }
        return sum;
    }

    public double subtract(double a, double b){
        return a-b;
    }

    public double multiply(double a, double b){
        return a * b;
    }

    public double divide(double numberator, double denominator){
        if(denominator == 0){
            return 0;
        }
        return numberator/ denominator;
    }

}
