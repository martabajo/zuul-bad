
/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael KÃ¶lling and David J. Barnes
 * @version 2011.07.31
 */
public class Room 
{
    private String description;
    private Room northExit;
    private Room southExit;
    private Room eastExit;
    private Room westExit;
    private Room southEastExit;
    private Room northWestExit;
    private String descripcionObj;
    private int peso;
    
    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description, String descripcionObj, int peso) 
    {
        this.description = description;
        this.descripcionObj = descripcionObj;
        this.peso = peso;
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    public void setExits(Room north, Room east, Room south, Room west, Room southEast, Room northWest) 
    {
        if(north != null)
            northExit = north;
        if(east != null)
            eastExit = east;
        if(south != null)
            southExit = south;
        if(west != null)
            westExit = west;
        if (southEast != null)
            southEastExit = southEast;
        if (northWest != null)
           northWestExit = northWest;
    }

    public Room getExit(String coordenada)
    {
        Room direccion = null;
        if (coordenada.equals("north"))
        {
            direccion = northExit;  
        }
        else  if (coordenada.equals("east"))
        {
            direccion = southExit;  
        }
        else  if (coordenada.equals("south"))
        {
            direccion = southExit;  
        }
        else  if (coordenada.equals("west"))
        {
            direccion = westExit;  
        }
        else  if (coordenada.equals("southEast"))
        {
            direccion = southEastExit;  
        }
        else  if (coordenada.equals("northWest"))
        {
            direccion = northWestExit;  
        }
        return direccion;
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Return a description of the room's exits.
     * For example: "Exits: north east west"
     *
     * @ return A description of the available exits.
     */
    public String getExitString()
    {
        String exit = "";
        if(northExit != null)
        {
            exit += " north";
        }
        if(eastExit != null)
        {
            exit += " east";
        }
         if(southExit != null)
        {
            exit += " south";
        }
         if(westExit != null)
        {
            exit += " west";
        }
         if(southEastExit != null)
        {
            exit += " southEast";
        }
        if(northWestExit != null)
        {
            exit += " northWest";
        }
        
        return exit;
    }
    
    public String getLongDescription()
    {
        return "Estás en " + getDescription() + "\n Salidas: " + getExitString() + "La descripcion del objeto es: " + descripcionObj + "su peso es:" + peso;
    }
}
