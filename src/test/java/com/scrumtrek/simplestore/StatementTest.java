package com.scrumtrek.simplestore;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created by raz0r on 29.02.2016.
 */
public class StatementTest {

    @Test
    public void bonusRegular() {
        //region Given
        Movie movCinderella = new Movie("Cinderella", PriceCodes.CHILDREN);
        Customer custMickeyMouse = new Customer("Mickey Mouse");
        Rental rental1 = new Rental(2);
        rental1.addMovie(movCinderella);
        custMickeyMouse.addRental(rental1);
        //endregion

        //region When
//        String invoice = custMickeyMouse.getInvoice();
        //endregion

        //region Then
//        assertThat(invoice).contains("You earned " + 1 + " frequent renter points.");
        //endregion
    }

    @Test
    public void totalAmountRegularDay1() {
        //region Given
        Movie movCinderella = new Movie("Cinderella", PriceCodes.REGULAR);
        Customer custMickeyMouse = new Customer("Mickey Mouse");
        Rental rental1 = new Rental(movCinderella, 1);
        custMickeyMouse.addRental(rental1);
        //endregion

        //region When
//        String invoice = custMickeyMouse.getInvoice();
        ReportFormat format = new TextReport();
        String invoice = format.format(Report.getReport(custMickeyMouse));
        //endregion

        //region Then


        // Print the statement

        assertThat(invoice).contains("Total amount: 2");
        //endregion
    }

    @Test
    public void totalAmountRegularDay3() {
        //region Given
        Movie movCinderella = new Movie("Cinderella", PriceCodes.REGULAR);
        Customer custMickeyMouse = new Customer("Mickey Mouse");
        Rental rental1 = new Rental(movCinderella, 3);
        custMickeyMouse.addRental(rental1);
        //endregion

        //region When
//        String invoice = custMickeyMouse.getInvoice();
        ReportFormat format = new TextReport();
        String invoice = format.format(Report.getReport(custMickeyMouse));
        //endregion

        //region Then


        // Print the statement

        assertThat(invoice).contains("Total amount: 3.5");
        //endregion
    }

    @Test
    public void totalAmountNewReleaseDay1() {
        //region Given
        Movie movCinderella = new Movie("Cinderella", PriceCodes.NEWRELEASE);
        Customer custMickeyMouse = new Customer("Mickey Mouse");
        Rental rental1 = new Rental(movCinderella, 1);
        custMickeyMouse.addRental(rental1);
        //endregion

        //region When
//        String invoice = custMickeyMouse.getInvoice();
        ReportFormat format = new TextReport();
        String invoice = format.format(Report.getReport(custMickeyMouse));
        //endregion

        //region Then


        // Print the statement

        assertThat(invoice).contains("Total amount: 3.0");
        //endregion
    }

    @Test
    public void totalAmountNewReleaseDay1Json() {
        //region Given
        Movie movCinderella = new Movie("Cinderella", PriceCodes.NEWRELEASE);
        Customer custMickeyMouse = new Customer("Mickey Mouse");
        Rental rental1 = new Rental(movCinderella, 1);
        custMickeyMouse.addRental(rental1);
        //endregion

        //region When
//        String invoice = custMickeyMouse.getInvoice();
        ReportFormat format = new JsonReport();
        String invoice = format.format(Report.getReport(custMickeyMouse));
        //endregion

        //region Then


        // Print the statement

        assertThat(invoice).isEqualTo("{Customer:  Mickey MouseRentals: [ Rental: {Movies: [ Cinderella,],amount: 3.0}, ],Total amount: 3.0}");
        //endregion
    }
//
    @Test
    public void totalAmountNewReleaseDay3() {
        //region Given
        Movie movCinderella = new Movie("Cinderella", PriceCodes.NEWRELEASE);
        Customer custMickeyMouse = new Customer("Mickey Mouse");
        Rental rental1 = new Rental(movCinderella, 3);
        custMickeyMouse.addRental(rental1);
        //endregion

        //region When
        ReportFormat format = new TextReport();
        String invoice = format.format(Report.getReport(custMickeyMouse));
        //endregion

        //region Then
        assertThat(invoice).contains("Total amount: 9");
        //endregion
    }
//
//
    @Test
    public void totalAmountXXXDay1() {
        //region Given
        Movie movCinderella = new Movie("Cinderella", PriceCodes.XXX);
        Customer custMickeyMouse = new Customer("Mickey Mouse");
        Rental rental1 = new Rental(movCinderella, 1);
        custMickeyMouse.addRental(rental1);
        //endregion

        //region When
        ReportFormat format = new TextReport();
        String invoice = format.format(Report.getReport(custMickeyMouse));
        //endregion

        //region Then
        assertThat(invoice).contains("Total amount: 5");
        //endregion
    }

