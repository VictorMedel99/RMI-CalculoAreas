/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.rmi.Naming;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author alberto
 */
public class Cliente {

    private double radio, lado, ladoA, ladoB;
    private Scanner in;

    public Cliente() {
        try {
            in = new Scanner(System.in);
            
            InterfazRemotaGeneral<Circulo> circuloRemoto = (InterfazRemotaGeneral<Circulo>) Naming.lookup("//192.168.0.11/DaoCirculo");
            
            InterfazRemotaGeneral<Cuadrado> cuadradoRemoto = (InterfazRemotaGeneral<Cuadrado>) Naming.lookup("//192.168.0.11/DaoCuadrado");
            
            InterfazRemotaGeneral<TrianguloIsosceles> trianguloRemoto = (InterfazRemotaGeneral<TrianguloIsosceles>) Naming.lookup("//localhost/DaoTrianguloIsosceles");

            boolean rest = true;
            do {
                System.out.println("███████████████MENU████████████████");
                System.out.println("█            Opciones             █");
                System.out.println("█1- Area de un Circulo            █");
                System.out.println("█2- Area de un Cuadrado           █");
                System.out.println("█3- Area de un Triangulo Isoseles █");
                System.out.println("███████████████████████████████████");
                
                System.out.println("Ingrese la opción ");
                int res = in.nextInt();
                
                switch(res){
                    case 1:
                        Circulo circulo = new Circulo();
                        System.out.println("Ingrese el radio del circulo");
                        radio = in.nextDouble();
                        circulo.setRadio(radio);
                        System.out.println("El area del circulo es "+circuloRemoto.calcularArea(circulo));
                        break;
                    case 2:
                        Cuadrado cuadrado = new Cuadrado();
                        System.out.println("Ingrese el lado del cuadrado");
                        radio = in.nextDouble();
                        cuadrado.setLado(lado);
                        System.out.println("El area del cuadrado es "+cuadradoRemoto.calcularArea(cuadrado));
                        break;
                    case 3:
                        TrianguloIsosceles trianguloIsosceles = new TrianguloIsosceles();
                        System.out.println("Ingrese el lado A del triangulo");
                        ladoA = in.nextDouble();
                        
                        System.out.println("Ingrese el lado b del triangulo");
                        ladoB = in.nextDouble();
                        trianguloIsosceles.setA(ladoA);
                        trianguloIsosceles.setA(ladoB);
                        System.out.println("El area del circulo es "+trianguloRemoto.calcularArea(trianguloIsosceles));
                        break;
                    default:
                        System.out.println("Opccion Invalida");
                        break;                      
                }  
            } while (rest);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Cliente();
    }
}
