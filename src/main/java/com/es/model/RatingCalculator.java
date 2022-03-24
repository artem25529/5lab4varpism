package com.es.model;

import javax.ejb.Local;
import java.util.List;

@Local
public interface RatingCalculator {
    double getRating(List<Double> marks);
}
