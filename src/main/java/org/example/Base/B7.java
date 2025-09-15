package org.example.Base;

import java.util.Scanner;

public class B7{
    public static void action(){
        System.out.print("\nInput double x, e\n");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double e = scanner.nextDouble();
        int n = 1;
        double temp=1;
        double sum = 1;
        while(Math.abs(temp)>e){
            temp *= x/n;
            sum+=temp;
            n++;
        }
        System.out.printf("e^x = %f\nCalculation result e^x: %f", Math.exp(x), sum);
    }
}
