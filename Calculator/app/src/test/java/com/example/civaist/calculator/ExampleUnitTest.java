package com.example.civaist.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void testPostFixComputation() throws Exception{
        System.out.println("10 * 20");
        ShuntingYard sh= new ShuntingYard();
        ComputePostFix comp = new ComputePostFix();
        System.out.println(sh.infixToPostfix("10 * 20 + 10"));
    }
}