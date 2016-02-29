package com.scrumtrek.simplestore.pricecodes;

import com.scrumtrek.simplestore.model.Rental;
import com.scrumtrek.simplestore.model.Report;

/**
 * Created by AnnaEeePC on 29.02.2016.
 */
public abstract class MovieReportCalculator {

    public abstract Report.MovieReport calculate(Rental rental);
}
