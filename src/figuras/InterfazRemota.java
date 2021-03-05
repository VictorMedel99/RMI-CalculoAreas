package figuras;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author victorm
 */
public interface InterfazRemota extends Remote{
    
    public double calcularAreaCirculo(double radio)throws RemoteException;
    
    public double calcularAreaCuadrado(double lado)throws RemoteException;
    
    public double calculaeAreaTrianguloIsosceles(double ladoA, double ladoB)throws RemoteException;
}
