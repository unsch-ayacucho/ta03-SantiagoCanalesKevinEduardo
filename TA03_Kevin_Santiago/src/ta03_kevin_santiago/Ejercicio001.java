package ta03_kevin_santiago;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Ejercicio001 {
    public static void main(String[] args) {
        //declaro variable de apyo como double para que me ayude a elegir numeros aleatorios
        double n = 21;
        //declaro entero a las variables 
        int numero,valor1,valor2;
        //Creo un lista de valores enteros
        int listanumeros[];
        //Declaro cuantas objetos de tipo entero tendra mi lista
        listanumeros=new int[100];
        System.out.println("lista inicial");
        //con este for agrego valores a mi lista
        for (int i=0;i<listanumeros.length ;i++){
            //Math random me dara numeros aleatorios del 0 al 20
            //que sera utiles para mi lista
            numero = (int) (Math.random() *n) ;
            //Aprovecho la variable del for para usarlos como indices y asi ingresar valores a mi lista
            listanumeros[i]=numero;
            //imprimi los numeros que se obtuvo
            System.out.print(listanumeros[i]+" ");
        }
        //Como el JOptionPane solo acepta String entonces uso Intger.parseInt para que
        //acepte valores enteros,valor 1 sera el numero que va cambiarse
        //y valor 2 el valor que sustituira a valor 1
        valor1=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un número"));
        valor2=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un número"));
        System.out.println("\nlista cambiada");
        //Con este for ingreso a los indices de mi lista y con ello obtengo sus elementos3
        
        for (int x=0;x<listanumeros.length;x++){
            //si Valor uno es igual a uno de los objetos de mi lista entonces se cambiara
            //el valor de ese objeto por valor2 que fue ingresado por el usuario
            if (valor1==listanumeros[x]){
                listanumeros[x]=valor2;
                //imprimo los elementos cambiados entre comillas
                System.out.print("'"+listanumeros[x]+"' ");
                        
            }else{
                //si no son repetidos seran imprimdos normalmente
            System.out.print(listanumeros[x]+" ");
            }
        }
        System.out.println("");
    }
    
}
