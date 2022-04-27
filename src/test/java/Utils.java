public class Utils {

    public static Rational rational;
    public static Rational rational2;

    public static void setValueFraction(int numerator1, int denominator1, int numerator2, int denominator2){

        rational = new Rational(numerator1, denominator1);
        rational2 = new Rational(numerator2, denominator2);

    }

    public static void setValueFraction(int numerator, int denominator){

        rational = new Rational(numerator, denominator);

    }

    public static void setValueFraction(){

        rational = new Rational();

    }

}
