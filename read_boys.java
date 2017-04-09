import java.io.*;
import java.util.*;
/**
 * Reader Class for the Boys Data
 * @author Chinmoy Das, IIT2015028
 */
public class read_boys
{
    /**
    * @exception FileNotFoundException
    * @return array of objects of girls_data
    */
    public boys_data[] read_fnc () throws FileNotFoundException
    {
        boys_data[] obj = new boys_data[75];
        Scanner Sc = new Scanner (new File ("Boys_input.txt"));
        int i, j, x, y, t;
        double k;
        String s0;
        
        for (t = 0; t < 75; ++t) {
            obj[t] = new boys_data();
            s0 = Sc.next();
            i = Sc.nextInt();
            j = Sc.nextInt();
            k = Sc.nextDouble();
            x = Sc.nextInt();
            y = Sc.nextInt();
            obj[t].set_name (s0);
            obj[t].set_att (i);
            obj[t].set_intel (j);
            obj[t].set_budget (k);
            obj[t].set_req_att (x);
            obj[t].set_type (y);
        }
        
        Sc.close();
        return obj;
    }
}