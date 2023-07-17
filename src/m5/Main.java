package m5;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x>0;
        System.out.println(isPositive.test(5));
        System.out.println(isPositive.test(-10));

        BinaryOperator<Integer> plus = (x, y) -> x+y;
        System.out.println(plus.apply(5,3));
        UnaryOperator<Integer> s = x -> x*x;
        System.out.println(s.apply(5));

        Function<Integer, String> convert = x -> String.valueOf(x) + " руб.";
        System.out.println(convert.apply(5));

    }
}
