package com.scrumtrek.simplestore;

/**
 * Created by AnnaEeePC on 01.03.2016.
 */
public class JsonReport implements ReportFormat {

    @Override
    public String format(Report report) {
        final StringBuilder sb = new StringBuilder();
        sb.append("{");

        if (report.header != null) {
            sb.append("Customer:  " + report.header.customerName);
        }

        if (report.body != null) {
            sb.append("Rentals: [ ");
            for (Rental r : report.body.rentals) {
                sb.append("Rental: {");
                if (r.getMovies() != null) {
                    sb.append("Movies: [ ");
                    for (Movie m : r.getMovies()) {
                        sb.append(m.getTitle() + ",");
                    }
                    sb.append("],");
                }
                sb.append("amount: " + r.getTotal());
                sb.append("}, ");
            }
            sb.append("],");
        }

        if (report.footer != null) {
            sb.append("Total amount: " + report.footer.total);
        }

        sb.append("}");
        return sb.toString();
    }
}


