/**
 * IPPL430C Assignment
 * Prof. Rahul Kala
 * @author Chinmoy Das, IIT2015028
 * @version February 17, 2017
 */
public class girls_data
{
    /**
     * Class which stores the details of the Girls
     */
    private String name; /**Name*/
    private int attractiveness; /**Attractiveness*/
    private int intel; /**Intelligence Level*/
    private double budget; /**Maintance Budget*/
    private int type; /**Type of Girl -- Question 2*/
    
    public girls_data ()
    {
        /**
         * Default Constructor
         */
        name = "";
        attractiveness = 0;
        intel = 0;
        budget = 0.0;
        type = -1;
    }
    public girls_data (girls_data obj)
    {
        /**
         * Copy Constructor
         */
        this.name = obj.get_name();
        this.attractiveness = obj.get_att();
        this.intel = obj.get_intel();
        this.budget = obj.get_budget();
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
         * to set maintainance budget
         */
        this.budget = budget;
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
         * to get maintainance budget
         */
        return budget;
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