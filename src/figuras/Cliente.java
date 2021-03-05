/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.rmi.Naming;
import java.util.Scanner;

/**
 *
 * @author alberto
 */
public class Cliente {
    
    private double radio, lado, ladoA, ladoB;
    private Scanner in;
    private String resp;

    public Cliente() {
        try {
            in = new Scanner(System.in);

            InterfazRemota areasRemotas = (InterfazRemota) Naming.lookup("//localhost/Areas");
            
            do {
                System.out.println("███████████████MENU████████████████");
                System.out.println("█            Opciones             █");
                System.out.println("█1- Area de un Circulo            █");
                System.out.println("█2- Area de un Cuadrado           █");
                System.out.println("█3- Area de un Triangulo Isoseles █");
                System.out.println("███████████████████████████████████");

                System.out.println("Ingrese la opccion");
                int res = in.nextInt();

                switch (res) {
                    
                    case 1:
                        System.out.println("Ingrese el radio del circulo");
                        radio = in.nextDouble();
  
                        System.out.println("El area del circulo es " + areasRemotas.calcularAreaCirculo(radio));
                        break;
                        
                    case 2:
                        System.out.println("Ingrese el lado del cuadrado");
                        lado = in.nextDouble();
                        System.out.println("El area del cuadrado es " + areasRemotas.calcularAreaCuadrado(lado));
                        break;
                        
                    case 3:
                        
                        System.out.println("Ingrese el lado A del triangulo");
                        ladoA = in.nextDouble();
                        
                        System.out.println("Ingrese el lado b del triangulo");
                        ladoB = in.nextDouble();
                        
                        System.out.println("El area del circulo es " + areasRemotas.calculaeAreaTrianguloIsosceles(ladoA,ladoB));
                        break;
                    default:
                        System.out.println("Opccion Invalida");
                        break;
                }
                System.out.println("Desea hacer otra operacion s = si\nn = no");
                resp = in.next();
                
                

            } while (resp.equals("s"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        new Cliente();
    }
}
