package com.ingreso.main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
        final String nombreEmpresa = "Distribuidora TupperWare";

        System.out.println("Inserte la cantidad de productos que desea comprar:");
        int cantidadProductoVendido;
        	Scanner sc = new Scanner(System.in);
        	cantidadProductoVendido = sc.nextInt(); 

        double cantidadProducto = 100;
        double costoUnitario = 35;  // Q45.00
        double totalAPagar = costoUnitario*cantidadProducto; //Q
        double precioDeVenta = 20;
        double IVA = 0.12; // 12%
        double totalIVAPorUnidad = precioDeVenta*IVA;
  
                
        System.out.println("Costo por unidad: Q"+costoUnitario);
        System.out.println("Cantidad de prodructo: "+cantidadProducto);
        System.out.println("-------------------------");
        System.out.println("Total: Q"+totalAPagar);
     
        System.out.println("Venderse a: "+precioDeVenta);
        System.out.println("Impuesto establecido: "+IVA);
        System.out.println("Impuesto por unidad: Q"+totalIVAPorUnidad);
        
        
        double totalcobradoSinDescuento = cantidadProductoVendido*precioDeVenta;
        
        //double tipoDeDescuento = 0;
        
        double totalConDescuento = 0;
        double tipoDeDescuento = 0;
       
        if(cantidadProductoVendido>=50) {
        	tipoDeDescuento = 0.05;
        	 totalConDescuento = totalcobradoSinDescuento - (totalcobradoSinDescuento*tipoDeDescuento);
        }
         if(cantidadProductoVendido>=100) {
        	 tipoDeDescuento = 0.15;
        	 totalConDescuento = totalcobradoSinDescuento - (totalcobradoSinDescuento*tipoDeDescuento);
         }
        if(cantidadProductoVendido>=1000) {
        	tipoDeDescuento = 0.25;
        	totalConDescuento = totalcobradoSinDescuento - (totalcobradoSinDescuento*tipoDeDescuento);
        }
        
        
        double impuestototalADeclarar =  totalConDescuento *IVA;
        //double tipoDeDescuento = 0.05;
        double ganancias = (cantidadProductoVendido*costoUnitario) - totalcobradoSinDescuento -impuestototalADeclarar;
        
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("Cantidad Vendida: "+cantidadProductoVendido);
        System.out.println("Total sin descuento: "+totalcobradoSinDescuento);
        System.out.println("Total con descuento: Q"+totalConDescuento);
        System.out.println("IVA a declarar: Q"+impuestototalADeclarar);
        System.out.println("Tipo de descuento "+tipoDeDescuento);
        System.out.println("Ganancia: Q"+ ganancias);
        
        
        
	}

}
