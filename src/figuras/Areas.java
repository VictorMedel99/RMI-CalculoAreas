/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author alberto
 */
public class Areas extends UnicastRemoteObject implements InterfazRemota{
    private static double PI = 3.1416;
    
    public  Areas() throws RemoteException{
        super();
    } 
    
    @Override
    public double calcularAreaCirculo(double radio) throws RemoteException {
        return PI*Math.pow(radio,2);
    }

    @Override
    public double calcularAreaCuadrado(double lado) throws RemoteException {
        return lado*lado;
    }

    @Override
    public double calculaeAreaTrianguloIsosceles(double ladoA, double ladoB) throws RemoteException {
        return  (ladoB*Math.sqrt(Math.pow(ladoA,2)-((Math.pow(ladoB,2))/4)))/2;
    }
}
