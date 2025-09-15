package org.example.Base;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B5 {
    public static void action(){
        System.out.print("\nInput 3 double nums (3 arguments from, to, step)(for sinus function)\n");
        Scanner scanner = new Scanner(System.in);
        Map<Character, Double> data = new HashMap<>();
        Character[] keys = {'f', 't', 's'};
        for(char i:keys){
            data.put(i, scanner.nextDouble());
        }
        int step = 0;
        int total = Math.toIntExact(Math.round((Math.abs(data.get('f') - data.get('t')) / data.get('s'))));
        for(double i = data.get('f'); i<data.get('t'); i+=data.get('s')){
            System.out.printf("\n[%d/%d]: Function sin(x) at %f: %f", step, total, i, Math.sin(i));
            step++;
        }
    }
}
