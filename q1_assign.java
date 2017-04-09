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
    /**
    * Reading the list of boys and girls.
    * As per the requirements,
    * form the couples.
    */
    public static void main (String[] args) throws Exception
    {
        /**
         * Assuming that a maximum of 10000 boys, and 10000 girls are there.
         */
        
        int g, b, i, j, t, type;
        double x;
        String s0;
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
        
        FileWriter Fw = new FileWriter ("Couples.txt", true);
        BufferedWriter Bw = new BufferedWriter (Fw);
        PrintWriter Pw = new PrintWriter (Bw);
        
        for (b = 75, g = 60, i = 0; i < g; ++i) {
            /**
             * Search in the list of the boys.
             * Now pair the girl with the most suitable boy.
             */
            for (j = 0; j < b; ++j) {
                if (boys[j].get_budget() >= girls[i].get_budget() && girls[i].get_att() >= boys[j].get_req_att()) {
                    /**System.out.println ("Couple :- " + girls[i].get_name() + " & " + boys[j].get_name());*/
                    Pw.println (girls[i].get_name() + " " + girls[i].get_att() + " " + girls[i].get_intel() + " " + girls[i].get_budget() + " " + girls[i].get_type() + " " + boys[j].get_name() + " " + boys[j].get_att() + " " + boys[j].get_intel() + " " + boys[j].get_budget() + " " + boys[j].get_req_att() + " " + boys[j].get_type());
                    /**
                     * Printing the paired couples in a text file
                     * stored for use in Question 2
                     */
                    /**Mark that boy as commited.*/
                    for ( ; j < b - 1; ++j) {
                        boys[j] = new boys_data (boys[j + 1]);
                    }
                    --b;
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
