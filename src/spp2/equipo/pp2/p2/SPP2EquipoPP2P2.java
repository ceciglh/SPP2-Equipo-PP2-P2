/*
Norma Alejandra Ledezma Martinez
Erick Eduardo Gervacci Romero
Benito Rafael Morante Vazquez
Diego Santana Leiva
Cecilia Gutierrez de Lara Hernandez
 */

package spp2.equipo.pp2.p2;
import java.util.*;
/**
 *
 * @author cecigutierrez
 */
public class SPP2EquipoPP2P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido, este programa determinara si los arreglos son iguales");
        Scanner kb=new Scanner(System.in);
        int a;
        System.out.println("Intoduzca el tamaño del arrreglo");
        a=PedirDato();
        int [][]matrizA=new int[a][a];
        int [][]matrizB=new int[a][a];
        System.out.println("Introduzca los valores del primer arreglo");
        matrizA= matriz(a);
        System.out.println("Introduzca los valores del segundo arreglo");
        matrizB =matriz(a);
        calcular (matrizA, matrizB);
    }
    
    public static int PedirDato(){
        Scanner kb=new Scanner(System.in);
        boolean flag;
        int v=0;
                do{
                    System.out.println("Introduzca un valor entero");
                    try{
                        v=kb.nextInt();
                        flag=false;
                    } catch(Exception er){
                        System.out.println("No es un valor entero, intentelo otra vez");
                        flag=true;
                        kb.nextLine();
                    }
                } while (flag);
                return v;
    }
public static int [][]matriz(int a){
   int[][]matriz=new int [a][a];
   for (int i=0;i<matriz.length;i++)
   {
       for(int j=0;j<matriz.length; j++)
       {
           matriz[i][j]=PedirDato();
       }
   }
   return matriz;
}
public static void calcular(int[][]matrizA,int[][]matrizB){
    int x=0;
            for(int i=0;i<matrizA.length;i++){
                for(int j=0;j<matrizA.length;j++){
             x=matrizA[i][j]-matrizB[i][j];
            if( x==0){   
                    }else{
                        System.out.println("Sus arreglos son diferentes");
                        x=2;
                        break;
                    }
                }
            }
            if(x==0){
                System.out.println("Sus arreglos son iguales");
            }else{    
             }
}
    }

         
