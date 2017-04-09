/**
 * IPPL430C Assignment
 * Prof. Rahul Kala
 * @author Chinmoy Das, IIT2015028
 * @version February 17, 2017
 */
/**
* Details of the Boys
*/
public class boys_data
{
    private String name; /**Name of Boys*/
    private int attractiveness; /**Attractiveness level*/
    private int intel; /**Intelligence level*/
    private double budget; /**Budget of the boy*/
    private int req_att; /**Minimum required attractiveness*/
    private int type; /**Type of Boys -- Question 2*/
    
    public boys_data ()
    {
        /**
         * Default Constructor
         */
        name = "";
        attractiveness = 0;
        intel = 0;
        budget = 0.0;
        req_att = 0;
        type = -1;
    }
    public boys_data (boys_data obj)
    {
        /**
         * Copy Constructor
         */
        this.name = obj.get_name();
        this.attractiveness = obj.get_att();
        this.intel = obj.get_intel();
        this.budget = obj.get_budget();
        this.req_att = obj.get_req_att();
        this.type = obj.get_type();
    }
    public void set_name (String name)
    {
        this.name = name;
    }
    public void set_att (int attractiveness)
    {
        this.attractiveness = attractiveness;
    }
    public void set_intel (int intel)
    {
        this.intel = intel;
    }
    public void set_budget (double budget)
    {
        this.budget = budget;
    }
    public void set_req_att (int req_att)
    {
        this.req_att = req_att;
    }
    public void set_type (int type)
    {
        this.type = type;
    }
    
    public String get_name()
    {
        return name;
    }
    public int get_att()
    {
        return attractiveness;
    }
    public int get_intel()
    {
        return intel;
    }
    public double get_budget()
    {
        return budget;
    }
    public int get_req_att()
    {
        return req_att;
    }
    public int get_type()
    {
        return type;
    }
}