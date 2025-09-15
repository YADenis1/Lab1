package org.example.SimpleClasses;

import lombok.Getter;

public class Point3D {
    @Getter
    private double x, y, z;

    public Point3D(double x, double y, double z){
        this.x = x; this.y = y; this.z = z;
    }
    Point3D(){
        this.x = 0; this.y = 0; this.z = 0;
    }
    public String info(){
        return String.valueOf(x)+" "+String.valueOf(y)+" "+String.valueOf(z);
    }

    public boolean equals(Point3D obj) {
        return this.x == obj.x && this.y == obj.y && this.z == obj.z;
    }
}
