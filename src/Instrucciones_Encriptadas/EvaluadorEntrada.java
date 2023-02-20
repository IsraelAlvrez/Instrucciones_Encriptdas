package Instrucciones_Encriptadas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EvaluadorEntrada {


    public String[] AnalizadorDeExepciones(String [] ArchivoEntrada){

        String [] Entrada_1 =ArchivoEntrada[1].split("");
        String [] Entrada_2 = ArchivoEntrada[2].split("");
        String[] Encriptado = ArchivoEntrada [3].split("");



        String [] TamañoDeEntradas = ArchivoEntrada[0].split( " ");
        int TamañoE1 = Integer.parseInt(TamañoDeEntradas [0]);
        int TamañoE2 = Integer.parseInt(TamañoDeEntradas [1]);
        int TamañoE3 = Integer.parseInt(TamañoDeEntradas [2]);

        if ( TamañoE1 !=  Entrada_1.length || TamañoE2 != Entrada_2.length || TamañoE3 != Encriptado.length)
        {
            throw new IllegalArgumentException("El tamaño de tus entradas no coincide con el tamaño que estas declarando");
        }



        boolean RestriccionTamaño= false;
        boolean EntradasEvaluadas;
          if ((Entrada_1.length >= 2 && Entrada_1.length <= 50) &&
                  (Entrada_2.length >= 2 && Entrada_2.length <= 50 )&&
                  (Encriptado.length >= 3 && Encriptado.length <= 5000) ){
              RestriccionTamaño = true;
        }else {
              throw new IllegalArgumentException("Tu entrada no fue validad por el tamaño");
          }




        boolean RestriccionRepetidos = AnalizarRepetidos(Entrada_1) && AnalizarRepetidos(Entrada_2);
          if (!RestriccionRepetidos ) {
              throw new IllegalArgumentException("Tu entrada tiene caracteres repetidos");
          }



          boolean EntradasSinCaracteres = AnalizadorDeCaracteresInvalidos(Entrada_1) &&
                  AnalizadorDeCaracteresInvalidos(Entrada_2) &&
                  AnalizadorDeCaracteresInvalidos(Encriptado);
          if (!EntradasSinCaracteres){
              throw new IllegalArgumentException("Tu entrada tienes caracteres invalidos");

          }

        return  ArchivoEntrada;
    }





    public  boolean AnalizarRepetidos(String [] Entradas){

        String prev = Entradas[0];
        boolean EntradaAnlizada= true;

        for (int i= 1;i <Entradas.length;i++){
            if (prev.equals(Entradas[i])){
                EntradaAnlizada = false;
            }
            prev= Entradas[i];
        }
        return EntradaAnlizada;
    }



       public  Boolean AnalizadorDeCaracteresInvalidos(String [] Entradas){
        boolean EntradasAnalizadas = true;

        for ( int i = 0 ; i < Entradas.length ; i++ ){
            if (! Entradas[i].matches("^[A-Za-z0-9]*$")){
            EntradasAnalizadas = false;
            }
        }


       return  EntradasAnalizadas;
       }


    }


