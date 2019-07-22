
package jueguito;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
public class Posiciones {
    public static int[] obtXY(String candy) {
        int xy[] = new int[2];

        xy[0]= Integer.parseInt(candy.substring(1,2));
        xy[1]= Integer.parseInt(candy.substring(3,4));
        return xy;
    }
    public static int TipoP(String tag){
         return Integer.parseInt(tag.substring(5,6));
    }
}
