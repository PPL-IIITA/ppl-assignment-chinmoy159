/**
 * IPPL430C Assignment
 * Prof. Rahul Kala
 * @author Chinmoy Das, IIT2015028
 * @version February 17, 2017
 */
public class boys_data
{
    /**
     * Class which stores the details of the Boys
     */
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
        /**
         * Accessor Method
         * to set name
         */
        this.name = name;
    }
    public void set_att (int attractiveness)
    {
        /**
         * Accessor Method
         * to set attractiveness
         */
        this.attractiveness = attractiveness;
    }
    public void set_intel (int intel)
    {
        /**
         * Accessor Method
         * to set intelligence level
         */
        this.intel = intel;
    }
    public void set_budget (double budget)
    {
        /**
         * Accessor Method
         * to set budget
         */
        this.budget = budget;
    }
    public void set_req_att (int req_att)
    {
        /**
         * Accessor Method
         * to set minimum required attractiveness
         */
        this.req_att = req_att;
    }
    public void set_type (int type)
    {
        /**
         * Accessor Method
         * to set type
         */
        this.type = type;
    }
    
    public String get_name()
    {
        /**
         * Accessor Method
         * to get name
         */
        return name;
    }
    public int get_att()
    {
        /**
         * Accessor Method
         * to get attractiveness
         */
        return attractiveness;
    }
    public int get_intel()
    {
        /**
         * Accessor Method
         * to get intelligence level
         */
        return intel;
    }
    public double get_budget()
    {
        /**
         * Accessor Method
         * to get budget
         */
        return budget;
    }
    public int get_req_att()
    {
        /**
         * Accessor Method
         * to get minimum required attractiveness
         */
        return req_att;
    }
    public int get_type()
    {
        /**
         * Accessor Method
         * to get type
         */
        return type;
    }
}