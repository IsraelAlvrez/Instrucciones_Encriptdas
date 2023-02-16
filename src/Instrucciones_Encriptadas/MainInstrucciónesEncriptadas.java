package Instrucciones_Encriptadas;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MainInstrucciónesEncriptadas extends LectorDeTexto {
    public static void main(String[] args) throws IOException {
        Scanner svc = new Scanner(System.in);
        System.out.println("ingresa la ruta de entrada de tu archivo");
        String RutaEntrada = svc.nextLine();

        LectorDeTexto lector = new LectorDeTexto();
        String [] EntradaLeida = lector.lectorEntrada(RutaEntrada);
        try {

            EvaluadorEntrada EntradaEvaluada = new EvaluadorEntrada();
            String[] EntradaAnalizada = EntradaEvaluada.AnalizadorDeExepciones(EntradaLeida);

        EliminadorDuplicados RemuveDupli =new EliminadorDuplicados();
        String MsjEncriptado = RemuveDupli.RemovedorDeDuplicados(EntradaAnalizada[3]);


        System.out.println("ingresa tu ruta de salida ");
        String RutaSalida = svc.nextLine();

        AnalizadorGanador AnalizadorG = new AnalizadorGanador();
        AnalizadorG.Analizador(EntradaAnalizada,MsjEncriptado,RutaSalida);
    }catch (Exception exception ){
        System.out.println(exception.getMessage());
    }
}
}