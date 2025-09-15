package org.example.SimpleClasses;

public class Verctor3DProcessor {
    public static Vector3D vec3DSumm(Vector3D v1, Vector3D v2){
        return new Vector3D(v1.getPStart().getX(), v1.getPStart().getY(), v1.getPStart().getZ(),
                v1.getPEnd().getX()+v2.getPEnd().getX()-v2.getPStart().getX(),
                v1.getPEnd().getY()+v2.getPEnd().getY()-v2.getPStart().getY(),
                v1.getPEnd().getZ()+v2.getPEnd().getZ()-v2.getPStart().getZ());
    }
    public static Vector3D vec3Ddifference(Vector3D v1, Vector3D v2){
        return new Vector3D(v1.getPStart().getX(), v1.getPStart().getY(), v1.getPStart().getZ(),
                v1.getPEnd().getX()-v2.getPEnd().getX()+v2.getPStart().getX(),
                v1.getPEnd().getY()-v2.getPEnd().getY()+v2.getPStart().getY(),
                v1.getPEnd().getZ()-v2.getPEnd().getZ()+v2.getPStart().getZ());
    }
    public static double vec3DScalMultiplication(Vector3D v1, Vector3D v2){
        return v1.direction().get('x')*v2.direction().get('x')+
                v1.direction().get('y')*v2.direction().get('y')+
                v1.direction().get('z')*v2.direction().get('z');
    }
    public static double vec3DVeclMultiplication(Vector3D v1, Vector3D v2){
        return v1.direction().get('y')*v2.direction().get('z')-v1.direction().get('z')*v2.direction().get('y')-
                v1.direction().get('x')*v2.direction().get('z')+v1.direction().get('z')*v2.direction().get('x')+
                v1.direction().get('x')*v2.direction().get('y')-v1.direction().get('y')*v2.direction().get('x');
    }
    public static void printVector(Vector3D v){
        System.out.printf("X: %f, Y: %f, Z: %f", v.direction().get('x'), v.direction().get('y'), v.direction().get('z'));
    }
}
