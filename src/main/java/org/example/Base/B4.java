package org.example.Base;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B4 {
    public static void action(){
        System.out.print("\nInput 3 double nums (3 arguments a, b, c)\n");
        Scanner scanner = new Scanner(System.in);
        Map<Character, Double> data = new HashMap<>();
        Character[] keys = {'a', 'b', 'c'};
        for(char i:keys){
            data.put(i, scanner.nextDouble());
        }
        double d = Math.pow(data.get('b'), 2) - 4*data.get('a')*data.get('c');
        if(d>0) System.out.print("2 solutions");
        else if(d<0) System.out.print("no solutions");
        else System.out.print("1 solution");
    }
}
