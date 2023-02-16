package Instrucciones_Encriptadas;

import java.io.*;
import java.util.Scanner;

public class LectorDeTexto {

        public  String[] lectorEntrada(String RutaEntrada){
    try{

        File Docuemento = new File(RutaEntrada);
        Scanner sc = new Scanner(Docuemento);
        String [] instrucciones = new String[4];
        for ( int i=0 ;i<4 ; i++){
            instrucciones[i]= sc.nextLine();
        }

        return instrucciones;
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    }

        }

}



