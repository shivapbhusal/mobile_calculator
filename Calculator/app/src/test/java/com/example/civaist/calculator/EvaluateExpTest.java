package com.example.civaist.calculator;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class EvaluateExpTest {

    @Test
    public void testPostFixComputation() throws Exception{
        EvaluateExp sh= new EvaluateExp();
        double result=sh.evaluate("( 10 - 20 ) * 10");
        assert(result==-100);
    }
}