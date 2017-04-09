/**
 * Random Data Generator
 * IPPL430C Assignment
 * Prof. Rahul Kala
 * @author Chinmoy Das, IIT2015028
 * @version February 17, 2017
 */
import java.util.*;
import java.io.*;
public class rand_data_girls
{
    /**
    * Random generation of girls_data
    */
    public static void main (String[] args) throws Exception
    {
        String file;
        String name;
        int i, j, type, t;
        double x;
        
        Random rnd = new Random (100007);
        
        FileWriter Fw = new FileWriter ("Girls_input.txt");
        BufferedWriter Bw = new BufferedWriter (Fw);
        PrintWriter Pw = new PrintWriter (Bw);
        
        for (t = 10; t < 70; ++t) {
            name = "Girl-" + t;
            i = rnd.nextInt(20) + 75; /**Attractiveness*/
            j = rnd.nextInt(15) + 1; /**Intel Level*/
            x = ((double)rnd.nextInt(400) / 10) + 200.0; /**Budget*/
            type = rnd.nextInt(3); /**Type of Girl*/
            //System.out.println(name + " " + i + " " + j + " " + x);
            Pw.println(name + " " + i + " " + j + " " + x + " " + type);
        }
        
        Pw.close();
        Bw.close();
        Fw.close();
    }
}