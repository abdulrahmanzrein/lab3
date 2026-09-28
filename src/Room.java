import java.util.*;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game. It is
 * connected to other rooms via exits, stored in a Map of
 * direction -> room. New directions (e.g. "up", "down") can be added
 * without any change to this class.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */
public class Room 
{
    private String description;
    private Map<String, Room> exits;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap<>();
    }

    /**
     * Define a single exit of this room in one direction.
     * @param direction The direction of the exit (e.g. "north", "up").
     * @param neighbor The room in that direction.
     */
    public void setExit(String direction, Room neighbor) 
    {
        exits.put(direction, neighbor);
    }

    /**
     * @param direction The direction we want to leave in.
     * @return The room in the given direction, or null if there is no exit there.
     */
    public Room getExit(String direction) 
    {
        return exits.get(direction);
    }

    /**
     * @return The description of the room.
     */
    public String getDescription() 
    {
        return description;
    }

    /**
     * Print the room description and its exits.
     * Uses the Map's keySet(), so it automatically lists every
     * direction that exists - no changes needed when directions
     * like "up" and "down" are added.
     */
    public void printLongDescription() 
    {
        System.out.println("You are " + this.getDescription());
        System.out.print("Exits: ");
        for (String direction : exits.keySet()) {
            System.out.print(direction + " Hello");
        }
        System.out.println();
    }
}
