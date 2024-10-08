
/**
 * Lorry
 *
 * @author Michael Gennery
 * @version 11/9/24
 */
public class Lorry extends Vehicle
{
    int maxLoad;    // Kilogrammes
    int carriages;
    int capacity;   // Cubic Metres 

    /**
     * Constructor for objects of class Lorry
     */
    public Lorry(String aRegistrationNumber, int aYear, String aMake, String aModel, 
    int anEngineCapacity, String aTransmission, int aMileage, int aNumberOfDoors, int aNumberOfSeats, 
    String aFuel, String aSubType, int aMaxLoad, int aCarriages, int aCapacity)
    {
        super(aRegistrationNumber, aYear, aMake, aModel, anEngineCapacity, aTransmission, aMileage, 
        aNumberOfDoors, aNumberOfSeats, aFuel, aSubType);
        maxLoad = aMaxLoad;
        carriages = aCarriages;
        capacity = aCapacity;
        super.setType("LORRY");
    }

    /**
     * GETTER METHODS
     */
    
    public int getMaxLoad()
    {
        return maxLoad;
    }
    
    public int getCarriages()
    {
        return carriages;
    }
    
    public int getCapacity()
    {
        return capacity;
    }
    
    /**
     * SETTER METHODS
     */
    
    public void getMaxLoad(int aMaxLoad)
    {
        maxLoad = aMaxLoad;
    }
    
    public void getCarriages(int aCarriages)
    {
        carriages = aCarriages;
    }    
    
    public void setCapacity(int aCapacity)
    {
        capacity = aCapacity;
    }    
    
    @Override
    public String toString()
    {
        return super.toString() + 
        " / Max Load: " + getMaxLoad() + 
        " / Carriages: " + getCarriages() +
        " / Capacity: " + getCapacity();
    }   

}
