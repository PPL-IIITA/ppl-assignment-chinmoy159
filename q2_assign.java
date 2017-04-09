/**
 * IPPL430C Assignment
 * Prof. Rahul Kala
 * @author Chinmoy Das, IIT2015028
 * @version February 17, 2017
 */
import java.io.*;
import java.util.*;
public class q2_assign
{
    /**
    * Reading the couples formed after Question 1,
    * Reading the list of gifts exchanged in the couple,
    * Now, calculate the associated happiness and compatibility of each couple.
    */
    public static void main (String[] args) throws Exception
    {
        /**
         * Assuming that the number of gifts,
         * given by each boy is known pre-hand.
         */
        Scanner Sc, Gift;
        int c, i, j, k, size, t;
        double x;
        String St;
        couples_data[] obj = new couples_data[10000];
        
        FileWriter Fw0 = new FileWriter ("Couples_data.txt", true);
        BufferedWriter Bw0 = new BufferedWriter (Fw0);
        PrintWriter Pw0 = new PrintWriter (Bw0);
        
        /**
         * Reading the List of paired couples, and the gifts given.
         */
        Sc = new Scanner (new File ("Couples.txt"));
        Gift = new Scanner (new File ("Gifts.txt"));
        for (c = 0; Sc.hasNext(); ++c) {
            obj[c] = new couples_data();
            St = Sc.next();
            i = Sc.nextInt();
            j = Sc.nextInt();
            x = Sc.nextDouble();
            t = Sc.nextInt();
            obj[c].set_girl (St, i, j, x, t);
            
            St = Sc.next();
            i = Sc.nextInt();
            j = Sc.nextInt();
            x = Sc.nextDouble();
            k = Sc.nextInt();
            t = Sc.nextInt();
            obj[c].set_boy (St, i, j, x, k, t);
            
            size = Gift.nextInt();
            obj[c].set_num_gifts (size);
            for (k = 0; k < size; ++k) {
                obj[c].gifts[k] = new gift_type();
                /**Scanning the Gifts*/
                t = Gift.nextInt();
                obj[c].gifts[k].set_type (t);
                obj[c].gifts[k].set_common (Gift.nextInt(), Gift.nextInt());
                if (t == 1) {
                    obj[c].gifts[k].set_lux (Gift.nextInt(), Gift.nextInt());
                } else if (t == 2) {
                    obj[c].gifts[k].set_util (Gift.nextInt(), Gift.nextInt());
                }
            }
            
            /**Calculating happiness for the Girl*/
            t = obj[c].girl.get_type();
            if (t == 0) {
                x = girl_gift.girl_choosy (obj[c].gifts, size);
            } else if (t == 1) {
                x = girl_gift.girl_normal (obj[c].gifts, size);
            } else {
                x = girl_gift.girl_desperate (obj[c].gifts, size);
            }
            /**Calculating happiness for the Boy*/
            t = obj[c].boy.get_type();
            if (t == 0) {
                x += boy_gift.boy_miser (obj[c].gifts, obj[c].boy.get_budget(), size);
            } else if (t == 1) {
                x *= 2;
            } else {
                x += boy_gift.boy_geek (obj[c].girl.get_intel());
            }
            
            obj[c].set_happ (x);
            obj[c].set_compat (Math.abs (obj[c].boy.get_budget() - obj[c].girl.get_budget()) + Math.abs(obj[c].boy.get_att() + obj[c].boy.get_att()) + Math.abs(obj[c].boy.get_intel() + obj[c].boy.get_intel()));
            
            Pw0.println (obj[c].girl.get_name () + " " + obj[c].boy.get_name () + " " + obj[c].get_happ () + " " +obj[c].get_compat());
        }
        Sc.close();
        Gift.close();
        Pw0.close();
        Bw0.close();
        Fw0.close();
        
        //Sc = new Scanner (System.in);
        /**
         * Opening a file for Writing
         */
        FileWriter Fw = new FileWriter ("Gift_log.txt");
        BufferedWriter Bw = new BufferedWriter (Fw);
        PrintWriter Pw = new PrintWriter (Bw);
        k = 10; /**Scanning the value of k*/
        for (i = 0; i < c; ++i) {
            for (j = 0; j < c - i - 1; ++j) {
                if (obj[j].get_happ() < obj[j + 1].get_happ()) {
                    couples_data temp = new couples_data (obj[j]);
                    obj[j] = new couples_data (obj[j + 1]);
                    obj[j + 1] = new couples_data (temp);
                }
            }
        }/**Bubble Sorting*/
        Pw.println("k-happiest couples    Value of k = " + k);
        for (i = 0; i < k; ++i) {
            Pw.println(obj[i].girl.get_name() + " " + obj[i].boy.get_name());
            for (size = obj[i].get_num_gifts(), j = 0; j < size; ++j) {
                t = obj[i].gifts[j].get_type();
                Pw.print(t + " " + obj[i].gifts[j].get_value() + " " + obj[i].gifts[j].get_price() + " ");
                if (t == 1) {
                    Pw.print(obj[i].gifts[j].get_lux_rat() + " " + obj[i].gifts[j].get_diff());
                } else if (t == 2) {
                    Pw.print(obj[i].gifts[j].get_util_val() + " " + obj[i].gifts[j].get_util_class());
                }
                Pw.println();
            }
        }
        for (i = 0; i < c; ++i) {
            for (j = 0; j < c - i - 1; ++j) {
                if (obj[j].get_compat() < obj[j + 1].get_compat()) {
                    couples_data temp = new couples_data (obj[j]);
                    obj[j] = new couples_data (obj[j + 1]);
                    obj[j + 1] = new couples_data (temp);
                }
            }
        }/**Bubble Sorting*/
        Pw.println("k-most compatible couples    Value of k = " + k);
        for (i = 0; i < k; ++i) {
            Pw.println(obj[i].girl.get_name() + " " + obj[i].boy.get_name());
            for (size = obj[i].get_num_gifts(), j = 0; j < size; ++j) {
                t = obj[i].gifts[j].get_type();
                Pw.print(t + " " + obj[i].gifts[j].get_value() + " " + obj[i].gifts[j].get_price() + " ");
                if (t == 1) {
                    Pw.print(obj[i].gifts[j].get_lux_rat() + " " + obj[i].gifts[j].get_diff());
                } else if (t == 2) {
                    Pw.print(obj[i].gifts[j].get_util_val() + " " + obj[i].gifts[j].get_util_class());
                }
                Pw.println();
            }
        }
        /**
         * Closing all the opened streams
         */
        Pw.close();
        Bw.close();
        Fw.close();
    }
}