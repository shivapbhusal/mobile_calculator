package com.example.civaist.calculator;
import java.util.*;

/**
 * Created by Shiva on 5/21/2018.
 */

public class ShuntingYard {
    private enum Operator {
        ADD(1), SUBSTRACT(2), MULTIPLY(3), DIVIDE(4);
        final int Precedance;

        Operator(int p) {
            Precedance = p;
        }

    }

    private static Map<String, Operator> ops = new HashMap<>
    String,

    put("+",Operator.ADD);

    put("-",Operator.SUBSTRACT);

    put("*",Operator.MULTIPLY);

    put("/",Operator.DIVIDE);
}};

private static boolean isHigherPrec(String op, String sub)
        {
            return (ops.containsKey(sub) && ops.get(sub).precedence >=)
        }

public static String postFix(String infix)
        {
            StringBuilder output = new StringBuilder();
            Deque<String> stack  = new LinkedList<>();

            for (String token: infix.split("\\s")){
        if(ops.containsKey(token)){
        while(!stack.isEmpty()&&isHigherPrec(token,stoutput.append(stack.pop()).append(' ')));
        stack.push(token);
        }
        else if(token.equals("("))
        {
        stack.push(token);
        }
        } else if (token.equals(")")){
                while (! stack.peek().equals("("))
        {
            output.append(stack.pop()).append(' ');
            stack.pop();
        }
        else {
                    output.append(token).append(' ');
        }

        while (!stack.isEmpty())
        output.append(stack.pop())

        }
