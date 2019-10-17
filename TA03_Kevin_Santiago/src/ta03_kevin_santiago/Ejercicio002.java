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
public class Ejercicio002 {
    public static void main(String[] args) {
        //declaro entero a las variables 
        int numero;
        //Creo un lista de valores enteros
        int listanumeros[];
        //Declaro cuantos objetos de tipo entero tendra mi lista
        listanumeros=new int[10];        
        for (int i=0;i<10 ;i++){
            //pido numeros al usuario para que mi lista obtenga oabjetos de tipo entero
            //El JOptionane solo acepta String por lo cual uso Intger parse int para que 
            //me permita ingresar enteros
            numero=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un número"));
            //Aprovecho la variable i del for para usarlos como indices y asi ingresar valores a mi lista
            listanumeros[i]=numero;
        }
        //imprimo los indices inciales
        System.out.println("Indices");
        for(int k=0;k<10;k++){
            System.out.print(k+"\t");
        }
        //imprimo los objetos de la lista
        System.out.println("\nElementos de la lista");
        for(int x=0;x<10;x++){
            System.out.print(listanumeros[x]+"\t");
        }
        // le hago una modificacion al ordenamiento de tipo burbuja
        //para que asi me pongo en los primeros indices a los numeros primos 
        //en vez de a los menores
        for(int h= 0; h < listanumeros.length - 1; h++){
            for(int z=0;z<listanumeros.length - 1;z++){
                if(esPrimo(listanumeros[z])==false){
                    
                        int temporal = listanumeros[z+1];
                        listanumeros[z+1] = listanumeros[z];
                        listanumeros[z] = temporal;
                    
                }
            }
        }
        //imprimo nuevamente los indices de mi lista
        System.out.println("\nindices");
        for(int j = 0;j < listanumeros.length; j++){
            System.out.print(j+"\t");
        }
        //imprimo mi nueva lista 
        System.out.println("\nnueva lista");
        for(int l = 0;l < listanumeros.length; l++){
            System.out.print(listanumeros[l]+"\t");
        }
    }
    public static boolean esPrimo(Integer numero) {
        //creo una funcion que me va a retornar un valor booleano 
        //si es primo me retorna true si no lo es me retorna false
        int contador;
        contador = 0;
        for(int i = 1; i <= numero; i++)
        {
            if((numero % i) == 0){
            
                contador++;
            }
        }
        if(contador == 2){
            
            return (true);
        }else{
            return (false);
        }
    }
}
    
    

    
    


