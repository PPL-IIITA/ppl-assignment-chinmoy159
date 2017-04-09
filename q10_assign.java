import java.io.*;
import java.util.*;
/**
 * PPL Assignment, Prof. Rahul Kala
 * @author Chinmoy Das, IIT2015028
 * @version April 3, 2017
 */
public class q10_assign
{
    /**
    * This is a simple data structure,
    * which stores the objects of couples,
    * sorts them according to the happiness factor involved,
    * and it returns any index randomly from the first ""n"" indices involved.
    * Value of n == 7
    */
    public static void main (String[] args) throws Exception
    {
        int ans, n;
        /**
         * value of n == 7
         */
        Scanner couples = new Scanner (new File ("Couples_data.txt"));
        aux_class[] obj = new aux_class[50];
        for (n = 0; couples.hasNext(); ++n) {
            obj[n] = new aux_class ();
            obj[n].set_name (couples.next(), couples.next());
            obj[n].set_happ (couples.nextDouble());
            obj[n].set_compat (couples.nextDouble());
        }
        couples.close();
        
        Arrays.sort (obj, 0, n, new Comp2());
        
        ans = (new Random (100000009)).nextInt (150) % 7;
        FileWriter Fw = new FileWriter ("Q10_Random_Ans.txt");
        BufferedWriter Bw = new BufferedWriter (Fw);
        PrintWriter Pw = new PrintWriter (Bw);
        Pw.println(ans);
        Pw.println(obj[ans].get_girl_name() + " " + obj[ans].get_boy_name() + " " + obj[ans].get_happ() + " " + obj[ans].get_compat());
        Pw.close();
        Bw.close();
        Fw.close();
    }
}
class Comp2 implements Comparator
{
    /**
    * Comparator class for quicksorting the objects of aux_class
    * @return int
    */
    public int compare (Object o0, Object o1)
    {
        double x;
        aux_class obj0, obj1;
        obj0 = (aux_class) o0;
        obj1 = (aux_class) o1;
        x = obj0.get_happ() - obj1.get_happ();
        if (x > 0.0) {
            return 1;
        } else if (x == 0.0) {
            return 0;
        } else {
            return -1;
        }
    }
}