package com.example.civaist.calculator;

import org.junit.Test;

import static com.example.civaist.calculator.ComputePostFix.compute;
import static com.example.civaist.calculator.ShuntingYard.infixToPostfix;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        String infix = "3 + 4 * 2 / ( 1 - 5 ) ^ 2 ^ 3";
        System.out.printf("infix:   %s%n", infix);
        System.out.printf("postfix: %s%n", infixToPostfix(infix));
    }

    public void testPostFixComputation() {
        System.out.println("3 4 2 * 1 5 - 2 3 ^ ^ / +");
        System.out.println(compute("3 4 2 * 1 5 - 2 3 ^ ^ / +"));
    }
}