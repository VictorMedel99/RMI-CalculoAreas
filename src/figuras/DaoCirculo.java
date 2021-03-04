package figuras;

import java.rmi.RemoteException;

/**
 *
 * @author victorm
 */
public class DaoCirculo implements InterfazRemotaGeneral<Circulo>{
    //circulo A = π r² 
    Circulo circuloArea;

    public DaoCirculo() throws RemoteException{
        this.circuloArea = new Circulo();
    }
    
    

    @Override
    public double calcularArea(Circulo pojo) throws RemoteException {
        this.circuloArea.setArea(pojo.getPI()*Math.pow(pojo.getRadio(),2));
        return this.circuloArea.getArea();
    }
    
}
