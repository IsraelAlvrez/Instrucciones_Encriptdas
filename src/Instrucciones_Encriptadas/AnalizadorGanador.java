package Instrucciones_Encriptadas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class AnalizadorGanador {

    public void Analizador (String[]EntradasDatos, String Encriptado,String RutaSalida) throws IOException {
        String  Inst_1= EntradasDatos[1];
        String  Inst_2 = EntradasDatos[2];

        File resultados  = new File(RutaSalida);
        resultados.createNewFile();
        FileWriter escritor = new FileWriter(resultados);
        BufferedWriter bw=new BufferedWriter(escritor);



        if (Encriptado.contains(Inst_1)&&Encriptado.contains(Inst_2)){
            throw new  IllegalArgumentException("tu encriptado no puede tener las 2 instrucciones");
        }
        else if (Encriptado.contains(Inst_1)){
            bw.write("Si");
            bw.newLine();
            bw.write("no ");
            bw.close();
        }else if(Encriptado.contains(Inst_2)){
            bw.write("no");
            bw.newLine();
            bw.write("si");
            bw.close();
        }

    }

}

