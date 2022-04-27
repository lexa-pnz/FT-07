import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CheckingFractions {


    @Test
    public void numeratorAndDenominatorCheckInteger(){

        Utils.setValueFraction(1,1);
        assertEquals("Numerator is not int", Utils.rational.getNumerator(), 1);
        assertEquals("Denominator is not int", Utils.rational.getDenominator(), 1);

    }

    @Test
    public void defaultValueNumeratorAndDenominator(){

        Utils.setValueFraction();
        assertEquals("Invalid default numerator", Utils.rational.getNumerator(), 0);
        assertEquals("Invalid default denominator", Utils.rational.getDenominator(), 1);

    }

    @Test
    public void minusBeforeNumerator(){

        Utils.setValueFraction(-1, 1);
        assertEquals("Minus not before numerator", Utils.rational.getNumerator(), -1);
        assertEquals("Minus before denominator", Utils.rational.getDenominator(), 1);

    }

    @Test
    public void minusBeforeDenominator(){

        Utils.setValueFraction(1, -1);
        assertEquals("Minus not before numerator", Utils.rational.getNumerator(), -1);
        assertEquals("Minus before denominator", Utils.rational.getDenominator(), 1);

    }

    /*
    Один момент заметил, если попробовать установить нулевой знаменатель через метод setDenominator,
    то он устанавливается, хотя не должен,
    если и числитель и знаменатель занулить через сеттеры, то ошибка выдается, но обрезанная.
    А вот если через конструктор указывать знаменатель, то все ок, корректная ошибка
    */

    @Test
    public void zeroDenominator() throws ArithmeticException {

        Throwable thrown = assertThrows(ArithmeticException.class, () -> {
            Utils.setValueFraction(1,0);
        });
        assertEquals("Invalid division by zero","division by zero !",thrown.getMessage());

    }

    @Test // ERR. Неполное сообщение об ошибке
    public void zeroDenominatorSetDenominator() throws ArithmeticException {

        Utils.setValueFraction();
        Throwable thrown = assertThrows(ArithmeticException.class, () -> {
            Utils.rational.setDenominator(0);
        });
        assertEquals("Invalid division by zero","division by zero !",thrown.getMessage());

    }

    @Test // ERR. Нет сообщения об ошибке
    public void zeroDenominatorSetNumeratorAndDenominator() throws ArithmeticException {

        Utils.setValueFraction();
        Throwable thrown = assertThrows(ArithmeticException.class, () -> {
            Utils.rational.setNumerator(1);
            Utils.rational.setDenominator(0);
        });
        assertEquals("Invalid division by zero","division by zero !",thrown.getMessage());

    }
}
