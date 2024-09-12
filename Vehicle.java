
/**
 * Vehicle 
 * Super class for different vehicle types
 *
 * @author      Michael Gennery
 * @version     9/8/24
 */
public abstract class Vehicle
{
    private String registrationNumber;
    private int year;
    private String make;
    private String model;
    private int engineCapacity;     // Cubic Centimetres
    private String transmission;    // Auto, Manual
    private int mileage;
    private int numberOfDoors;
    private int numberOfSeats;
    private String fuel;            // Petrol, Diesel, EV, Hybrid
    private String type;            // Car, Van, Truck, Lorry, Bus
    private String subType;
    
    /**
     * Constructor for objects of class Vehicle
     */
    public Vehicle(String aRegistrationNumber, int aYear, String aMake, String aModel, 
    int anEngineCapacity, String aTransmission, int aMileage, int aNumberOfDoors, 
    int aNumberOfSeats, String aFuel, String aSubType)
    {
        registrationNumber = aRegistrationNumber;
        year = aYear;
        make = aMake; 
        model = aModel;
        engineCapacity = anEngineCapacity; 
        transmission = aTransmission; 
        mileage = aMileage; 
        numberOfDoors = aNumberOfDoors;
        numberOfSeats = aNumberOfSeats;
        fuel = aFuel;
        subType = aSubType;
    }

    /**
     * GETTER METHODS
     */
    public String getRegistrationNumber()
    {
        return registrationNumber;
    }

    public int getYear()
    {
        return year;
    }
    
    public String getMake()
    {
        return make;
    }
    
    public String getModel()
    {
        return model;
    }
    
    public int getEngineCapacity()
    {
        return engineCapacity;
    }
    
    public String getTransmission()
    {
        return transmission;
    }  

    public int getMileage()
    {
        return mileage;
    }  
    
    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }    
    
    public int getNumberOfSeats()
    {
        return numberOfSeats;
    }      

    public String getFuel()
    {
        return fuel;
    } 
    
    public String getType()
    {
        return type;
    }    

    public String getSubType()
    {
        return subType;
    }    
    
    /**
     * SETTER METHODS
     */
    public void setRegistrationNumber(String aRegistrationNumber)
    {
        registrationNumber = aRegistrationNumber;
    }

    public void setYear(int aYear)
    {
        year = aYear;
    }
    
    public void setMake(String aMake)
    {
        make = aMake;
    }
    
    public void setModel(String aModel)
    {
        model = aModel;
    }
    
    public void setEngineCapacity(int anEngineCapacity)
    {
        engineCapacity = anEngineCapacity;
    }
    
    public void setTransmission(String aTransmission)
    {
        transmission = aTransmission;
    }  
 
    public void setMileage(int aMileage)
    {
        mileage = aMileage;
    } 
    
    public void setNumberOfDoors(int aNumberOfDoors)
    {
        numberOfDoors = aNumberOfDoors;
    } 
    
    public void setNumberOfSeats(int aNumberOfSeats)
    {
        numberOfSeats = aNumberOfSeats;
    }        

    public void setFuel(String aFuel)
    {
        fuel = aFuel;
    } 
    
    public void setType(String aType)
    {
        type = aType;
    }   

    public void setSubType(String aSubType)
    {
        subType = aSubType;
    }   
    
    /**
     * Display Details of Vehicle
     *
     */
    
    @Override
    public String toString()
    {
        return "Registration Number: " + getRegistrationNumber() + 
        " / Year: " + getYear() +
        " / Make: " + getMake() + 
        " / Model: " + getModel() + 
        " / Engine Capacity (CC): " + getEngineCapacity() + 
        " / Transmission: " + getTransmission() +  
        " / Mileage: " + getMileage() + 
        " / Number of Doors: " + getNumberOfDoors() +
        " / Number of Seats: " + getNumberOfSeats() +
        " / Fuel: " + getFuel() +
        ", Type: " + getType() + ", " + getSubType();
    }
     
}
