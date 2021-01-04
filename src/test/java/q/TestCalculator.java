package q;

import org.junit.jupiter.api.Assertions;

public class TestCalculator {
    @org.junit.jupiter.api.Test
    public void testMonthlyPayment() {
        // given:
        Calculator calculator = new Calculator();
        int term = 12;                           //срок кредита, мес.
        double rate = 1;                         //ставка по кредита, % в мес.
        int credit = 1000000;                    //размер кредита.
        double monthlyPayment = 88848.79;       //сумма ежемесячного платежа образцовая
        // when:
        double monthlyPaymentTest = calculator.monthlyPayment(credit, rate, term);
        // then:
        Assertions.assertTrue(monthlyPaymentTest == monthlyPayment);
    }

    @org.junit.jupiter.api.Test
    public void testTotal() {
        // given:
        Calculator calculator = new Calculator();
        int term = 12;                           //срок кредита, мес.
        double rate = 1;                         //ставка по кредита, % в мес.
        int credit = 1000000;                    //размер кредита.
        double monthlyPayment = 146763.32;       //сумма ежемесячного платежа образцовая
        double total = monthlyPayment * term;    // общая сумма к возврату образцовая
        // when:
        double totalTest = calculator.total(credit, rate, term);
        // then:
        Assertions.assertTrue(totalTest == total);
    }

    @org.junit.jupiter.api.Test
    public void testOverpayment() {
        // given:
        Calculator calculator = new Calculator();
        int term = 12;                           //срок кредита, мес.
        double rate = 1;                         //ставка по кредита, % в мес.
        int credit = 1000000;                    //размер кредита.
        double monthlyPayment = 146763.32;       //сумма ежемесячного платежа образцовая
        double total = monthlyPayment * term;    // общая сумма к возврату образцовая
        double overpayment = total - credit;      // сумма переплаты образцовая
        // when:
        double overpaymentTest = calculator.overpayment(credit, rate, term);
        // then:
        Assertions.assertTrue(overpaymentTest == overpayment);
    }
}
