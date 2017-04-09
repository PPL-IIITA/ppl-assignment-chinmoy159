import java.io.*;
import java.util.*;
/**
 * Reader Class for the Girls Data
 * @author Chinmoy Das, IIT2015028
 */
public class read_girls
{
    /**
    * @exception FileNotFoundException
    * @return array of objects of girls_data
    */
    public girls_data[] read_fnc () throws FileNotFoundException
    {
        girls_data[] obj = new girls_data[60];
        Scanner Sc = new Scanner (new File ("Girls_input.txt"));
        int i, j, x, t;
        double k;
        String s0;
        
        for (t = 0; t < 60; ++t) {
            obj[t] = new girls_data();
            s0 = Sc.next();
            i = Sc.nextInt();
            j = Sc.nextInt();
            k = Sc.nextDouble();
            x = Sc.nextInt();
            obj[t].set_name (s0);
            obj[t].set_att (i);
            obj[t].set_intel (j);
            obj[t].set_budget (k);
            obj[t].set_type (x);
        }
        
        Sc.close();
        return obj;
    }
}