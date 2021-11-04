package com.meituan.saas.catering_management;
import java.util.Arrays;
/**
 * @ClassName Calculator
 * @Description 在main中的主要类
 * @Author lingxiangxiang
 * @Date 10:07 AM
 * @Version 1.0
 **/
public class Calculator {
    public int calculate(String expression) {
        String[] ss = expression.split("\\+");
        System.out.println(expression + " => " + Arrays.toString(ss));
        int sum = 0;
        for (String s: ss) {
            sum += Integer.parseInt(s.trim());
        }
        return sum;
    }
}
