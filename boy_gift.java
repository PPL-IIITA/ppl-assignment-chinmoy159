/**
 * IPPL430C Assignment
 * Prof. Rahul Kala
 * @author Chinmoy Das, IIT2015028
 * @version February 17, 2017
 */
/**
* Different types of Boys
*/
public class boy_gift
{
    /**
    * Miser Boy
    * @return double
    */
    public static double boy_miser (gift_type[] obj, double budget, int size)
    {
        double happiness;
        int i, sum;
        for (i = sum = 0; i < size; ++i) {
            sum += obj[i].get_price();
        }
        happiness = budget - (double) sum;
        return happiness;
    }
    /**
    * public static double boy_generous (gift_type[] obj, int type)
    * {
    *    double happiness = 0;
    *    switch (type) {
    *        case 0:
    *        happiness = girl_gift.girl_choosy (obj);
    *        break;
    *        case 1:
    *        happiness = girl_gift.girl_normal (obj);
    *        break;
    *        case 2:
    *        happiness = girl_gift.girl_desperate (obj);
    *        break;
    *    }
    *    return happiness;
    *}
    */
    /**
    * Geek Boy
    * @return double
    */
    public static double boy_geek (int intel)
    {
        return (double) intel;
    }
}