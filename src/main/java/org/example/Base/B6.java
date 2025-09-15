package org.example.Base;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B6{
    public static void action(){
        System.out.print("\nInput 6 nums (6 args: a1, b1, a2, b2, c1, c2)\n");
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> data = new HashMap<>();
        String[] keys = {"a1", "b1", "a2", "b2", "c1", "c2"};
        for(String i:keys){
            data.put(i, scanner.nextDouble());
        }
        double y = (data.get("c2")-data.get("c1")*(data.get("a2")/data.get("a1")))/(data.get("b2")-data.get("b1")*(data.get("a2")/data.get("a1")));
        double x = (data.get("c1")-data.get("b1")*y)/data.get("a1");
        System.out.printf("Result for your system x: %f y: %f", x, y);
    }
}
