import java.util.TreeSet;
import java.util.TreeMap;
import java.util.Iterator;
import java.lang.Object;
import java.util.Collections;
import java.util.ArrayList;

/**
 * CarPool
 * A collection of Vehicles
 *
 * @author Michael Gennery
 * @version 11/9/24
 */
public class CarPool
{
    private ArrayList<Vehicle> carPool;

    /**
     * Constructor for objects of class CarPool
     */
    public CarPool()
    {
        carPool = new ArrayList<>();
        carPool.add(new Car("A1", 2023, "Mercedes", "GLC", 2000, "Automatic",  32591, 5, 5, "Petrol", "SUV"));
        carPool.add(new Car("A2", 2022, "Ford", "Fiesta", 1400, "Manual", 86000, 5, 5, "Petrol", "Hatchback"));
        carPool.add(new Van("B3", 2024, "Renault", "Traffic", 2000, "Manual", 40, 3, 3, "Diesel", "Transit", 5));
        carPool.add(new Van("B4", 2009, "Citreon", "Belingo", 1600, "Manual", 127000, 3, 3, "Diesel", "Small", 7));
        carPool.add(new Lorry("C4", 2016, "Lecitrailer", "Tri-Axle", 3000, "Manual", 190000, 3, 2, "Diesel", "Trailer", 10000, 2, 50));
        carPool.add(new Lorry("C5", 2018, "Scania", "R450", 12700, "Automatic", 88000, 2, 2, "Diesel", "HGV", 4400, 1, 100));
        carPool.add(new Bike("D1", 1999, "Suzuki", "Bandit", 1157, "Manual", 54000, 0, 1, "Petrol", "Sports Tourer"));
        carPool.add(new Bike("D2", 2010, "Kawasaki", "Ninja 250", 249, "Manual", 22000, 0, 1, "Petrol", "Standard"));
        carPool.add(new Bus("D6", 2021, "Bazooka", "70", 2000, "Automatic", 100000, 2, 100, "Hybrid", "Single-Decker", 110));
        carPool.add(new Bus("D7", 2020, "Comet", "Express", 2500, "Automatic", 90000, 2, 150, "Hybrid", "Coach", 160));
    }

    @Override
    public String toString()
    {
        String formattedOutput = "CURRENT LIST OF VEHICLES: ";
        
        for (Vehicle aVehicle: carPool)
        {
            formattedOutput += aVehicle.toString() + " || ";
        }
        
        return formattedOutput;
    }  
    
    public void displayCarPool()
    {  
        System.out.println("CURRENT LIST OF VEHICLES: ");
        
        for (Vehicle aVehicle: carPool)
        {
            System.out.println(aVehicle.toString());
        }
    }
    
}
