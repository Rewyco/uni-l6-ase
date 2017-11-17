package toberenamed;

public class Vacation extends Redeemable {
    
    //----------------------------------------------------------------------
    // Type Definitions:
    //----------------------------------------------------------------------

    public enum Destinations {
        London,
        NewYork,
        Paris, 
        Amsterdam, 
        Manitoba
    }
    
    //----------------------------------------------------------------------
    // Private Fields:
    //----------------------------------------------------------------------

    
    //----------------------------------------------------------------------
    // Constructors:
    //----------------------------------------------------------------------
    
    public Vacation() {
        id = Unique.getUniqueId();
    }
}