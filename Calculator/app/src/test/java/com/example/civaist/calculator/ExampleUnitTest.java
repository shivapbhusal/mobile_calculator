package com.example.civaist.calculator;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void testPostFixComputation() throws Exception{
        EvaluateExp sh= new EvaluateExp();
        ComputePostFix comp = new ComputePostFix();
        System.out.println(sh.evaluate("10 - 20 * 10"));
    }
}