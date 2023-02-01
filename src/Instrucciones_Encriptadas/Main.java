package Instrucciones_Encriptadas;

import java.io.IOException;
import java.util.Scanner;

public class Main extends Lector_De_Texto{
    public static void main(String[] args) /*crea una espcion para los archivos*/throws IOException {

        Scanner sc= new Scanner(System.in);
        System.out.println("increse la ruta de dode se encuentre su archivo");
        String ruta = sc.nextLine();

        System.out.println("increse la ruta de donde quiera que se guarde  su archivo");
        String rutasalida = sc.nextLine();
        Lector_De_Texto p = new Lector_De_Texto();
        p.Analizador(ruta, rutasalida);
    }
}
