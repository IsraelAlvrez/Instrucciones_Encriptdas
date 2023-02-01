package Instrucciones_Encriptadas;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class Lector_De_Texto {

        public static String[] lector(String s){
    try{

        File Docuemento = new File(s);
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

     public static String Eliminador_dupli(String ruta) {
          String[] p = lector(ruta);

         String  a = p[3];
         String w = removeDuplicates(a);
         return  w;
     }



       public static String removeDuplicates(String s)
    {
        char[] chars = s.toCharArray();
        char prev = 0;
        int k = 0;

        for (char c: chars)
        {
            if (prev != c)
            {
                chars[k++] = c;
                prev = c;
            }
        }

        return new String(chars).substring(0, k);
    }

    public static void Analizador (String ruta, String rutasalida) throws IOException {
       String[] p= lector(ruta);
            String  Inst_1= p[1];
            String  Inst_2 = p[2];
            String Encriptado = Eliminador_dupli(ruta);

            File resultados  = new File(rutasalida+"\\resultados.txt");
            resultados.createNewFile();
            FileWriter  escritor = new FileWriter(resultados);
            BufferedWriter bw=new BufferedWriter(escritor);

            if (Encriptado.contains(Inst_1)){
                 bw.write("Si");
                 bw.newLine();
                bw.write("no ");
                bw.close();
            }else if(Encriptado.contains(Inst_2)){
                bw.write("NO");
                bw.newLine();
                bw.write("SI");
                bw.close();
            }
    }

}



