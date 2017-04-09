/**
 * IPPL430C Assignment
 * Prof. Rahul Kala
 * @author Chinmoy Das, IIT2015028
 * @version February 17, 2017
 */
/**
* Details of the couples formed.
*/
public class couples_data
{
    protected boys_data boy;
    protected girls_data girl;
    protected gift_type[] gifts;
    private int num_gifts;
    private double happiness;
    private double compat;
    
    public couples_data()
    {
        /**
         * Default Constructor
         */
        boy = null;
        girl = null;
        num_gifts = 0;
        gifts = new gift_type[num_gifts];
        happiness = compat = 0.0;
    }
    
    public couples_data (couples_data obj)
    {
        /**
         * Copy Constructor
         */
        this.boy = new boys_data (obj.boy);
        this.girl = new girls_data (obj.girl);
        this.happiness = obj.get_happ();
        this.compat = obj.get_compat();
        this.num_gifts = obj.get_num_gifts();
        this.gifts = new gift_type[num_gifts];
        for (int i = 0; i < num_gifts; ++i) {
            this.gifts[i] = new gift_type (obj.gifts[i]);
        }
    }
    
    public void set_girl (String St, int i, int j, double x, int t)
    {
        girl = new girls_data ();
        girl.set_name (St);
        girl.set_att (i);
        girl.set_intel (j);
        girl.set_budget (x);
        girl.set_type (t);
    }
    public void set_boy (String St, int i, int j, double x, int k, int t)
    {
        boy = new boys_data ();
        boy.set_name (St);
        boy.set_att (i);
        boy.set_intel (j);
        boy.set_budget (x);
        boy.set_req_att (k);
        boy.set_type (t);
    }
    public void set_happ (double happiness)
    {
        this.happiness = happiness;
    }
    public void set_compat (double compat)
    {
        this.compat = compat;
    }
    public void set_num_gifts (int num_gifts)
    {
        this.num_gifts = num_gifts;
        this.gifts = new gift_type[this.num_gifts];
    }
    
    public double get_happ()
    {
        return happiness;
    }
    public double get_compat()
    {
        return compat;
    }
    public int get_num_gifts()
    {
        return num_gifts;
    }
}