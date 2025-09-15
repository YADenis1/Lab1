package org.example;

import org.example.SimpleClasses.*;
import org.example.Base.*;
import org.example.Arrays.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        B1.action();
//        B2.action();
//        B4.action();
//        B5.action();
//        B6.action();
//        B7.action();
//
//        ArrayController arrayController = new ArrayController();
//        Integer[] arr = {1, 3, 4};
//        Double[] arr2 = {3.1, 5.3, 6.0};
//        arrayController.printArray(arr);
//        arrayController.printArray(arr2);
//        System.out.println(arrayController.sumArr(arr));
//        System.out.println(arrayController.sumArr(arr2));
//        System.out.println();
//        System.out.println(arrayController.numsOfEven(arr));
//        System.out.println();
//        System.out.println(arrayController.liesIn(arr, 0.9, 3.4));
//        System.out.println(arrayController.liesIn(arr2, 0.9, 3.4));
//        System.out.println();
//        System.out.println(arrayController.moreZero(arr));
//        System.out.println(arrayController.moreZero(arr2));
//        System.out.println();
//        arrayController.reverse(arr);
//        arrayController.reverse(arr2);
//        arrayController.printArray(arr);
//        arrayController.printArray(arr2);

//        Point3D p1 = new Point3D(1, 2, 3);
//        Point3D p2 = new Point3D(1, 2, 3);
//        System.out.print(p1.equals(p2));

        Vector3D vector1 = new Vector3D(0, 0, 0, 1, 2, 3);
        Vector3D vector2 = new Vector3D(0, 0, 0, 4, 5, 6);
        Verctor3DProcessor.printVector(Verctor3DProcessor.vec3DSumm(vector2, vector1));
        Verctor3DProcessor.printVector(Verctor3DProcessor.vec3Ddifference(vector2, vector1));
        System.out.println(Verctor3DProcessor.vec3DScalMultiplication(vector1, vector2));
        System.out.println(Verctor3DProcessor.vec3DVeclMultiplication(vector1, vector2));
    }
}