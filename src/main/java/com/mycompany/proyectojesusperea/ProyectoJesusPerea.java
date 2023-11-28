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

    
    
    public static void main(String[] args) {
        
        cantidadMeses = inputInt("Ingrese la cantidad de meses");
        cantidadTiendas = inputInt("Ingrese la cantidad de tiendas");
        
        nombresTiendas = new String[cantidadTiendas];
        ventas = new double[cantidadMeses][cantidadTiendas];
        
        for(int i = 0 ; i < cantidadTiendas ; i++){
            nombresTiendas[i] = (input("Ingrese el nombre de la tienda " + (i+1))).toUpperCase();
        }
        
        VentanaLogin ventanaLogin = new VentanaLogin();
        iniciarVentana(ventanaLogin);
    }
}
