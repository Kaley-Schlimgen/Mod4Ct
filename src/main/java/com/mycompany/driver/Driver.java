/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.driver;

/**
 *
 * @author kaleyschlimgen
 */
public class Driver {

    public static void main(String[] args) {
        Sphere sphereEX = new Sphere();
        Cylinder cylinderEX = new Cylinder();
        Cone coneEX = new Cone();
        
        System.out.println("Sphere Area: " + sphereEX.surface_area());
        System.out.println("Sphere Volume: " + sphereEX.volume());
        
        System.out.println("Cylinder Area: " + cylinderEX.surface_area());
        System.out.println("Cylinder Volume: " + cylinderEX.volume());
        
        System.out.println("Cone Area: " + coneEX.surface_area());
        System.out.println("Cone Volume: " + coneEX.volume());
    }
}
