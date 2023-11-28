package com.mycompany.proyectojesusperea;

import static com.mycompany.proyectojesusperea.Metodos.*;


public class ProyectoJesusPerea {
    
    public static int cantidadTiendas;
    public static int cantidadMeses;
    public static double[][] ventas;
    public static String[] meses = {
    "ENERO", "FEBRERO", "MARZO", "ABRIL",
    "MAYO", "JUNIO","JULIO", "AGOSTO", 
    "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"
    };
    public static String nombresTiendas[];
    
    public static double ventasPorMes[];
    public static double ventasPorTienda[];
        
    public static double ventaMasAltaPorMes[];
    public static double ventaMasBajaPorMes[];     
        
    public static double ventaMasAltaPorTienda[];
    public static double ventaMasBajaPorTienda[];
    
    
    public static void main(String[] args) {
        
        cantidadMeses = inputInt("Ingrese la cantidad de meses");
        cantidadTiendas = inputInt("Ingrese la cantidad de tiendas");
        
        nombresTiendas = new String[cantidadTiendas];
        ventas = new double[cantidadMeses][cantidadTiendas];
        
        for(int i = 0 ; i < cantidadTiendas ; i++){
            nombresTiendas[i] = (input("Ingrese el nombre de la tienda " + (i+1))).toUpperCase();
        }
        
        ventasPorMes = new double[cantidadMeses];
        ventasPorTienda = new double[cantidadTiendas];
        
        ventaMasAltaPorMes = new double[cantidadMeses];
        ventaMasBajaPorMes = new double[cantidadMeses];
        
        ventaMasAltaPorTienda = new double[cantidadTiendas];
        ventaMasBajaPorTienda = new double[cantidadTiendas];
        
        VentanaLogin ventanaLogin = new VentanaLogin();
        iniciarVentana(ventanaLogin);
    }
}
