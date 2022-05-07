package hw1t1;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        Integer c = calc.devide.apply(a, b); //из-за возможного возврата null (NullPointerException)

        calc.println.accept(c);
    }
}
