package Instrucciones_Encriptadas;

import java.util.Arrays;

public class EliminadorDuplicados {


    public  String RemovedorDeDuplicados(String s)
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
                System.out.println(c);
                System.out.println(Arrays.toString(chars));
                System.out.println(k);
            }
        }
        System.out.println(Arrays.toString(chars));
        System.out.println(k);
        return new String(chars).substring(0, k);
    }
}
