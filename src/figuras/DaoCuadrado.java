package figuras;

import java.rmi.RemoteException;
import jdk.nashorn.internal.objects.annotations.Constructor;

/**
 *
 * @author victorm
 */
public class DaoCuadrado implements InterfazRemotaGeneral<Cuadrado>{
    //poligono regular Cuadrado A=L*L
    Cuadrado cuadradoArea;

    public DaoCuadrado() throws RemoteException{
        this.cuadradoArea=new Cuadrado();
    }
    
    @Override
    public double calcularArea(Cuadrado pojo) throws RemoteException {
        this.cuadradoArea.setArea(pojo.getLado()*pojo.getLado());
        return this.cuadradoArea.getArea();
    }
    
}
