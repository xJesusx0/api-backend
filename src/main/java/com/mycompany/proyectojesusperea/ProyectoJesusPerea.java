package com.mycompany.proyectojesusperea;

import static com.mycompany.proyectojesusperea.Metodos.*;


public class ProyectoJesusPerea {
    
    public static int cantidadTiendas;
    public static int cantidadMeses;
    public static double[][] ventas;
    
    public static void main(String[] args) {
        
        cantidadMeses = inputInt("Ingrese la cantidad de meses");
        cantidadTiendas = inputInt("Ingrese la cantidad de tiendas");

        ventas = new double[cantidadMeses][cantidadTiendas];
        
        VentanaLogin ventanaLogin = new VentanaLogin();
        iniciarVentana(ventanaLogin);
    }
}
