/**
 * IPPL430C Assignment
 * Prof. Rahul Kala
 * @author Chinmoy Das, IIT2015028
 * @version February 17, 2017
 */
public class girl_gift
{
    public static double girl_choosy (gift_type[] obj, int size)
    {
        /**
         * Only the Price of gift matter,
         * however, Luxury Gift have double value.
         */
        double happiness = 0.0;
        int sum, i, type;
        for (i = sum = 0; i < size; ++i) {
            type = obj[i].get_type();
            if (type == 1) {
                sum += (2 * obj[i].get_price());
            } else {
                sum += obj[i].get_price();
            }
        }
        happiness = Math.log ((double) sum);
        return happiness;
    }
    public static double girl_normal (gift_type[] obj, int size)
    {
        double happiness = 0.0;
        int i, sum;
        for (i = sum = 0; i < size; ++i) {
            sum += obj[i].get_price() + obj[i].get_value();
        }
        happiness = (double) sum;
        return happiness;
    }
    public static double girl_desperate (gift_type[] obj, int size)
    {
        double happiness = 0.0;
        int i, sum;
        for (i = sum = 0; i < size; ++i) {
            sum += obj[i].get_price();
        }
        happiness = Math.exp ((double) sum);
        return happiness;
    }
}