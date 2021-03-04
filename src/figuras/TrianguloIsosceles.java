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
public class TrianguloIsosceles {
    //poligono irregular
    //triangulo isosceles A=0b.sqrt(a²-b²)/4)/2
    //a=uno de los 2 lados iguales,b=es el lado desigual a los 2
    private double area=0,a=0,b=0;

    public TrianguloIsosceles() {
    }

    public double getArea() {
        return area;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    
    
}
