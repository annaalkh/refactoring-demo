package com.scrumtrek.simplestore;

/**
 * Created by raz0r on 01.03.2016.
 */
public class TextReport implements ReportFormat {
    @Override
    public String format(Report report) {
        final StringBuilder sb = new StringBuilder();
        if (report.header != null) {
            sb.append("Customer " + report.header.customerName);
        }

        if (report.body != null) {
            if (!sb.toString().isEmpty()) {
                sb.append("\n");
            }
            sb.append("Rentals: " + "\n");
            for (Rental r : report.body.rentals) {
                sb.append("Rental: " + "\n");
                if (r.getMovies() != null) {
                    sb.append("Movies: " + "\n");
                    for (Movie m : r.getMovies()) {
                        sb.append(m.getTitle() + "\n");
                    }
                }
                sb.append(r.getTotal());
            }
        }

        if (report.footer != null) {
            if (!sb.toString().isEmpty()) {
                sb.append("\n");
            }
            sb.append("Total amount: " + report.footer.total);
        }
        return sb.toString();
    }
}
