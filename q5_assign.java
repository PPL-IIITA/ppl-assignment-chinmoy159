import java.io.*;
import java.util.*;
/**
 * IPPL430C Assignment
 * Prof. Rahul Kala
 * @author Chinmoy Das, IIT2015028
 * @version April 3, 2017
 */
public class q5_assign
{
    /**
    * search an appropriate boy for the given girl
    * @return boolean
    */
    public static boolean set_girl (girls_data[] girls, boys_data[] boys, int g, int b, int i, PrintWriter Pw)
    {
        int j;
        boolean res = false;
        for (j = 0; j < b; ++j) {
            /**
             * Assuming that the girl chooses the boy whose budget > her maintainance cost
             */
            if (boys[j].get_budget() >= girls[i].get_budget()) {
                Pw.println (girls[i].get_name() + " " + girls[i].get_att() + " " + girls[i].get_intel() + " " + girls[i].get_budget() + " " + girls[i].get_type() + " " + boys[j].get_name() + " " + boys[j].get_att() + " " + boys[j].get_intel() + " " + boys[j].get_budget() + " " + boys[j].get_req_att() + " " + boys[j].get_type());
                res = true;
                /**Mark that boy as commited.*/
                for ( ; j < b - 1; ++j) {
                    boys[j] = new boys_data (boys[j + 1]);
                }
                break;
            }
        }
        return res;
    }
    /**
    * search a suitable girl for the given boy
    * @return boolean
    */
    public static boolean set_boy (girls_data[] girls, boys_data[] boys, int g, int b, int i, PrintWriter Pw)
    {
        int j, max_val, ans;
        /**
         * Assuming that the boy chooses the most attractive girl available
         */
        for (j = 0, max_val = -1, ans = -1; j < g; ++j) {
            if (girls[j].get_att() > max_val) {
                max_val = girls[j].get_att();
                ans = j;
            }
        }
        j = ans;
        Pw.println (girls[j].get_name() + " " + girls[j].get_att() + " " + girls[j].get_intel() + " " + girls[j].get_budget() + " " + girls[j].get_type() + " " + boys[i].get_name() + " " + boys[i].get_att() + " " + boys[i].get_intel() + " " + boys[i].get_budget() + " " + boys[i].get_req_att() + " " + boys[i].get_type());
        for ( ; j < g - 1; ++j) {
            girls[j] = new girls_data (girls[j + 1]);
        }
        return true;
    }
    /**
    * Driver function of the Question 5
    * Different method of allocating the mates
    */
    public static void main (String[] args) throws Exception
    {
        int g, b, i, j, t, type;
        double x;
        String s0;
        FileWriter Fw;
        BufferedWriter Bw;
        PrintWriter Pw;
        girls_data[] girls = new girls_data[100];
        boys_data[] boys = new boys_data[150];
        Scanner Sc;
        
        /**
         * Reading from file -- Girls_input.txt
         */
        girls = (new read_girls()).read_fnc();
        
        /**
         * Reading from file -- Boys_input.txt
         */
        boys = (new read_boys()).read_fnc();
        
        Fw = new FileWriter ("Couples_Q5.txt");
        Bw = new BufferedWriter (Fw);
        Pw = new PrintWriter (Bw);
        
        for (g = 60, b = 75, i = 0, j = 0, type = 0; i < g && j < b; ) {
            switch (type) {
                case 0:
                if (set_girl (girls, boys, g, b, i, Pw)) {
                    --b;
                }
                ++i;
                break;
                case 1:
                if (set_boy (girls, boys, g, b, j, Pw)) {
                    --g;
                }
                ++j;
                break;
            }
            type = type ^ 0 ^ 1;
        }
        
        Pw.close();
        Bw.close();
        Fw.close();
    }
}