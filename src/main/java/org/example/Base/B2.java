package org.example.Base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B2 {
    public static void action(){
        System.out.print("\nInput 3 double nums\n");
        Scanner scanner = new Scanner(System.in);
        List<Double> arr = new ArrayList<>();
        for(int i = 0; i<3; i++){
            arr.add(scanner.nextDouble());
        }
        Collections.sort(arr);
        System.out.printf("Multiplication: %f, Average: %f, Sorted: %f %f %f", arr.get(0)* arr.get(1)*arr.get(2), (arr.get(0)+arr.get(1)+arr.get(2))/3, arr.get(0), arr.get(1), arr.get(2));
    }
}
