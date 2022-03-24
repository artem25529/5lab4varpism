package com.es.model;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class RatingCalculatorBean implements RatingCalculator {
    @Override
    public double getRating(List<Double> marks) {
        return marks.stream().mapToDouble(mark -> mark).average().orElse(0);
    }
}
