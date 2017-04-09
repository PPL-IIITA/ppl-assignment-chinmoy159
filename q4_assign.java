import java.util.*;
import java.io.*;
/**
 * Question 4 -- PPL Assignment
 * @author Chinmoy Das, IIT2015028
 * @version April 3, 2017
 */
public class q4_assign
{
    /**
    * Searching if the person already has a mate
    * @return boolean
    */
    public static boolean search (aux_class[] obj, String bae_name, int type)
    {
        int i, j;
        switch (type) {
            case 0:
            /**
             * Search for boy in the list of broken up pairs
             */
            for (i = 7, j = obj.length; i < j && obj[i] != null; ++i) {
                if (bae_name.equals (obj[i].get_boy_name())) {
                    return true;
                }
            }
            return false;
            case 1:
            for (i = 7, j = obj.length; i < j && obj[i] != null; ++i) {
                if (bae_name.equals (obj[i].get_girl_name())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    /**
    * Driver function for Question 4
    * Do the breakup for the 7 least happy couple,
    * then form new couples.
    */
    public static void main (String[] arg) throws Exception
    {
        int i, j, k = 7, t, x, y, n;
        double a, b;
        Scanner Sc, couples;
        
        aux_class[] obj = new aux_class[75];
        couples = new Scanner (new File ("Couples_data.txt"));
        
        for (n = 0; couples.hasNext(); ++n) {
            obj[n] = new aux_class ();
            obj[n].set_name (couples.next(), couples.next());
            obj[n].set_happ (couples.nextDouble());
            obj[n].set_compat (couples.nextDouble());
        }
        couples.close();
        
        for (i = 0; i < n; ++i) {
            for (j = 0; j < n - i - 1; ++j) {
                if (obj[j].get_happ() > obj[j + 1].get_happ()) {
                    aux_class temp = new aux_class (obj[j]);
                    obj[j] = new aux_class (obj[j + 1]);
                    obj[j + 1] = new aux_class (temp);
                }
            }
        }
        
        FileWriter Fw;
        BufferedWriter Bw;
        PrintWriter Pw;
        /**
         * Reading the list of girls
         */
        girls_data[] girls = new girls_data[60];
        boys_data[] boys = new boys_data[75];
        girls = (new read_girls()).read_fnc();
        boys = (new read_boys()).read_fnc();
        
        Fw = new FileWriter ("Broken_up.txt");
        Bw = new BufferedWriter (Fw);
        Pw = new PrintWriter (Bw);
        Pw.println("Broken-up Pair are -- Value of k = " + k);
        for (i = 0; i < k; ++i) {
            Pw.println(obj[i].get_girl_name() + " " + obj[i].get_boy_name());
        }
        Pw.close();
        Bw.close();
        Fw.close();
        
        Fw = new FileWriter ("New_couples.txt");
        Bw = new BufferedWriter (Fw);
        Pw = new PrintWriter (Bw);
        Pw.println("Newly formed couples --");
        for (y = 75, x = 60, i = 0; i < x && girls[i] != null; ++i) {
            if (search (obj, girls[i].get_name(), 1)) {
                continue;
            }
            /**
             * Search in the list of the boys.
             * Now pair the girl with the most suitable boy.
             */
            for (j = 0; j < y && boys[j] != null; ++j) {
                if (search (obj, boys[i].get_name(), 0)) {
                    for ( ; j < y - 1; ++j) {
                        boys[j] = new boys_data (boys[j + 1]);
                    }
                    --y;
                    continue;
                }
                if (boys[j].get_budget() >= girls[i].get_budget() && girls[i].get_att() >= boys[j].get_req_att()) {
                    /**System.out.println ("Couple :- " + girls[i].get_name() + " & " + boys[j].get_name());*/
                    Pw.println (girls[i].get_name() + " " + girls[i].get_att() + " " + girls[i].get_intel() + " " + girls[i].get_budget() + " " + girls[i].get_type() + " " + boys[j].get_name() + " " + boys[j].get_att() + " " + boys[j].get_intel() + " " + boys[j].get_budget() + " " + boys[j].get_req_att() + " " + boys[j].get_type());
                    /**
                     * Printing the paired couples in a text file
                     * stored for use in Question 2
                     */
                    /**Mark that boy as commited.*/
                    for ( ; j < y - 1; ++j) {
                        boys[j] = new boys_data (boys[j + 1]);
                    }
                    --y;
                    break;
                }
            }
        }
        /**Closing the opened File Streams*/
        Pw.close();
        Bw.close();
        Fw.close();
    }
}