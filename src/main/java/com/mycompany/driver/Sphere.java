/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.driver;

/**
 *
 * @author kaleyschlimgen
 */
class Sphere extends Shape {
    private double radius;
    
    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double surface_area() {
        //return (Math.PI * Math.pow(radius, 2));
        //4*pi*r^2
        double surfaceArea = 4 * Math.PI * radius * radius;
        
        //get two decimal places...
//String formattedResult = String.format("%.2f", surfaceArea);
//return Double.parseDouble(formattedResult);

        return (surfaceArea);
    }
    
    @Override
    public double volume() {
        return 0;
    }
    
    @Override
    public String toString() {
 //get two decimal places here?
        //String formattedArea = String.format(%.2f, surfaceArea);
        //return "Surface Area: " + formattedArea() +
          //      "\nVolume: " + volume() + "\n";
        //return "Surface Area: " + String.format(%.2f, surface_area()) +
        
        
        return "Sphere Surface Area: " + surface_area() +
                "\nSphere Volume: " + volume() + "\n";
        
    }
}
