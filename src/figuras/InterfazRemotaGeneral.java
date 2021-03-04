package figuras;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author victorm
 */
public interface InterfazRemotaGeneral<T> extends Remote{
    
    public double calcularArea(T pojo)throws RemoteException;
}
