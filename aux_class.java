/**
 * Shorter Description of the Data of Couples
 * @author Chinmoy Das, IIT2015028
 */
public class aux_class
{
    private String boy_name;
    private String girl_name;
    private double happ;
    private double compat;
    
    public aux_class ()
    {
        /**
         * Default constructor
         */
        boy_name = girl_name = null;
        happ = 0.0;
        compat = 0.0;
    }
    public aux_class (aux_class obj)
    {
        /**
         * Copy constructor
         */
        this.boy_name = obj.get_boy_name();
        this.girl_name = obj.get_girl_name();
        this.happ = obj.get_happ();
        this.compat = obj.get_compat();
    }
    
    public void set_name (String a, String b)
    {
        girl_name = a;
        boy_name = b;
    }
    public void set_happ (double x)
    {
        happ = x;
    }
    public void set_compat (double x)
    {
        compat = x;
    }
    
    public String get_boy_name ()
    {
        return boy_name;
    }
    public String get_girl_name ()
    {
        return girl_name;
    }
    public double get_happ()
    {
        return happ;
    }
    public double get_compat ()
    {
        return compat;
    }
}