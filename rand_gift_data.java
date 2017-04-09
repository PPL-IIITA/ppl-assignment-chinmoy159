import java.util.*;
import java.io.*;
/**
 * Random Generator for the gifts given
 * @author Chinmoy Das, IIT2015028
 */
public class rand_gift_data
{
    /**
    * Randomly generate gifts for the couples
    */
    public static void main (String[] args) throws Exception
    {
        int type, i, j, x, y, z, count;
        FileWriter Fw = new FileWriter ("Gifts.txt");
        BufferedWriter Bw = new BufferedWriter (Fw);
        PrintWriter Pw = new PrintWriter (Bw);
        Random rnd = new Random (100007);
        
        for (count = 0; count < 50; ++count) {
            z = rnd.nextInt (5) + 2;
            Pw.println (z);
            for ( ; z > 0; --z) {
                type = rnd.nextInt (3);
                i = rnd.nextInt (50) + 20;
                j = rnd.nextInt (30) + 10;
                if (type == 1) {
                    x = rnd.nextInt (30) + 10;
                    y = rnd.nextInt (8) + 3;
                    Pw.println (type + " " + i + " " + j + " " + x + " " + y);
                } else if (type == 2) {
                    x = rnd.nextInt (30) + 10;
                    y = rnd.nextInt (5) + 5;
                    Pw.println (type + " " + i + " " + j + " " + x + " " + y);
                } else {
                    Pw.println (type + " " + i + " " + j);
                }
            }
        }
        
        Pw.close();
        Bw.close();
        Fw.close();
    }
}