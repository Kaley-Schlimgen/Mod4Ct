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

    @Override
    public double surface_area() {
        //return (Math.PI * Math.pow(radius, 2));
        return (2);
    }
    
    @Override
    public double volume() {
        return (3);
    }
}
