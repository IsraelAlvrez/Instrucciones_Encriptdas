package Instrucciones_Encriptadas;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MainInstrucciónesEncriptadas  {
    public static void main(String[] args) throws IOException {

        LectorDeTexto lector = new LectorDeTexto();
        String [] EntradaLeida = lector.lectorEntrada(args[0]);
        try {

            EvaluadorEntrada EntradaEvaluada = new EvaluadorEntrada();
            String[] EntradaAnalizada = EntradaEvaluada.AnalizadorDeExepciones(EntradaLeida);

        EliminadorDuplicados RemuveDupli =new EliminadorDuplicados();
        String MsjEncriptado = RemuveDupli.RemovedorDeDuplicados(EntradaAnalizada[3]);



        AnalizadorGanador AnalizadorG = new AnalizadorGanador();
        AnalizadorG.Analizador(EntradaAnalizada,MsjEncriptado,args[1]);
    }catch (Exception exception ){
        System.out.println(exception.getMessage());
    }
}
}