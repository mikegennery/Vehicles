
/**
 * Van
 *
 * @author Michael Gennery
 * @version 9/9/24
 */
public class Van extends Vehicle
{
    int capacity; // Cubic Metres 
    
    /**
     * Constructor for objects of class Van
     */
    public Van(String aRegistrationNumber, int aYear, String aMake, String aModel, 
    int anEngineCapacity, String aTransmission, int aMileage, int aNumberOfDoors, int aNumberOfSeats, 
    String aFuel, String aSubType, int aCapacity)
    {
        super(aRegistrationNumber, aYear, aMake, aModel, anEngineCapacity, aTransmission, aMileage, 
        aNumberOfDoors, aNumberOfSeats, aFuel, aSubType);
        capacity = aCapacity;
        super.setType("VAN");
    }

    /**
     * GETTER METHODS
     */
    public int getCapacity()
    {
        return capacity;
    }
    
    /**
     * SETTER METHODS
     */
    public void setCapacity(int aCapacity)
    {
        capacity = aCapacity;
    }    
    
    @Override
    public String toString()
    {
        return super.toString() + " / Capacity: " + getCapacity();
    }   
}
