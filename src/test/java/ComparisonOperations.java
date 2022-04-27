import org.junit.Test;

import static org.junit.Assert.*;

public class ComparisonOperations {

    @Test
    public void operationEqualityComparison_Positive(){

        Utils.setValueFraction(1, 5, 1,5);
        assertEquals("Fail Operation equality comparison", Utils.rational, Utils.rational2);

    }

    @Test
    public void operationEqualityComparison_NegativeMore(){

        Utils.setValueFraction(2, 5, 1,5);
        assertNotEquals("Fail Operation equality comparison", Utils.rational, Utils.rational2);

    }

    @Test
    public void operationEqualityComparison_NegativeLess(){

        Utils.setValueFraction(1, 5, 2,5);
        assertNotEquals("Fail Operation equality comparison", Utils.rational, Utils.rational2);

    }

    @Test
    public void operationComparisonLess_Positive(){

        Utils.setValueFraction(2, 5, 1,5);
        assertTrue("Fail Operation comparison Less", Utils.rational2.less(Utils.rational));

    }

    @Test
    public void operationComparisonLess_NegativeEqually(){

        Utils.setValueFraction(1, 5, 1,5);
        assertFalse("Fail Operation comparison Less", Utils.rational2.less(Utils.rational));

    }

    @Test
    public void operationComparisonLess_NegativeMore(){

        Utils.setValueFraction(1, 5, 2,5);
        assertFalse("Fail Operation comparison Less", Utils.rational2.less(Utils.rational));

    }

    @Test
    public void operationComparisonLessOrEqual_PositiveEqually(){

        Utils.setValueFraction(1, 5, 1,5);
        assertTrue("Fail Operation comparisonLess or equal", Utils.rational2.lessOrEqual(Utils.rational));

    }

    @Test
    public void operationComparisonLessOrEqual_PositiveLess(){

        Utils.setValueFraction(2, 5, 1,5);
        assertTrue("Fail Operation comparisonLess or equal", Utils.rational2.lessOrEqual(Utils.rational));

    }

    @Test
    public void operationComparisonLessOrEqual_NegativeMore(){

        Utils.setValueFraction(1, 5, 2,5);
        assertFalse("Fail Operation comparisonLess or equal", Utils.rational2.lessOrEqual(Utils.rational));

    }
}
