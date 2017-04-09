import java.io.*;
import java.util.*;
/**
 * PPL_Assignment Prof. Rahul Kala
 * @author Chinmoy Das, IIT2015028
 * @version April 3, 2017
 */
public class q7_assign
{
    /**
    * Binary Searching for a boy in the list of couples.
    * Prints whether the boy is commited or not
    *
    */
    public static void b_search (String val, aux_class[] obj, int n, PrintWriter Pw)
    {
        /**
         * Binary Search function
         */
        int i, j, m, x;
        for (i = 0,j = n - 1; i <= j; ) {
            m = (i + j)/2;
            x = obj[m].get_boy_name().compareTo (val);
            if (x == 0) {
                Pw.println(val + " has a girlfriend !");
                return;
            } else if (x > 0) {
                j = m - 1;
            } else {
                i = m + 1;
            }
        }
        Pw.println(val + " is still a virgin!");
    }
    /**
    * Driver function for Question 7
    * Select the boy, and  search for him in the list of couples.
    */
    public static void main (String[] args) throws Exception
    {
        boys_data[] boys = new boys_data[75];
        aux_class[] obj = new aux_class[75];
        int i, j, k, n, x, y;
        Scanner couples, Sc;
        FileWriter Fw;
        BufferedWriter Bw;
        PrintWriter Pw;
        
        boys = (new read_boys()).read_fnc();
        couples = new Scanner (new File ("Couples_data.txt"));
        for (n = 0; couples.hasNext(); ++n) {
            obj[n] = new aux_class ();
            obj[n].set_name (couples.next(), couples.next());
            obj[n].set_happ (couples.nextDouble());
            obj[n].set_compat (couples.nextDouble());
        }
        couples.close();
        Arrays.sort (obj, 0, n, new Comp1());
        /**
         * Taking the list of couples to be sorted lexicographically,
         * according to the boy_name.
         */
        Fw = new FileWriter ("Q7_analysis.txt");
        Bw = new BufferedWriter (Fw);
        Pw = new PrintWriter (Bw);
        
        for (i = 0; i < 75; ++i) {
            /**
             * Performing binary searching on the names of the couples.
             */
            b_search (boys[i].get_name(), obj, n, Pw);
        }
        Pw.close();
        Bw.close();
        Fw.close();
    }
}
class Comp1 implements Comparator
{
    /**
    * Comparator class for sorting the objects of aux_class
    * @return int
    */
    public int compare (Object o0, Object o1)
    {
        aux_class obj0, obj1;
        obj0 = (aux_class) o0;
        obj1 = (aux_class) o1;
        
        int x = obj0.get_boy_name().compareTo (obj1.get_boy_name());
        if (x > 0) {
            return 1;
        } else if (x == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}