    @Test
    public void totalAmountXXXDay4() {
        //region Given
        Movie movCinderella = new Movie("Cinderella", PriceCodes.XXX);
        Customer custMickeyMouse = new Customer("Mickey Mouse");
        Rental rental1 = new Rental(movCinderella, 4);
        custMickeyMouse.addRental(rental1);
        //endregion

        //region When
        ReportFormat format = new TextReport();
        String invoice = format.format(Report.getReport(custMickeyMouse));
        //endregion

        //region Then
        assertThat(invoice).contains("Total amount: 6");
        //endregion
    }

    @Test
    public void totalAmountChildrenDay1() {
        //region Given
        Movie movCinderella = new Movie("Cinderella", PriceCodes.CHILDREN);
        Customer custMickeyMouse = new Customer("Mickey Mouse");
        Rental rental1 = new Rental(movCinderella, 1);
        custMickeyMouse.addRental(rental1);
        //endregion

        //region When
//        String invoice = custMickeyMouse.getInvoice();
        ReportFormat format = new TextReport();
        String invoice = format.format(Report.getReport(custMickeyMouse));
        //endregion

        //region Then


        // Print the statement

        assertThat(invoice).contains("Total amount: 1.5");
        //endregion
    }

    @Test
    public void totalAmountChildrenDay4() {
        //region Given
        Movie movCinderella = new Movie("Cinderella", PriceCodes.CHILDREN);
        Customer custMickeyMouse = new Customer("Mickey Mouse");
        Rental rental1 = new Rental(movCinderella, 4);
        custMickeyMouse.addRental(rental1);
        //endregion

        //region When
//        String invoice = custMickeyMouse.getInvoice();
        ReportFormat format = new TextReport();
        String invoice = format.format(Report.getReport(custMickeyMouse));
        //endregion

        //region Then


        // Print the statement

        assertThat(invoice).contains("Total amount: 3");
        //endregion
    }

    @Test
    public void totalAmountNewReleaseDay1HeaderOnly() {
        //region Given
        Movie movCinderella = new Movie("Cinderella", PriceCodes.NEWRELEASE);
        Customer custMickeyMouse = new Customer("Mickey Mouse");
        Rental rental1 = new Rental(movCinderella, 1);
        custMickeyMouse.addRental(rental1);
        //endregion

        //region When
//        String invoice = custMickeyMouse.getInvoice();
        ReportFormat format = new TextReport();
        String invoice = format.format(Report.getSpecificReport(custMickeyMouse, true, false, false, false));
        //endregion

        //region Then


        // Print the statement

        assertThat(invoice).isEqualTo("Customer Mickey Mouse");
        //endregion
    }

