import java.io.*;
import java.util.*;
/**
 * PPL Assignment, Prof. Rahul Kala
 * @author Chinmoy Das, IIT2015028
 * @version April 3, 2017
 */
public class q6_assign
{
    /**
    * Driver function for Question 6
    * Breakup of 2 least happy couples, after every day of exchanging gifts
    */
    public static void main (String[] args) throws Exception
    {
        /**
         * 2 Least Happy couples will break-up everyday after the gifts are exchanged.
         */
        int i, j, k, t, l = 2, n;
        double a, b;
        Scanner Sc, couples;
        FileWriter Fw0, Fw1;
        BufferedWriter Bw0, Bw1;
        PrintWriter Pw0, Pw1;
        
        /**
         * Reading the couples name, happiness and compatibility.
         * For the first time.
         */
        aux_class[] obj = new aux_class[75];
        couples = new Scanner (new File ("Couples_data.txt"));
        for (n = 0; couples.hasNext(); ++n) {
            obj[n] = new aux_class();
            obj[n].set_name (couples.next(), couples.next());
            obj[n].set_happ (couples.nextDouble());
            obj[n].set_compat (couples.nextDouble());
        }
        couples.close();
        
        /**
         * Assuming that gifts are given for 5 days in any month.
         */
        Fw0 = new FileWriter ("Q6_Breakups.txt", true);
        Bw0 = new BufferedWriter (Fw0);
        Pw0 = new PrintWriter (Bw0);
        for (t = 1; t <= 5; ++t) {
            /**
             * Static function to allocate the gifts to couples.
             */
            Arrays.sort (obj,0, n, new Comp0());
            Pw0.println("Day -- " + t);
            for (i = 0; i < l; ++i) {
                Pw0.println(obj[i].get_girl_name() + " " + obj[i].get_boy_name());
            }
            Pw0.println();
            
            rand_gift_days.generator();
            Sc = new Scanner (new File ("Q6_Gifts.txt"));
            Gifts_Q6[] gifts = new Gifts_Q6[n];
            for (i = 0; i < n; ++i) {
                int size = Sc.nextInt();
                gifts[i] = new Gifts_Q6(size);
                for (int xy = 0; xy < size; ++xy) {
                    gifts[i].obj[xy].set_type (Sc.nextInt());
                    gifts[i].obj[xy].set_common (Sc.nextInt(), Sc.nextInt());
                    if (gifts[i].obj[xy].get_type() == 1) {
                        gifts[i].obj[xy].set_lux (Sc.nextInt(), Sc.nextInt());
                    } else if (gifts[i].obj[xy].get_type() == 2) {
                        gifts[i].obj[xy].set_util (Sc.nextInt(), Sc.nextInt());
                    }
                }
            }
            
            Fw1 = new FileWriter ("TEMPORARY.txt");
            Bw1 = new BufferedWriter (Fw1);
            Pw1 = new PrintWriter (Bw1);
            Random rnd = new Random (10000009);
            for (i = 0; i < n; ++i) {
                Pw1.println(obj[i].get_girl_name() + " " + obj[i].get_boy_name() + " " + rnd.nextDouble() + " " + rnd.nextDouble());
            }
            Pw1.close();
            Bw1.close();
            Fw1.close();
            
            couples = new Scanner (new File ("TEMPORARY.txt"));
            for (n = 0; couples.hasNext(); ++n) {
                obj[n] = new aux_class();
                obj[n].set_name (couples.next(), couples.next());
                obj[n].set_happ (couples.nextDouble());
                obj[n].set_compat (couples.nextDouble());
            }
            couples.close();
        }
        Pw0.close();
        Bw0.close();
        Fw0.close();
    }
}
/**
* Temporary class only required for processing in Question 6
*/
class Gifts_Q6
{
    protected int num;
    protected gift_type[] obj;
    
    public Gifts_Q6(int n)
    {
        num = n;
        obj = new gift_type[num];
        for (int i = 0; i < n; ++i) {
            obj[i] = new gift_type();
        }
    }
}
class Comp0 implements Comparator
{
    /**
    * Comparator for sorting the objects in aux_class
    * @return int
    */
    public int compare (Object o0, Object o1)
    {
        aux_class obj0 = (aux_class) o0;
        aux_class obj1 = (aux_class) o1;
        
        if (obj0.get_happ() > obj1.get_happ()) {
            return 1;
        } else if (obj0.get_happ() == obj1.get_happ()) {
            return 0;
        } else {
            return -1;
        }
    }
}
