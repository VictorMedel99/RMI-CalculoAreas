/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author victorm
 */
public class Circulo {
    //circulo A = π*r² 
    private final double PI=3.1416;
    private double area=0,radio=0;

    public Circulo() {
    }

    public double getArea() {
        return area;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPI() {
        return PI;
    }

    
    
    
}
