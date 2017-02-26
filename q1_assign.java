/**
 * IPPL430C Assignment
 * Prof. Rahul Kala
 * @author Chinmoy Das, IIT2015028
 * @version February 17, 2017
 */
import java.io.*;
import java.util.*;

public class q1_assign
{
    public static void main (String[] args) throws Exception
    {
        /**
         * Assuming that a maximum of 10000 boys, and 10000 girls are there.
         */
        
        int g, b, i, j, t, type;
        double x;
        boolean res;
        String s0;
        girls_data[] girls = new girls_data[10000];
        boys_data[] boys = new boys_data[10000];
        
        Scanner Sc;
        /**
         * Reading from file -- Girls_input.txt
         */
        Sc = new Scanner (new File ("Girls_input.txt"));
        for (g = 0; Sc.hasNext(); ++g) {
            girls[g] = new girls_data();
            s0 = Sc.next();
            i = Sc.nextInt();
            j = Sc.nextInt();
            x = Sc.nextDouble();
            type = Sc.nextInt();
            girls[g].set_name (s0);
            girls[g].set_att (i);
            girls[g].set_intel (j);
            girls[g].set_budget (x);
            girls[g].set_type (type);
        }
        Sc.close();
        /**
         * Reading from file -- Boys_input.txt
         */
        Sc = new Scanner (new File ("Boys_input.txt"));
        for (b = 0; Sc.hasNext(); ++b) {
            boys[b] = new boys_data();
            s0 = Sc.next();
            i = Sc.nextInt();
            j = Sc.nextInt();
            x = Sc.nextDouble();
            t = Sc.nextInt();
            type = Sc.nextInt();
            boys[b].set_name (s0);
            boys[b].set_att (i);
            boys[b].set_intel (j);
            boys[b].set_budget (x);
            boys[b].set_req_att (t);
            boys[b].set_type (type);
        }
        Sc.close();
        
	/**
	* Opening file for Writing
	*/
        FileWriter Fw = new FileWriter ("Couples.txt", true);
        BufferedWriter Bw = new BufferedWriter (Fw);
        PrintWriter Pw = new PrintWriter (Bw);
        
        for (i = 0; i < g; ++i) {
            res = false;
            /**
             * Search in the list of the boys.
             * Now pair the girl with the most suitable boy.
             */
            for (j = 0; j < b; ++j) {
                if (boys[j].get_budget() >= girls[i].get_budget() && girls[i].get_att() >= boys[j].get_req_att()) {
                    /**System.out.println ("Couple :- " + girls[i].get_name() + " & " + boys[j].get_name());*/
                    Pw.println (girls[i].get_name() + " " + girls[i].get_att() + " " + girls[i].get_intel() + " " + girls[i].get_budget() + " " + girls[i].get_type() + " " + boys[j].get_name() + " " + boys[j].get_att() + " " + boys[j].get_intel() + " " + boys[j].get_budget() + " " + boys[j].get_req_att() + " " + boys[j].get_type());
		    /**
		    * Printing the paired couples in a text file,
		    * stored for use in Question 2
		    */
                    res = true;
                    /**
                     * Mark that boy as commited.
                     */
                    for ( ; j < b - 1; ++j) {
                        boys[j] = new boys_data (boys[j + 1]);
                    }
                    --b;
                    break;
                }
            }
            if (!res) {
                System.out.println(girls[i].get_name() + " will stay single..!!");
            }
        }
        
	/**
	* Closing the opened File Streams
	*/
        Pw.close();
        Bw.close();
        Fw.close();
    }
}