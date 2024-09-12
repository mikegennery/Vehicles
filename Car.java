
/**
 * Car
 *
 * @author Michael Gennery
 * @version 10/9/24
 */
public class Car extends Vehicle
{
    
    /**
     * Constructor for objects of class Car
     */
    public Car(String aRegistrationNumber, int aYear, String aMake, String aModel, 
    int anEngineCapacity, String aTransmission, int aMileage, int aNumberOfDoors, int aNumberOfSeats,
    String aFuel, String aSubType)
    {
        super(aRegistrationNumber, aYear, aMake, aModel, anEngineCapacity, aTransmission, aMileage, 
        aNumberOfDoors, aNumberOfSeats, aFuel, aSubType);
        super.setType("CAR");
    }


    
}
