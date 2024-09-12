
/**
 * Bike
 *
 * @author Michael Gennery
 * @version 11/9/24
 */
public class Bike extends Vehicle
{
    
    /**
     * Constructor for objects of class Bike
     */
    public Bike(String aRegistrationNumber, int aYear, String aMake, String aModel, 
    int anEngineCapacity, String aTransmission, int aMileage, int aNumberOfDoors, int aNumberOfSeats,
    String aFuel, String aSubType)
    {
        super(aRegistrationNumber, aYear, aMake, aModel, anEngineCapacity, aTransmission, aMileage, 
        aNumberOfDoors, aNumberOfSeats, aFuel, aSubType);
        super.setType("BIKE");
    }

    /**
     * GETTER METHODS
     */
    @Override
    public String getType()
    {
        return "BIKE";
    }    
    
}