    @Test
    public void totalAmountNewReleaseDay1FooterOnly() {
        //region Given
        Movie movCinderella = new Movie("Cinderella", PriceCodes.NEWRELEASE);
        Customer custMickeyMouse = new Customer("Mickey Mouse");
        Rental rental1 = new Rental(movCinderella, 1);
        custMickeyMouse.addRental(rental1);
        //endregion

        //region When
//        String invoice = custMickeyMouse.getInvoice();
        ReportFormat format = new TextReport();
        String invoice = format.format(Report.getSpecificReport(custMickeyMouse, false, false, false, true));
        //endregion

        //region Then


        // Print the statement

        System.out.println(invoice);
        assertThat(invoice).isEqualTo("Total amount: 3.0");
        //endregion
    }
//
//
//    @Test
//    public void bonuXxxDay3() {
//        //region Given
//        Movie movCinderella = new Movie("Cinderella", PriceCodes.XXX);
//        Customer custMickeyMouse = new Customer("Mickey Mouse");
//        Rental rental1 = new Rental(movCinderella, 3);
//        custMickeyMouse.addRental(rental1);
//        //endregion
//
//        //region When
//        String invoice = custMickeyMouse.getInvoice();
//        //endregion
//
//        //region Then
//        assertThat(invoice).contains("You earned " + 6 + " frequent renter points.");
//        //endregion
//    }
//
//    @Test
//    public void xxxMovieRentalNoOverprice() {
//        //region Given
//        Movie movCinderella = new Movie("Cinderella", PriceCodes.XXX);
//        Customer custMickeyMouse = new Customer("Mickey Mouse");
//        Rental rental1 = new Rental(movCinderella, 2);
//        custMickeyMouse.addRental(rental1);
//        //endregion
//
//        //region When
//        String invoice = custMickeyMouse.getInvoice();
//        //endregion
//
//        //region Then
//        assertThat(invoice).contains("Amount owed is " + 5);
//        //endregion
//    }
//
//
//    @Test
//    public void xxxMovieRentalOverprice() {
//        //region Given
//        Movie movCinderella = new Movie("Cinderella", PriceCodes.XXX);
//        Customer custMickeyMouse = new Customer("Mickey Mouse");
//        Rental rental1 = new Rental(movCinderella, 4);
//        custMickeyMouse.addRental(rental1);
//        //endregion
//
//        //region When
//        String invoice = custMickeyMouse.getInvoice();
//        //endregion
//
//        //region Then
//        assertThat(invoice).contains("Amount owed is " + (5 + (4 - 3) * 1));
//        //endregion
//    }
//
//    @Test
//    public void childrenMovieRentalNoOverprice() {
//        //region Given
//        Movie movCinderella = new Movie("Cinderella", PriceCodes.CHILDREN);
//        Customer custMickeyMouse = new Customer("Mickey Mouse");
//        Rental rental1 = new Rental(movCinderella, 1);
//        custMickeyMouse.addRental(rental1);
//        //endregion
//
//        //region When
//        String invoice = custMickeyMouse.getInvoice();
//        //endregion
//
//        //region Then
//        assertThat(invoice).contains("Amount owed is " + 1.5);
//        //endregion
//    }
//
//
//    @Test
//    public void childrenMovieRentalOverprice() {
//        //region Given
//        Movie movCinderella = new Movie("Cinderella", PriceCodes.CHILDREN);
//        Customer custMickeyMouse = new Customer("Mickey Mouse");
//        Rental rental1 = new Rental(movCinderella, 5);
//        custMickeyMouse.addRental(rental1);
//        //endregion
//
//        //region When
//        String invoice = custMickeyMouse.getInvoice();
//        //endregion
//
//        //region Then
//        assertThat(invoice).contains("Amount owed is " + (1.5 + (5-3)*1.5));
//        //endregion
//    }
//
//
//    @Test
//    public void regularMovieOverprice() {
//        //region Given
//        Movie movCinderella = new Movie("Cinderella", PriceCodes.REGULAR);
//        Customer custMickeyMouse = new Customer("Mickey Mouse");
//        Rental rental1 = new Rental(movCinderella, 5);
//        custMickeyMouse.addRental(rental1);
//        //endregion
//
//        //region When
//        String invoice = custMickeyMouse.getInvoice();
//        //endregion
//
//        //region Then
//        assertThat(invoice).contains("Amount owed is " + (2 + (5-2)*1.5));
//        //endregion
//    }
//
//    @Test
//    public void regularMovieNoOverprice() {
//        //region Given
//        Movie movCinderella = new Movie("Cinderella", PriceCodes.REGULAR);
//        Customer custMickeyMouse = new Customer("Mickey Mouse");
//        Rental rental1 = new Rental(movCinderella, 1);
//        custMickeyMouse.addRental(rental1);
//        //endregion
//
//        //region When
//        String invoice = custMickeyMouse.getInvoice();
//        //endregion
//
//        //region Then
//        assertThat(invoice).contains("Amount owed is " + 2);
//        //endregion
//    }
//
//    @Test
//    public void newReleaaseMoviePrice() {
//        //region Given
//        Movie movCinderella = new Movie("Cinderella", PriceCodes.NEWRELEASE);
//        Customer custMickeyMouse = new Customer("Mickey Mouse");
//        Rental rental1 = new Rental(movCinderella, 5);
//        custMickeyMouse.addRental(rental1);
//        //endregion
//
//        //region When
//        String invoice = custMickeyMouse.getInvoice();
//        //endregion
//
//        //region Then
//        assertThat(invoice).contains("Amount owed is " + 5 * 3);
//    }
}
