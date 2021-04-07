import java.awt.*;
import java.util.ArrayList;

public class Split {

    ArrayList<Integer> listB = new ArrayList<Integer>();
    ArrayList<Integer> listC = new ArrayList<Integer>();

    public static boolean verificare(int arrayA[])
    {
        boolean ok = false;
        int suma = 0, n = arrayA.length;
        for(int i=0;i<n;i++)
        {
            suma = suma + arrayA[i];
        }

        int m = n/2;
        for(int i=1;i<=m && !ok;i++)
        {
            if((suma*i) % n == 0) // formula am explicat-o pe foaie
                ok = true;
        }

        if(!ok)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        int arrayA[] = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(verificare(arrayA));
    }
}
