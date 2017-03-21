/*Ángel Ávalos Ortega A01410325
Alberto Isaac Gómez Jiménez A01410769
Jorge Daniel Bombardier
Miguel Ángel Méndez 
Nohely Cortés del Ángel A01410768
*/
package spp.equipo.pp2.p1;

import java.util.Scanner;

/**
 *
 * @author Nohely C
 */
public class SPPEquipoPP2P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb= new Scanner (System.in);
        int opEntrada;
        System.out.println("Bienvenido a la calculadora de matrices");
        System.out.println("Escoja la opción deseada");
        System.out.println("1.Suma de matrices");
        System.out.println("2.Resta de matrices");
        System.out.println("3.Multiplicación de matrices");
        System.out.println("4.Salir");
        opEntrada=kb.nextInt();
        int tamaño=solicitaTamaño();
        int [][] a = arreglo ("A", tamaño);
        int [][] b = arreglo ("B", tamaño);
        
        switch (opEntrada){
            case 1:
                sumaMatriz(a,b);
                break;
            case 2: 
                restaMatriz (a,b);
                break;
            case 3:
                multiplicaciónMatriz (a,b);
                break;
            default:
                System.out.println("Hasta luego!");
        }
    }
        //Método para solicitar Tamaño del arreglo
        
        public static int solicitaTamaño (){
        Scanner key = new Scanner (System.in);
        boolean flag;
        int a = 0;
        do{
            try{
                System.out.println("Escribe el tamaño del arreglo: ");
                a = key.nextInt();
                flag = false;
            }
            catch (Exception e){
                System.out.println("Error");
                key.next();
                flag = true;
            }
        }
        while (flag);
        return a;
        }
        //Metodo para pedir valores del arreglo
        public static int solicitaEntero(){
        Scanner kb= new Scanner (System.in);
        boolean flag;
        int n=0;
        do{
            System.out.println("Introduce un número entero");
            try{
                n=kb.nextInt();
                flag=false;
                
            }
            catch(Exception er){
                System.out.println("Lo que introdujo no es un entero, Inténtalo de nuevo");
                flag=true;
                kb.nextLine();
            }
        }while (flag);
        
        return n;
        }
        //Método para crear arreglo
        public static int [][] arreglo (String a, int tamaño){
        int [][]arreglo = new int [tamaño][tamaño];
        System.out.println("Arreglo: " + a);
        for (int i = 0; i < arreglo.length; i++){
        for (int j = 0; j < arreglo[i].length; j++){
        arreglo [i][j] = solicitaEntero();
                }
            }
        return arreglo;
        }
        //realizar la suma de matrices en un metodo
        public static int [][] sumaMatriz (int [][]a, int[][]b){
        int [][] resultado = new int [a.length] [a.length];
        System.out.println("Suma: ");
        for (int i = 0; i < a.length; i++){
        for (int j = 0; j < a[i].length; j++){
        resultado[i][j] = a[i][j] + b[i][j];
        System.out.println("["+resultado[i][j]+"]");   
        }
        System.out.println("");   
        }
        return resultado; 
        }
    
        //Realizar resta de matrices
        public static int [][] restaMatriz (int [][]a, int[][]b){
        int [][] resultado = new int [a.length] [a.length];
        System.out.println("Resta: ");
        for (int i = 0; i < a.length; i++){
        for (int j = 0; j < a[i].length; j++){
        resultado[i][j] = a[i][j] - b[i][j];
        System.out.println("["+resultado[i][j]+"]");   
        }
        System.out.println("");   
        }
        return resultado; 
        }
        //Realizar multiplicación de matrices
        public static int [][] multiplicaciónMatriz (int [][]a, int[][]b){
        int [][] resultado = new int [a.length] [a.length];
        System.out.println("Multiplicación: ");
        for (int i = 0; i < a.length; i++){
        for (int j = 0; j < a[i].length; j++){
        resultado[i][j] = a[i][j] * b[i][j];
        System.out.println("["+resultado[i][j]+"]");   
        }
        System.out.println("");   
        }
        return resultado; 
        }
    
}