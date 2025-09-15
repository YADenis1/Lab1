package org.example.SimpleClasses;

import lombok.Getter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class Vector3D {
    private final Point3D pStart;
    private final Point3D pEnd;
    private double length;
    public Vector3D(double x1, double y1, double z1, double x2, double y2, double z2){
        pStart = new Point3D(x1, y1, z1);
        pEnd = new Point3D(x2, y2, z2);
        this.length = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)+Math.pow(z2-z1, 2));
    }

    public Vector3D(){
        pStart = new Point3D();
        pEnd = new Point3D();
        this.length = Math.sqrt(Math.pow(pStart.getX()-pEnd.getX(), 2)+Math.pow(pStart.getY()-pEnd.getY(), 2)+Math.pow(pStart.getZ()-pEnd.getZ(),2));
    }

    public Vector3D(Point3D pS, Point3D pE){
        pStart = pS;
        pEnd = pE;
        this.length = Math.sqrt(Math.pow(pStart.getX()-pEnd.getX(), 2)+Math.pow(pStart.getY()-pEnd.getY(), 2)+Math.pow(pStart.getZ()-pEnd.getZ(),2));
    }

    public Map<Character, Double> getDirection(){
        Map<Character, Double> out = new HashMap<>();
        out.put('x', pEnd.getX()- pStart.getX());
        out.put('y', pEnd.getY()- pStart.getY());
        out.put('z', pEnd.getZ()- pStart.getZ());
        return out;
    }
    public boolean equals(Vector3D vec) {
        return pStart.equals(vec.pStart) && pEnd.equals(vec.pEnd);
    }
}
