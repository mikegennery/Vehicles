
/**
 * Bus
 *
 * @author Michael Gennery
 * @version 11/9/24
 */
public class Bus extends Vehicle
{
    int maxPassengers; // Max no. of passengers
    
    /**
     * Constructor for objects of class Bus
     */
    public Bus(String aRegistrationNumber, int aYear, String aMake, String aModel, 
    int anEngineCapacity, String aTransmission, int aMileage, int aNumberOfDoors, 
    int aNumberOfSeats, String aFuel, String aSubType, int aMaxPassengers)
    {
        super(aRegistrationNumber, aYear, aMake, aModel, anEngineCapacity, aTransmission, aMileage, 
        aNumberOfDoors, aNumberOfSeats, aFuel, aSubType);
        maxPassengers = aMaxPassengers;
        super.setType("BUS");
    }

    /**
     * GETTER METHODS
     */
    public int getMaxPassengers()
    {
        return maxPassengers;
    }
    
    /**
     * SETTER METHODS
     */
    public void setMaxPassengers(int aMaxPassengers)
    {
        maxPassengers = aMaxPassengers;
    }    
    
    @Override
    public String toString()
    {
        return super.toString() + " / Maximum Passengers: " + getMaxPassengers();
    }   
    
}
