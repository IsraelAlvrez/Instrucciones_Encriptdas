package Jugador_Ganador;

import java.io.*;
import java.util.Scanner;

public class Lector_de_Texto {


    public  String [] Lector_Entrada(String s){

        try{

            File Docuemento = new File(s);
            Scanner sc = new Scanner(Docuemento);
            String [] Entradas = new String[6];
            for ( int i=0 ;i<6 ; i++){
                Entradas[i]= sc.nextLine();
            }
            return Entradas;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }



}

