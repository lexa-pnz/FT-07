import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArithmeticOperations {

    @Test
    public void fractionReduction(){

        Utils.setValueFraction(7, 21);
        assertEquals("The numerator is not reduced", Utils.rational.getNumerator(), 1);
        assertEquals("The denominator is not reduced", Utils.rational.getDenominator(), 3);

    }

    @Test
    public void operationPlus(){

        Utils.setValueFraction(2, 5, 1,7);
        Rational result = Utils.rational.plus(Utils.rational2);

        assertEquals("Plus operation performed incorrectly", result.getNumerator(), 19);
        assertEquals("Plus operation performed incorrectly", result.getDenominator(), 35);

    }

    @Test
    public void operationMinus(){

        Utils.setValueFraction(2, 5, 3,7);
        Rational result = Utils.rational.minus(Utils.rational2);

        assertEquals("Minus operation performed incorrectly", result.getNumerator(), -1);
        assertEquals("Minus operation performed incorrectly", result.getDenominator(), 35);

    }

    @Test
    public void operationMultiplication(){

        Utils.setValueFraction(2, 5, 1,3);
        Rational result = Utils.rational.multiply(Utils.rational2);

        assertEquals("Multiplication operation performed incorrectly", result.getNumerator(), 2);
        assertEquals("Multiplication operation performed incorrectly", result.getDenominator(), 15);

    }

    @Test
    public void operationDivision(){

        Utils.setValueFraction(2, 5, 1,3);
        Rational result = Utils.rational.divide(Utils.rational2);

        assertEquals("Division operation performed incorrectly", result.getNumerator(), 6);
        assertEquals("Division operation performed incorrectly", result.getDenominator(), 5);

    }

    @Test
    public void divisionByZero() throws ArithmeticException{

        Utils.setValueFraction(1,5,0,1);

        Throwable thrown = assertThrows(ArithmeticException.class, () -> {
            Utils.rational.divide(Utils.rational2);
        });
        assertEquals("Invalid division by zero","division by zero !",thrown.getMessage());

    }

}
