package org.example.Arrays;

import java.util.Scanner;

public class ArrayController {
    private Scanner scanner;
    public ArrayController(){
        this.scanner = new Scanner(System.in);
    }

    public <T extends Number> void printArray(T[] arr){
        for(T i:arr){
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public void getUserInput(int[] arr){
        System.out.print("Change element at pos n to x, (enter n, x) >> ");
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        arr[n] = x;
        System.out.print("\nOk.");
    }

    public void getUserInput(double[] arr){
        System.out.print("Change element at pos n to x, (enter n, x) >> ");
        int n = scanner.nextInt();
        double x = scanner.nextInt();
        arr[n] = x;
        System.out.print("\nOk.");
    }

    public void getUserInput(float[] arr){
        System.out.print("Change element at pos n to x, (enter n, x) >> ");
        int n = scanner.nextInt();
        float x = scanner.nextInt();
        arr[n] = x;
        System.out.print("\nOk.");
    }

    public <T extends Number> double sumArr(T[] arr){
        double sum = 0;
        for(T i:arr){
            sum+=i.doubleValue();
        }
        return sum;
    }



    public <T extends Number> T[] reverse(T[] arr){
        T temp;
        for(int i = 0; i < arr.length/2;i++){
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }

    public int numsOfEven(Integer[] arr){
        int n = 0;
        for(int i:arr){
            if(i%2==0){
                n ++;
            }
        }
        return n;
    }

    public <T extends Number> boolean moreZero(T[] arr){
        for(T i:arr){
            if(i.doubleValue() < 0){
                return false;
            }
        }
        return true;
    }

    public <T extends Number> int liesIn(T[] arr, T from, T to){
        int n = 0;
        for(T i:arr){
            if(from.doubleValue()<i.doubleValue() && i.doubleValue()<to.doubleValue()){
                n++;
            }
        }
        return n;
    }
}
