package figuras;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author victorm
 */
public class DaoTrianguloIsosceles extends UnicastRemoteObject implements InterfazRemotaGeneral<TrianguloIsosceles>{
    //poligono irregular triangulo isosceles b.sqrt(a²-b²)/4)/2
    TrianguloIsosceles trianguloIsoscelesArea;

    public DaoTrianguloIsosceles() throws RemoteException{
        trianguloIsoscelesArea=new TrianguloIsosceles();
    }
    
    @Override
    public double calcularArea(TrianguloIsosceles pojo) throws RemoteException {
        this.trianguloIsoscelesArea.setArea(
                (pojo.getB()*Math.sqrt(Math.pow(pojo.getA(),2)-((Math.pow(pojo.getB(),2))/4)))/2);
        return this.trianguloIsoscelesArea.getArea();
    }
    
}
