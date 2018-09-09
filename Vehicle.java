
/**
 * Escreva a descrição da classe Vehicle aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Vehicle
{
    // A unique ID for this vehicle.
    private String id;
    // The destination of this vehicle.
    private String destination;
    // The location of this vehicle.
    private String location;

    /**
     * COnstrutor para objetos da classe Vehicle
     */
    public Vehicle( String id )
    {
        this.id = id;
        this.destination = null;
    }
    
    /**
     * Return the ID of the vehicle.
     * @return The ID of the vehicle.
     */
    public String getID()
    {
        return id;
    }
    
    /**
     * Return the destination of the vehicle.
     * @return The destination of the vehicle.
     */
    public String getDestination()
    {
        return destination;
    }
    
    /**
     * Set the intented destination of the vehicle.
     * @param destination The intended destination.
     */
    public void setDestination(String destination)
    {
        this.destination = destination;
    }
    
    /**
     * Return the location of the vehicle.
     * @return The location of the vehicle.
     */
    public String getLocation()
    {
        return location;
    }
    
    /**
     * Set the location of the vehicle.
     * @param location the intended location.
     */
    public void setLocation( String location )
    {
        this.location = location;
    }
    
    /**
     * Return the status of this vehicle.
     * @return The status.
     */
    public String getStatus()
    {
        return this.id + " at " + this.location + " headed for " +
               this.destination;
    }

}
