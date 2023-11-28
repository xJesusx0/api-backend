package com.mycompany.proyectojesusperea;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.*;

public class Metodos {
    
    public static boolean verificarVacio(String dato){
        return (!dato.trim().isEmpty());
    }
    
    public static void iniciarVentana(JFrame ventana) {
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

    }
    
    public static void mostrarError(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje,"Error",JOptionPane.ERROR_MESSAGE);
    }
    
    public static boolean validarDatos(String nombre, String contraseña) throws FileNotFoundException, IOException{
        BufferedReader file = new BufferedReader(new FileReader("datos usuarios.txt"));
        String line = file.readLine();
        while(line != null){
            String datos[] = line.split("\\,");
            if(datos[0].equals(nombre) && datos[1].equals(contraseña)){
                return true;
            }
            line = file.readLine();
        }
        
        return false;
    }
    
    public static String input(String mensaje){       
        while (true) {            
            String UserInput = JOptionPane.showInputDialog(null,mensaje);

            if (!UserInput.trim().isEmpty()) {
                return UserInput;
                
            } else {
                mostrarError("La entrada esta vacia, intentelo denuevo");
            }
        }
    }
    public static int inputInt(String mensaje){
        while(true){
        String entrada = input(mensaje);
        
            try {
                return Integer.parseInt(entrada);
                
            } catch (NumberFormatException e) {
                mostrarError("Entrada invalida, intenelo denuevo");

            }
        }
    }
    public static double inputDouble(String mensaje){
        while(true){
        String entrada = input(mensaje);
        
            try {
                return Double.parseDouble(entrada);
                
            } catch (NumberFormatException e) {
                mostrarError("Entrada invalida, intentelo denuevo");

            }
        }
    }
    
    public static double convertirDouble(String string){
        if(verificarVacio(string)){
            try {
                return Double.parseDouble(string);
                
            } catch (NumberFormatException e) {
                return -1;

            }
        } else {
            return -1;
        }

    }
    
    public static String imprimirMatriz(double[][] matriz){
       String men = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                men += (matriz[i][j] + "\t"); // \t agrega una tabulación entre los elementos
            }
            men += "\n";
        }
        return men;
    }
    
    public static double obtenerMayor(double[] vector){
        double mayor = vector[0];
        for(int i = 1; i < vector.length; i++){
          if(vector[i] > mayor){
            mayor = vector[i];
          }
        }
        return mayor;  
    }
  
    public static double obtenerMenor(double[] vector){
        double menor = vector[0];
        for(int i = 1; i < vector.length; i++){
          if(vector[i] < menor){
            menor = vector[i];
          }
        }
        return menor;  
   }
    
}
