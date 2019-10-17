/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta03_kevin_santiago;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio003 {
        public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        //declaro variable de apoyo como double para que me ayude a elegir numeros aleatorios
        double n = 501;
        //declaro entero la variable entero
        int numero;
        //declaro esta variable de tipo cadena
        String opcion;
        //Creo un lista de valores enteros
        int listanumeros[];
        //Declaro cuantas objetos de tipo entero tendra mi lista
        listanumeros=new int[100];
        System.out.println("lista inicial");
        //con este for agrego valores a mi lista
        for (int i=0;i<100 ;i++){
            //Math random me dara numeros aleatorios del 0 al 20
            //que sera utiles para mi lista
            numero = (int) (Math.random() *n) ;
            //Aprovecho la variable del for para usarlos como indices y asi ingresar valores a mi lista
            listanumeros[i]=numero;
            //imprimi los numeros que se obtuvo
            System.out.print(listanumeros[i]+" ");
            
        }
        
        //con estas lineas de codigo veo quien es el numero maximo
        int max = 0;
        for (int i = 0; i < listanumeros.length; i++) {
            //ingreso a la lista gracias al for que me da los indices de mi lista
            //cuando algun elemento de mi lista sea mayor a max este se volvera max
            if (listanumeros[i] > max) {
                max = listanumeros[i] ;
            }
        }
        //con estas lineas de codigo veo quien es el numero minimo
        //ingreso a la lista gracias al for que me da los indices de mi lista
        //cuando algun elemento de mi lista sea mayor a max este se volvera min
        int min = max;
        for (int x = 0; x < listanumeros.length; x++) {
            if (listanumeros[x] < min) {
                min =listanumeros[x];
            }
        }
        
        
            OUTER:
            //hago un bucle para cuando el usuario se equivoque al ingresar el dato opcion
            //y el programa sea capaz de perdirle que ingrese nuevamente el dato 
            while (true) {
                System.out.println("\nQue quiere destacar(1   minimo, 2   maximo)");
                //Gracias a este puedo ingresar datos String por consola
                opcion=leer.next();
                //Dependiendo de la opcion que ingrese el usuario el promgrama correra
                switch (opcion) {
                    //en el caso de que inrese "1" entonces este buscar el menor de los numeros
                    //y lo marcara entre asteriscos **numero**
                    case "1":
                        for (int q = 0; q < listanumeros.length; q++){
                            if (listanumeros[q]==min){
                                System.out.print("**"+listanumeros[q]+"** ");
                            //de no ser el numero minimo lo imprimira de forma normal
                            }else{
                                System.out.print(listanumeros[q]+" ");
                            }
                            
                        }       break OUTER;
                    //en el caso de que inrese "2" entonces este buscar el mayor de los numeros
                    //y lo marcara entre asteriscos **numero**
                    case "2":
                        for (int q = 0; q < listanumeros.length; q++){
                            if (listanumeros[q]==max){
                                System.out.print("**"+listanumeros[q]+"** ");
                                
                            //de no ser el numero maximo lo imprimira de forma normal
                            }else{
                                System.out.print(listanumeros[q]+" ");
                            }
                        }       break OUTER;
                       
                    default:
                        //si el usuario ingresa a opcion un dato diferente a "1" o "2"
                        //El usuario tendra la oportunidad de ingresar el dato nuevamente
                        System.out.println("opcion incorrecta intente nuevamente");
                        
                        break;
                }
            }
    }  
}
