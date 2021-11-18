package com.challenge.apiclients.helper;

import java.util.function.DoubleConsumer;

public class StandardDeviater implements DoubleConsumer {

    private int count  = 0;
    private double total = 0;
    private double sumOfSquare;


    @Override
    public void accept(double value) {
        double squareValue = value * value;
        sumOfSquare += squareValue;
        total += value;
        count++;
    }

    public StandardDeviater combine(StandardDeviater other) {
        sumOfSquare += other.sumOfSquare;
        total += other.total;
        count += other.count;
        return this;
    }



    public final double getStandardDeviation() {
        return count > 0 ? Math.sqrt((sumOfSquare / count ) - Math.pow(getAverage(), 2)) : 0.0d;
    }

    private double getAverage() {
        return total / count;
    }
}
