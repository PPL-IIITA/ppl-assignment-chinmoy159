/**
 * IPPL430C Assignment
 * Prof. Rahul Kala
 * @author Chinmoy Das, IIT2015028
 * @version February 17, 2017
 */
public class gift_type
{
    private int type; /**Type of Gift*/
    private int value, price; /**Common Properties*/
    private int lux_rat, diff; /**Luxurious Gifts*/
    private int util_val, util_class; /**Utility Gifts*/
    
    public gift_type()
    {
        /**Default Constructor*/
        type = -1;
        value = price = 0;
        lux_rat = diff = -1;
        util_val = util_class = -1;
    }
    public gift_type(gift_type obj)
    {
        /**Copy Constructor*/
        this.type = obj.get_type();
        this.value = obj.get_value();
        this.price = obj.get_price();
        this.lux_rat = obj.get_lux_rat();
        this.diff = obj.get_diff();
        this.util_val = obj.get_util_val();
        this.util_class = obj.get_util_class();
    }
    
    public void set_type (int type)
    {
        /**
         * Accessor Method
         * to set type of gift
         */
        this.type = type;
    }
    public void set_common (int value, int price)
    {
        /**
         * Accessor Method
         * to set common attributes
         */
        this.value = value;
        this.price = price;
    }
    public void set_lux (int lux_rat, int diff)
    {
        /**
         * Accessor method
         * to set Luxury Gifts' attributes
         */
        this.lux_rat = lux_rat;
        this.diff = diff;
    }
    public void set_util (int util_val, int util_class)
    {
        /**
         * Accessor method
         * to set Utility Gifts' attributes
         */
        this.util_val = util_val;
        this.util_class = util_class;
    }
    
    public int get_type()
    {
        return type;
    }
    public int get_value()
    {
        return value;
    }
    public int get_price()
    {
        return price;
    }
    public int get_lux_rat()
    {
        return lux_rat;
    }
    public int get_diff()
    {
        return diff;
    }
    public int get_util_val()
    {
        return util_val;
    }
    public int get_util_class()
    {
        return util_class;
    }
}